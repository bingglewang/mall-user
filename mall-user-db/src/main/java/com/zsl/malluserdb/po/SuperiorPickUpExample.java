package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class SuperiorPickUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperiorPickUpExample() {
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

    public SuperiorPickUpExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SuperiorPickUpExample orderBy(String ... orderByClauses) {
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
        SuperiorPickUpExample example = new SuperiorPickUpExample();
        return example.createCriteria();
    }

    public SuperiorPickUpExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SuperiorPickUpExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SuperiorPickUp.Column column) {
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

        public Criteria andUserMemberIdEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_member_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdNotEqualTo(Integer value) {
            addCriterion("user_member_id <>", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdNotEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_member_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThan(Integer value) {
            addCriterion("user_member_id >", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_member_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_member_id >=", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdGreaterThanOrEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_member_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThan(Integer value) {
            addCriterion("user_member_id <", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_member_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_member_id <=", value, "userMemberId");
            return (Criteria) this;
        }

        public Criteria andUserMemberIdLessThanOrEqualToColumn(SuperiorPickUp.Column column) {
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

        public Criteria andUserAddressIdIsNull() {
            addCriterion("user_address_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIsNotNull() {
            addCriterion("user_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdEqualTo(Integer value) {
            addCriterion("user_address_id =", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_address_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotEqualTo(Integer value) {
            addCriterion("user_address_id <>", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_address_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThan(Integer value) {
            addCriterion("user_address_id >", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_address_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_address_id >=", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThanOrEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_address_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThan(Integer value) {
            addCriterion("user_address_id <", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_address_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_address_id <=", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThanOrEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("user_address_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIn(List<Integer> values) {
            addCriterion("user_address_id in", values, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotIn(List<Integer> values) {
            addCriterion("user_address_id not in", values, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("user_address_id between", value1, value2, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_address_id not between", value1, value2, "userAddressId");
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

        public Criteria andStockDecrementIdEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdNotEqualTo(Integer value) {
            addCriterion("stock_decrement_id <>", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdNotEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThan(Integer value) {
            addCriterion("stock_decrement_id >", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_decrement_id >=", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdGreaterThanOrEqualToColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThan(Integer value) {
            addCriterion("stock_decrement_id <", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThanColumn(SuperiorPickUp.Column column) {
            addCriterion(new StringBuilder("stock_decrement_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_decrement_id <=", value, "stockDecrementId");
            return (Criteria) this;
        }

        public Criteria andStockDecrementIdLessThanOrEqualToColumn(SuperiorPickUp.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private SuperiorPickUpExample example;

        protected Criteria(SuperiorPickUpExample example) {
            super();
            this.example = example;
        }

        public SuperiorPickUpExample example() {
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
        void example(com.zsl.malluserdb.po.SuperiorPickUpExample example);
    }
}