package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemFreightTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemFreightTemplateExample() {
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

    public ItemFreightTemplateExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ItemFreightTemplateExample orderBy(String ... orderByClauses) {
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
        ItemFreightTemplateExample example = new ItemFreightTemplateExample();
        return example.createCriteria();
    }

    public ItemFreightTemplateExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ItemFreightTemplateExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andFreightTemplateIdIsNull() {
            addCriterion("freight_template_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIsNotNull() {
            addCriterion("freight_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdEqualTo(Integer value) {
            addCriterion("freight_template_id =", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("freight_template_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotEqualTo(Integer value) {
            addCriterion("freight_template_id <>", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("freight_template_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThan(Integer value) {
            addCriterion("freight_template_id >", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("freight_template_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_template_id >=", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("freight_template_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThan(Integer value) {
            addCriterion("freight_template_id <", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("freight_template_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("freight_template_id <=", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("freight_template_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIn(List<Integer> values) {
            addCriterion("freight_template_id in", values, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotIn(List<Integer> values) {
            addCriterion("freight_template_id not in", values, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("freight_template_id between", value1, value2, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_template_id not between", value1, value2, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template_name =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("template_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("template_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template_name >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("template_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("template_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template_name <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("template_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("template_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("template_name like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("template_name not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("template_name in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Integer value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("merchant_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Integer value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("merchant_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Integer value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("merchant_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("merchant_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Integer value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("merchant_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("merchant_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Integer> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Integer> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andFreeShippingIsNull() {
            addCriterion("free_shipping is null");
            return (Criteria) this;
        }

        public Criteria andFreeShippingIsNotNull() {
            addCriterion("free_shipping is not null");
            return (Criteria) this;
        }

        public Criteria andFreeShippingEqualTo(Integer value) {
            addCriterion("free_shipping =", value, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_shipping = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeShippingNotEqualTo(Integer value) {
            addCriterion("free_shipping <>", value, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_shipping <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeShippingGreaterThan(Integer value) {
            addCriterion("free_shipping >", value, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_shipping > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeShippingGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_shipping >=", value, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_shipping >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeShippingLessThan(Integer value) {
            addCriterion("free_shipping <", value, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_shipping < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeShippingLessThanOrEqualTo(Integer value) {
            addCriterion("free_shipping <=", value, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_shipping <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeShippingIn(List<Integer> values) {
            addCriterion("free_shipping in", values, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingNotIn(List<Integer> values) {
            addCriterion("free_shipping not in", values, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingBetween(Integer value1, Integer value2) {
            addCriterion("free_shipping between", value1, value2, "freeShipping");
            return (Criteria) this;
        }

        public Criteria andFreeShippingNotBetween(Integer value1, Integer value2) {
            addCriterion("free_shipping not between", value1, value2, "freeShipping");
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

        public Criteria andRuleEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("`rule` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualTo(Integer value) {
            addCriterion("`rule` <>", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("`rule` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThan(Integer value) {
            addCriterion("`rule` >", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("`rule` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("`rule` >=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("`rule` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleLessThan(Integer value) {
            addCriterion("`rule` <", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("`rule` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualTo(Integer value) {
            addCriterion("`rule` <=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
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

        public Criteria andDefaultNumIsNull() {
            addCriterion("default_num is null");
            return (Criteria) this;
        }

        public Criteria andDefaultNumIsNotNull() {
            addCriterion("default_num is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultNumEqualTo(Integer value) {
            addCriterion("default_num =", value, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultNumNotEqualTo(Integer value) {
            addCriterion("default_num <>", value, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultNumGreaterThan(Integer value) {
            addCriterion("default_num >", value, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_num >=", value, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultNumLessThan(Integer value) {
            addCriterion("default_num <", value, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultNumLessThanOrEqualTo(Integer value) {
            addCriterion("default_num <=", value, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultNumIn(List<Integer> values) {
            addCriterion("default_num in", values, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumNotIn(List<Integer> values) {
            addCriterion("default_num not in", values, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumBetween(Integer value1, Integer value2) {
            addCriterion("default_num between", value1, value2, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultNumNotBetween(Integer value1, Integer value2) {
            addCriterion("default_num not between", value1, value2, "defaultNum");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightIsNull() {
            addCriterion("default_freight is null");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightIsNotNull() {
            addCriterion("default_freight is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightEqualTo(BigDecimal value) {
            addCriterion("default_freight =", value, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultFreightNotEqualTo(BigDecimal value) {
            addCriterion("default_freight <>", value, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultFreightGreaterThan(BigDecimal value) {
            addCriterion("default_freight >", value, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("default_freight >=", value, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultFreightLessThan(BigDecimal value) {
            addCriterion("default_freight <", value, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("default_freight <=", value, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultFreightIn(List<BigDecimal> values) {
            addCriterion("default_freight in", values, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightNotIn(List<BigDecimal> values) {
            addCriterion("default_freight not in", values, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("default_freight between", value1, value2, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("default_freight not between", value1, value2, "defaultFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueIsNull() {
            addCriterion("default_continue is null");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueIsNotNull() {
            addCriterion("default_continue is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueEqualTo(Integer value) {
            addCriterion("default_continue =", value, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueNotEqualTo(Integer value) {
            addCriterion("default_continue <>", value, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueGreaterThan(Integer value) {
            addCriterion("default_continue >", value, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_continue >=", value, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueLessThan(Integer value) {
            addCriterion("default_continue <", value, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueLessThanOrEqualTo(Integer value) {
            addCriterion("default_continue <=", value, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueIn(List<Integer> values) {
            addCriterion("default_continue in", values, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueNotIn(List<Integer> values) {
            addCriterion("default_continue not in", values, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueBetween(Integer value1, Integer value2) {
            addCriterion("default_continue between", value1, value2, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueNotBetween(Integer value1, Integer value2) {
            addCriterion("default_continue not between", value1, value2, "defaultContinue");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightIsNull() {
            addCriterion("default_continue_freight is null");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightIsNotNull() {
            addCriterion("default_continue_freight is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightEqualTo(BigDecimal value) {
            addCriterion("default_continue_freight =", value, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightNotEqualTo(BigDecimal value) {
            addCriterion("default_continue_freight <>", value, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightGreaterThan(BigDecimal value) {
            addCriterion("default_continue_freight >", value, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("default_continue_freight >=", value, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightLessThan(BigDecimal value) {
            addCriterion("default_continue_freight <", value, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("default_continue_freight <=", value, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("default_continue_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightIn(List<BigDecimal> values) {
            addCriterion("default_continue_freight in", values, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightNotIn(List<BigDecimal> values) {
            addCriterion("default_continue_freight not in", values, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("default_continue_freight between", value1, value2, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andDefaultContinueFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("default_continue_freight not between", value1, value2, "defaultContinueFreight");
            return (Criteria) this;
        }

        public Criteria andFirstNumIsNull() {
            addCriterion("first_num is null");
            return (Criteria) this;
        }

        public Criteria andFirstNumIsNotNull() {
            addCriterion("first_num is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNumEqualTo(Integer value) {
            addCriterion("first_num =", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstNumNotEqualTo(Integer value) {
            addCriterion("first_num <>", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThan(Integer value) {
            addCriterion("first_num >", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_num >=", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThan(Integer value) {
            addCriterion("first_num <", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThanOrEqualTo(Integer value) {
            addCriterion("first_num <=", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstNumIn(List<Integer> values) {
            addCriterion("first_num in", values, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotIn(List<Integer> values) {
            addCriterion("first_num not in", values, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumBetween(Integer value1, Integer value2) {
            addCriterion("first_num between", value1, value2, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotBetween(Integer value1, Integer value2) {
            addCriterion("first_num not between", value1, value2, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIsNull() {
            addCriterion("first_freight is null");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIsNotNull() {
            addCriterion("first_freight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFreightEqualTo(BigDecimal value) {
            addCriterion("first_freight =", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotEqualTo(BigDecimal value) {
            addCriterion("first_freight <>", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThan(BigDecimal value) {
            addCriterion("first_freight >", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_freight >=", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThan(BigDecimal value) {
            addCriterion("first_freight <", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_freight <=", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("first_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFirstFreightIn(List<BigDecimal> values) {
            addCriterion("first_freight in", values, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotIn(List<BigDecimal> values) {
            addCriterion("first_freight not in", values, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_freight between", value1, value2, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_freight not between", value1, value2, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andContinueNumIsNull() {
            addCriterion("continue_num is null");
            return (Criteria) this;
        }

        public Criteria andContinueNumIsNotNull() {
            addCriterion("continue_num is not null");
            return (Criteria) this;
        }

        public Criteria andContinueNumEqualTo(Integer value) {
            addCriterion("continue_num =", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueNumNotEqualTo(Integer value) {
            addCriterion("continue_num <>", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueNumGreaterThan(Integer value) {
            addCriterion("continue_num >", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_num >=", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueNumLessThan(Integer value) {
            addCriterion("continue_num <", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueNumLessThanOrEqualTo(Integer value) {
            addCriterion("continue_num <=", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueNumIn(List<Integer> values) {
            addCriterion("continue_num in", values, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumNotIn(List<Integer> values) {
            addCriterion("continue_num not in", values, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumBetween(Integer value1, Integer value2) {
            addCriterion("continue_num between", value1, value2, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_num not between", value1, value2, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIsNull() {
            addCriterion("continue_freight is null");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIsNotNull() {
            addCriterion("continue_freight is not null");
            return (Criteria) this;
        }

        public Criteria andContinueFreightEqualTo(BigDecimal value) {
            addCriterion("continue_freight =", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotEqualTo(BigDecimal value) {
            addCriterion("continue_freight <>", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThan(BigDecimal value) {
            addCriterion("continue_freight >", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_freight >=", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThan(BigDecimal value) {
            addCriterion("continue_freight <", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_freight <=", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("continue_freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContinueFreightIn(List<BigDecimal> values) {
            addCriterion("continue_freight in", values, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotIn(List<BigDecimal> values) {
            addCriterion("continue_freight not in", values, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_freight between", value1, value2, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_freight not between", value1, value2, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andFreeConditionIsNull() {
            addCriterion("free_condition is null");
            return (Criteria) this;
        }

        public Criteria andFreeConditionIsNotNull() {
            addCriterion("free_condition is not null");
            return (Criteria) this;
        }

        public Criteria andFreeConditionEqualTo(Integer value) {
            addCriterion("free_condition =", value, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_condition = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeConditionNotEqualTo(Integer value) {
            addCriterion("free_condition <>", value, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_condition <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeConditionGreaterThan(Integer value) {
            addCriterion("free_condition >", value, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_condition > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_condition >=", value, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_condition >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeConditionLessThan(Integer value) {
            addCriterion("free_condition <", value, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_condition < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeConditionLessThanOrEqualTo(Integer value) {
            addCriterion("free_condition <=", value, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("free_condition <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreeConditionIn(List<Integer> values) {
            addCriterion("free_condition in", values, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionNotIn(List<Integer> values) {
            addCriterion("free_condition not in", values, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionBetween(Integer value1, Integer value2) {
            addCriterion("free_condition between", value1, value2, "freeCondition");
            return (Criteria) this;
        }

        public Criteria andFreeConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("free_condition not between", value1, value2, "freeCondition");
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

        public Criteria andCreateTimeEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(ItemFreightTemplate.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(ItemFreightTemplate.Column column) {
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
        private ItemFreightTemplateExample example;

        protected Criteria(ItemFreightTemplateExample example) {
            super();
            this.example = example;
        }

        public ItemFreightTemplateExample example() {
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
        void example(com.zsl.malluserdb.po.ItemFreightTemplateExample example);
    }
}