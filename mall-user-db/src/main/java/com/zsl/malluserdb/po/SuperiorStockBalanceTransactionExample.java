package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class SuperiorStockBalanceTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperiorStockBalanceTransactionExample() {
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

    public SuperiorStockBalanceTransactionExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SuperiorStockBalanceTransactionExample orderBy(String ... orderByClauses) {
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
        SuperiorStockBalanceTransactionExample example = new SuperiorStockBalanceTransactionExample();
        return example.createCriteria();
    }

    public SuperiorStockBalanceTransactionExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SuperiorStockBalanceTransactionExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
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

        public Criteria andStockIncrementIdIsNull() {
            addCriterion("stock_increment_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdIsNotNull() {
            addCriterion("stock_increment_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdEqualTo(Integer value) {
            addCriterion("stock_increment_id =", value, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_increment_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdNotEqualTo(Integer value) {
            addCriterion("stock_increment_id <>", value, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdNotEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_increment_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdGreaterThan(Integer value) {
            addCriterion("stock_increment_id >", value, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdGreaterThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_increment_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_increment_id >=", value, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdGreaterThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_increment_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdLessThan(Integer value) {
            addCriterion("stock_increment_id <", value, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdLessThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_increment_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_increment_id <=", value, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdLessThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_increment_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdIn(List<Integer> values) {
            addCriterion("stock_increment_id in", values, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdNotIn(List<Integer> values) {
            addCriterion("stock_increment_id not in", values, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_increment_id between", value1, value2, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockIncrementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_increment_id not between", value1, value2, "stockIncrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdIsNull() {
            addCriterion("stock_decrement_id is null");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdIsNotNull() {
            addCriterion("stock_decrement_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdEqualTo(Integer value) {
            addCriterion("stock_decrement_id =", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdNotEqualTo(Integer value) {
            addCriterion("stock_decrement_id <>", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdNotEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThan(Integer value) {
            addCriterion("stock_decrement_id >", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_decrement_id >=", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThan(Integer value) {
            addCriterion("stock_decrement_id <", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_decrement_id <=", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdIn(List<Integer> values) {
            addCriterion("stock_decrement_id in", values, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdNotIn(List<Integer> values) {
            addCriterion("stock_decrement_id not in", values, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_decrement_id between", value1, value2, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_decrement_id not between", value1, value2, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdIsNull() {
            addCriterion("balance_increment_id is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdIsNotNull() {
            addCriterion("balance_increment_id is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdEqualTo(Integer value) {
            addCriterion("balance_increment_id =", value, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_increment_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdNotEqualTo(Integer value) {
            addCriterion("balance_increment_id <>", value, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdNotEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_increment_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdGreaterThan(Integer value) {
            addCriterion("balance_increment_id >", value, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdGreaterThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_increment_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_increment_id >=", value, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdGreaterThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_increment_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdLessThan(Integer value) {
            addCriterion("balance_increment_id <", value, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdLessThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_increment_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdLessThanOrEqualTo(Integer value) {
            addCriterion("balance_increment_id <=", value, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdLessThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_increment_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdIn(List<Integer> values) {
            addCriterion("balance_increment_id in", values, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdNotIn(List<Integer> values) {
            addCriterion("balance_increment_id not in", values, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdBetween(Integer value1, Integer value2) {
            addCriterion("balance_increment_id between", value1, value2, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceIncrementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_increment_id not between", value1, value2, "balanceIncrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdIsNull() {
            addCriterion("balance_decrement_id is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdIsNotNull() {
            addCriterion("balance_decrement_id is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdEqualTo(Integer value) {
            addCriterion("balance_decrement_id =", value, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_decrement_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdNotEqualTo(Integer value) {
            addCriterion("balance_decrement_id <>", value, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdNotEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_decrement_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdGreaterThan(Integer value) {
            addCriterion("balance_decrement_id >", value, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdGreaterThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_decrement_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_decrement_id >=", value, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdGreaterThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_decrement_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdLessThan(Integer value) {
            addCriterion("balance_decrement_id <", value, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdLessThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_decrement_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdLessThanOrEqualTo(Integer value) {
            addCriterion("balance_decrement_id <=", value, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdLessThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("balance_decrement_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdIn(List<Integer> values) {
            addCriterion("balance_decrement_id in", values, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdNotIn(List<Integer> values) {
            addCriterion("balance_decrement_id not in", values, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdBetween(Integer value1, Integer value2) {
            addCriterion("balance_decrement_id between", value1, value2, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andBalanceDecrementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_decrement_id not between", value1, value2, "balanceDecrementId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdIsNull() {
            addCriterion("trade_info_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdIsNotNull() {
            addCriterion("trade_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdEqualTo(Integer value) {
            addCriterion("trade_info_id =", value, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("trade_info_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdNotEqualTo(Integer value) {
            addCriterion("trade_info_id <>", value, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdNotEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("trade_info_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdGreaterThan(Integer value) {
            addCriterion("trade_info_id >", value, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdGreaterThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("trade_info_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_info_id >=", value, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdGreaterThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("trade_info_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdLessThan(Integer value) {
            addCriterion("trade_info_id <", value, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdLessThanColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("trade_info_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_info_id <=", value, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdLessThanOrEqualToColumn(SuperiorStockBalanceTransaction.Column column) {
            addCriterion(new StringBuilder("trade_info_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdIn(List<Integer> values) {
            addCriterion("trade_info_id in", values, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdNotIn(List<Integer> values) {
            addCriterion("trade_info_id not in", values, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_info_id between", value1, value2, "tradeInfoId");
            return (Criteria) this;
        }

        public Criteria andTradeInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_info_id not between", value1, value2, "tradeInfoId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SuperiorStockBalanceTransactionExample example;

        protected Criteria(SuperiorStockBalanceTransactionExample example) {
            super();
            this.example = example;
        }

        public SuperiorStockBalanceTransactionExample example() {
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
        void example(com.zsl.malluserdb.po.SuperiorStockBalanceTransactionExample example);
    }
}