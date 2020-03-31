package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsModulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsModulesExample() {
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

    public GoodsModulesExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsModulesExample orderBy(String ... orderByClauses) {
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
        GoodsModulesExample example = new GoodsModulesExample();
        return example.createCriteria();
    }

    public GoodsModulesExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsModulesExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andGoodsModulesIdIsNull() {
            addCriterion("goods_modules_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdIsNotNull() {
            addCriterion("goods_modules_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdEqualTo(Integer value) {
            addCriterion("goods_modules_id =", value, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_modules_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdNotEqualTo(Integer value) {
            addCriterion("goods_modules_id <>", value, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdNotEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_modules_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdGreaterThan(Integer value) {
            addCriterion("goods_modules_id >", value, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdGreaterThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_modules_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_modules_id >=", value, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdGreaterThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_modules_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdLessThan(Integer value) {
            addCriterion("goods_modules_id <", value, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdLessThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_modules_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_modules_id <=", value, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdLessThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_modules_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdIn(List<Integer> values) {
            addCriterion("goods_modules_id in", values, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdNotIn(List<Integer> values) {
            addCriterion("goods_modules_id not in", values, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_modules_id between", value1, value2, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsModulesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_modules_id not between", value1, value2, "goodsModulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdIsNull() {
            addCriterion("modules_id is null");
            return (Criteria) this;
        }

        public Criteria andModulesIdIsNotNull() {
            addCriterion("modules_id is not null");
            return (Criteria) this;
        }

        public Criteria andModulesIdEqualTo(Integer value) {
            addCriterion("modules_id =", value, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("modules_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModulesIdNotEqualTo(Integer value) {
            addCriterion("modules_id <>", value, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdNotEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("modules_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModulesIdGreaterThan(Integer value) {
            addCriterion("modules_id >", value, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdGreaterThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("modules_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModulesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modules_id >=", value, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdGreaterThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("modules_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModulesIdLessThan(Integer value) {
            addCriterion("modules_id <", value, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdLessThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("modules_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModulesIdLessThanOrEqualTo(Integer value) {
            addCriterion("modules_id <=", value, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdLessThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("modules_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModulesIdIn(List<Integer> values) {
            addCriterion("modules_id in", values, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdNotIn(List<Integer> values) {
            addCriterion("modules_id not in", values, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdBetween(Integer value1, Integer value2) {
            addCriterion("modules_id between", value1, value2, "modulesId");
            return (Criteria) this;
        }

        public Criteria andModulesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modules_id not between", value1, value2, "modulesId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("goods_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNull() {
            addCriterion("promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNotNull() {
            addCriterion("promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceEqualTo(BigDecimal value) {
            addCriterion("promotion_price =", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("promotion_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotEqualTo(BigDecimal value) {
            addCriterion("promotion_price <>", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("promotion_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThan(BigDecimal value) {
            addCriterion("promotion_price >", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("promotion_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price >=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("promotion_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThan(BigDecimal value) {
            addCriterion("promotion_price <", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("promotion_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price <=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanOrEqualToColumn(GoodsModules.Column column) {
            addCriterion(new StringBuilder("promotion_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIn(List<BigDecimal> values) {
            addCriterion("promotion_price in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotIn(List<BigDecimal> values) {
            addCriterion("promotion_price not in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price not between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsModulesExample example;

        protected Criteria(GoodsModulesExample example) {
            super();
            this.example = example;
        }

        public GoodsModulesExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsModulesExample example);
    }
}