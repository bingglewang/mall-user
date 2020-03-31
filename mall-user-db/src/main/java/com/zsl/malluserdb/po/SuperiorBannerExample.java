package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class SuperiorBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperiorBannerExample() {
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

    public SuperiorBannerExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SuperiorBannerExample orderBy(String ... orderByClauses) {
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
        SuperiorBannerExample example = new SuperiorBannerExample();
        return example.createCriteria();
    }

    public SuperiorBannerExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SuperiorBannerExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SuperiorBanner.Column column) {
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

        public Criteria andGoodsSpuIdIsNull() {
            addCriterion("goods_spu_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdIsNotNull() {
            addCriterion("goods_spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdEqualTo(Integer value) {
            addCriterion("goods_spu_id =", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("goods_spu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotEqualTo(Integer value) {
            addCriterion("goods_spu_id <>", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("goods_spu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThan(Integer value) {
            addCriterion("goods_spu_id >", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("goods_spu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spu_id >=", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("goods_spu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThan(Integer value) {
            addCriterion("goods_spu_id <", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("goods_spu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spu_id <=", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("goods_spu_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdIn(List<Integer> values) {
            addCriterion("goods_spu_id in", values, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotIn(List<Integer> values) {
            addCriterion("goods_spu_id not in", values, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_spu_id between", value1, value2, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_spu_id not between", value1, value2, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andImgBannerIsNull() {
            addCriterion("img_banner is null");
            return (Criteria) this;
        }

        public Criteria andImgBannerIsNotNull() {
            addCriterion("img_banner is not null");
            return (Criteria) this;
        }

        public Criteria andImgBannerEqualTo(String value) {
            addCriterion("img_banner =", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_banner = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgBannerNotEqualTo(String value) {
            addCriterion("img_banner <>", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerNotEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_banner <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgBannerGreaterThan(String value) {
            addCriterion("img_banner >", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerGreaterThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_banner > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgBannerGreaterThanOrEqualTo(String value) {
            addCriterion("img_banner >=", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerGreaterThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_banner >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgBannerLessThan(String value) {
            addCriterion("img_banner <", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerLessThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_banner < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgBannerLessThanOrEqualTo(String value) {
            addCriterion("img_banner <=", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerLessThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_banner <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgBannerLike(String value) {
            addCriterion("img_banner like", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerNotLike(String value) {
            addCriterion("img_banner not like", value, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerIn(List<String> values) {
            addCriterion("img_banner in", values, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerNotIn(List<String> values) {
            addCriterion("img_banner not in", values, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerBetween(String value1, String value2) {
            addCriterion("img_banner between", value1, value2, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgBannerNotBetween(String value1, String value2) {
            addCriterion("img_banner not between", value1, value2, "imgBanner");
            return (Criteria) this;
        }

        public Criteria andImgDetailIsNull() {
            addCriterion("img_detail is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailIsNotNull() {
            addCriterion("img_detail is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailEqualTo(String value) {
            addCriterion("img_detail =", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_detail = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgDetailNotEqualTo(String value) {
            addCriterion("img_detail <>", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_detail <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgDetailGreaterThan(String value) {
            addCriterion("img_detail >", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailGreaterThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_detail > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgDetailGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail >=", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailGreaterThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_detail >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgDetailLessThan(String value) {
            addCriterion("img_detail <", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailLessThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_detail < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgDetailLessThanOrEqualTo(String value) {
            addCriterion("img_detail <=", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailLessThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_detail <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgDetailLike(String value) {
            addCriterion("img_detail like", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotLike(String value) {
            addCriterion("img_detail not like", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailIn(List<String> values) {
            addCriterion("img_detail in", values, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotIn(List<String> values) {
            addCriterion("img_detail not in", values, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailBetween(String value1, String value2) {
            addCriterion("img_detail between", value1, value2, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotBetween(String value1, String value2) {
            addCriterion("img_detail not between", value1, value2, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgPosterIsNull() {
            addCriterion("img_poster is null");
            return (Criteria) this;
        }

        public Criteria andImgPosterIsNotNull() {
            addCriterion("img_poster is not null");
            return (Criteria) this;
        }

        public Criteria andImgPosterEqualTo(String value) {
            addCriterion("img_poster =", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_poster = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgPosterNotEqualTo(String value) {
            addCriterion("img_poster <>", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterNotEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_poster <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgPosterGreaterThan(String value) {
            addCriterion("img_poster >", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterGreaterThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_poster > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgPosterGreaterThanOrEqualTo(String value) {
            addCriterion("img_poster >=", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterGreaterThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_poster >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgPosterLessThan(String value) {
            addCriterion("img_poster <", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterLessThanColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_poster < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgPosterLessThanOrEqualTo(String value) {
            addCriterion("img_poster <=", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterLessThanOrEqualToColumn(SuperiorBanner.Column column) {
            addCriterion(new StringBuilder("img_poster <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgPosterLike(String value) {
            addCriterion("img_poster like", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterNotLike(String value) {
            addCriterion("img_poster not like", value, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterIn(List<String> values) {
            addCriterion("img_poster in", values, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterNotIn(List<String> values) {
            addCriterion("img_poster not in", values, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterBetween(String value1, String value2) {
            addCriterion("img_poster between", value1, value2, "imgPoster");
            return (Criteria) this;
        }

        public Criteria andImgPosterNotBetween(String value1, String value2) {
            addCriterion("img_poster not between", value1, value2, "imgPoster");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SuperiorBannerExample example;

        protected Criteria(SuperiorBannerExample example) {
            super();
            this.example = example;
        }

        public SuperiorBannerExample example() {
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
        void example(com.zsl.malluserdb.po.SuperiorBannerExample example);
    }
}