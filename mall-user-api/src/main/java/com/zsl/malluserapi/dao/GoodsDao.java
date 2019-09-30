package com.zsl.malluserapi.dao;


import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 自定义Dao
 * Created by wangbinggui on 2019/5/28.
 */
public interface GoodsDao {
 int updateGoodsUpperBatch(@Param("Ids") List<Integer> ids);
 int updateGoodsDownBatch(@Param("Ids") List<Integer> ids);
 Integer selectSuperiorBySpuId(@Param("id") Long id);
 BigDecimal selectMaxPrice(@Param("id") Long id);
 BigDecimal selectMinPrice(@Param("id") Long id);
 BigDecimal selectMinActivityPrice(@Param("id") Long id);
 BigDecimal selectMinGiftPoint(@Param("id") Long id);
 Integer selectTotalSal(@Param("id") Long id);
 }
