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
 BigDecimal selectMaxPrice(@Param("id") Long id);
 BigDecimal selectMinPrice(@Param("id") Long id);
 BigDecimal selectMinGiftPoint(@Param("id") Long id);
 int selectTotalSal(@Param("id") Long id);
 }