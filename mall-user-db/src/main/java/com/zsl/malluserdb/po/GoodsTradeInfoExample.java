package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsTradeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTradeInfoExample() {
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

    public GoodsTradeInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsTradeInfoExample orderBy(String ... orderByClauses) {
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
        GoodsTradeInfoExample example = new GoodsTradeInfoExample();
        return example.createCriteria();
    }

    public GoodsTradeInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsTradeInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andTradeNoEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
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

        public Criteria andMemberIdEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("member_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("member_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("member_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("member_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("member_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("address_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("address_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("address_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("address_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("address_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("address_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
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

        public Criteria andPayWayEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Byte value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Byte value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Byte value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Byte value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andCurrentStatusEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("current_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(Byte value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("current_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(Byte value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("current_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("current_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(Byte value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("current_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andPreStatusIsNull() {
            addCriterion("pre_status is null");
            return (Criteria) this;
        }

        public Criteria andPreStatusIsNotNull() {
            addCriterion("pre_status is not null");
            return (Criteria) this;
        }

        public Criteria andPreStatusEqualTo(Byte value) {
            addCriterion("pre_status =", value, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pre_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStatusNotEqualTo(Byte value) {
            addCriterion("pre_status <>", value, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pre_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStatusGreaterThan(Byte value) {
            addCriterion("pre_status >", value, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pre_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pre_status >=", value, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pre_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStatusLessThan(Byte value) {
            addCriterion("pre_status <", value, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pre_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pre_status <=", value, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("pre_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreStatusIn(List<Byte> values) {
            addCriterion("pre_status in", values, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusNotIn(List<Byte> values) {
            addCriterion("pre_status not in", values, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusBetween(Byte value1, Byte value2) {
            addCriterion("pre_status between", value1, value2, "preStatus");
            return (Criteria) this;
        }

        public Criteria andPreStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pre_status not between", value1, value2, "preStatus");
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

        public Criteria andEvaluateEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("evaluate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(Boolean value) {
            addCriterion("evaluate <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("evaluate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(Boolean value) {
            addCriterion("evaluate >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("evaluate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("evaluate >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("evaluate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(Boolean value) {
            addCriterion("evaluate <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("evaluate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(Boolean value) {
            addCriterion("evaluate <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andTotalAmountEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Float value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Float value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Float value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Float value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andTotalCountEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andTotalPointEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualTo(Integer value) {
            addCriterion("total_point <>", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThan(Integer value) {
            addCriterion("total_point >", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_point >=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThan(Integer value) {
            addCriterion("total_point <", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualTo(Integer value) {
            addCriterion("total_point <=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andTotalCoinEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotEqualTo(Integer value) {
            addCriterion("total_coin <>", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThan(Integer value) {
            addCriterion("total_coin >", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_coin >=", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThan(Integer value) {
            addCriterion("total_coin <", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("total_coin <=", value, "totalCoin");
            return (Criteria) this;
        }

        public Criteria andTotalCoinLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andFreightChargeEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("freight_charge = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualTo(BigDecimal value) {
            addCriterion("freight_charge <>", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("freight_charge <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThan(BigDecimal value) {
            addCriterion("freight_charge >", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("freight_charge > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge >=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("freight_charge >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThan(BigDecimal value) {
            addCriterion("freight_charge <", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("freight_charge < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge <=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andRemarkEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("remark = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("remark <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("remark > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("remark >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("remark < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andTradeTimeEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andPaymentTimeEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andFinishTimeEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("finish_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("finish_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("finish_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("finish_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("finish_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andEndTimeEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andShipmentsTimeEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipments_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeNotEqualTo(Date value) {
            addCriterion("shipments_time <>", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipments_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThan(Date value) {
            addCriterion("shipments_time >", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipments_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipments_time >=", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipments_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThan(Date value) {
            addCriterion("shipments_time <", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipments_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipments_time <=", value, "shipmentsTime");
            return (Criteria) this;
        }

        public Criteria andShipmentsTimeLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsTradeInfoExample example;

        protected Criteria(GoodsTradeInfoExample example) {
            super();
            this.example = example;
        }

        public GoodsTradeInfoExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsTradeInfoExample example);
    }
}