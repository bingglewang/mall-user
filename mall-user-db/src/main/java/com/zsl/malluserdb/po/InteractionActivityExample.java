package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InteractionActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InteractionActivityExample() {
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

    public InteractionActivityExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public InteractionActivityExample orderBy(String ... orderByClauses) {
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
        InteractionActivityExample example = new InteractionActivityExample();
        return example.createCriteria();
    }

    public InteractionActivityExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public InteractionActivityExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(InteractionActivity.Column column) {
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

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("activity_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("activity_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("activity_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("activity_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("activity_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("activity_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_title = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_title <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_title > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_title >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_title < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_title <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareImageIsNull() {
            addCriterion("share_image is null");
            return (Criteria) this;
        }

        public Criteria andShareImageIsNotNull() {
            addCriterion("share_image is not null");
            return (Criteria) this;
        }

        public Criteria andShareImageEqualTo(String value) {
            addCriterion("share_image =", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_image = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareImageNotEqualTo(String value) {
            addCriterion("share_image <>", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_image <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareImageGreaterThan(String value) {
            addCriterion("share_image >", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_image > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareImageGreaterThanOrEqualTo(String value) {
            addCriterion("share_image >=", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_image >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareImageLessThan(String value) {
            addCriterion("share_image <", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_image < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareImageLessThanOrEqualTo(String value) {
            addCriterion("share_image <=", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_image <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareImageLike(String value) {
            addCriterion("share_image like", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageNotLike(String value) {
            addCriterion("share_image not like", value, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageIn(List<String> values) {
            addCriterion("share_image in", values, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageNotIn(List<String> values) {
            addCriterion("share_image not in", values, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageBetween(String value1, String value2) {
            addCriterion("share_image between", value1, value2, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareImageNotBetween(String value1, String value2) {
            addCriterion("share_image not between", value1, value2, "shareImage");
            return (Criteria) this;
        }

        public Criteria andShareContextIsNull() {
            addCriterion("share_context is null");
            return (Criteria) this;
        }

        public Criteria andShareContextIsNotNull() {
            addCriterion("share_context is not null");
            return (Criteria) this;
        }

        public Criteria andShareContextEqualTo(String value) {
            addCriterion("share_context =", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_context = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareContextNotEqualTo(String value) {
            addCriterion("share_context <>", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_context <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareContextGreaterThan(String value) {
            addCriterion("share_context >", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_context > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareContextGreaterThanOrEqualTo(String value) {
            addCriterion("share_context >=", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_context >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareContextLessThan(String value) {
            addCriterion("share_context <", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_context < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareContextLessThanOrEqualTo(String value) {
            addCriterion("share_context <=", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("share_context <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareContextLike(String value) {
            addCriterion("share_context like", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextNotLike(String value) {
            addCriterion("share_context not like", value, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextIn(List<String> values) {
            addCriterion("share_context in", values, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextNotIn(List<String> values) {
            addCriterion("share_context not in", values, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextBetween(String value1, String value2) {
            addCriterion("share_context between", value1, value2, "shareContext");
            return (Criteria) this;
        }

        public Criteria andShareContextNotBetween(String value1, String value2) {
            addCriterion("share_context not between", value1, value2, "shareContext");
            return (Criteria) this;
        }

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(Integer value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(Integer value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(Integer value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(Integer value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(Integer value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<Integer> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<Integer> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(Integer value1, Integer value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andGoldIsNull() {
            addCriterion("gold is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion("gold is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(Integer value) {
            addCriterion("gold =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("gold = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(Integer value) {
            addCriterion("gold <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("gold <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(Integer value) {
            addCriterion("gold >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("gold > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("gold >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(Integer value) {
            addCriterion("gold <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("gold < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(Integer value) {
            addCriterion("gold <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("gold <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Integer> values) {
            addCriterion("gold in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Integer> values) {
            addCriterion("gold not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(Integer value1, Integer value2) {
            addCriterion("gold between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("gold not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andExtractTimesIsNull() {
            addCriterion("extract_times is null");
            return (Criteria) this;
        }

        public Criteria andExtractTimesIsNotNull() {
            addCriterion("extract_times is not null");
            return (Criteria) this;
        }

        public Criteria andExtractTimesEqualTo(Integer value) {
            addCriterion("extract_times =", value, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_times = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractTimesNotEqualTo(Integer value) {
            addCriterion("extract_times <>", value, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_times <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractTimesGreaterThan(Integer value) {
            addCriterion("extract_times >", value, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_times > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("extract_times >=", value, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_times >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractTimesLessThan(Integer value) {
            addCriterion("extract_times <", value, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_times < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractTimesLessThanOrEqualTo(Integer value) {
            addCriterion("extract_times <=", value, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_times <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractTimesIn(List<Integer> values) {
            addCriterion("extract_times in", values, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesNotIn(List<Integer> values) {
            addCriterion("extract_times not in", values, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesBetween(Integer value1, Integer value2) {
            addCriterion("extract_times between", value1, value2, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("extract_times not between", value1, value2, "extractTimes");
            return (Criteria) this;
        }

        public Criteria andExtractLimitIsNull() {
            addCriterion("extract_limit is null");
            return (Criteria) this;
        }

        public Criteria andExtractLimitIsNotNull() {
            addCriterion("extract_limit is not null");
            return (Criteria) this;
        }

        public Criteria andExtractLimitEqualTo(Integer value) {
            addCriterion("extract_limit =", value, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_limit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractLimitNotEqualTo(Integer value) {
            addCriterion("extract_limit <>", value, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_limit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractLimitGreaterThan(Integer value) {
            addCriterion("extract_limit >", value, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_limit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("extract_limit >=", value, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_limit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractLimitLessThan(Integer value) {
            addCriterion("extract_limit <", value, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_limit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractLimitLessThanOrEqualTo(Integer value) {
            addCriterion("extract_limit <=", value, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("extract_limit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExtractLimitIn(List<Integer> values) {
            addCriterion("extract_limit in", values, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitNotIn(List<Integer> values) {
            addCriterion("extract_limit not in", values, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitBetween(Integer value1, Integer value2) {
            addCriterion("extract_limit between", value1, value2, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andExtractLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("extract_limit not between", value1, value2, "extractLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinIsNull() {
            addCriterion("recommend_coin is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinIsNotNull() {
            addCriterion("recommend_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinEqualTo(Integer value) {
            addCriterion("recommend_coin =", value, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendCoinNotEqualTo(Integer value) {
            addCriterion("recommend_coin <>", value, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendCoinGreaterThan(Integer value) {
            addCriterion("recommend_coin >", value, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_coin >=", value, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendCoinLessThan(Integer value) {
            addCriterion("recommend_coin <", value, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendCoinLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_coin <=", value, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendCoinIn(List<Integer> values) {
            addCriterion("recommend_coin in", values, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinNotIn(List<Integer> values) {
            addCriterion("recommend_coin not in", values, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinBetween(Integer value1, Integer value2) {
            addCriterion("recommend_coin between", value1, value2, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_coin not between", value1, value2, "recommendCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinIsNull() {
            addCriterion("recommended_coin is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinIsNotNull() {
            addCriterion("recommended_coin is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinEqualTo(Integer value) {
            addCriterion("recommended_coin =", value, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommended_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinNotEqualTo(Integer value) {
            addCriterion("recommended_coin <>", value, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommended_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinGreaterThan(Integer value) {
            addCriterion("recommended_coin >", value, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommended_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommended_coin >=", value, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommended_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinLessThan(Integer value) {
            addCriterion("recommended_coin <", value, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommended_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinLessThanOrEqualTo(Integer value) {
            addCriterion("recommended_coin <=", value, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommended_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinIn(List<Integer> values) {
            addCriterion("recommended_coin in", values, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinNotIn(List<Integer> values) {
            addCriterion("recommended_coin not in", values, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinBetween(Integer value1, Integer value2) {
            addCriterion("recommended_coin between", value1, value2, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendedCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("recommended_coin not between", value1, value2, "recommendedCoin");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesIsNull() {
            addCriterion("recommend_times is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesIsNotNull() {
            addCriterion("recommend_times is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesEqualTo(Integer value) {
            addCriterion("recommend_times =", value, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_times = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendTimesNotEqualTo(Integer value) {
            addCriterion("recommend_times <>", value, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_times <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendTimesGreaterThan(Integer value) {
            addCriterion("recommend_times >", value, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_times > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_times >=", value, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_times >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendTimesLessThan(Integer value) {
            addCriterion("recommend_times <", value, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_times < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendTimesLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_times <=", value, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_times <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendTimesIn(List<Integer> values) {
            addCriterion("recommend_times in", values, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesNotIn(List<Integer> values) {
            addCriterion("recommend_times not in", values, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesBetween(Integer value1, Integer value2) {
            addCriterion("recommend_times between", value1, value2, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_times not between", value1, value2, "recommendTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitIsNull() {
            addCriterion("recommend_limit is null");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitIsNotNull() {
            addCriterion("recommend_limit is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitEqualTo(Integer value) {
            addCriterion("recommend_limit =", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_limit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotEqualTo(Integer value) {
            addCriterion("recommend_limit <>", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_limit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendLimitGreaterThan(Integer value) {
            addCriterion("recommend_limit >", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_limit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_limit >=", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_limit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendLimitLessThan(Integer value) {
            addCriterion("recommend_limit <", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_limit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendLimitLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_limit <=", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("recommend_limit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecommendLimitIn(List<Integer> values) {
            addCriterion("recommend_limit in", values, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotIn(List<Integer> values) {
            addCriterion("recommend_limit not in", values, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitBetween(Integer value1, Integer value2) {
            addCriterion("recommend_limit between", value1, value2, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_limit not between", value1, value2, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(InteractionActivity.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private InteractionActivityExample example;

        protected Criteria(InteractionActivityExample example) {
            super();
            this.example = example;
        }

        public InteractionActivityExample example() {
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
        void example(com.zsl.malluserdb.po.InteractionActivityExample example);
    }
}