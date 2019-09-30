package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSkuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public GoodsSkuExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsSkuExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        GoodsSkuExample example = new GoodsSkuExample();
        return example.createCriteria();
    }

    public GoodsSkuExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsSkuExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(Long value) {
            addCriterion("spu_id =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("spu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Long value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("spu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Long value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("spu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("spu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Long value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("spu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Long value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("spu_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<Long> values) {
            addCriterion("spu_id in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<Long> values) {
            addCriterion("spu_id not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(Long value1, Long value2) {
            addCriterion("spu_id between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(Long value1, Long value2) {
            addCriterion("spu_id not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("shop_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("shop_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("shop_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("shop_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("shop_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("shop_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andSkuNoIsNull() {
            addCriterion("sku_no is null");
            return (Criteria) this;
        }

        public Criteria andSkuNoIsNotNull() {
            addCriterion("sku_no is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNoEqualTo(String value) {
            addCriterion("sku_no =", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNoNotEqualTo(String value) {
            addCriterion("sku_no <>", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNoGreaterThan(String value) {
            addCriterion("sku_no >", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNoGreaterThanOrEqualTo(String value) {
            addCriterion("sku_no >=", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNoLessThan(String value) {
            addCriterion("sku_no <", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNoLessThanOrEqualTo(String value) {
            addCriterion("sku_no <=", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNoLike(String value) {
            addCriterion("sku_no like", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotLike(String value) {
            addCriterion("sku_no not like", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoIn(List<String> values) {
            addCriterion("sku_no in", values, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotIn(List<String> values) {
            addCriterion("sku_no not in", values, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoBetween(String value1, String value2) {
            addCriterion("sku_no between", value1, value2, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotBetween(String value1, String value2) {
            addCriterion("sku_no not between", value1, value2, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("cost = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("cost <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("cost > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("cost >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("cost < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("cost <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("point <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Integer value) {
            addCriterion("sales_volume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sales_volume = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Integer value) {
            addCriterion("sales_volume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sales_volume <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Integer value) {
            addCriterion("sales_volume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sales_volume > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_volume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sales_volume >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Integer value) {
            addCriterion("sales_volume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sales_volume < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("sales_volume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sales_volume <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Integer> values) {
            addCriterion("sales_volume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Integer> values) {
            addCriterion("sales_volume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Integer value1, Integer value2) {
            addCriterion("sales_volume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_volume not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("stock = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("stock <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("stock > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("stock >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("stock < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("stock <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andWarnStockIsNull() {
            addCriterion("warn_stock is null");
            return (Criteria) this;
        }

        public Criteria andWarnStockIsNotNull() {
            addCriterion("warn_stock is not null");
            return (Criteria) this;
        }

        public Criteria andWarnStockEqualTo(Integer value) {
            addCriterion("warn_stock =", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("warn_stock = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarnStockNotEqualTo(Integer value) {
            addCriterion("warn_stock <>", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("warn_stock <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThan(Integer value) {
            addCriterion("warn_stock >", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("warn_stock > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_stock >=", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("warn_stock >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThan(Integer value) {
            addCriterion("warn_stock <", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("warn_stock < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThanOrEqualTo(Integer value) {
            addCriterion("warn_stock <=", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("warn_stock <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarnStockIn(List<Integer> values) {
            addCriterion("warn_stock in", values, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotIn(List<Integer> values) {
            addCriterion("warn_stock not in", values, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockBetween(Integer value1, Integer value2) {
            addCriterion("warn_stock between", value1, value2, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_stock not between", value1, value2, "warnStock");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("`status` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGiftPointIsNull() {
            addCriterion("gift_point is null");
            return (Criteria) this;
        }

        public Criteria andGiftPointIsNotNull() {
            addCriterion("gift_point is not null");
            return (Criteria) this;
        }

        public Criteria andGiftPointEqualTo(Integer value) {
            addCriterion("gift_point =", value, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftPointNotEqualTo(Integer value) {
            addCriterion("gift_point <>", value, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftPointGreaterThan(Integer value) {
            addCriterion("gift_point >", value, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_point >=", value, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftPointLessThan(Integer value) {
            addCriterion("gift_point <", value, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftPointLessThanOrEqualTo(Integer value) {
            addCriterion("gift_point <=", value, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_point <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftPointIn(List<Integer> values) {
            addCriterion("gift_point in", values, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointNotIn(List<Integer> values) {
            addCriterion("gift_point not in", values, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointBetween(Integer value1, Integer value2) {
            addCriterion("gift_point between", value1, value2, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andGiftPointNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_point not between", value1, value2, "giftPoint");
            return (Criteria) this;
        }

        public Criteria andSkuPictureIsNull() {
            addCriterion("sku_picture is null");
            return (Criteria) this;
        }

        public Criteria andSkuPictureIsNotNull() {
            addCriterion("sku_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPictureEqualTo(String value) {
            addCriterion("sku_picture =", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_picture = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuPictureNotEqualTo(String value) {
            addCriterion("sku_picture <>", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_picture <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuPictureGreaterThan(String value) {
            addCriterion("sku_picture >", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_picture > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuPictureGreaterThanOrEqualTo(String value) {
            addCriterion("sku_picture >=", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_picture >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuPictureLessThan(String value) {
            addCriterion("sku_picture <", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_picture < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuPictureLessThanOrEqualTo(String value) {
            addCriterion("sku_picture <=", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("sku_picture <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuPictureLike(String value) {
            addCriterion("sku_picture like", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureNotLike(String value) {
            addCriterion("sku_picture not like", value, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureIn(List<String> values) {
            addCriterion("sku_picture in", values, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureNotIn(List<String> values) {
            addCriterion("sku_picture not in", values, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureBetween(String value1, String value2) {
            addCriterion("sku_picture between", value1, value2, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andSkuPictureNotBetween(String value1, String value2) {
            addCriterion("sku_picture not between", value1, value2, "skuPicture");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNull() {
            addCriterion("gift_money is null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNotNull() {
            addCriterion("gift_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyEqualTo(BigDecimal value) {
            addCriterion("gift_money =", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotEqualTo(BigDecimal value) {
            addCriterion("gift_money <>", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThan(BigDecimal value) {
            addCriterion("gift_money >", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gift_money >=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThan(BigDecimal value) {
            addCriterion("gift_money <", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gift_money <=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("gift_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIn(List<BigDecimal> values) {
            addCriterion("gift_money in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotIn(List<BigDecimal> values) {
            addCriterion("gift_money not in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gift_money between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gift_money not between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyIsNull() {
            addCriterion("father_money is null");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyIsNotNull() {
            addCriterion("father_money is not null");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyEqualTo(BigDecimal value) {
            addCriterion("father_money =", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("father_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("father_money <>", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("father_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("father_money >", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("father_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money >=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("father_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThan(BigDecimal value) {
            addCriterion("father_money <", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("father_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money <=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("father_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyIn(List<BigDecimal> values) {
            addCriterion("father_money in", values, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotIn(List<BigDecimal> values) {
            addCriterion("father_money not in", values, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("father_money between", value1, value2, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("father_money not between", value1, value2, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyIsNull() {
            addCriterion("grandfather_money is null");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyIsNotNull() {
            addCriterion("grandfather_money is not null");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyEqualTo(BigDecimal value) {
            addCriterion("grandfather_money =", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("grandfather_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <>", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("grandfather_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("grandfather_money >", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("grandfather_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money >=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("grandfather_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThan(BigDecimal value) {
            addCriterion("grandfather_money <", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("grandfather_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualToColumn(GoodsSku.Column column) {
            addCriterion(new StringBuilder("grandfather_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyIn(List<BigDecimal> values) {
            addCriterion("grandfather_money in", values, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotIn(List<BigDecimal> values) {
            addCriterion("grandfather_money not in", values, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grandfather_money between", value1, value2, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grandfather_money not between", value1, value2, "grandfatherMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsSkuExample example;

        protected Criteria(GoodsSkuExample example) {
            super();
            this.example = example;
        }

        public GoodsSkuExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.zsl.malluserdb.po.GoodsSkuExample example);
    }
}