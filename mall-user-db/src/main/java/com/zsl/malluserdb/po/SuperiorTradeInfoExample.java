package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuperiorTradeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperiorTradeInfoExample() {
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

    public SuperiorTradeInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SuperiorTradeInfoExample orderBy(String ... orderByClauses) {
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
        SuperiorTradeInfoExample example = new SuperiorTradeInfoExample();
        return example.createCriteria();
    }

    public SuperiorTradeInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SuperiorTradeInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
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

        public Criteria andTradeNoEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
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

        public Criteria andOutTradeNoEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("out_trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
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

        public Criteria andUserMemberIdIsNull() {
            addCriterion("user_member_id is null");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdIsNotNull() {
            addCriterion("user_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdEqualTo(Integer value) {
            addCriterion("user_member_id =", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("user_member_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdNotEqualTo(Integer value) {
            addCriterion("user_member_id <>", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("user_member_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThan(Integer value) {
            addCriterion("user_member_id >", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("user_member_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_member_id >=", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("user_member_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThan(Integer value) {
            addCriterion("user_member_id <", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("user_member_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_member_id <=", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("user_member_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdIn(List<Integer> values) {
            addCriterion("user_member_id in", values, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdNotIn(List<Integer> values) {
            addCriterion("user_member_id not in", values, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("user_member_id between", value1, value2, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_member_id not between", value1, value2, "userMemberId");
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

        public Criteria andPayWayEqualTo(Boolean value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Boolean value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Boolean value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Boolean value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("pay_way <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Boolean> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Boolean> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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

        public Criteria andTradeTimeEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("trade_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
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

        public Criteria andGoodsSpuIdIsNull() {
            addCriterion("goods_spu_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdIsNotNull() {
            addCriterion("goods_spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdEqualTo(Integer value) {
            addCriterion("goods_spu_id =", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("goods_spu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotEqualTo(Integer value) {
            addCriterion("goods_spu_id <>", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("goods_spu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThan(Integer value) {
            addCriterion("goods_spu_id >", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("goods_spu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spu_id >=", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("goods_spu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThan(Integer value) {
            addCriterion("goods_spu_id <", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("goods_spu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spu_id <=", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("goods_spu_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdIn(List<Integer> values) {
            addCriterion("goods_spu_id in", values, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotIn(List<Integer> values) {
            addCriterion("goods_spu_id not in", values, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_spu_id between", value1, value2, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_spu_id not between", value1, value2, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("unit_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("unit_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("unit_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("unit_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("unit_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("unit_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("`count` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("`count` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("`count` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("`count` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("`count` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("`count` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andTotolAmountIsNull() {
            addCriterion("totol_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotolAmountIsNotNull() {
            addCriterion("totol_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotolAmountEqualTo(BigDecimal value) {
            addCriterion("totol_amount =", value, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("totol_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotolAmountNotEqualTo(BigDecimal value) {
            addCriterion("totol_amount <>", value, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("totol_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotolAmountGreaterThan(BigDecimal value) {
            addCriterion("totol_amount >", value, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("totol_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotolAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totol_amount >=", value, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("totol_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotolAmountLessThan(BigDecimal value) {
            addCriterion("totol_amount <", value, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("totol_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotolAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totol_amount <=", value, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("totol_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotolAmountIn(List<BigDecimal> values) {
            addCriterion("totol_amount in", values, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountNotIn(List<BigDecimal> values) {
            addCriterion("totol_amount not in", values, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totol_amount between", value1, value2, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andTotolAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totol_amount not between", value1, value2, "totolAmount");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNull() {
            addCriterion("share_id is null");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNotNull() {
            addCriterion("share_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualTo(String value) {
            addCriterion("share_id =", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("share_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIdNotEqualTo(String value) {
            addCriterion("share_id <>", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("share_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThan(String value) {
            addCriterion("share_id >", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("share_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanOrEqualTo(String value) {
            addCriterion("share_id >=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("share_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIdLessThan(String value) {
            addCriterion("share_id <", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("share_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanOrEqualTo(String value) {
            addCriterion("share_id <=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("share_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIdLike(String value) {
            addCriterion("share_id like", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotLike(String value) {
            addCriterion("share_id not like", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdIn(List<String> values) {
            addCriterion("share_id in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotIn(List<String> values) {
            addCriterion("share_id not in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdBetween(String value1, String value2) {
            addCriterion("share_id between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotBetween(String value1, String value2) {
            addCriterion("share_id not between", value1, value2, "shareId");
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

        public Criteria andPaymentTimeEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanColumn(SuperiorTradeInfo.Column column) {
            addCriterion(new StringBuilder("payment_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualToColumn(SuperiorTradeInfo.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private SuperiorTradeInfoExample example;

        protected Criteria(SuperiorTradeInfoExample example) {
            super();
            this.example = example;
        }

        public SuperiorTradeInfoExample example() {
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
        void example(com.zsl.malluserdb.po.SuperiorTradeInfoExample example);
    }
}