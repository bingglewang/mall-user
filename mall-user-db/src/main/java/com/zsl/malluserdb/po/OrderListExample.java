package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderListExample() {
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

    public OrderListExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public OrderListExample orderBy(String ... orderByClauses) {
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
        OrderListExample example = new OrderListExample();
        return example.createCriteria();
    }

    public OrderListExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public OrderListExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andTradeNoEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("member_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("member_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("member_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("member_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("member_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("member_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(Byte value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(Byte value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(Byte value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(Byte value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<Byte> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<Byte> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(Byte value1, Byte value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(Float value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(Float value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(Float value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(Float value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(Float value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<Float> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<Float> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(Float value1, Float value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(Float value1, Float value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeCountIsNull() {
            addCriterion("trade_count is null");
            return (Criteria) this;
        }

        public Criteria andTradeCountIsNotNull() {
            addCriterion("trade_count is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCountEqualTo(Integer value) {
            addCriterion("trade_count =", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeCountNotEqualTo(Integer value) {
            addCriterion("trade_count <>", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThan(Integer value) {
            addCriterion("trade_count >", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_count >=", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThan(Integer value) {
            addCriterion("trade_count <", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThanOrEqualTo(Integer value) {
            addCriterion("trade_count <=", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeCountIn(List<Integer> values) {
            addCriterion("trade_count in", values, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotIn(List<Integer> values) {
            addCriterion("trade_count not in", values, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountBetween(Integer value1, Integer value2) {
            addCriterion("trade_count between", value1, value2, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_count not between", value1, value2, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradePointIsNull() {
            addCriterion("trade_point is null");
            return (Criteria) this;
        }

        public Criteria andTradePointIsNotNull() {
            addCriterion("trade_point is not null");
            return (Criteria) this;
        }

        public Criteria andTradePointEqualTo(Integer value) {
            addCriterion("trade_point =", value, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradePointNotEqualTo(Integer value) {
            addCriterion("trade_point <>", value, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradePointGreaterThan(Integer value) {
            addCriterion("trade_point >", value, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_point >=", value, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradePointLessThan(Integer value) {
            addCriterion("trade_point <", value, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradePointLessThanOrEqualTo(Integer value) {
            addCriterion("trade_point <=", value, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_point <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradePointIn(List<Integer> values) {
            addCriterion("trade_point in", values, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointNotIn(List<Integer> values) {
            addCriterion("trade_point not in", values, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointBetween(Integer value1, Integer value2) {
            addCriterion("trade_point between", value1, value2, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andTradePointNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_point not between", value1, value2, "tradePoint");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNull() {
            addCriterion("evaluate is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNotNull() {
            addCriterion("evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEqualTo(Boolean value) {
            addCriterion("evaluate =", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("evaluate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(Boolean value) {
            addCriterion("evaluate <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("evaluate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(Boolean value) {
            addCriterion("evaluate >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("evaluate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("evaluate >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("evaluate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(Boolean value) {
            addCriterion("evaluate <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("evaluate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(Boolean value) {
            addCriterion("evaluate <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("evaluate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateIn(List<Boolean> values) {
            addCriterion("evaluate in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotIn(List<Boolean> values) {
            addCriterion("evaluate not in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateBetween(Boolean value1, Boolean value2) {
            addCriterion("evaluate between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("evaluate not between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andFreightChargeIsNull() {
            addCriterion("freight_charge is null");
            return (Criteria) this;
        }

        public Criteria andFreightChargeIsNotNull() {
            addCriterion("freight_charge is not null");
            return (Criteria) this;
        }

        public Criteria andFreightChargeEqualTo(BigDecimal value) {
            addCriterion("freight_charge =", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("freight_charge = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualTo(BigDecimal value) {
            addCriterion("freight_charge <>", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("freight_charge <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThan(BigDecimal value) {
            addCriterion("freight_charge >", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("freight_charge > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge >=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("freight_charge >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThan(BigDecimal value) {
            addCriterion("freight_charge <", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("freight_charge < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge <=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("freight_charge <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeIn(List<BigDecimal> values) {
            addCriterion("freight_charge in", values, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotIn(List<BigDecimal> values) {
            addCriterion("freight_charge not in", values, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_charge between", value1, value2, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_charge not between", value1, value2, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("trade_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andOrderNoEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("order_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("order_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("order_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("order_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("order_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andCurrentStateEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualTo(Boolean value) {
            addCriterion("current_state <>", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThan(Boolean value) {
            addCriterion("current_state >", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("current_state >=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThan(Boolean value) {
            addCriterion("current_state <", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("current_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualTo(Boolean value) {
            addCriterion("current_state <=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andChildAmountIsNull() {
            addCriterion("child_amount is null");
            return (Criteria) this;
        }

        public Criteria andChildAmountIsNotNull() {
            addCriterion("child_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChildAmountEqualTo(BigDecimal value) {
            addCriterion("child_amount =", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountNotEqualTo(BigDecimal value) {
            addCriterion("child_amount <>", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThan(BigDecimal value) {
            addCriterion("child_amount >", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("child_amount >=", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThan(BigDecimal value) {
            addCriterion("child_amount <", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("child_amount <=", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountIn(List<BigDecimal> values) {
            addCriterion("child_amount in", values, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotIn(List<BigDecimal> values) {
            addCriterion("child_amount not in", values, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("child_amount between", value1, value2, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("child_amount not between", value1, value2, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildCountIsNull() {
            addCriterion("child_count is null");
            return (Criteria) this;
        }

        public Criteria andChildCountIsNotNull() {
            addCriterion("child_count is not null");
            return (Criteria) this;
        }

        public Criteria andChildCountEqualTo(Integer value) {
            addCriterion("child_count =", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountNotEqualTo(Integer value) {
            addCriterion("child_count <>", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThan(Integer value) {
            addCriterion("child_count >", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_count >=", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountLessThan(Integer value) {
            addCriterion("child_count <", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountLessThanOrEqualTo(Integer value) {
            addCriterion("child_count <=", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountIn(List<Integer> values) {
            addCriterion("child_count in", values, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountNotIn(List<Integer> values) {
            addCriterion("child_count not in", values, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountBetween(Integer value1, Integer value2) {
            addCriterion("child_count between", value1, value2, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountNotBetween(Integer value1, Integer value2) {
            addCriterion("child_count not between", value1, value2, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildPointIsNull() {
            addCriterion("child_point is null");
            return (Criteria) this;
        }

        public Criteria andChildPointIsNotNull() {
            addCriterion("child_point is not null");
            return (Criteria) this;
        }

        public Criteria andChildPointEqualTo(Integer value) {
            addCriterion("child_point =", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointNotEqualTo(Integer value) {
            addCriterion("child_point <>", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThan(Integer value) {
            addCriterion("child_point >", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_point >=", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointLessThan(Integer value) {
            addCriterion("child_point <", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointLessThanOrEqualTo(Integer value) {
            addCriterion("child_point <=", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("child_point <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointIn(List<Integer> values) {
            addCriterion("child_point in", values, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointNotIn(List<Integer> values) {
            addCriterion("child_point not in", values, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointBetween(Integer value1, Integer value2) {
            addCriterion("child_point between", value1, value2, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointNotBetween(Integer value1, Integer value2) {
            addCriterion("child_point not between", value1, value2, "childPoint");
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

        public Criteria andSkuNameEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andPriceEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andPictureUrlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualTo(String value) {
            addCriterion("picture_url =", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("picture_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("picture_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("picture_url >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("picture_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("picture_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("picture_url <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("picture_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("picture_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlLike(String value) {
            addCriterion("picture_url like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotLike(String value) {
            addCriterion("picture_url not like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIn(List<String> values) {
            addCriterion("picture_url in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andSpecValueIsNull() {
            addCriterion("spec_value is null");
            return (Criteria) this;
        }

        public Criteria andSpecValueIsNotNull() {
            addCriterion("spec_value is not null");
            return (Criteria) this;
        }

        public Criteria andSpecValueEqualTo(String value) {
            addCriterion("spec_value =", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_value = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueNotEqualTo(String value) {
            addCriterion("spec_value <>", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_value <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThan(String value) {
            addCriterion("spec_value >", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_value > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanOrEqualTo(String value) {
            addCriterion("spec_value >=", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_value >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThan(String value) {
            addCriterion("spec_value <", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_value < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanOrEqualTo(String value) {
            addCriterion("spec_value <=", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_value <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueLike(String value) {
            addCriterion("spec_value like", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotLike(String value) {
            addCriterion("spec_value not like", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueIn(List<String> values) {
            addCriterion("spec_value in", values, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotIn(List<String> values) {
            addCriterion("spec_value not in", values, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueBetween(String value1, String value2) {
            addCriterion("spec_value between", value1, value2, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotBetween(String value1, String value2) {
            addCriterion("spec_value not between", value1, value2, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("spec_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
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

        public Criteria andShopIdEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("shop_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andSkuIdEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("sku_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualToColumn(OrderList.Column column) {
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

        public Criteria andTotalCoinIsNull() {
            addCriterion("total_coin is null");
            return (Criteria) this;
        }

        public Criteria andTotalCoinIsNotNull() {
            addCriterion("total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCoinEqualTo(Integer value) {
            addCriterion("total_coin =", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotEqualTo(Integer value) {
            addCriterion("total_coin <>", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThan(Integer value) {
            addCriterion("total_coin >", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_coin >=", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThan(Integer value) {
            addCriterion("total_coin <", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("total_coin <=", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinIn(List<Integer> values) {
            addCriterion("total_coin in", values, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotIn(List<Integer> values) {
            addCriterion("total_coin not in", values, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("total_coin between", value1, value2, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("total_coin not between", value1, value2, "totalCoin");
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

        public Criteria andPresentCoinEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("present_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualTo(Integer value) {
            addCriterion("present_coin <>", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("present_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThan(Integer value) {
            addCriterion("present_coin >", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("present_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("present_coin >=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualToColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("present_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThan(Integer value) {
            addCriterion("present_coin <", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanColumn(OrderList.Column column) {
            addCriterion(new StringBuilder("present_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualTo(Integer value) {
            addCriterion("present_coin <=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualToColumn(OrderList.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private OrderListExample example;

        protected Criteria(OrderListExample example) {
            super();
            this.example = example;
        }

        public OrderListExample example() {
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
        void example(com.zsl.malluserdb.po.OrderListExample example);
    }
}