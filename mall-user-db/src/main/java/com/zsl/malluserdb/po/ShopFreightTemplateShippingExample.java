package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopFreightTemplateShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopFreightTemplateShippingExample() {
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

    public ShopFreightTemplateShippingExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ShopFreightTemplateShippingExample orderBy(String ... orderByClauses) {
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
        ShopFreightTemplateShippingExample example = new ShopFreightTemplateShippingExample();
        return example.createCriteria();
    }

    public ShopFreightTemplateShippingExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ShopFreightTemplateShippingExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Integer value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("shipping_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Integer value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("shipping_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Integer value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("shipping_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("shipping_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Integer value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("shipping_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("shipping_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Integer> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Integer> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Integer value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("config_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Integer value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("config_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Integer value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("config_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("config_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Integer value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("config_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("config_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Integer> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Integer> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andFreightFixedIsNull() {
            addCriterion("freight_fixed is null");
            return (Criteria) this;
        }

        public Criteria andFreightFixedIsNotNull() {
            addCriterion("freight_fixed is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFixedEqualTo(BigDecimal value) {
            addCriterion("freight_fixed =", value, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_fixed = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightFixedNotEqualTo(BigDecimal value) {
            addCriterion("freight_fixed <>", value, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_fixed <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightFixedGreaterThan(BigDecimal value) {
            addCriterion("freight_fixed >", value, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_fixed > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightFixedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fixed >=", value, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_fixed >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightFixedLessThan(BigDecimal value) {
            addCriterion("freight_fixed <", value, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_fixed < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightFixedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fixed <=", value, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_fixed <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightFixedIn(List<BigDecimal> values) {
            addCriterion("freight_fixed in", values, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedNotIn(List<BigDecimal> values) {
            addCriterion("freight_fixed not in", values, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fixed between", value1, value2, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andFreightFixedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fixed not between", value1, value2, "freightFixed");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountIsNull() {
            addCriterion("amount_discount is null");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountIsNotNull() {
            addCriterion("amount_discount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountEqualTo(BigDecimal value) {
            addCriterion("amount_discount =", value, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_discount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountDiscountNotEqualTo(BigDecimal value) {
            addCriterion("amount_discount <>", value, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_discount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountDiscountGreaterThan(BigDecimal value) {
            addCriterion("amount_discount >", value, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_discount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_discount >=", value, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_discount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountDiscountLessThan(BigDecimal value) {
            addCriterion("amount_discount <", value, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_discount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_discount <=", value, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_discount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountDiscountIn(List<BigDecimal> values) {
            addCriterion("amount_discount in", values, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountNotIn(List<BigDecimal> values) {
            addCriterion("amount_discount not in", values, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_discount between", value1, value2, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_discount not between", value1, value2, "amountDiscount");
            return (Criteria) this;
        }

        public Criteria andAmountFreeIsNull() {
            addCriterion("amount_free is null");
            return (Criteria) this;
        }

        public Criteria andAmountFreeIsNotNull() {
            addCriterion("amount_free is not null");
            return (Criteria) this;
        }

        public Criteria andAmountFreeEqualTo(BigDecimal value) {
            addCriterion("amount_free =", value, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_free = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountFreeNotEqualTo(BigDecimal value) {
            addCriterion("amount_free <>", value, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_free <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountFreeGreaterThan(BigDecimal value) {
            addCriterion("amount_free >", value, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_free > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountFreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_free >=", value, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_free >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountFreeLessThan(BigDecimal value) {
            addCriterion("amount_free <", value, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_free < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountFreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_free <=", value, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("amount_free <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAmountFreeIn(List<BigDecimal> values) {
            addCriterion("amount_free in", values, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeNotIn(List<BigDecimal> values) {
            addCriterion("amount_free not in", values, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_free between", value1, value2, "amountFree");
            return (Criteria) this;
        }

        public Criteria andAmountFreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_free not between", value1, value2, "amountFree");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountIsNull() {
            addCriterion("freight_discount is null");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountIsNotNull() {
            addCriterion("freight_discount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountEqualTo(BigDecimal value) {
            addCriterion("freight_discount =", value, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_discount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightDiscountNotEqualTo(BigDecimal value) {
            addCriterion("freight_discount <>", value, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_discount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightDiscountGreaterThan(BigDecimal value) {
            addCriterion("freight_discount >", value, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_discount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_discount >=", value, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_discount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightDiscountLessThan(BigDecimal value) {
            addCriterion("freight_discount <", value, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_discount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_discount <=", value, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("freight_discount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightDiscountIn(List<BigDecimal> values) {
            addCriterion("freight_discount in", values, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountNotIn(List<BigDecimal> values) {
            addCriterion("freight_discount not in", values, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_discount between", value1, value2, "freightDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_discount not between", value1, value2, "freightDiscount");
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

        public Criteria andCreateTimeEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(ShopFreightTemplateShipping.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(ShopFreightTemplateShipping.Column column) {
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
        private ShopFreightTemplateShippingExample example;

        protected Criteria(ShopFreightTemplateShippingExample example) {
            super();
            this.example = example;
        }

        public ShopFreightTemplateShippingExample example() {
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
        void example(com.zsl.malluserdb.po.ShopFreightTemplateShippingExample example);
    }
}