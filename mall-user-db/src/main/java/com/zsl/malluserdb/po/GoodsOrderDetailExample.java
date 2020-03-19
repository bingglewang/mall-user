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

        public Criteria andTotalFreightEqualTo(BigDecimal value) {
            addCriterion("total_freight =", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotEqualTo(BigDecimal value) {
            addCriterion("total_freight <>", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThan(BigDecimal value) {
            addCriterion("total_freight >", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_freight >=", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThan(BigDecimal value) {
            addCriterion("total_freight <", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_freight <=", value, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("total_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalFreightIn(List<BigDecimal> values) {
            addCriterion("total_freight in", values, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotIn(List<BigDecimal> values) {
            addCriterion("total_freight not in", values, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_freight between", value1, value2, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andTotalFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_freight not between", value1, value2, "totalFreight");
            return (Criteria) this;
        }

        public Criteria andFreightInfoIsNull() {
            addCriterion("freight_info is null");
            return (Criteria) this;
        }

        public Criteria andFreightInfoIsNotNull() {
            addCriterion("freight_info is not null");
            return (Criteria) this;
        }

        public Criteria andFreightInfoEqualTo(String value) {
            addCriterion("freight_info =", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_info = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightInfoNotEqualTo(String value) {
            addCriterion("freight_info <>", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_info <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightInfoGreaterThan(String value) {
            addCriterion("freight_info >", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_info > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightInfoGreaterThanOrEqualTo(String value) {
            addCriterion("freight_info >=", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_info >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightInfoLessThan(String value) {
            addCriterion("freight_info <", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_info < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightInfoLessThanOrEqualTo(String value) {
            addCriterion("freight_info <=", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_info <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightInfoLike(String value) {
            addCriterion("freight_info like", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoNotLike(String value) {
            addCriterion("freight_info not like", value, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoIn(List<String> values) {
            addCriterion("freight_info in", values, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoNotIn(List<String> values) {
            addCriterion("freight_info not in", values, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoBetween(String value1, String value2) {
            addCriterion("freight_info between", value1, value2, "freightInfo");
            return (Criteria) this;
        }

        public Criteria andFreightInfoNotBetween(String value1, String value2) {
            addCriterion("freight_info not between", value1, value2, "freightInfo");
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

        public Criteria andReturnedIsNull() {
            addCriterion("returned is null");
            return (Criteria) this;
        }

        public Criteria andReturnedIsNotNull() {
            addCriterion("returned is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedEqualTo(Boolean value) {
            addCriterion("returned =", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("returned = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnedNotEqualTo(Boolean value) {
            addCriterion("returned <>", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("returned <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThan(Boolean value) {
            addCriterion("returned >", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("returned > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("returned >=", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("returned >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnedLessThan(Boolean value) {
            addCriterion("returned <", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("returned < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnedLessThanOrEqualTo(Boolean value) {
            addCriterion("returned <=", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("returned <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnedIn(List<Boolean> values) {
            addCriterion("returned in", values, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotIn(List<Boolean> values) {
            addCriterion("returned not in", values, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedBetween(Boolean value1, Boolean value2) {
            addCriterion("returned between", value1, value2, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("returned not between", value1, value2, "returned");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountIsNull() {
            addCriterion("surplus_valid_count is null");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountIsNotNull() {
            addCriterion("surplus_valid_count is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountEqualTo(Integer value) {
            addCriterion("surplus_valid_count =", value, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("surplus_valid_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountNotEqualTo(Integer value) {
            addCriterion("surplus_valid_count <>", value, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("surplus_valid_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountGreaterThan(Integer value) {
            addCriterion("surplus_valid_count >", value, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("surplus_valid_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_valid_count >=", value, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("surplus_valid_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountLessThan(Integer value) {
            addCriterion("surplus_valid_count <", value, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("surplus_valid_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_valid_count <=", value, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("surplus_valid_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountIn(List<Integer> values) {
            addCriterion("surplus_valid_count in", values, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountNotIn(List<Integer> values) {
            addCriterion("surplus_valid_count not in", values, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountBetween(Integer value1, Integer value2) {
            addCriterion("surplus_valid_count between", value1, value2, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andSurplusValidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_valid_count not between", value1, value2, "surplusValidCount");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureIsNull() {
            addCriterion("goods_picture is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureIsNotNull() {
            addCriterion("goods_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureEqualTo(String value) {
            addCriterion("goods_picture =", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_picture = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotEqualTo(String value) {
            addCriterion("goods_picture <>", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_picture <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThan(String value) {
            addCriterion("goods_picture >", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_picture > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("goods_picture >=", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_picture >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThan(String value) {
            addCriterion("goods_picture <", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_picture < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThanOrEqualTo(String value) {
            addCriterion("goods_picture <=", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_picture <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLike(String value) {
            addCriterion("goods_picture like", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotLike(String value) {
            addCriterion("goods_picture not like", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureIn(List<String> values) {
            addCriterion("goods_picture in", values, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotIn(List<String> values) {
            addCriterion("goods_picture not in", values, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureBetween(String value1, String value2) {
            addCriterion("goods_picture between", value1, value2, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotBetween(String value1, String value2) {
            addCriterion("goods_picture not between", value1, value2, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNull() {
            addCriterion("goods_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNotNull() {
            addCriterion("goods_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualTo(String value) {
            addCriterion("goods_spec =", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_spec = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualTo(String value) {
            addCriterion("goods_spec <>", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_spec <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThan(String value) {
            addCriterion("goods_spec >", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_spec > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec >=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_spec >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThan(String value) {
            addCriterion("goods_spec <", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_spec < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualTo(String value) {
            addCriterion("goods_spec <=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("goods_spec <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLike(String value) {
            addCriterion("goods_spec like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotLike(String value) {
            addCriterion("goods_spec not like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIn(List<String> values) {
            addCriterion("goods_spec in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotIn(List<String> values) {
            addCriterion("goods_spec not in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecBetween(String value1, String value2) {
            addCriterion("goods_spec between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotBetween(String value1, String value2) {
            addCriterion("goods_spec not between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyIsNull() {
            addCriterion("present_money is null");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyIsNotNull() {
            addCriterion("present_money is not null");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyEqualTo(BigDecimal value) {
            addCriterion("present_money =", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("present_money <>", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThan(BigDecimal value) {
            addCriterion("present_money >", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("present_money >=", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThan(BigDecimal value) {
            addCriterion("present_money <", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("present_money <=", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("present_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyIn(List<BigDecimal> values) {
            addCriterion("present_money in", values, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("present_money not in", values, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("present_money between", value1, value2, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("present_money not between", value1, value2, "presentMoney");
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

        public Criteria andFatherMoneyEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("father_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("father_money <>", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("father_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("father_money >", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("father_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money >=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("father_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThan(BigDecimal value) {
            addCriterion("father_money <", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("father_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money <=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
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

        public Criteria andGrandfatherMoneyEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("grandfather_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <>", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("grandfather_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("grandfather_money >", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("grandfather_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money >=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("grandfather_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThan(BigDecimal value) {
            addCriterion("grandfather_money <", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("grandfather_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
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

        public Criteria andDeductionIsNull() {
            addCriterion("deduction is null");
            return (Criteria) this;
        }

        public Criteria andDeductionIsNotNull() {
            addCriterion("deduction is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionEqualTo(BigDecimal value) {
            addCriterion("deduction =", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionNotEqualTo(BigDecimal value) {
            addCriterion("deduction <>", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGreaterThan(BigDecimal value) {
            addCriterion("deduction >", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction >=", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionLessThan(BigDecimal value) {
            addCriterion("deduction <", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction <=", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionIn(List<BigDecimal> values) {
            addCriterion("deduction in", values, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionNotIn(List<BigDecimal> values) {
            addCriterion("deduction not in", values, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction between", value1, value2, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction not between", value1, value2, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountIsNull() {
            addCriterion("deduction_goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountIsNotNull() {
            addCriterion("deduction_goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("deduction_goods_amount =", value, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction_goods_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("deduction_goods_amount <>", value, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountNotEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction_goods_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("deduction_goods_amount >", value, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountGreaterThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction_goods_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction_goods_amount >=", value, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountGreaterThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction_goods_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountLessThan(BigDecimal value) {
            addCriterion("deduction_goods_amount <", value, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountLessThanColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction_goods_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction_goods_amount <=", value, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountLessThanOrEqualToColumn(GoodsOrderDetail.Column column) {
            addCriterion(new StringBuilder("deduction_goods_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("deduction_goods_amount in", values, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("deduction_goods_amount not in", values, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction_goods_amount between", value1, value2, "deductionGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction_goods_amount not between", value1, value2, "deductionGoodsAmount");
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