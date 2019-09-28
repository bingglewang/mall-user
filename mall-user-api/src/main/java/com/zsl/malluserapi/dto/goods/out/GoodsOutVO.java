package com.zsl.malluserapi.dto.goods.out;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class GoodsOutVO {
    private Long id; //spu id
    private String goodsName;//商品名称
    private String goodsSubName;//商品副标题
    private BigDecimal minPrice;//最低价格
    private BigDecimal maxPrice;//最高价格
    private String price;//价格
    private Long totalSal;//总销量
    private String goodsPic; //商品图片
    private BigDecimal activityPrice;//商品活动价格
}
