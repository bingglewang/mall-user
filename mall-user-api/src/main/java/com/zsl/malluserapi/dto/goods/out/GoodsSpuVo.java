package com.zsl.malluserapi.dto.goods.out;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GoodsSpuVo {
    private Long id; //spu id
    private String goodsName;//商品名称
    private String goodsSubName;//商品副标题
    private BigDecimal minPrice;//最低价格
    private BigDecimal maxPrice;//最高价格
    private String price; //价格
    private String totalSal;//总销量
}
