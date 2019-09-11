package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsPicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsPicInfoExample() {
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

    public GoodsPicInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsPicInfoExample orderBy(String ... orderByClauses) {
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
        GoodsPicInfoExample example = new GoodsPicInfoExample();
        return example.createCriteria();
    }

    public GoodsPicInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsPicInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsPicInfo.Column column) {
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

        public Criteria andSpuIdIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(Long value) {
            addCriterion("spu_id =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("spu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Long value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("spu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Long value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("spu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("spu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Long value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("spu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Long value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("spu_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<Long> values) {
            addCriterion("spu_id in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<Long> values) {
            addCriterion("spu_id not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(Long value1, Long value2) {
            addCriterion("spu_id between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(Long value1, Long value2) {
            addCriterion("spu_id not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlIsNull() {
            addCriterion("goods_info_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlIsNotNull() {
            addCriterion("goods_info_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlEqualTo(String value) {
            addCriterion("goods_info_url =", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("goods_info_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlNotEqualTo(String value) {
            addCriterion("goods_info_url <>", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlNotEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("goods_info_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlGreaterThan(String value) {
            addCriterion("goods_info_url >", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlGreaterThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("goods_info_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_info_url >=", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlGreaterThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("goods_info_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlLessThan(String value) {
            addCriterion("goods_info_url <", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlLessThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("goods_info_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlLessThanOrEqualTo(String value) {
            addCriterion("goods_info_url <=", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlLessThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("goods_info_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlLike(String value) {
            addCriterion("goods_info_url like", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlNotLike(String value) {
            addCriterion("goods_info_url not like", value, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlIn(List<String> values) {
            addCriterion("goods_info_url in", values, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlNotIn(List<String> values) {
            addCriterion("goods_info_url not in", values, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlBetween(String value1, String value2) {
            addCriterion("goods_info_url between", value1, value2, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoUrlNotBetween(String value1, String value2) {
            addCriterion("goods_info_url not between", value1, value2, "goodsInfoUrl");
            return (Criteria) this;
        }

        public Criteria andIndexIsNull() {
            addCriterion("`index` is null");
            return (Criteria) this;
        }

        public Criteria andIndexIsNotNull() {
            addCriterion("`index` is not null");
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(Integer value) {
            addCriterion("`index` =", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("`index` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualTo(Integer value) {
            addCriterion("`index` <>", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("`index` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThan(Integer value) {
            addCriterion("`index` >", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("`index` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("`index` >=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("`index` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexLessThan(Integer value) {
            addCriterion("`index` <", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("`index` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualTo(Integer value) {
            addCriterion("`index` <=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualToColumn(GoodsPicInfo.Column column) {
            addCriterion(new StringBuilder("`index` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexIn(List<Integer> values) {
            addCriterion("`index` in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotIn(List<Integer> values) {
            addCriterion("`index` not in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexBetween(Integer value1, Integer value2) {
            addCriterion("`index` between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("`index` not between", value1, value2, "index");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsPicInfoExample example;

        protected Criteria(GoodsPicInfoExample example) {
            super();
            this.example = example;
        }

        public GoodsPicInfoExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsPicInfoExample example);
    }
}