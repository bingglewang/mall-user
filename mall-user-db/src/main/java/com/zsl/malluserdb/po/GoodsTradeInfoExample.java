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

        public Criteria andSourceIsNull() {
            addCriterion("`source` is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("`source` is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Boolean value) {
            addCriterion("`source` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("`source` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Boolean value) {
            addCriterion("`source` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("`source` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Boolean value) {
            addCriterion("`source` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("`source` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`source` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("`source` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Boolean value) {
            addCriterion("`source` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("`source` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("`source` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("`source` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Boolean> values) {
            addCriterion("`source` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Boolean> values) {
            addCriterion("`source` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("`source` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`source` not between", value1, value2, "source");
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

        public Criteria andMoneyOffIsNull() {
            addCriterion("money_off is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOffIsNotNull() {
            addCriterion("money_off is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOffEqualTo(BigDecimal value) {
            addCriterion("money_off =", value, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("money_off = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyOffNotEqualTo(BigDecimal value) {
            addCriterion("money_off <>", value, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("money_off <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyOffGreaterThan(BigDecimal value) {
            addCriterion("money_off >", value, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("money_off > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyOffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_off >=", value, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("money_off >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyOffLessThan(BigDecimal value) {
            addCriterion("money_off <", value, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("money_off < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyOffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_off <=", value, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("money_off <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyOffIn(List<BigDecimal> values) {
            addCriterion("money_off in", values, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffNotIn(List<BigDecimal> values) {
            addCriterion("money_off not in", values, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_off between", value1, value2, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andMoneyOffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_off not between", value1, value2, "moneyOff");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionIsNull() {
            addCriterion("total_deduction is null");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionIsNotNull() {
            addCriterion("total_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionEqualTo(BigDecimal value) {
            addCriterion("total_deduction =", value, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_deduction = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalDeductionNotEqualTo(BigDecimal value) {
            addCriterion("total_deduction <>", value, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_deduction <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalDeductionGreaterThan(BigDecimal value) {
            addCriterion("total_deduction >", value, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_deduction > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalDeductionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_deduction >=", value, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_deduction >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalDeductionLessThan(BigDecimal value) {
            addCriterion("total_deduction <", value, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_deduction < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalDeductionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_deduction <=", value, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("total_deduction <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalDeductionIn(List<BigDecimal> values) {
            addCriterion("total_deduction in", values, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionNotIn(List<BigDecimal> values) {
            addCriterion("total_deduction not in", values, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_deduction between", value1, value2, "totalDeduction");
            return (Criteria) this;
        }

        public Criteria andTotalDeductionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_deduction not between", value1, value2, "totalDeduction");
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

        public Criteria andHiddenIsNull() {
            addCriterion("hidden is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNotNull() {
            addCriterion("hidden is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualTo(Boolean value) {
            addCriterion("hidden =", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("hidden = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualTo(Boolean value) {
            addCriterion("hidden <>", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("hidden <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThan(Boolean value) {
            addCriterion("hidden >", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("hidden > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hidden >=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("hidden >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHiddenLessThan(Boolean value) {
            addCriterion("hidden <", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("hidden < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualTo(Boolean value) {
            addCriterion("hidden <=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("hidden <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHiddenIn(List<Boolean> values) {
            addCriterion("hidden in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotIn(List<Boolean> values) {
            addCriterion("hidden not in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenBetween(Boolean value1, Boolean value2) {
            addCriterion("hidden between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hidden not between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNull() {
            addCriterion("recipients is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNotNull() {
            addCriterion("recipients is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsEqualTo(String value) {
            addCriterion("recipients =", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsNotEqualTo(String value) {
            addCriterion("recipients <>", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThan(String value) {
            addCriterion("recipients >", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThanOrEqualTo(String value) {
            addCriterion("recipients >=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThan(String value) {
            addCriterion("recipients <", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThanOrEqualTo(String value) {
            addCriterion("recipients <=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsLike(String value) {
            addCriterion("recipients like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotLike(String value) {
            addCriterion("recipients not like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsIn(List<String> values) {
            addCriterion("recipients in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotIn(List<String> values) {
            addCriterion("recipients not in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsBetween(String value1, String value2) {
            addCriterion("recipients between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotBetween(String value1, String value2) {
            addCriterion("recipients not between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneIsNull() {
            addCriterion("recipients_phone is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneIsNotNull() {
            addCriterion("recipients_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneEqualTo(String value) {
            addCriterion("recipients_phone =", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients_phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotEqualTo(String value) {
            addCriterion("recipients_phone <>", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients_phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneGreaterThan(String value) {
            addCriterion("recipients_phone >", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients_phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("recipients_phone >=", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients_phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLessThan(String value) {
            addCriterion("recipients_phone <", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients_phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLessThanOrEqualTo(String value) {
            addCriterion("recipients_phone <=", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("recipients_phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLike(String value) {
            addCriterion("recipients_phone like", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotLike(String value) {
            addCriterion("recipients_phone not like", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneIn(List<String> values) {
            addCriterion("recipients_phone in", values, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotIn(List<String> values) {
            addCriterion("recipients_phone not in", values, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneBetween(String value1, String value2) {
            addCriterion("recipients_phone between", value1, value2, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotBetween(String value1, String value2) {
            addCriterion("recipients_phone not between", value1, value2, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailIsNull() {
            addCriterion("shipping_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailIsNotNull() {
            addCriterion("shipping_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailEqualTo(String value) {
            addCriterion("shipping_address_detail =", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address_detail = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailNotEqualTo(String value) {
            addCriterion("shipping_address_detail <>", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address_detail <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailGreaterThan(String value) {
            addCriterion("shipping_address_detail >", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address_detail > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address_detail >=", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address_detail >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailLessThan(String value) {
            addCriterion("shipping_address_detail <", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address_detail < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("shipping_address_detail <=", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("shipping_address_detail <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailLike(String value) {
            addCriterion("shipping_address_detail like", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailNotLike(String value) {
            addCriterion("shipping_address_detail not like", value, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailIn(List<String> values) {
            addCriterion("shipping_address_detail in", values, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailNotIn(List<String> values) {
            addCriterion("shipping_address_detail not in", values, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailBetween(String value1, String value2) {
            addCriterion("shipping_address_detail between", value1, value2, "shippingAddressDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAddressDetailNotBetween(String value1, String value2) {
            addCriterion("shipping_address_detail not between", value1, value2, "shippingAddressDetail");
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

        public Criteria andPresentMoneyEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("present_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("present_money <>", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("present_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThan(BigDecimal value) {
            addCriterion("present_money >", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("present_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("present_money >=", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("present_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThan(BigDecimal value) {
            addCriterion("present_money <", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("present_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("present_money <=", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andFatherMoneyEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("father_money <>", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("father_money >", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money >=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThan(BigDecimal value) {
            addCriterion("father_money <", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money <=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andGrandfatherMoneyEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <>", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("grandfather_money >", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money >=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThan(BigDecimal value) {
            addCriterion("grandfather_money <", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
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

        public Criteria andFatherCoinIsNull() {
            addCriterion("father_coin is null");
            return (Criteria) this;
        }

        public Criteria andFatherCoinIsNotNull() {
            addCriterion("father_coin is not null");
            return (Criteria) this;
        }

        public Criteria andFatherCoinEqualTo(Integer value) {
            addCriterion("father_coin =", value, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherCoinNotEqualTo(Integer value) {
            addCriterion("father_coin <>", value, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherCoinGreaterThan(Integer value) {
            addCriterion("father_coin >", value, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("father_coin >=", value, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherCoinLessThan(Integer value) {
            addCriterion("father_coin <", value, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherCoinLessThanOrEqualTo(Integer value) {
            addCriterion("father_coin <=", value, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("father_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherCoinIn(List<Integer> values) {
            addCriterion("father_coin in", values, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinNotIn(List<Integer> values) {
            addCriterion("father_coin not in", values, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinBetween(Integer value1, Integer value2) {
            addCriterion("father_coin between", value1, value2, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andFatherCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("father_coin not between", value1, value2, "fatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinIsNull() {
            addCriterion("grandfather_coin is null");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinIsNotNull() {
            addCriterion("grandfather_coin is not null");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinEqualTo(Integer value) {
            addCriterion("grandfather_coin =", value, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinNotEqualTo(Integer value) {
            addCriterion("grandfather_coin <>", value, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinNotEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinGreaterThan(Integer value) {
            addCriterion("grandfather_coin >", value, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinGreaterThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("grandfather_coin >=", value, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinGreaterThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinLessThan(Integer value) {
            addCriterion("grandfather_coin <", value, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinLessThanColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinLessThanOrEqualTo(Integer value) {
            addCriterion("grandfather_coin <=", value, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinLessThanOrEqualToColumn(GoodsTradeInfo.Column column) {
            addCriterion(new StringBuilder("grandfather_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinIn(List<Integer> values) {
            addCriterion("grandfather_coin in", values, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinNotIn(List<Integer> values) {
            addCriterion("grandfather_coin not in", values, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinBetween(Integer value1, Integer value2) {
            addCriterion("grandfather_coin between", value1, value2, "grandfatherCoin");
            return (Criteria) this;
        }

        public Criteria andGrandfatherCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("grandfather_coin not between", value1, value2, "grandfatherCoin");
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