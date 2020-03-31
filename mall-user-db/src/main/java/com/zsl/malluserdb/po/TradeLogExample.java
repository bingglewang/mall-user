package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeLogExample() {
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

    public TradeLogExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TradeLogExample orderBy(String ... orderByClauses) {
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
        TradeLogExample example = new TradeLogExample();
        return example.createCriteria();
    }

    public TradeLogExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TradeLogExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andTradeLogIdIsNull() {
            addCriterion("trade_log_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdIsNotNull() {
            addCriterion("trade_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdEqualTo(Integer value) {
            addCriterion("trade_log_id =", value, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_log_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeLogIdNotEqualTo(Integer value) {
            addCriterion("trade_log_id <>", value, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdNotEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_log_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeLogIdGreaterThan(Integer value) {
            addCriterion("trade_log_id >", value, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdGreaterThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_log_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_log_id >=", value, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdGreaterThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_log_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeLogIdLessThan(Integer value) {
            addCriterion("trade_log_id <", value, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdLessThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_log_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_log_id <=", value, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdLessThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_log_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeLogIdIn(List<Integer> values) {
            addCriterion("trade_log_id in", values, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdNotIn(List<Integer> values) {
            addCriterion("trade_log_id not in", values, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_log_id between", value1, value2, "tradeLogId");
            return (Criteria) this;
        }

        public Criteria andTradeLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_log_id not between", value1, value2, "tradeLogId");
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

        public Criteria andTradeTimeEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("trade_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualToColumn(TradeLog.Column column) {
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

        public Criteria andMillTimeIsNull() {
            addCriterion("mill_time is null");
            return (Criteria) this;
        }

        public Criteria andMillTimeIsNotNull() {
            addCriterion("mill_time is not null");
            return (Criteria) this;
        }

        public Criteria andMillTimeEqualTo(String value) {
            addCriterion("mill_time =", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("mill_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMillTimeNotEqualTo(String value) {
            addCriterion("mill_time <>", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeNotEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("mill_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMillTimeGreaterThan(String value) {
            addCriterion("mill_time >", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeGreaterThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("mill_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMillTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mill_time >=", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeGreaterThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("mill_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMillTimeLessThan(String value) {
            addCriterion("mill_time <", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeLessThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("mill_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMillTimeLessThanOrEqualTo(String value) {
            addCriterion("mill_time <=", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeLessThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("mill_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMillTimeLike(String value) {
            addCriterion("mill_time like", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeNotLike(String value) {
            addCriterion("mill_time not like", value, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeIn(List<String> values) {
            addCriterion("mill_time in", values, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeNotIn(List<String> values) {
            addCriterion("mill_time not in", values, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeBetween(String value1, String value2) {
            addCriterion("mill_time between", value1, value2, "millTime");
            return (Criteria) this;
        }

        public Criteria andMillTimeNotBetween(String value1, String value2) {
            addCriterion("mill_time not between", value1, value2, "millTime");
            return (Criteria) this;
        }

        public Criteria andResTimeIsNull() {
            addCriterion("res_time is null");
            return (Criteria) this;
        }

        public Criteria andResTimeIsNotNull() {
            addCriterion("res_time is not null");
            return (Criteria) this;
        }

        public Criteria andResTimeEqualTo(String value) {
            addCriterion("res_time =", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResTimeNotEqualTo(String value) {
            addCriterion("res_time <>", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResTimeGreaterThan(String value) {
            addCriterion("res_time >", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeGreaterThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResTimeGreaterThanOrEqualTo(String value) {
            addCriterion("res_time >=", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeGreaterThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResTimeLessThan(String value) {
            addCriterion("res_time <", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeLessThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResTimeLessThanOrEqualTo(String value) {
            addCriterion("res_time <=", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeLessThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResTimeLike(String value) {
            addCriterion("res_time like", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotLike(String value) {
            addCriterion("res_time not like", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeIn(List<String> values) {
            addCriterion("res_time in", values, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotIn(List<String> values) {
            addCriterion("res_time not in", values, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeBetween(String value1, String value2) {
            addCriterion("res_time between", value1, value2, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotBetween(String value1, String value2) {
            addCriterion("res_time not between", value1, value2, "resTime");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNull() {
            addCriterion("res_code is null");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNotNull() {
            addCriterion("res_code is not null");
            return (Criteria) this;
        }

        public Criteria andResCodeEqualTo(Integer value) {
            addCriterion("res_code =", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResCodeNotEqualTo(Integer value) {
            addCriterion("res_code <>", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThan(Integer value) {
            addCriterion("res_code >", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_code >=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResCodeLessThan(Integer value) {
            addCriterion("res_code <", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanOrEqualTo(Integer value) {
            addCriterion("res_code <=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResCodeIn(List<Integer> values) {
            addCriterion("res_code in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotIn(List<Integer> values) {
            addCriterion("res_code not in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeBetween(Integer value1, Integer value2) {
            addCriterion("res_code between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_code not between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResDescIsNull() {
            addCriterion("res_desc is null");
            return (Criteria) this;
        }

        public Criteria andResDescIsNotNull() {
            addCriterion("res_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResDescEqualTo(String value) {
            addCriterion("res_desc =", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResDescNotEqualTo(String value) {
            addCriterion("res_desc <>", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThan(String value) {
            addCriterion("res_desc >", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanOrEqualTo(String value) {
            addCriterion("res_desc >=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResDescLessThan(String value) {
            addCriterion("res_desc <", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThanColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResDescLessThanOrEqualTo(String value) {
            addCriterion("res_desc <=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThanOrEqualToColumn(TradeLog.Column column) {
            addCriterion(new StringBuilder("res_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResDescLike(String value) {
            addCriterion("res_desc like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotLike(String value) {
            addCriterion("res_desc not like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescIn(List<String> values) {
            addCriterion("res_desc in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotIn(List<String> values) {
            addCriterion("res_desc not in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescBetween(String value1, String value2) {
            addCriterion("res_desc between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotBetween(String value1, String value2) {
            addCriterion("res_desc not between", value1, value2, "resDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TradeLogExample example;

        protected Criteria(TradeLogExample example) {
            super();
            this.example = example;
        }

        public TradeLogExample example() {
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
        void example(com.zsl.malluserdb.po.TradeLogExample example);
    }
}