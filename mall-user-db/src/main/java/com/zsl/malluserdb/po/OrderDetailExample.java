package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

    public OrderDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public OrderDetailExample orderBy(String ... orderByClauses) {
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
        OrderDetailExample example = new OrderDetailExample();
        return example.createCriteria();
    }

    public OrderDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public OrderDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andTradeNoEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andMemberIdEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("member_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("member_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("member_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("member_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("member_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andCurrentStatusEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(Byte value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(Byte value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(Byte value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Byte value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("pay_way = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Byte value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("pay_way <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Byte value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("pay_way > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("pay_way >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Byte value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("pay_way < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Byte value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("pay_way <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Byte> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Byte> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Byte value1, Byte value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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

        public Criteria andTotalAmountEqualTo(Float value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Float value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Float value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Float value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Float value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Float> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Float> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Float value1, Float value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Float value1, Float value2) {
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

        public Criteria andTotalCountEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andTotalPointEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualTo(Integer value) {
            addCriterion("total_point <>", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThan(Integer value) {
            addCriterion("total_point >", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_point >=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThan(Integer value) {
            addCriterion("total_point <", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualTo(Integer value) {
            addCriterion("total_point <=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("remark = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("remark <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("remark > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("remark >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("remark < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("remark <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andEvaluateEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(Boolean value) {
            addCriterion("evaluate <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(Boolean value) {
            addCriterion("evaluate >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("evaluate >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(Boolean value) {
            addCriterion("evaluate <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("evaluate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(Boolean value) {
            addCriterion("evaluate <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andTradeTimeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("trade_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("payment_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("payment_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("payment_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("payment_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("payment_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("payment_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("finish_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("finish_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("finish_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("finish_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("finish_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("finish_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
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

        public Criteria andEndTimeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andShipmentsTimeIsNull() {
            addCriterion("shipments_time is null");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeIsNotNull() {
            addCriterion("shipments_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeEqualTo(Date value) {
            addCriterion("shipments_time =", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shipments_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeNotEqualTo(Date value) {
            addCriterion("shipments_time <>", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shipments_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThan(Date value) {
            addCriterion("shipments_time >", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shipments_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipments_time >=", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shipments_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThan(Date value) {
            addCriterion("shipments_time <", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shipments_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipments_time <=", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shipments_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeIn(List<Date> values) {
            addCriterion("shipments_time in", values, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeNotIn(List<Date> values) {
            addCriterion("shipments_time not in", values, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeBetween(Date value1, Date value2) {
            addCriterion("shipments_time between", value1, value2, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipments_time not between", value1, value2, "shipmentsTime");
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

        public Criteria andFreightChargeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_charge = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualTo(BigDecimal value) {
            addCriterion("freight_charge <>", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_charge <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThan(BigDecimal value) {
            addCriterion("freight_charge >", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_charge > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge >=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_charge >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThan(BigDecimal value) {
            addCriterion("freight_charge <", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("freight_charge < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge <=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andOrderNoEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("order_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andCurrentStateEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualTo(Boolean value) {
            addCriterion("current_state <>", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThan(Boolean value) {
            addCriterion("current_state >", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("current_state >=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThan(Boolean value) {
            addCriterion("current_state <", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("current_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualTo(Boolean value) {
            addCriterion("current_state <=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andChildAmountEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountNotEqualTo(BigDecimal value) {
            addCriterion("child_amount <>", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThan(BigDecimal value) {
            addCriterion("child_amount >", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("child_amount >=", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThan(BigDecimal value) {
            addCriterion("child_amount <", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("child_amount <=", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andChildCountEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountNotEqualTo(Integer value) {
            addCriterion("child_count <>", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThan(Integer value) {
            addCriterion("child_count >", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_count >=", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountLessThan(Integer value) {
            addCriterion("child_count <", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildCountLessThanOrEqualTo(Integer value) {
            addCriterion("child_count <=", value, "childCount");
            return (Criteria) this;
        }

        public Criteria andChildCountLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andChildPointEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointNotEqualTo(Integer value) {
            addCriterion("child_point <>", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThan(Integer value) {
            addCriterion("child_point >", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_point >=", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointLessThan(Integer value) {
            addCriterion("child_point <", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("child_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andChildPointLessThanOrEqualTo(Integer value) {
            addCriterion("child_point <=", value, "childPoint");
            return (Criteria) this;
        }

        public Criteria andChildPointLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andSkuNameEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andPriceEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andPictureUrlEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("picture_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("picture_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("picture_url >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("picture_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("picture_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("picture_url <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("picture_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andSpecValueEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_value = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueNotEqualTo(String value) {
            addCriterion("spec_value <>", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_value <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThan(String value) {
            addCriterion("spec_value >", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_value > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanOrEqualTo(String value) {
            addCriterion("spec_value >=", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_value >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThan(String value) {
            addCriterion("spec_value <", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_value < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanOrEqualTo(String value) {
            addCriterion("spec_value <=", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andSpecNameEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("spec_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andShopNameEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andFullSiteIsNull() {
            addCriterion("full_site is null");
            return (Criteria) this;
        }

        public Criteria andFullSiteIsNotNull() {
            addCriterion("full_site is not null");
            return (Criteria) this;
        }

        public Criteria andFullSiteEqualTo(String value) {
            addCriterion("full_site =", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("full_site = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFullSiteNotEqualTo(String value) {
            addCriterion("full_site <>", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("full_site <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFullSiteGreaterThan(String value) {
            addCriterion("full_site >", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("full_site > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFullSiteGreaterThanOrEqualTo(String value) {
            addCriterion("full_site >=", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("full_site >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFullSiteLessThan(String value) {
            addCriterion("full_site <", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("full_site < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFullSiteLessThanOrEqualTo(String value) {
            addCriterion("full_site <=", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("full_site <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFullSiteLike(String value) {
            addCriterion("full_site like", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteNotLike(String value) {
            addCriterion("full_site not like", value, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteIn(List<String> values) {
            addCriterion("full_site in", values, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteNotIn(List<String> values) {
            addCriterion("full_site not in", values, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteBetween(String value1, String value2) {
            addCriterion("full_site between", value1, value2, "fullSite");
            return (Criteria) this;
        }

        public Criteria andFullSiteNotBetween(String value1, String value2) {
            addCriterion("full_site not between", value1, value2, "fullSite");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("consignee = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("consignee <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("consignee > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("consignee >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("consignee < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("consignee <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("mobile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("mobile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("mobile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("mobile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("mobile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("mobile <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("is_default = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("is_default <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("is_default > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("is_default >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("is_default < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("is_default <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
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

        public Criteria andShopIdEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("shop_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andSkuIdEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("sku_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andTotalCoinEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotEqualTo(Integer value) {
            addCriterion("total_coin <>", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThan(Integer value) {
            addCriterion("total_coin >", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_coin >=", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThan(Integer value) {
            addCriterion("total_coin <", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("total_coin <=", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanOrEqualToColumn(OrderDetail.Column column) {
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

        public Criteria andPresentCoinEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualTo(Integer value) {
            addCriterion("present_coin <>", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThan(Integer value) {
            addCriterion("present_coin >", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("present_coin >=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualToColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThan(Integer value) {
            addCriterion("present_coin <", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanColumn(OrderDetail.Column column) {
            addCriterion(new StringBuilder("present_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualTo(Integer value) {
            addCriterion("present_coin <=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualToColumn(OrderDetail.Column column) {
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
        private OrderDetailExample example;

        protected Criteria(OrderDetailExample example) {
            super();
            this.example = example;
        }

        public OrderDetailExample example() {
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
        void example(com.zsl.malluserdb.po.OrderDetailExample example);
    }
}