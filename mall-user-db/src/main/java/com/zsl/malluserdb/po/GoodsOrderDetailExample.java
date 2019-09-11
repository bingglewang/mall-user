package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsOrderDetailExample() {
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

    public GoodsOrderDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsOrderDetailExample orderBy(String ... orderByClauses) {
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
        GoodsOrderDetailExample example = new GoodsOrderDetailExample();
        return example.createCriteria();
    }

    public GoodsOrderDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsOrderDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNull() {
            addCriterion("total_point is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNotNull() {
            addCriterion("total_point is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointEqualTo(Integer value) {
            addCriterion("total_point =", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualTo(Integer value) {
            addCriterion("total_point <>", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThan(Integer value) {
            addCriterion("total_point >", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_point >=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThan(Integer value) {
            addCriterion("total_point <", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualTo(Integer value) {
            addCriterion("total_point <=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointIn(List<Integer> values) {
            addCriterion("total_point in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotIn(List<Integer> values) {
            addCriterion("total_point not in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointBetween(Integer value1, Integer value2) {
            addCriterion("total_point between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotBetween(Integer value1, Integer value2) {
            addCriterion("total_point not between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalFreightIsNull() {
            addCriterion("total_freight is null");
            return (Criteria) this;
        }

        public Criteria andTotalFreightIsNotNull() {
            addCriterion("total_freight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFreightEqualTo(Long value) {
            addCriterion("total_freight =", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotEqualTo(Long value) {
            addCriterion("total_freight <>", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThan(Long value) {
            addCriterion("total_freight >", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThanOrEqualTo(Long value) {
            addCriterion("total_freight >=", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThan(Long value) {
            addCriterion("total_freight <", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThanOrEqualTo(Long value) {
            addCriterion("total_freight <=", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightIn(List<Long> values) {
            addCriterion("total_freight in", values, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotIn(List<Long> values) {
            addCriterion("total_freight not in", values, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightBetween(Long value1, Long value2) {
            addCriterion("total_freight between", value1, value2, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotBetween(Long value1, Long value2) {
            addCriterion("total_freight not between", value1, value2, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andPresentCoinIsNull() {
            addCriterion("present_coin is null");
            return (Criteria) this;
        }

        public Criteria andPresentCoinIsNotNull() {
            addCriterion("present_coin is not null");
            return (Criteria) this;
        }

        public Criteria andPresentCoinEqualTo(Integer value) {
            addCriterion("present_coin =", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualTo(Integer value) {
            addCriterion("present_coin <>", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThan(Integer value) {
            addCriterion("present_coin >", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("present_coin >=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThan(Integer value) {
            addCriterion("present_coin <", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualTo(Integer value) {
            addCriterion("present_coin <=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinIn(List<Integer> values) {
            addCriterion("present_coin in", values, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotIn(List<Integer> values) {
            addCriterion("present_coin not in", values, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinBetween(Integer value1, Integer value2) {
            addCriterion("present_coin between", value1, value2, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("present_coin not between", value1, value2, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionIsNull() {
            addCriterion("degree_of_satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionIsNotNull() {
            addCriterion("degree_of_satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionEqualTo(Boolean value) {
            addCriterion("degree_of_satisfaction =", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotEqualTo(Boolean value) {
            addCriterion("degree_of_satisfaction <>", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThan(Boolean value) {
            addCriterion("degree_of_satisfaction >", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("degree_of_satisfaction >=", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThan(Boolean value) {
            addCriterion("degree_of_satisfaction <", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThanOrEqualTo(Boolean value) {
            addCriterion("degree_of_satisfaction <=", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionIn(List<Boolean> values) {
            addCriterion("degree_of_satisfaction in", values, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotIn(List<Boolean> values) {
            addCriterion("degree_of_satisfaction not in", values, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionBetween(Boolean value1, Boolean value2) {
            addCriterion("degree_of_satisfaction between", value1, value2, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("degree_of_satisfaction not between", value1, value2, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNull() {
            addCriterion("evaluation_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNotNull() {
            addCriterion("evaluation_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentEqualTo(String value) {
            addCriterion("evaluation_content =", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotEqualTo(String value) {
            addCriterion("evaluation_content <>", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThan(String value) {
            addCriterion("evaluation_content >", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_content >=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThan(String value) {
            addCriterion("evaluation_content <", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanOrEqualTo(String value) {
            addCriterion("evaluation_content <=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLike(String value) {
            addCriterion("evaluation_content like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotLike(String value) {
            addCriterion("evaluation_content not like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIn(List<String> values) {
            addCriterion("evaluation_content in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotIn(List<String> values) {
            addCriterion("evaluation_content not in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentBetween(String value1, String value2) {
            addCriterion("evaluation_content between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotBetween(String value1, String value2) {
            addCriterion("evaluation_content not between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlIsNull() {
            addCriterion("evaluation_image_url is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlIsNotNull() {
            addCriterion("evaluation_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlEqualTo(String value) {
            addCriterion("evaluation_image_url =", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotEqualTo(String value) {
            addCriterion("evaluation_image_url <>", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThan(String value) {
            addCriterion("evaluation_image_url >", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_image_url >=", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThan(String value) {
            addCriterion("evaluation_image_url <", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThanOrEqualTo(String value) {
            addCriterion("evaluation_image_url <=", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLike(String value) {
            addCriterion("evaluation_image_url like", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotLike(String value) {
            addCriterion("evaluation_image_url not like", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlIn(List<String> values) {
            addCriterion("evaluation_image_url in", values, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotIn(List<String> values) {
            addCriterion("evaluation_image_url not in", values, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlBetween(String value1, String value2) {
            addCriterion("evaluation_image_url between", value1, value2, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotBetween(String value1, String value2) {
            addCriterion("evaluation_image_url not between", value1, value2, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andAnonymityIsNull() {
            addCriterion("anonymity is null");
            return (Criteria) this;
        }

        public Criteria andAnonymityIsNotNull() {
            addCriterion("anonymity is not null");
            return (Criteria) this;
        }

        public Criteria andAnonymityEqualTo(Boolean value) {
            addCriterion("anonymity =", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("anonymity = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityNotEqualTo(Boolean value) {
            addCriterion("anonymity <>", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("anonymity <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThan(Boolean value) {
            addCriterion("anonymity >", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("anonymity > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("anonymity >=", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("anonymity >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThan(Boolean value) {
            addCriterion("anonymity <", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("anonymity < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanOrEqualTo(Boolean value) {
            addCriterion("anonymity <=", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("anonymity <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityIn(List<Boolean> values) {
            addCriterion("anonymity in", values, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotIn(List<Boolean> values) {
            addCriterion("anonymity not in", values, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityBetween(Boolean value1, Boolean value2) {
            addCriterion("anonymity between", value1, value2, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("anonymity not between", value1, value2, "anonymity");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsOrderDetailExample example;

        protected Criteria(GoodsOrderDetailExample example) {
            super();
            this.example = example;
        }

        public GoodsOrderDetailExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsOrderDetailExample example);
    }
}