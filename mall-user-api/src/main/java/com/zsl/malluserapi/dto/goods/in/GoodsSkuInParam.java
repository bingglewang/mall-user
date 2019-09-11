package com.zsl.malluserapi.dto.goods.in;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class GoodsSkuInParam {
    private String skuNo;  //sku编号,唯一
    private String skuName; //sku名称(冗余spu_name)
    private BigDecimal cost; //成本价
    private BigDecimal price;  //售价(价格为0时表示该商品仅支持使用积分兑换)
    private Integer point; //积分(积分为0时表示该商品仅支持用现金支付)
    private Integer salesVolume; //销量
    private Integer stock; //库存
    private Integer warnStock; //库存预警
    private Long shopId; //商铺id,为0表示自营
    private Boolean status; //状态(0：已下架；1：已上架)
    private Integer giftPoint; //赠送积分
    private String skuPicture; //sku的图片
    private List<Long> specValueId; // 规格值id
}
