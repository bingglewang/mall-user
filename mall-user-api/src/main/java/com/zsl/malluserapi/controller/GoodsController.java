package com.zsl.malluserapi.controller;

import com.zsl.malluserapi.dao.GoodsDao;
import com.zsl.malluserapi.dto.goods.in.GoodsInParam;
import com.zsl.malluserapi.dto.goods.out.GoodsOutVO;
import com.zsl.malluserapi.service.GoodsService;
import com.zsl.malluserapi.util.IntIdsQuery;
import com.zsl.malluserapi.validator.validator.Order;
import com.zsl.malluserapi.validator.validator.Sort;
import com.zsl.mallusercommon.CommonResult;
import com.zsl.malluserdb.mapper.*;
import com.zsl.malluserdb.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsImageMapper goodsImageMapper;

    @Autowired
    private GoodsSpuMapper goodsSpuMapper;

    @Autowired
    private GoodsDao goodsDao;
    /**
     * 商品列表搜索
     * @param goodsName
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    @GetMapping("list")
    public CommonResult list(
            String goodsName,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer limit,
            @Sort(accepts = {"create_time", "price", "sku_name"}) @RequestParam(defaultValue = "create_time") String sort,
            @Order @RequestParam(defaultValue = "desc") String order
    ){
        List<GoodsSku>  goodsSkuList = goodsService.getGoodsList(goodsName,page,limit,sort,order);
        Set<Long> spuIdSet = new HashSet<>();
        List<GoodsOutVO> result = new ArrayList<>();
        for(GoodsSku goodsSku1 : goodsSkuList){
            spuIdSet.add(goodsSku1.getSpuId());
        }
        for(Long spuid : spuIdSet){
            GoodsSpu goodsSpu = goodsSpuMapper.selectByPrimaryKey(spuid);
            if(goodsSpu != null){
                GoodsOutVO goodsOutVO = new GoodsOutVO();
                goodsOutVO.setId(goodsSpu.getId());
                goodsOutVO.setGoodsName(goodsSpu.getGoodsName());
                goodsOutVO.setGoodsSubName(goodsSpu.getGoodsSubName());
                BigDecimal max = goodsDao.selectMaxPrice(goodsSpu.getId());
                BigDecimal min = goodsDao.selectMinPrice(goodsSpu.getId());
                if(max.compareTo(min) == 0){
                    goodsOutVO.setPrice(min+"");
                }else{
                    goodsOutVO.setPrice(min +"-"+ max);
                }
                goodsOutVO.setMaxPrice(goodsDao.selectMaxPrice(goodsSpu.getId()));
                goodsOutVO.setMinPrice(goodsDao.selectMinPrice(goodsSpu.getId()));
                goodsOutVO.setTotalSal(new Long(goodsDao.selectTotalSal(goodsSpu.getId())));
                GoodsImageExample goodsImageExample = new GoodsImageExample();
                goodsImageExample.or().andSpuIdEqualTo(spuid).andIndexEqualTo(0);
                List<GoodsImage> goodsSpuList = goodsImageMapper.selectByExample(goodsImageExample);
                if (!CollectionUtils.isEmpty(goodsSpuList)) {
                    goodsOutVO.setGoodsPic(goodsSpuList.get(0).getPictureUrl()); //商品主图
                }
                result.add(goodsOutVO);
            }

        }
        return CommonResult.success(result);
    }

    /**
     * 商品详情
     * @param goodsId
     * @return
     */
    @GetMapping("goodsDetail")
    public CommonResult getGoodsDetail(Integer goodsId){
        return CommonResult.success(goodsService.getGoodsDetail(goodsId));
    }

    /**
     * 是否域上优品用户或商品
     * @param spuId  商品spu_id
     * @param sourceUserId 分享人userId
     * @param targetUserId 被分享人userId
     * @return
     */
    @GetMapping("isSuperiorUserOrGoods")
    public CommonResult isSuperiorUserOrGoods(Long spuId,Integer sourceUserId,Integer targetUserId,Integer doRedis){
        return goodsService.isSuperiorUserOrGoods(spuId,sourceUserId,targetUserId,doRedis);
    }

    /**
     * 商品批量上架
     * @param intIdsQuery
     * @param result
     * @return
     */
    @PostMapping("upperBatch")
    public CommonResult upperBatch(@RequestBody @Valid IntIdsQuery intIdsQuery, BindingResult result){
        int i = goodsService.updateGoodsUpperBatch(intIdsQuery.getIds());
        if(i > 0){
            return CommonResult.success("商品上架成功");
        }else {
            return CommonResult.failed("商品上架失败");
        }
    }

    /**
     * 商品批量下架
     * @param intIdsQuery
     * @param result
     * @return
     */
    @PostMapping("downBatch")
    public CommonResult downBatch(@RequestBody @Valid IntIdsQuery intIdsQuery,BindingResult result){
        int i = goodsService.updateGoodsDownBatch(intIdsQuery.getIds());
        if(i > 0){
            return CommonResult.success("商品下架成功");
        }else {
            return CommonResult.failed("商品下架失败");
        }
    }

    @PostMapping("addGoods")
    public CommonResult addGoods(@RequestBody GoodsInParam goodsInParam){
        int i = goodsService.addGoods(goodsInParam);
        if(i > 0){
            return CommonResult.success("商品添加成功");
        }else{
            return CommonResult.failed("商品添加失败");
        }
    }

    /**
     * 商品分类
     * @return
     */
    @GetMapping("CateGoryTree")
    public CommonResult getCateGoryTree(){
        return CommonResult.success(goodsService.getCatagoryTree());
    }

    /**
     * 商品品牌
     * @return
     */
    @GetMapping("getBrandList")
    public CommonResult getBrandList(){
        return CommonResult.success(goodsService.getBrandList());
    }

    /**
     * 商品规格
     * @return
     */
    @GetMapping("getSpecList")
    public CommonResult getSpecList(){
        return CommonResult.success(goodsService.getSpecList());
    }

    /**
     * 商品属性
     * @return
     */
    @GetMapping("getAttrList")
    public CommonResult getAttrList(){
        return CommonResult.success(goodsService.getAttributeList());
    }

    /**
     * 商铺列表
     * @return
     */
    @GetMapping("getShopList")
    public CommonResult getShopList(){
        return CommonResult.success(goodsService.getShopList());
    }

    /**
     * 根据id获取规格
     * @return
     */
    @PostMapping("getSpecById")
    public CommonResult getSpecById(@RequestBody List<Long> specId){
        return CommonResult.success(goodsService.getSpecValueBySpecId(specId));
    }
}
