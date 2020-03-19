package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsOrderInfoExample() {
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

    public GoodsOrderInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsOrderInfoExample orderBy(String ... orderByClauses) {
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
        GoodsOrderInfoExample example = new GoodsOrderInfoExample();
        return example.createCriteria();
    }

    public GoodsOrderInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsOrderInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andOrderNoEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
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

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("trade_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
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

        public Criteria andShopIdEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
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

        public Criteria andPreStateIsNull() {
            addCriterion("pre_state is null");
            return (Criteria) this;
        }

        public Criteria andPreStateIsNotNull() {
            addCriterion("pre_state is not null");
            return (Criteria) this;
        }

        public Criteria andPreStateEqualTo(Boolean value) {
            addCriterion("pre_state =", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("pre_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStateNotEqualTo(Boolean value) {
            addCriterion("pre_state <>", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("pre_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStateGreaterThan(Boolean value) {
            addCriterion("pre_state >", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("pre_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pre_state >=", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("pre_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStateLessThan(Boolean value) {
            addCriterion("pre_state <", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("pre_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStateLessThanOrEqualTo(Boolean value) {
            addCriterion("pre_state <=", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("pre_state <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStateIn(List<Boolean> values) {
            addCriterion("pre_state in", values, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateNotIn(List<Boolean> values) {
            addCriterion("pre_state not in", values, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateBetween(Boolean value1, Boolean value2) {
            addCriterion("pre_state between", value1, value2, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pre_state not between", value1, value2, "preState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNull() {
            addCriterion("current_state is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNotNull() {
            addCriterion("current_state is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateEqualTo(Boolean value) {
            addCriterion("current_state =", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("current_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualTo(Boolean value) {
            addCriterion("current_state <>", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("current_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThan(Boolean value) {
            addCriterion("current_state >", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("current_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("current_state >=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("current_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThan(Boolean value) {
            addCriterion("current_state <", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("current_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualTo(Boolean value) {
            addCriterion("current_state <=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("current_state <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateIn(List<Boolean> values) {
            addCriterion("current_state in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotIn(List<Boolean> values) {
            addCriterion("current_state not in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateBetween(Boolean value1, Boolean value2) {
            addCriterion("current_state between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("current_state not between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdIsNull() {
            addCriterion("tracking_company_id is null");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdIsNotNull() {
            addCriterion("tracking_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdEqualTo(Integer value) {
            addCriterion("tracking_company_id =", value, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_company_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdNotEqualTo(Integer value) {
            addCriterion("tracking_company_id <>", value, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_company_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdGreaterThan(Integer value) {
            addCriterion("tracking_company_id >", value, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_company_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tracking_company_id >=", value, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_company_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdLessThan(Integer value) {
            addCriterion("tracking_company_id <", value, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_company_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("tracking_company_id <=", value, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_company_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdIn(List<Integer> values) {
            addCriterion("tracking_company_id in", values, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdNotIn(List<Integer> values) {
            addCriterion("tracking_company_id not in", values, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("tracking_company_id between", value1, value2, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tracking_company_id not between", value1, value2, "trackingCompanyId");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberIsNull() {
            addCriterion("tracking_number is null");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberIsNotNull() {
            addCriterion("tracking_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberEqualTo(String value) {
            addCriterion("tracking_number =", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNumberNotEqualTo(String value) {
            addCriterion("tracking_number <>", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNumberGreaterThan(String value) {
            addCriterion("tracking_number >", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tracking_number >=", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNumberLessThan(String value) {
            addCriterion("tracking_number <", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNumberLessThanOrEqualTo(String value) {
            addCriterion("tracking_number <=", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("tracking_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNumberLike(String value) {
            addCriterion("tracking_number like", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberNotLike(String value) {
            addCriterion("tracking_number not like", value, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberIn(List<String> values) {
            addCriterion("tracking_number in", values, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberNotIn(List<String> values) {
            addCriterion("tracking_number not in", values, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberBetween(String value1, String value2) {
            addCriterion("tracking_number between", value1, value2, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andTrackingNumberNotBetween(String value1, String value2) {
            addCriterion("tracking_number not between", value1, value2, "trackingNumber");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Date value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shipping_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Date value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shipping_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Date value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shipping_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shipping_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Date value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shipping_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shipping_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Date> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Date> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Date value1, Date value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateIsNull() {
            addCriterion("order_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateIsNotNull() {
            addCriterion("order_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateEqualTo(Boolean value) {
            addCriterion("order_evaluate =", value, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_evaluate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateNotEqualTo(Boolean value) {
            addCriterion("order_evaluate <>", value, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_evaluate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateGreaterThan(Boolean value) {
            addCriterion("order_evaluate >", value, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_evaluate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_evaluate >=", value, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_evaluate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateLessThan(Boolean value) {
            addCriterion("order_evaluate <", value, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_evaluate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateLessThanOrEqualTo(Boolean value) {
            addCriterion("order_evaluate <=", value, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("order_evaluate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateIn(List<Boolean> values) {
            addCriterion("order_evaluate in", values, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateNotIn(List<Boolean> values) {
            addCriterion("order_evaluate not in", values, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateBetween(Boolean value1, Boolean value2) {
            addCriterion("order_evaluate between", value1, value2, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_evaluate not between", value1, value2, "orderEvaluate");
            return (Criteria) this;
        }

        public Criteria andShopFreightIsNull() {
            addCriterion("shop_freight is null");
            return (Criteria) this;
        }

        public Criteria andShopFreightIsNotNull() {
            addCriterion("shop_freight is not null");
            return (Criteria) this;
        }

        public Criteria andShopFreightEqualTo(BigDecimal value) {
            addCriterion("shop_freight =", value, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopFreightNotEqualTo(BigDecimal value) {
            addCriterion("shop_freight <>", value, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopFreightGreaterThan(BigDecimal value) {
            addCriterion("shop_freight >", value, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_freight >=", value, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopFreightLessThan(BigDecimal value) {
            addCriterion("shop_freight <", value, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_freight <=", value, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("shop_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopFreightIn(List<BigDecimal> values) {
            addCriterion("shop_freight in", values, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightNotIn(List<BigDecimal> values) {
            addCriterion("shop_freight not in", values, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_freight between", value1, value2, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andShopFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_freight not between", value1, value2, "shopFreight");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeIsNull() {
            addCriterion("freight_template_type is null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeIsNotNull() {
            addCriterion("freight_template_type is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeEqualTo(Integer value) {
            addCriterion("freight_template_type =", value, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("freight_template_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeNotEqualTo(Integer value) {
            addCriterion("freight_template_type <>", value, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeNotEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("freight_template_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeGreaterThan(Integer value) {
            addCriterion("freight_template_type >", value, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeGreaterThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("freight_template_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_template_type >=", value, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeGreaterThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("freight_template_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeLessThan(Integer value) {
            addCriterion("freight_template_type <", value, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeLessThanColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("freight_template_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("freight_template_type <=", value, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeLessThanOrEqualToColumn(GoodsOrderInfo.Column column) {
            addCriterion(new StringBuilder("freight_template_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeIn(List<Integer> values) {
            addCriterion("freight_template_type in", values, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeNotIn(List<Integer> values) {
            addCriterion("freight_template_type not in", values, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeBetween(Integer value1, Integer value2) {
            addCriterion("freight_template_type between", value1, value2, "freightTemplateType");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_template_type not between", value1, value2, "freightTemplateType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsOrderInfoExample example;

        protected Criteria(GoodsOrderInfoExample example) {
            super();
            this.example = example;
        }

        public GoodsOrderInfoExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsOrderInfoExample example);
    }
}