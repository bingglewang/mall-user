package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class TrackingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrackingExample() {
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

    public TrackingExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TrackingExample orderBy(String ... orderByClauses) {
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
        TrackingExample example = new TrackingExample();
        return example.createCriteria();
    }

    public TrackingExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TrackingExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andTrackingIdIsNull() {
            addCriterion("tracking_id is null");
            return (Criteria) this;
        }

        public Criteria andTrackingIdIsNotNull() {
            addCriterion("tracking_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingIdEqualTo(Integer value) {
            addCriterion("tracking_id =", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotEqualTo(Integer value) {
            addCriterion("tracking_id <>", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingIdGreaterThan(Integer value) {
            addCriterion("tracking_id >", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdGreaterThanColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tracking_id >=", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdGreaterThanOrEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingIdLessThan(Integer value) {
            addCriterion("tracking_id <", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdLessThanColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingIdLessThanOrEqualTo(Integer value) {
            addCriterion("tracking_id <=", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdLessThanOrEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingIdIn(List<Integer> values) {
            addCriterion("tracking_id in", values, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotIn(List<Integer> values) {
            addCriterion("tracking_id not in", values, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdBetween(Integer value1, Integer value2) {
            addCriterion("tracking_id between", value1, value2, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tracking_id not between", value1, value2, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameIsNull() {
            addCriterion("tracking_company_name is null");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameIsNotNull() {
            addCriterion("tracking_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameEqualTo(String value) {
            addCriterion("tracking_company_name =", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_company_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameNotEqualTo(String value) {
            addCriterion("tracking_company_name <>", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameNotEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_company_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameGreaterThan(String value) {
            addCriterion("tracking_company_name >", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameGreaterThanColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_company_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("tracking_company_name >=", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameGreaterThanOrEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_company_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameLessThan(String value) {
            addCriterion("tracking_company_name <", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameLessThanColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_company_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("tracking_company_name <=", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameLessThanOrEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_company_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameLike(String value) {
            addCriterion("tracking_company_name like", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameNotLike(String value) {
            addCriterion("tracking_company_name not like", value, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameIn(List<String> values) {
            addCriterion("tracking_company_name in", values, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameNotIn(List<String> values) {
            addCriterion("tracking_company_name not in", values, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameBetween(String value1, String value2) {
            addCriterion("tracking_company_name between", value1, value2, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCompanyNameNotBetween(String value1, String value2) {
            addCriterion("tracking_company_name not between", value1, value2, "trackingCompanyName");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeIsNull() {
            addCriterion("tracking_code is null");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeIsNotNull() {
            addCriterion("tracking_code is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeEqualTo(String value) {
            addCriterion("tracking_code =", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCodeNotEqualTo(String value) {
            addCriterion("tracking_code <>", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeNotEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCodeGreaterThan(String value) {
            addCriterion("tracking_code >", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeGreaterThanColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tracking_code >=", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeGreaterThanOrEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCodeLessThan(String value) {
            addCriterion("tracking_code <", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeLessThanColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCodeLessThanOrEqualTo(String value) {
            addCriterion("tracking_code <=", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeLessThanOrEqualToColumn(Tracking.Column column) {
            addCriterion(new StringBuilder("tracking_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingCodeLike(String value) {
            addCriterion("tracking_code like", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeNotLike(String value) {
            addCriterion("tracking_code not like", value, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeIn(List<String> values) {
            addCriterion("tracking_code in", values, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeNotIn(List<String> values) {
            addCriterion("tracking_code not in", values, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeBetween(String value1, String value2) {
            addCriterion("tracking_code between", value1, value2, "trackingCode");
            return (Criteria) this;
        }

        public Criteria andTrackingCodeNotBetween(String value1, String value2) {
            addCriterion("tracking_code not between", value1, value2, "trackingCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TrackingExample example;

        protected Criteria(TrackingExample example) {
            super();
            this.example = example;
        }

        public TrackingExample example() {
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
        void example(com.zsl.malluserdb.po.TrackingExample example);
    }
}