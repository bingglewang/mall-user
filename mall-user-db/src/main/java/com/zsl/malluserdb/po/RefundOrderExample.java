package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundOrderExample() {
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

    public RefundOrderExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public RefundOrderExample orderBy(String ... orderByClauses) {
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
        RefundOrderExample example = new RefundOrderExample();
        return example.createCriteria();
    }

    public RefundOrderExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public RefundOrderExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(RefundOrder.Column column) {
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

        public Criteria andRefundTradeNoIsNull() {
            addCriterion("refund_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoIsNotNull() {
            addCriterion("refund_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoEqualTo(String value) {
            addCriterion("refund_trade_no =", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotEqualTo(String value) {
            addCriterion("refund_trade_no <>", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoGreaterThan(String value) {
            addCriterion("refund_trade_no >", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_trade_no >=", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLessThan(String value) {
            addCriterion("refund_trade_no <", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLessThanOrEqualTo(String value) {
            addCriterion("refund_trade_no <=", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_trade_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoLike(String value) {
            addCriterion("refund_trade_no like", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotLike(String value) {
            addCriterion("refund_trade_no not like", value, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoIn(List<String> values) {
            addCriterion("refund_trade_no in", values, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotIn(List<String> values) {
            addCriterion("refund_trade_no not in", values, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoBetween(String value1, String value2) {
            addCriterion("refund_trade_no between", value1, value2, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundTradeNoNotBetween(String value1, String value2) {
            addCriterion("refund_trade_no not between", value1, value2, "refundTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoIsNull() {
            addCriterion("refund_out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoIsNotNull() {
            addCriterion("refund_out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoEqualTo(String value) {
            addCriterion("refund_out_trade_no =", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_out_trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoNotEqualTo(String value) {
            addCriterion("refund_out_trade_no <>", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_out_trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoGreaterThan(String value) {
            addCriterion("refund_out_trade_no >", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_out_trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_out_trade_no >=", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_out_trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoLessThan(String value) {
            addCriterion("refund_out_trade_no <", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_out_trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("refund_out_trade_no <=", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_out_trade_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoLike(String value) {
            addCriterion("refund_out_trade_no like", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoNotLike(String value) {
            addCriterion("refund_out_trade_no not like", value, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoIn(List<String> values) {
            addCriterion("refund_out_trade_no in", values, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoNotIn(List<String> values) {
            addCriterion("refund_out_trade_no not in", values, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoBetween(String value1, String value2) {
            addCriterion("refund_out_trade_no between", value1, value2, "refundOutTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("refund_out_trade_no not between", value1, value2, "refundOutTradeNo");
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

        public Criteria andOrderNoEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("order_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("order_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("order_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("order_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("order_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualToColumn(RefundOrder.Column column) {
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

        public Criteria andRefundTotalAmountIsNull() {
            addCriterion("refund_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountIsNotNull() {
            addCriterion("refund_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount =", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount <>", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_total_amount >", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount >=", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountLessThan(BigDecimal value) {
            addCriterion("refund_total_amount <", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount <=", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountIn(List<BigDecimal> values) {
            addCriterion("refund_total_amount in", values, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_total_amount not in", values, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_total_amount between", value1, value2, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_total_amount not between", value1, value2, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutIsNull() {
            addCriterion("reality_refund_total_amout is null");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutIsNotNull() {
            addCriterion("reality_refund_total_amout is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutEqualTo(BigDecimal value) {
            addCriterion("reality_refund_total_amout =", value, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_amout = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutNotEqualTo(BigDecimal value) {
            addCriterion("reality_refund_total_amout <>", value, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_amout <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutGreaterThan(BigDecimal value) {
            addCriterion("reality_refund_total_amout >", value, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_amout > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_refund_total_amout >=", value, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_amout >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutLessThan(BigDecimal value) {
            addCriterion("reality_refund_total_amout <", value, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_amout < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_refund_total_amout <=", value, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_amout <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutIn(List<BigDecimal> values) {
            addCriterion("reality_refund_total_amout in", values, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutNotIn(List<BigDecimal> values) {
            addCriterion("reality_refund_total_amout not in", values, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_refund_total_amout between", value1, value2, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalAmoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_refund_total_amout not between", value1, value2, "realityRefundTotalAmout");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinIsNull() {
            addCriterion("refund_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinIsNotNull() {
            addCriterion("refund_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinEqualTo(Integer value) {
            addCriterion("refund_total_coin =", value, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinNotEqualTo(Integer value) {
            addCriterion("refund_total_coin <>", value, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinGreaterThan(Integer value) {
            addCriterion("refund_total_coin >", value, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_total_coin >=", value, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinLessThan(Integer value) {
            addCriterion("refund_total_coin <", value, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("refund_total_coin <=", value, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinIn(List<Integer> values) {
            addCriterion("refund_total_coin in", values, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinNotIn(List<Integer> values) {
            addCriterion("refund_total_coin not in", values, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("refund_total_coin between", value1, value2, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRefundTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_total_coin not between", value1, value2, "refundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinIsNull() {
            addCriterion("reality_refund_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinIsNotNull() {
            addCriterion("reality_refund_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinEqualTo(Integer value) {
            addCriterion("reality_refund_total_coin =", value, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinNotEqualTo(Integer value) {
            addCriterion("reality_refund_total_coin <>", value, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinGreaterThan(Integer value) {
            addCriterion("reality_refund_total_coin >", value, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("reality_refund_total_coin >=", value, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinLessThan(Integer value) {
            addCriterion("reality_refund_total_coin <", value, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("reality_refund_total_coin <=", value, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_refund_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinIn(List<Integer> values) {
            addCriterion("reality_refund_total_coin in", values, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinNotIn(List<Integer> values) {
            addCriterion("reality_refund_total_coin not in", values, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("reality_refund_total_coin between", value1, value2, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRefundTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("reality_refund_total_coin not between", value1, value2, "realityRefundTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinIsNull() {
            addCriterion("regain_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinIsNotNull() {
            addCriterion("regain_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinEqualTo(Integer value) {
            addCriterion("regain_total_coin =", value, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinNotEqualTo(Integer value) {
            addCriterion("regain_total_coin <>", value, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinGreaterThan(Integer value) {
            addCriterion("regain_total_coin >", value, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("regain_total_coin >=", value, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinLessThan(Integer value) {
            addCriterion("regain_total_coin <", value, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("regain_total_coin <=", value, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinIn(List<Integer> values) {
            addCriterion("regain_total_coin in", values, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinNotIn(List<Integer> values) {
            addCriterion("regain_total_coin not in", values, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("regain_total_coin between", value1, value2, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("regain_total_coin not between", value1, value2, "regainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinIsNull() {
            addCriterion("reality_regain_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinIsNotNull() {
            addCriterion("reality_regain_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinEqualTo(Integer value) {
            addCriterion("reality_regain_total_coin =", value, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinNotEqualTo(Integer value) {
            addCriterion("reality_regain_total_coin <>", value, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinGreaterThan(Integer value) {
            addCriterion("reality_regain_total_coin >", value, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("reality_regain_total_coin >=", value, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinLessThan(Integer value) {
            addCriterion("reality_regain_total_coin <", value, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("reality_regain_total_coin <=", value, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinIn(List<Integer> values) {
            addCriterion("reality_regain_total_coin in", values, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinNotIn(List<Integer> values) {
            addCriterion("reality_regain_total_coin not in", values, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("reality_regain_total_coin between", value1, value2, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("reality_regain_total_coin not between", value1, value2, "realityRegainTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinIsNull() {
            addCriterion("regain_father_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinIsNotNull() {
            addCriterion("regain_father_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinEqualTo(Integer value) {
            addCriterion("regain_father_total_coin =", value, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinNotEqualTo(Integer value) {
            addCriterion("regain_father_total_coin <>", value, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinGreaterThan(Integer value) {
            addCriterion("regain_father_total_coin >", value, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("regain_father_total_coin >=", value, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinLessThan(Integer value) {
            addCriterion("regain_father_total_coin <", value, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("regain_father_total_coin <=", value, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinIn(List<Integer> values) {
            addCriterion("regain_father_total_coin in", values, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinNotIn(List<Integer> values) {
            addCriterion("regain_father_total_coin not in", values, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("regain_father_total_coin between", value1, value2, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("regain_father_total_coin not between", value1, value2, "regainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinIsNull() {
            addCriterion("reality_regain_father_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinIsNotNull() {
            addCriterion("reality_regain_father_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinEqualTo(Integer value) {
            addCriterion("reality_regain_father_total_coin =", value, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinNotEqualTo(Integer value) {
            addCriterion("reality_regain_father_total_coin <>", value, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinGreaterThan(Integer value) {
            addCriterion("reality_regain_father_total_coin >", value, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("reality_regain_father_total_coin >=", value, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinLessThan(Integer value) {
            addCriterion("reality_regain_father_total_coin <", value, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("reality_regain_father_total_coin <=", value, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinIn(List<Integer> values) {
            addCriterion("reality_regain_father_total_coin in", values, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinNotIn(List<Integer> values) {
            addCriterion("reality_regain_father_total_coin not in", values, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("reality_regain_father_total_coin between", value1, value2, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("reality_regain_father_total_coin not between", value1, value2, "realityRegainFatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinIsNull() {
            addCriterion("regain_grandfather_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinIsNotNull() {
            addCriterion("regain_grandfather_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinEqualTo(Integer value) {
            addCriterion("regain_grandfather_total_coin =", value, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinNotEqualTo(Integer value) {
            addCriterion("regain_grandfather_total_coin <>", value, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinGreaterThan(Integer value) {
            addCriterion("regain_grandfather_total_coin >", value, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("regain_grandfather_total_coin >=", value, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinLessThan(Integer value) {
            addCriterion("regain_grandfather_total_coin <", value, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("regain_grandfather_total_coin <=", value, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinIn(List<Integer> values) {
            addCriterion("regain_grandfather_total_coin in", values, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinNotIn(List<Integer> values) {
            addCriterion("regain_grandfather_total_coin not in", values, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("regain_grandfather_total_coin between", value1, value2, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("regain_grandfather_total_coin not between", value1, value2, "regainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinIsNull() {
            addCriterion("reality_regain_grandfather_total_coin is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinIsNotNull() {
            addCriterion("reality_regain_grandfather_total_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinEqualTo(Integer value) {
            addCriterion("reality_regain_grandfather_total_coin =", value, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinNotEqualTo(Integer value) {
            addCriterion("reality_regain_grandfather_total_coin <>", value, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinGreaterThan(Integer value) {
            addCriterion("reality_regain_grandfather_total_coin >", value, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("reality_regain_grandfather_total_coin >=", value, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinLessThan(Integer value) {
            addCriterion("reality_regain_grandfather_total_coin <", value, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinLessThanOrEqualTo(Integer value) {
            addCriterion("reality_regain_grandfather_total_coin <=", value, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinIn(List<Integer> values) {
            addCriterion("reality_regain_grandfather_total_coin in", values, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinNotIn(List<Integer> values) {
            addCriterion("reality_regain_grandfather_total_coin not in", values, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinBetween(Integer value1, Integer value2) {
            addCriterion("reality_regain_grandfather_total_coin between", value1, value2, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("reality_regain_grandfather_total_coin not between", value1, value2, "realityRegainGrandfatherTotalCoin");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountIsNull() {
            addCriterion("regain_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountIsNotNull() {
            addCriterion("regain_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountEqualTo(BigDecimal value) {
            addCriterion("regain_total_amount =", value, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("regain_total_amount <>", value, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("regain_total_amount >", value, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_total_amount >=", value, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountLessThan(BigDecimal value) {
            addCriterion("regain_total_amount <", value, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_total_amount <=", value, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountIn(List<BigDecimal> values) {
            addCriterion("regain_total_amount in", values, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("regain_total_amount not in", values, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_total_amount between", value1, value2, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_total_amount not between", value1, value2, "regainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountIsNull() {
            addCriterion("reality_regain_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountIsNotNull() {
            addCriterion("reality_regain_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountEqualTo(BigDecimal value) {
            addCriterion("reality_regain_total_amount =", value, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("reality_regain_total_amount <>", value, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("reality_regain_total_amount >", value, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_total_amount >=", value, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountLessThan(BigDecimal value) {
            addCriterion("reality_regain_total_amount <", value, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_total_amount <=", value, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountIn(List<BigDecimal> values) {
            addCriterion("reality_regain_total_amount in", values, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("reality_regain_total_amount not in", values, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_total_amount between", value1, value2, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_total_amount not between", value1, value2, "realityRegainTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountIsNull() {
            addCriterion("regain_father_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountIsNotNull() {
            addCriterion("regain_father_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountEqualTo(BigDecimal value) {
            addCriterion("regain_father_total_amount =", value, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("regain_father_total_amount <>", value, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("regain_father_total_amount >", value, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_father_total_amount >=", value, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountLessThan(BigDecimal value) {
            addCriterion("regain_father_total_amount <", value, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_father_total_amount <=", value, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_father_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountIn(List<BigDecimal> values) {
            addCriterion("regain_father_total_amount in", values, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("regain_father_total_amount not in", values, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_father_total_amount between", value1, value2, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainFatherTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_father_total_amount not between", value1, value2, "regainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountIsNull() {
            addCriterion("reality_regain_father_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountIsNotNull() {
            addCriterion("reality_regain_father_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountEqualTo(BigDecimal value) {
            addCriterion("reality_regain_father_total_amount =", value, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("reality_regain_father_total_amount <>", value, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("reality_regain_father_total_amount >", value, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_father_total_amount >=", value, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountLessThan(BigDecimal value) {
            addCriterion("reality_regain_father_total_amount <", value, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_father_total_amount <=", value, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_father_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountIn(List<BigDecimal> values) {
            addCriterion("reality_regain_father_total_amount in", values, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("reality_regain_father_total_amount not in", values, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_father_total_amount between", value1, value2, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainFatherTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_father_total_amount not between", value1, value2, "realityRegainFatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountIsNull() {
            addCriterion("regain_grandfather_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountIsNotNull() {
            addCriterion("regain_grandfather_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountEqualTo(BigDecimal value) {
            addCriterion("regain_grandfather_total_amount =", value, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("regain_grandfather_total_amount <>", value, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("regain_grandfather_total_amount >", value, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_grandfather_total_amount >=", value, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountLessThan(BigDecimal value) {
            addCriterion("regain_grandfather_total_amount <", value, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_grandfather_total_amount <=", value, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_grandfather_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountIn(List<BigDecimal> values) {
            addCriterion("regain_grandfather_total_amount in", values, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("regain_grandfather_total_amount not in", values, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_grandfather_total_amount between", value1, value2, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainGrandfatherTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_grandfather_total_amount not between", value1, value2, "regainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountIsNull() {
            addCriterion("reality_regain_grandfather_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountIsNotNull() {
            addCriterion("reality_regain_grandfather_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountEqualTo(BigDecimal value) {
            addCriterion("reality_regain_grandfather_total_amount =", value, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("reality_regain_grandfather_total_amount <>", value, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("reality_regain_grandfather_total_amount >", value, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_grandfather_total_amount >=", value, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountLessThan(BigDecimal value) {
            addCriterion("reality_regain_grandfather_total_amount <", value, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_grandfather_total_amount <=", value, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_grandfather_total_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountIn(List<BigDecimal> values) {
            addCriterion("reality_regain_grandfather_total_amount in", values, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("reality_regain_grandfather_total_amount not in", values, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_grandfather_total_amount between", value1, value2, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealityRegainGrandfatherTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_grandfather_total_amount not between", value1, value2, "realityRegainGrandfatherTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRegainReducionIsNull() {
            addCriterion("regain_reducion is null");
            return (Criteria) this;
        }

        public Criteria andRegainReducionIsNotNull() {
            addCriterion("regain_reducion is not null");
            return (Criteria) this;
        }

        public Criteria andRegainReducionEqualTo(BigDecimal value) {
            addCriterion("regain_reducion =", value, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_reducion = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainReducionNotEqualTo(BigDecimal value) {
            addCriterion("regain_reducion <>", value, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_reducion <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainReducionGreaterThan(BigDecimal value) {
            addCriterion("regain_reducion >", value, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_reducion > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainReducionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_reducion >=", value, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_reducion >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainReducionLessThan(BigDecimal value) {
            addCriterion("regain_reducion <", value, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_reducion < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainReducionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regain_reducion <=", value, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("regain_reducion <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegainReducionIn(List<BigDecimal> values) {
            addCriterion("regain_reducion in", values, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionNotIn(List<BigDecimal> values) {
            addCriterion("regain_reducion not in", values, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_reducion between", value1, value2, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRegainReducionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regain_reducion not between", value1, value2, "regainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionIsNull() {
            addCriterion("reality_regain_reducion is null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionIsNotNull() {
            addCriterion("reality_regain_reducion is not null");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionEqualTo(BigDecimal value) {
            addCriterion("reality_regain_reducion =", value, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_reducion = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionNotEqualTo(BigDecimal value) {
            addCriterion("reality_regain_reducion <>", value, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_reducion <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionGreaterThan(BigDecimal value) {
            addCriterion("reality_regain_reducion >", value, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_reducion > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_reducion >=", value, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_reducion >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionLessThan(BigDecimal value) {
            addCriterion("reality_regain_reducion <", value, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_reducion < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reality_regain_reducion <=", value, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("reality_regain_reducion <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionIn(List<BigDecimal> values) {
            addCriterion("reality_regain_reducion in", values, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionNotIn(List<BigDecimal> values) {
            addCriterion("reality_regain_reducion not in", values, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_reducion between", value1, value2, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andRealityRegainReducionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reality_regain_reducion not between", value1, value2, "realityRegainReducion");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("apply_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("apply_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("apply_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("apply_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("apply_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("apply_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeIsNull() {
            addCriterion("allow_time is null");
            return (Criteria) this;
        }

        public Criteria andAllowTimeIsNotNull() {
            addCriterion("allow_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllowTimeEqualTo(Date value) {
            addCriterion("allow_time =", value, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("allow_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAllowTimeNotEqualTo(Date value) {
            addCriterion("allow_time <>", value, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("allow_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAllowTimeGreaterThan(Date value) {
            addCriterion("allow_time >", value, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("allow_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAllowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("allow_time >=", value, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("allow_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAllowTimeLessThan(Date value) {
            addCriterion("allow_time <", value, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("allow_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAllowTimeLessThanOrEqualTo(Date value) {
            addCriterion("allow_time <=", value, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("allow_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAllowTimeIn(List<Date> values) {
            addCriterion("allow_time in", values, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeNotIn(List<Date> values) {
            addCriterion("allow_time not in", values, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeBetween(Date value1, Date value2) {
            addCriterion("allow_time between", value1, value2, "allowTime");
            return (Criteria) this;
        }

        public Criteria andAllowTimeNotBetween(Date value1, Date value2) {
            addCriterion("allow_time not between", value1, value2, "allowTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeIsNull() {
            addCriterion("pass_time is null");
            return (Criteria) this;
        }

        public Criteria andPassTimeIsNotNull() {
            addCriterion("pass_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassTimeEqualTo(Date value) {
            addCriterion("pass_time =", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("pass_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPassTimeNotEqualTo(Date value) {
            addCriterion("pass_time <>", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("pass_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPassTimeGreaterThan(Date value) {
            addCriterion("pass_time >", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("pass_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPassTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pass_time >=", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("pass_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPassTimeLessThan(Date value) {
            addCriterion("pass_time <", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("pass_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPassTimeLessThanOrEqualTo(Date value) {
            addCriterion("pass_time <=", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("pass_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPassTimeIn(List<Date> values) {
            addCriterion("pass_time in", values, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeNotIn(List<Date> values) {
            addCriterion("pass_time not in", values, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeBetween(Date value1, Date value2) {
            addCriterion("pass_time between", value1, value2, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeNotBetween(Date value1, Date value2) {
            addCriterion("pass_time not between", value1, value2, "passTime");
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

        public Criteria andFinishTimeEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("finish_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("finish_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("finish_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("finish_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("finish_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualToColumn(RefundOrder.Column column) {
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

        public Criteria andRefundReasonIsNull() {
            addCriterion("refund_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNotNull() {
            addCriterion("refund_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualTo(String value) {
            addCriterion("refund_reason =", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_reason = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualTo(String value) {
            addCriterion("refund_reason <>", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_reason <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThan(String value) {
            addCriterion("refund_reason >", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_reason > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refund_reason >=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_reason >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThan(String value) {
            addCriterion("refund_reason <", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_reason < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualTo(String value) {
            addCriterion("refund_reason <=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_reason <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundReasonLike(String value) {
            addCriterion("refund_reason like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotLike(String value) {
            addCriterion("refund_reason not like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIn(List<String> values) {
            addCriterion("refund_reason in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotIn(List<String> values) {
            addCriterion("refund_reason not in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonBetween(String value1, String value2) {
            addCriterion("refund_reason between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotBetween(String value1, String value2) {
            addCriterion("refund_reason not between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionIsNull() {
            addCriterion("refund_description is null");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionIsNotNull() {
            addCriterion("refund_description is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionEqualTo(String value) {
            addCriterion("refund_description =", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_description = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionNotEqualTo(String value) {
            addCriterion("refund_description <>", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_description <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionGreaterThan(String value) {
            addCriterion("refund_description >", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_description > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("refund_description >=", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_description >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionLessThan(String value) {
            addCriterion("refund_description <", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_description < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionLessThanOrEqualTo(String value) {
            addCriterion("refund_description <=", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_description <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionLike(String value) {
            addCriterion("refund_description like", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionNotLike(String value) {
            addCriterion("refund_description not like", value, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionIn(List<String> values) {
            addCriterion("refund_description in", values, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionNotIn(List<String> values) {
            addCriterion("refund_description not in", values, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionBetween(String value1, String value2) {
            addCriterion("refund_description between", value1, value2, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundDescriptionNotBetween(String value1, String value2) {
            addCriterion("refund_description not between", value1, value2, "refundDescription");
            return (Criteria) this;
        }

        public Criteria andRefundImagesIsNull() {
            addCriterion("refund_images is null");
            return (Criteria) this;
        }

        public Criteria andRefundImagesIsNotNull() {
            addCriterion("refund_images is not null");
            return (Criteria) this;
        }

        public Criteria andRefundImagesEqualTo(String value) {
            addCriterion("refund_images =", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_images = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundImagesNotEqualTo(String value) {
            addCriterion("refund_images <>", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_images <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundImagesGreaterThan(String value) {
            addCriterion("refund_images >", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_images > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundImagesGreaterThanOrEqualTo(String value) {
            addCriterion("refund_images >=", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_images >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundImagesLessThan(String value) {
            addCriterion("refund_images <", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_images < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundImagesLessThanOrEqualTo(String value) {
            addCriterion("refund_images <=", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_images <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundImagesLike(String value) {
            addCriterion("refund_images like", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesNotLike(String value) {
            addCriterion("refund_images not like", value, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesIn(List<String> values) {
            addCriterion("refund_images in", values, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesNotIn(List<String> values) {
            addCriterion("refund_images not in", values, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesBetween(String value1, String value2) {
            addCriterion("refund_images between", value1, value2, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundImagesNotBetween(String value1, String value2) {
            addCriterion("refund_images not between", value1, value2, "refundImages");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNull() {
            addCriterion("refund_type is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNotNull() {
            addCriterion("refund_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualTo(Integer value) {
            addCriterion("refund_type =", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualTo(Integer value) {
            addCriterion("refund_type <>", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThan(Integer value) {
            addCriterion("refund_type >", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_type >=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThan(Integer value) {
            addCriterion("refund_type <", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_type <=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundTypeIn(List<Integer> values) {
            addCriterion("refund_type in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotIn(List<Integer> values) {
            addCriterion("refund_type not in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeBetween(Integer value1, Integer value2) {
            addCriterion("refund_type between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_type not between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Byte value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Byte value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Byte value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Byte value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Byte value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualToColumn(RefundOrder.Column column) {
            addCriterion(new StringBuilder("refund_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Byte> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Byte> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Byte value1, Byte value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private RefundOrderExample example;

        protected Criteria(RefundOrderExample example) {
            super();
            this.example = example;
        }

        public RefundOrderExample example() {
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
        void example(com.zsl.malluserdb.po.RefundOrderExample example);
    }
}