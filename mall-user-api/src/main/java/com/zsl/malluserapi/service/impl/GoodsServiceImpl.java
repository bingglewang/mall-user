package com.zsl.malluserapi.service.impl;

import com.zsl.malluserapi.dao.GoodsDao;
import com.zsl.malluserapi.dao.UserDao;
import com.zsl.malluserapi.dto.goods.in.AreaValue;
import com.zsl.malluserapi.dto.goods.in.GoodsInParam;
import com.zsl.malluserapi.dto.goods.in.GoodsSkuInParam;
import com.zsl.malluserapi.dto.goods.out.GoodsSpuVo;
import com.zsl.malluserapi.dto.goods.out.SpecChildListVo;
import com.zsl.malluserapi.dto.goods.out.SpecListVo;
import com.zsl.malluserapi.service.GoodsService;
import com.zsl.malluserapi.service.RedisService;
import com.zsl.malluserapi.util.CartesianArith;
import com.zsl.malluserapi.util.PointUtil;
import com.zsl.malluserapi.util.TreeUtil;
import com.zsl.mallusercommon.CommonResult;
import com.zsl.malluserdb.mapper.*;
import com.zsl.malluserdb.po.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsSkuMapper goodsSkuMapper;

    @Autowired
    private GoodsImageMapper goodsImageMapper;

    @Autowired
    private GoodsSpuTagMapper goodsSpuTagMapper;

    @Autowired
    private GoodsTagMapper goodsTagMapper;

    @Autowired
    private GoodsSkuSpecValueMapper goodsSkuSpecValueMapper;

    @Autowired
    private GoodsSpecValueMapper goodsSpecValueMapper;

    @Autowired
    private GoodsSpecMapper goodsSpecMapper;

    @Autowired
    private GoodsPicInfoMapper goodsPicInfoMapper;

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private GoodsSpuMapper goodsSpuMapper;

    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    @Autowired
    private GoodsBrandMapper goodsBrandMappe;

    @Autowired
    private GoodsShopInfoMapper goodsShopInfoMapper;

    @Autowired
    private GoodsSpuSpecMapper goodsSpuSpecMapper;

    @Autowired
    private ShippingRegionLimitsMapper shippingRegionLimitsMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserDao userDao;

    @Override
    public List<GoodsSpu> getGoodsList(String goodsName, Integer page, Integer limit, String sort, String order) {
        GoodsSpuExample goodsSpuExample = new GoodsSpuExample();
        GoodsSpuExample.Criteria criteria = goodsSpuExample.createCriteria();

        if (!StringUtils.isEmpty(goodsName)) {
            criteria.andGoodsNameLike("%" + goodsName + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            goodsSpuExample.setOrderByClause(sort + " " + order);
        }
        criteria.andStatusEqualTo(true); //根据商品商品上架下架
        //PageHelper.startPage(page, limit);

        return goodsSpuMapper.selectByExample(goodsSpuExample);
    }

    @Override
    public Map<String, Object> getGoodsDetail(Integer goodsSpuId) {
        Map<String, Object> result = new HashMap<>();
        //商品信息
        GoodsSpu goodsSpu = goodsSpuMapper.selectByPrimaryKey(new Long(goodsSpuId));
        if (goodsSpu == null) {
            return result;
        }
        GoodsSpuVo goodsInfo = new GoodsSpuVo();
        goodsInfo.setId(goodsSpu.getId());
        goodsInfo.setGoodsName(goodsSpu.getGoodsName());
        goodsInfo.setGoodsSubName(goodsSpu.getGoodsSubName());
        BigDecimal max = goodsDao.selectMaxPrice(goodsSpu.getId());
        BigDecimal min = goodsDao.selectMinPrice(goodsSpu.getId());
        if(max.compareTo(min) == 0){
            goodsInfo.setPrice(min+"");
        }else{
            goodsInfo.setPrice(min+"-"+ max);
        }
        goodsInfo.setMaxPrice(goodsDao.selectMaxPrice(goodsSpu.getId()));
        goodsInfo.setMinPrice(goodsDao.selectMinPrice(goodsSpu.getId()));
        if(getMinGifgPointBySpuId(goodsSpu.getId()) > 0){
            goodsInfo.setTotalSal(goodsDao.selectTotalSal(goodsSpu.getId())+"  赠送"+getMinGifgPointBySpuId(goodsSpu.getId())+"积分");
        }else{
            goodsInfo.setTotalSal(goodsDao.selectTotalSal(goodsSpu.getId())+"");
        }
        //活动价格
        BigDecimal activityPrice = goodsDao.selectMinActivityPrice(goodsSpu.getId());
        activityPrice = activityPrice == null ? new BigDecimal(-1) : activityPrice;
        result.put("activityPrice",activityPrice);
        result.put("goodsInfo", goodsInfo);
        //商品组图
        List<String> goodsPic = new ArrayList<>();
        GoodsImageExample goodsImageExample = new GoodsImageExample();
        goodsImageExample.or().andSpuIdEqualTo(goodsSpu.getId());
        List<GoodsImage> goodsSpuList = goodsImageMapper.selectByExample(goodsImageExample);
        if (!CollectionUtils.isEmpty(goodsSpuList)) {
            //排序
            Collections.sort(goodsSpuList, new Comparator<GoodsImage>() {
                @Override
                public int compare(GoodsImage o1, GoodsImage o2) {
                    // 按照层级排序
                    if (Integer.valueOf(o1.getIndex()) > Integer.valueOf(o2.getIndex())) {
                        return 1;
                    }
                    if (Integer.valueOf(o1.getIndex()) == Integer.valueOf(o2.getIndex())) {
                        return 0;
                    }
                    return -1;
                }
            });
            for (GoodsImage goodsImage : goodsSpuList) {
                goodsPic.add(goodsImage.getPictureUrl());
            }
        }
        result.put("goodsPic", goodsPic);
        //商品标签
        List<String> tagList = new ArrayList<>();
        GoodsSpuTagExample goodsSkuTagExample = new GoodsSpuTagExample();
        goodsSkuTagExample.or().andSpuIdEqualTo(goodsSpu.getId());
        List<GoodsSpuTag> goodsSkuTagList = goodsSpuTagMapper.selectByExample(goodsSkuTagExample);
        if (!CollectionUtils.isEmpty(goodsSkuTagList)) {
            for (GoodsSpuTag goodsSkuTag : goodsSkuTagList) {
                GoodsTag goodsTag = goodsTagMapper.selectByPrimaryKey(goodsSkuTag.getTagId());
                if (goodsTag != null)
                    tagList.add(goodsTag.getTag());
            }
        }
        result.put("tagList", tagList);
        //商品规格
        List<SpecListVo> specList = new ArrayList<>();
        List<SpecChildListVo> specChildList = new ArrayList<>();
        Set<Long> specIds = new HashSet<>();
        Set<Long> specValues = new HashSet<>();
        GoodsSkuExample goodsSkuExample = new GoodsSkuExample();
        goodsSkuExample.or().andSpuIdEqualTo(goodsSpu.getId());
        List<GoodsSku> goodsSkuList = goodsSkuMapper.selectByExample(goodsSkuExample);
        if (!CollectionUtils.isEmpty(goodsSkuList)) {
            for (GoodsSku goodsSku : goodsSkuList) {
                GoodsSkuSpecValueExample goodsSkuSpecValueExample = new GoodsSkuSpecValueExample();
                goodsSkuSpecValueExample.or().andSkuIdEqualTo(goodsSku.getId());
                List<GoodsSkuSpecValue> goodsSkuSpecValueList = goodsSkuSpecValueMapper.selectByExample(goodsSkuSpecValueExample);
                for (GoodsSkuSpecValue goodsSkuSpecValue : goodsSkuSpecValueList) {
                    GoodsSpecValue goodsSpecValue = goodsSpecValueMapper.selectByPrimaryKey(goodsSkuSpecValue.getSpecValueId());
                    //规格
                    GoodsSpec goodsSpec = goodsSpecMapper.selectByPrimaryKey(goodsSpecValue.getSpecId());
                    if (specIds.add(goodsSpecValue.getSpecId())) {
                        if (goodsSpec != null) {
                            SpecListVo specListVo = new SpecListVo();
                            specListVo.setId(goodsSpec.getId()); //spec_id
                            specListVo.setName(goodsSpec.getSpecName());
                            specList.add(specListVo);
                        }
                    }
                    if(specValues.add(goodsSpecValue.getId())) {
                        //规格值
                        SpecChildListVo specChildListVo = new SpecChildListVo();
                        specChildListVo.setId(goodsSpecValue.getId()); //spec_value_id    this.specValue
                        specChildListVo.setPid(goodsSpec.getId());
                        specChildListVo.setName(goodsSpecValue.getSpecValue());
                        specChildList.add(specChildListVo);
                    }
                }
            }
        }

        result.put("specList", specList);
        result.put("specChildList", specChildList);

        //商品图文详情组
        List<String> goodsInfoPicList = new ArrayList<>();
        GoodsPicInfoExample goodsPicInfoExample = new GoodsPicInfoExample();
        goodsPicInfoExample.or().andSpuIdEqualTo(goodsSpu.getId());
        List<GoodsPicInfo> goodsPicInfoList = goodsPicInfoMapper.selectByExample(goodsPicInfoExample);
        if (!CollectionUtils.isEmpty(goodsPicInfoList)) {
            //排序
            Collections.sort(goodsPicInfoList, new Comparator<GoodsPicInfo>() {
                @Override
                public int compare(GoodsPicInfo o1, GoodsPicInfo o2) {
                    // 按照层级排序
                    if (Integer.valueOf(o1.getIndex()) > Integer.valueOf(o2.getIndex())) {
                        return 1;
                    }
                    if (Integer.valueOf(o1.getIndex()) == Integer.valueOf(o2.getIndex())) {
                        return 0;
                    }
                    return -1;
                }
            });
            for (GoodsPicInfo goodsPicInfo : goodsPicInfoList) {
                goodsInfoPicList.add(goodsPicInfo.getGoodsInfoUrl());
            }
        }
        result.put("goodsInfoPicList", goodsInfoPicList);
        return result;
    }

    @Override
    public CommonResult isSuperiorUserOrGoods(Long spuId, Integer sourceUserId, Integer targetUserId,Integer doRedis) {
        Map<String,Object> result = new HashMap<>();
        //判断商品是否是域上优品
        Integer superiorId = goodsDao.selectSuperiorBySpuId(spuId);
        //判断是否是域上优品用户
        Integer rankTarget = userDao.selectSuperiorByUserId(targetUserId);
        if(superiorId != null && superiorId == 1){
            result.put("isSuperiorGood",true);
            if(rankTarget != null){
                result.put("userRank",rankTarget);
            }else{
                result.put("userRank",-1); //小白
                Integer rankSource = userDao.selectSuperiorByUserId(sourceUserId);
                //通过域上优品会员分享
                if(rankSource != null && doRedis != null && doRedis == 1){
                    redisService.set("SUPERIOR_SHARE"+targetUserId,""+sourceUserId);
                }
            }
        }else{
            result.put("isSuperiorGood",false);
            if(rankTarget != null) {
                result.put("userRank", rankTarget);
            }else{
                result.put("userRank", -1);
            }
        }
        return CommonResult.success(result);
    }

    public int getMinGifgPointBySpuId(Long SpuId){
        List<Integer> pointValue = new ArrayList<>();
        GoodsSkuExample goodsSkuExample = new GoodsSkuExample();
        GoodsSkuExample.Criteria criteria = goodsSkuExample.createCriteria();
        criteria.andSpuIdEqualTo(SpuId);
        List<GoodsSku> goodsSkuList = goodsSkuMapper.selectByExample(goodsSkuExample);
        for(GoodsSku goodsSku : goodsSkuList){
            //pointValue.add(PointUtil.sum(goodsSku));
            pointValue.add(goodsSku.getGiftPoint());
        }
        return Collections.min(pointValue);
    }

    @Override
    public int updateGoodsUpperBatch(List<Integer> Ids) {
        return goodsDao.updateGoodsUpperBatch(Ids);
    }

    @Override
    public int updateGoodsDownBatch(List<Integer> Ids) {
        return goodsDao.updateGoodsDownBatch(Ids);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addGoods(GoodsInParam goodsInParam) {
        //添加spu信息
        GoodsSpu goodsSpu = new GoodsSpu();
        goodsSpu.setSpuNo(goodsInParam.getSpuNo());       //spu编号
        goodsSpu.setGoodsName(goodsInParam.getGoodsName());   //商品名称
        goodsSpu.setGoodsSubName(goodsInParam.getGoodsSubName()); //商品副标题
        goodsSpu.setFreight(goodsInParam.getFreight()); //运费
        goodsSpu.setShopId(goodsInParam.getShopId()); //商铺信息
        goodsSpu.setLowPrice(goodsInParam.getLowPrice());  //最低价格
        goodsSpu.setCategoryId(goodsInParam.getCategoryId()); //分类
        goodsSpu.setBrandId(goodsInParam.getBrandId()); //品牌
        goodsSpu.setCreateTime(new Date());
        int i = goodsSpuMapper.insert(goodsSpu);
        if (i <= 0)
            return -1; //添加商品失败

        //商品图文(多个)
        List<GoodsPicInfo> goodsPicInfoList = goodsInParam.getGoodsPicInfo();
        for (GoodsPicInfo goodsPicInfo : goodsPicInfoList) {
            GoodsPicInfo goodsPicInfoInsert = new GoodsPicInfo();
            goodsPicInfoInsert.setSpuId(goodsSpu.getId());
            goodsPicInfoInsert.setGoodsInfoUrl(goodsPicInfo.getGoodsInfoUrl()); //图片路径
            goodsPicInfoInsert.setIndex(goodsPicInfo.getIndex()); //权重值
            goodsPicInfoMapper.insert(goodsPicInfoInsert);
        }

        //商品轮播图（多个）
        List<GoodsImage> goodsImageList = goodsInParam.getGoodsImage();
        for (GoodsImage goodsImage : goodsImageList) {
            GoodsImage goodsImageInsert = new GoodsImage();
            goodsImageInsert.setSpuId(goodsSpu.getId());
            goodsImageInsert.setPictureUrl(goodsImage.getPictureUrl()); //图片路径
            goodsImageInsert.setIndex(goodsImage.getIndex()); //权重值
            goodsImageMapper.insert(goodsImageInsert);
        }

        //spu表关联表
        List<Long> specList = goodsInParam.getCheckedSpecs();
        for (Long specId : specList) {
            GoodsSpuSpec goodsSpuSpec = new GoodsSpuSpec();
            goodsSpuSpec.setSpecId(specId);
            goodsSpuSpec.setSpuId(goodsSpu.getId());
            goodsSpuSpec.setCreateTime(new Date());
            goodsSpuSpecMapper.insert(goodsSpuSpec);
        }

        //spu运费地址关联
        List<AreaValue> spuAreaList = goodsInParam.getAreaObject();
        for (AreaValue spuArea : spuAreaList) {
            ShippingRegionLimits shippingRegionLimits = new ShippingRegionLimits();
            shippingRegionLimits.setSpuId(goodsSpu.getId());
            shippingRegionLimits.setAreaName(spuArea.getCity());
            shippingRegionLimits.setSpecialFreight(spuArea.getValue());
            shippingRegionLimitsMapper.insert(shippingRegionLimits);
        }

        //商品sku信息
        List<GoodsSkuInParam> goodsSkuList = goodsInParam.getGoodsSkuList();
        for (GoodsSkuInParam goodsSkuParam : goodsSkuList) {
            //sku表
            GoodsSku goodsSkuInsert = new GoodsSku();
            BeanUtils.copyProperties(goodsSkuParam, goodsSkuInsert);
            goodsSkuInsert.setSpuId(goodsSpu.getId());
            //赠送积分
            if(PointUtil.sum(goodsSkuInsert) > 0){
                goodsSkuInsert.setGiftPoint(PointUtil.sum(goodsSkuInsert));
            } else {
                goodsSkuInsert.setGiftPoint(0);
            }

            goodsSkuMapper.insert(goodsSkuInsert);
            List<Long> specValueList = goodsSkuParam.getSpecValueId();
            for (Long specValueId : specValueList) {
                //sku和规格关联表
                GoodsSkuSpecValue goodsSkuSpecValueInsert = new GoodsSkuSpecValue();
                goodsSkuSpecValueInsert.setSkuId(goodsSkuInsert.getId());
                goodsSkuSpecValueInsert.setSpecValueId(specValueId);
                goodsSkuSpecValueInsert.setCreateTime(new Date());
                goodsSkuSpecValueMapper.insert(goodsSkuSpecValueInsert);
            }
        }
        return 1;
    }

    @Override
    public Object getCatagoryTree() {
        GoodsCategoryExample categoryExample = new GoodsCategoryExample();
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(categoryExample);
        return TreeUtil.bulidTree(goodsCategories, 0);
    }

    @Override
    public Object getBrandList() {
        GoodsBrandExample goodsBrandExample = new GoodsBrandExample();
        return goodsBrandMappe.selectByExample(goodsBrandExample);
    }

    @Override
    public Object getSpecList() {
        GoodsSpecValueExample goodsSpecValueExample = new GoodsSpecValueExample();
        return goodsSpecValueMapper.selectByExample(goodsSpecValueExample);
    }

    @Override
    public Object getAttributeList() {
        GoodsSpecExample goodsSpecExample = new GoodsSpecExample();
        return goodsSpecMapper.selectByExample(goodsSpecExample);
    }

    @Override
    public Object getShopList() {
        GoodsShopInfoExample goodsShopInfoExample = new GoodsShopInfoExample();
        return goodsShopInfoMapper.selectByExample(goodsShopInfoExample);
    }

    @Override
    public Object getSpecValueBySpecId(List<Long> specId) {
        ArrayList set = new ArrayList();
        for (int i = 0; i < specId.size(); i++) {
            GoodsSpecValueExample goodsSpecValueExample = new GoodsSpecValueExample();
            goodsSpecValueExample.or().andSpecIdEqualTo(specId.get(i));
            List<GoodsSpecValue> goodsSpecValueList = goodsSpecValueMapper.selectByExample(goodsSpecValueExample);
            set.add(goodsSpecValueList);
        }
        return CartesianArith.Dikaerji0(set);
    }

}
