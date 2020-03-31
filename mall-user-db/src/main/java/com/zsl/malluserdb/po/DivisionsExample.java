package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DivisionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DivisionsExample() {
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

    public DivisionsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public DivisionsExample orderBy(String ... orderByClauses) {
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
        DivisionsExample example = new DivisionsExample();
        return example.createCriteria();
    }

    public DivisionsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public DivisionsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andDivisionIdIsNull() {
            addCriterion("division_id is null");
            return (Criteria) this;
        }

        public Criteria andDivisionIdIsNotNull() {
            addCriterion("division_id is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionIdEqualTo(Integer value) {
            addCriterion("division_id =", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("division_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotEqualTo(Integer value) {
            addCriterion("division_id <>", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("division_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThan(Integer value) {
            addCriterion("division_id >", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("division_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("division_id >=", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("division_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThan(Integer value) {
            addCriterion("division_id <", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("division_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanOrEqualTo(Integer value) {
            addCriterion("division_id <=", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("division_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdIn(List<Integer> values) {
            addCriterion("division_id in", values, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotIn(List<Integer> values) {
            addCriterion("division_id not in", values, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdBetween(Integer value1, Integer value2) {
            addCriterion("division_id between", value1, value2, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("division_id not between", value1, value2, "divisionId");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNull() {
            addCriterion("show_type is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("show_type is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(Integer value) {
            addCriterion("show_type =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("show_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(Integer value) {
            addCriterion("show_type <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("show_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(Integer value) {
            addCriterion("show_type >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("show_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_type >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("show_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(Integer value) {
            addCriterion("show_type <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("show_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("show_type <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("show_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<Integer> values) {
            addCriterion("show_type in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<Integer> values) {
            addCriterion("show_type not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(Integer value1, Integer value2) {
            addCriterion("show_type between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("show_type not between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("`name` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("`name` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("`name` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("`name` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("`name` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("`name` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("sub_name is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("sub_name =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("sub_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("sub_name <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("sub_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("sub_name >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("sub_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_name >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("sub_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("sub_name <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("sub_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("sub_name <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("sub_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("sub_name like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("sub_name not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("sub_name in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("sub_name not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("sub_name between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("sub_name not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("area = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("area <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("area > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("area >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("area < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("area <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("category_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("category_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("category_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("category_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("category_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("category_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andExternalImageIsNull() {
            addCriterion("external_image is null");
            return (Criteria) this;
        }

        public Criteria andExternalImageIsNotNull() {
            addCriterion("external_image is not null");
            return (Criteria) this;
        }

        public Criteria andExternalImageEqualTo(String value) {
            addCriterion("external_image =", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_image = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalImageNotEqualTo(String value) {
            addCriterion("external_image <>", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_image <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalImageGreaterThan(String value) {
            addCriterion("external_image >", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_image > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalImageGreaterThanOrEqualTo(String value) {
            addCriterion("external_image >=", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_image >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalImageLessThan(String value) {
            addCriterion("external_image <", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_image < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalImageLessThanOrEqualTo(String value) {
            addCriterion("external_image <=", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_image <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalImageLike(String value) {
            addCriterion("external_image like", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageNotLike(String value) {
            addCriterion("external_image not like", value, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageIn(List<String> values) {
            addCriterion("external_image in", values, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageNotIn(List<String> values) {
            addCriterion("external_image not in", values, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageBetween(String value1, String value2) {
            addCriterion("external_image between", value1, value2, "externalImage");
            return (Criteria) this;
        }

        public Criteria andExternalImageNotBetween(String value1, String value2) {
            addCriterion("external_image not between", value1, value2, "externalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageIsNull() {
            addCriterion("internal_image is null");
            return (Criteria) this;
        }

        public Criteria andInternalImageIsNotNull() {
            addCriterion("internal_image is not null");
            return (Criteria) this;
        }

        public Criteria andInternalImageEqualTo(String value) {
            addCriterion("internal_image =", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("internal_image = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInternalImageNotEqualTo(String value) {
            addCriterion("internal_image <>", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("internal_image <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInternalImageGreaterThan(String value) {
            addCriterion("internal_image >", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("internal_image > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInternalImageGreaterThanOrEqualTo(String value) {
            addCriterion("internal_image >=", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("internal_image >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInternalImageLessThan(String value) {
            addCriterion("internal_image <", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("internal_image < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInternalImageLessThanOrEqualTo(String value) {
            addCriterion("internal_image <=", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("internal_image <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInternalImageLike(String value) {
            addCriterion("internal_image like", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageNotLike(String value) {
            addCriterion("internal_image not like", value, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageIn(List<String> values) {
            addCriterion("internal_image in", values, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageNotIn(List<String> values) {
            addCriterion("internal_image not in", values, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageBetween(String value1, String value2) {
            addCriterion("internal_image between", value1, value2, "internalImage");
            return (Criteria) this;
        }

        public Criteria andInternalImageNotBetween(String value1, String value2) {
            addCriterion("internal_image not between", value1, value2, "internalImage");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIsNull() {
            addCriterion("external_link is null");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIsNotNull() {
            addCriterion("external_link is not null");
            return (Criteria) this;
        }

        public Criteria andExternalLinkEqualTo(String value) {
            addCriterion("external_link =", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_link = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotEqualTo(String value) {
            addCriterion("external_link <>", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_link <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThan(String value) {
            addCriterion("external_link >", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_link > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("external_link >=", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_link >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThan(String value) {
            addCriterion("external_link <", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_link < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThanOrEqualTo(String value) {
            addCriterion("external_link <=", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("external_link <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExternalLinkLike(String value) {
            addCriterion("external_link like", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotLike(String value) {
            addCriterion("external_link not like", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIn(List<String> values) {
            addCriterion("external_link in", values, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotIn(List<String> values) {
            addCriterion("external_link not in", values, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkBetween(String value1, String value2) {
            addCriterion("external_link between", value1, value2, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotBetween(String value1, String value2) {
            addCriterion("external_link not between", value1, value2, "externalLink");
            return (Criteria) this;
        }

        public Criteria andSkipTypeIsNull() {
            addCriterion("skip_type is null");
            return (Criteria) this;
        }

        public Criteria andSkipTypeIsNotNull() {
            addCriterion("skip_type is not null");
            return (Criteria) this;
        }

        public Criteria andSkipTypeEqualTo(Byte value) {
            addCriterion("skip_type =", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("skip_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotEqualTo(Byte value) {
            addCriterion("skip_type <>", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("skip_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkipTypeGreaterThan(Byte value) {
            addCriterion("skip_type >", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("skip_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkipTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("skip_type >=", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("skip_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkipTypeLessThan(Byte value) {
            addCriterion("skip_type <", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("skip_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkipTypeLessThanOrEqualTo(Byte value) {
            addCriterion("skip_type <=", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("skip_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkipTypeIn(List<Byte> values) {
            addCriterion("skip_type in", values, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotIn(List<Byte> values) {
            addCriterion("skip_type not in", values, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeBetween(Byte value1, Byte value2) {
            addCriterion("skip_type between", value1, value2, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("skip_type not between", value1, value2, "skipType");
            return (Criteria) this;
        }

        public Criteria andOpenReductionIsNull() {
            addCriterion("open_reduction is null");
            return (Criteria) this;
        }

        public Criteria andOpenReductionIsNotNull() {
            addCriterion("open_reduction is not null");
            return (Criteria) this;
        }

        public Criteria andOpenReductionEqualTo(Byte value) {
            addCriterion("open_reduction =", value, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("open_reduction = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenReductionNotEqualTo(Byte value) {
            addCriterion("open_reduction <>", value, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("open_reduction <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenReductionGreaterThan(Byte value) {
            addCriterion("open_reduction >", value, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("open_reduction > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenReductionGreaterThanOrEqualTo(Byte value) {
            addCriterion("open_reduction >=", value, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("open_reduction >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenReductionLessThan(Byte value) {
            addCriterion("open_reduction <", value, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("open_reduction < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenReductionLessThanOrEqualTo(Byte value) {
            addCriterion("open_reduction <=", value, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("open_reduction <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenReductionIn(List<Byte> values) {
            addCriterion("open_reduction in", values, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionNotIn(List<Byte> values) {
            addCriterion("open_reduction not in", values, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionBetween(Byte value1, Byte value2) {
            addCriterion("open_reduction between", value1, value2, "openReduction");
            return (Criteria) this;
        }

        public Criteria andOpenReductionNotBetween(Byte value1, Byte value2) {
            addCriterion("open_reduction not between", value1, value2, "openReduction");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("start_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("start_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("start_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("start_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("start_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("start_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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

        public Criteria andEndTimeEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(Divisions.Column column) {
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

        public Criteria andConditionAmountIsNull() {
            addCriterion("condition_amount is null");
            return (Criteria) this;
        }

        public Criteria andConditionAmountIsNotNull() {
            addCriterion("condition_amount is not null");
            return (Criteria) this;
        }

        public Criteria andConditionAmountEqualTo(BigDecimal value) {
            addCriterion("condition_amount =", value, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("condition_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConditionAmountNotEqualTo(BigDecimal value) {
            addCriterion("condition_amount <>", value, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("condition_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConditionAmountGreaterThan(BigDecimal value) {
            addCriterion("condition_amount >", value, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("condition_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConditionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("condition_amount >=", value, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("condition_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConditionAmountLessThan(BigDecimal value) {
            addCriterion("condition_amount <", value, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("condition_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConditionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("condition_amount <=", value, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("condition_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConditionAmountIn(List<BigDecimal> values) {
            addCriterion("condition_amount in", values, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountNotIn(List<BigDecimal> values) {
            addCriterion("condition_amount not in", values, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("condition_amount between", value1, value2, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andConditionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("condition_amount not between", value1, value2, "conditionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountIsNull() {
            addCriterion("deduction_amount is null");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountIsNotNull() {
            addCriterion("deduction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountEqualTo(BigDecimal value) {
            addCriterion("deduction_amount =", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("deduction_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotEqualTo(BigDecimal value) {
            addCriterion("deduction_amount <>", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("deduction_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionAmountGreaterThan(BigDecimal value) {
            addCriterion("deduction_amount >", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("deduction_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction_amount >=", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("deduction_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionAmountLessThan(BigDecimal value) {
            addCriterion("deduction_amount <", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("deduction_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction_amount <=", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("deduction_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeductionAmountIn(List<BigDecimal> values) {
            addCriterion("deduction_amount in", values, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotIn(List<BigDecimal> values) {
            addCriterion("deduction_amount not in", values, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction_amount between", value1, value2, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction_amount not between", value1, value2, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andShareIconIsNull() {
            addCriterion("share_icon is null");
            return (Criteria) this;
        }

        public Criteria andShareIconIsNotNull() {
            addCriterion("share_icon is not null");
            return (Criteria) this;
        }

        public Criteria andShareIconEqualTo(String value) {
            addCriterion("share_icon =", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_icon = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIconNotEqualTo(String value) {
            addCriterion("share_icon <>", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_icon <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIconGreaterThan(String value) {
            addCriterion("share_icon >", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_icon > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIconGreaterThanOrEqualTo(String value) {
            addCriterion("share_icon >=", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_icon >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIconLessThan(String value) {
            addCriterion("share_icon <", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_icon < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIconLessThanOrEqualTo(String value) {
            addCriterion("share_icon <=", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_icon <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareIconLike(String value) {
            addCriterion("share_icon like", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconNotLike(String value) {
            addCriterion("share_icon not like", value, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconIn(List<String> values) {
            addCriterion("share_icon in", values, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconNotIn(List<String> values) {
            addCriterion("share_icon not in", values, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconBetween(String value1, String value2) {
            addCriterion("share_icon between", value1, value2, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareIconNotBetween(String value1, String value2) {
            addCriterion("share_icon not between", value1, value2, "shareIcon");
            return (Criteria) this;
        }

        public Criteria andShareNameIsNull() {
            addCriterion("share_name is null");
            return (Criteria) this;
        }

        public Criteria andShareNameIsNotNull() {
            addCriterion("share_name is not null");
            return (Criteria) this;
        }

        public Criteria andShareNameEqualTo(String value) {
            addCriterion("share_name =", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareNameNotEqualTo(String value) {
            addCriterion("share_name <>", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameNotEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareNameGreaterThan(String value) {
            addCriterion("share_name >", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameGreaterThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareNameGreaterThanOrEqualTo(String value) {
            addCriterion("share_name >=", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameGreaterThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareNameLessThan(String value) {
            addCriterion("share_name <", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameLessThanColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareNameLessThanOrEqualTo(String value) {
            addCriterion("share_name <=", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameLessThanOrEqualToColumn(Divisions.Column column) {
            addCriterion(new StringBuilder("share_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareNameLike(String value) {
            addCriterion("share_name like", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameNotLike(String value) {
            addCriterion("share_name not like", value, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameIn(List<String> values) {
            addCriterion("share_name in", values, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameNotIn(List<String> values) {
            addCriterion("share_name not in", values, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameBetween(String value1, String value2) {
            addCriterion("share_name between", value1, value2, "shareName");
            return (Criteria) this;
        }

        public Criteria andShareNameNotBetween(String value1, String value2) {
            addCriterion("share_name not between", value1, value2, "shareName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private DivisionsExample example;

        protected Criteria(DivisionsExample example) {
            super();
            this.example = example;
        }

        public DivisionsExample example() {
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
        void example(com.zsl.malluserdb.po.DivisionsExample example);
    }
}