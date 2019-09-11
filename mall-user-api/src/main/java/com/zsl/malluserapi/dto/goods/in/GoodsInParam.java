package com.zsl.malluserapi.dto.goods.in;

import com.zsl.malluserdb.po.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class GoodsInParam {
    private String spuNo; //商品编号
    private String goodsName; //商品名称
    private String goodsSubName;//商品副标题
   // private Integer distributionType; //邮费类型
    private BigDecimal freight; //运费
    private List<AreaValue> areaObject; //运费地区(多个)
    private Long shopId; //商铺id
    private BigDecimal lowPrice; //最低价格
    private Long categoryId; //分类id
    private Long brandId; //品牌id
    private List<Long> checkedSpecs;//选择的规格
    private List<GoodsPicInfo> goodsPicInfo;  //商品图文(多个)
    private List<GoodsImage> goodsImage;  //商品轮播图（多个）
    private List<GoodsSkuInParam> goodsSkuList; //商品sku信息
}
