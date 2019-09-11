package com.zsl.malluserapi.dto.goods.in;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AreaValue {
    private String city;
    private BigDecimal value;
}
