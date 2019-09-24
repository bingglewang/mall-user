package com.zsl.malluserapi.service;

import com.zsl.malluserapi.dto.goods.in.GoodsInParam;
import com.zsl.mallusercommon.CommonResult;
import com.zsl.malluserdb.po.GoodsSku;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    /**
     * 商品搜索
     * @param goodsName
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    List<GoodsSku> getGoodsList(String goodsName, Integer page, Integer limit, String sort, String order);

    /**
     * 商品详情
     * @param goodsId
     * @return
     */
    Map<String,Object> getGoodsDetail(Integer goodsId);


    /**
     * 是否域上优品用户或商品
     * @param spuId  商品spu_id
     * @param sourceUserId 分享人userId
     * @param targetUserId 被分享人userId
     * @return
     */
    CommonResult isSuperiorUserOrGoods(Long spuId, Integer sourceUserId, Integer targetUserId,Integer doRedis);

    /**
     *  商品上架（批量）
     * @param Ids
     * @return
     */
    int updateGoodsUpperBatch(List<Integer> Ids);

    /**
     *  商品下架（批量）
     * @param Ids
     * @return
     */
    int updateGoodsDownBatch(List<Integer> Ids);


    /**
     *商品新增
     * @param goodsInParam
     * @return
     */
    int addGoods(GoodsInParam goodsInParam);

    /**
     * 商品分类
     */
    Object getCatagoryTree();

    /**
     * 商品品牌
     * @return
     */
    Object getBrandList();

    /**
     * 商品规格
     * @return
     */
    Object getSpecList();

    /**
     * 商品属性
     * @return
     */
    Object getAttributeList();

    /**
     * 商铺列表
     * @return
     */
    Object getShopList();

    /**
     * 根据规格值查询规格
     * @param specId
     * @return
     */
    Object getSpecValueBySpecId(List<Long> specId);
}
