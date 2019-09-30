package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsDivisionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsDivisionExample() {
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

    public GoodsDivisionExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsDivisionExample orderBy(String ... orderByClauses) {
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
        GoodsDivisionExample example = new GoodsDivisionExample();
        return example.createCriteria();
    }

    public GoodsDivisionExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsDivisionExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsDivision.Column column) {
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

        public Criteria andDivisionIdEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("division_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotEqualTo(Integer value) {
            addCriterion("division_id <>", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("division_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThan(Integer value) {
            addCriterion("division_id >", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("division_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("division_id >=", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("division_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThan(Integer value) {
            addCriterion("division_id <", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("division_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanOrEqualTo(Integer value) {
            addCriterion("division_id <=", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanOrEqualToColumn(GoodsDivision.Column column) {
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

        public Criteria andTopicNameIsNull() {
            addCriterion("topic_name is null");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNotNull() {
            addCriterion("topic_name is not null");
            return (Criteria) this;
        }

        public Criteria andTopicNameEqualTo(String value) {
            addCriterion("topic_name =", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("topic_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTopicNameNotEqualTo(String value) {
            addCriterion("topic_name <>", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("topic_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThan(String value) {
            addCriterion("topic_name >", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("topic_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanOrEqualTo(String value) {
            addCriterion("topic_name >=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("topic_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThan(String value) {
            addCriterion("topic_name <", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("topic_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanOrEqualTo(String value) {
            addCriterion("topic_name <=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("topic_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTopicNameLike(String value) {
            addCriterion("topic_name like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotLike(String value) {
            addCriterion("topic_name not like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameIn(List<String> values) {
            addCriterion("topic_name in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotIn(List<String> values) {
            addCriterion("topic_name not in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameBetween(String value1, String value2) {
            addCriterion("topic_name between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotBetween(String value1, String value2) {
            addCriterion("topic_name not between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andViceNameIsNull() {
            addCriterion("vice_name is null");
            return (Criteria) this;
        }

        public Criteria andViceNameIsNotNull() {
            addCriterion("vice_name is not null");
            return (Criteria) this;
        }

        public Criteria andViceNameEqualTo(String value) {
            addCriterion("vice_name =", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("vice_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andViceNameNotEqualTo(String value) {
            addCriterion("vice_name <>", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("vice_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andViceNameGreaterThan(String value) {
            addCriterion("vice_name >", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("vice_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andViceNameGreaterThanOrEqualTo(String value) {
            addCriterion("vice_name >=", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("vice_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andViceNameLessThan(String value) {
            addCriterion("vice_name <", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("vice_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andViceNameLessThanOrEqualTo(String value) {
            addCriterion("vice_name <=", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameLessThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("vice_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andViceNameLike(String value) {
            addCriterion("vice_name like", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameNotLike(String value) {
            addCriterion("vice_name not like", value, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameIn(List<String> values) {
            addCriterion("vice_name in", values, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameNotIn(List<String> values) {
            addCriterion("vice_name not in", values, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameBetween(String value1, String value2) {
            addCriterion("vice_name between", value1, value2, "viceName");
            return (Criteria) this;
        }

        public Criteria andViceNameNotBetween(String value1, String value2) {
            addCriterion("vice_name not between", value1, value2, "viceName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureIsNull() {
            addCriterion("goods_picture is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureIsNotNull() {
            addCriterion("goods_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureEqualTo(String value) {
            addCriterion("goods_picture =", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_picture = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotEqualTo(String value) {
            addCriterion("goods_picture <>", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_picture <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThan(String value) {
            addCriterion("goods_picture >", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_picture > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("goods_picture >=", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_picture >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThan(String value) {
            addCriterion("goods_picture <", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_picture < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThanOrEqualTo(String value) {
            addCriterion("goods_picture <=", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLessThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_picture <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPictureLike(String value) {
            addCriterion("goods_picture like", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotLike(String value) {
            addCriterion("goods_picture not like", value, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureIn(List<String> values) {
            addCriterion("goods_picture in", values, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotIn(List<String> values) {
            addCriterion("goods_picture not in", values, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureBetween(String value1, String value2) {
            addCriterion("goods_picture between", value1, value2, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPictureNotBetween(String value1, String value2) {
            addCriterion("goods_picture not between", value1, value2, "goodsPicture");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("goods_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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

        public Criteria andSpuIdEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("spu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Long value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("spu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Long value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("spu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualToColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("spu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Long value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanColumn(GoodsDivision.Column column) {
            addCriterion(new StringBuilder("spu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Long value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualToColumn(GoodsDivision.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsDivisionExample example;

        protected Criteria(GoodsDivisionExample example) {
            super();
            this.example = example;
        }

        public GoodsDivisionExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsDivisionExample example);
    }
}