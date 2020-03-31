package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemFreightTemplateDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemFreightTemplateDetailedExample() {
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

    public ItemFreightTemplateDetailedExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ItemFreightTemplateDetailedExample orderBy(String ... orderByClauses) {
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
        ItemFreightTemplateDetailedExample example = new ItemFreightTemplateDetailedExample();
        return example.createCriteria();
    }

    public ItemFreightTemplateDetailedExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ItemFreightTemplateDetailedExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andDetailedIdIsNull() {
            addCriterion("detailed_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailedIdIsNotNull() {
            addCriterion("detailed_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedIdEqualTo(Integer value) {
            addCriterion("detailed_id =", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("detailed_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotEqualTo(Integer value) {
            addCriterion("detailed_id <>", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("detailed_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailedIdGreaterThan(Integer value) {
            addCriterion("detailed_id >", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("detailed_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailed_id >=", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("detailed_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailedIdLessThan(Integer value) {
            addCriterion("detailed_id <", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("detailed_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailedIdLessThanOrEqualTo(Integer value) {
            addCriterion("detailed_id <=", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("detailed_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailedIdIn(List<Integer> values) {
            addCriterion("detailed_id in", values, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotIn(List<Integer> values) {
            addCriterion("detailed_id not in", values, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdBetween(Integer value1, Integer value2) {
            addCriterion("detailed_id between", value1, value2, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detailed_id not between", value1, value2, "detailedId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("template_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("template_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("template_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("template_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("template_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("template_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNull() {
            addCriterion("free_id is null");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNotNull() {
            addCriterion("free_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreeIdEqualTo(Integer value) {
            addCriterion("free_id =", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("free_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeIdNotEqualTo(Integer value) {
            addCriterion("free_id <>", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("free_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThan(Integer value) {
            addCriterion("free_id >", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("free_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_id >=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("free_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThan(Integer value) {
            addCriterion("free_id <", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("free_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("free_id <=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("free_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeIdIn(List<Integer> values) {
            addCriterion("free_id in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotIn(List<Integer> values) {
            addCriterion("free_id not in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdBetween(Integer value1, Integer value2) {
            addCriterion("free_id between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("free_id not between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("country = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("country <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("country > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("country >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("country < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("country <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("province = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("province <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("province > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("province >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("province < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("province <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("city = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("city <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("city > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("city >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("city < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("city <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andAreaEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("area = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("area <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("area > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("area >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("area < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
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

        public Criteria andRuleIsNull() {
            addCriterion("`rule` is null");
            return (Criteria) this;
        }

        public Criteria andRuleIsNotNull() {
            addCriterion("`rule` is not null");
            return (Criteria) this;
        }

        public Criteria andRuleEqualTo(Integer value) {
            addCriterion("`rule` =", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("`rule` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualTo(Integer value) {
            addCriterion("`rule` <>", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("`rule` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThan(Integer value) {
            addCriterion("`rule` >", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("`rule` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("`rule` >=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("`rule` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleLessThan(Integer value) {
            addCriterion("`rule` <", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("`rule` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualTo(Integer value) {
            addCriterion("`rule` <=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("`rule` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleIn(List<Integer> values) {
            addCriterion("`rule` in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotIn(List<Integer> values) {
            addCriterion("`rule` not in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleBetween(Integer value1, Integer value2) {
            addCriterion("`rule` between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("`rule` not between", value1, value2, "rule");
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

        public Criteria andCreateTimeEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(ItemFreightTemplateDetailed.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(ItemFreightTemplateDetailed.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private ItemFreightTemplateDetailedExample example;

        protected Criteria(ItemFreightTemplateDetailedExample example) {
            super();
            this.example = example;
        }

        public ItemFreightTemplateDetailedExample example() {
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
        void example(com.zsl.malluserdb.po.ItemFreightTemplateDetailedExample example);
    }
}