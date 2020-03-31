package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuperiorGoodsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperiorGoodsDetailExample() {
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

    public SuperiorGoodsDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SuperiorGoodsDetailExample orderBy(String ... orderByClauses) {
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
        SuperiorGoodsDetailExample example = new SuperiorGoodsDetailExample();
        return example.createCriteria();
    }

    public SuperiorGoodsDetailExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SuperiorGoodsDetailExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
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

        public Criteria andGoodsSpuIdEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("goods_spu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotEqualTo(Integer value) {
            addCriterion("goods_spu_id <>", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("goods_spu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThan(Integer value) {
            addCriterion("goods_spu_id >", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("goods_spu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spu_id >=", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("goods_spu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThan(Integer value) {
            addCriterion("goods_spu_id <", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("goods_spu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spu_id <=", value, "goodsSpuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpuIdLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
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

        public Criteria andOfficialPriceIsNull() {
            addCriterion("official_price is null");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceIsNotNull() {
            addCriterion("official_price is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceEqualTo(BigDecimal value) {
            addCriterion("official_price =", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("official_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotEqualTo(BigDecimal value) {
            addCriterion("official_price <>", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("official_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficialPriceGreaterThan(BigDecimal value) {
            addCriterion("official_price >", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("official_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("official_price >=", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("official_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficialPriceLessThan(BigDecimal value) {
            addCriterion("official_price <", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("official_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("official_price <=", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("official_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficialPriceIn(List<BigDecimal> values) {
            addCriterion("official_price in", values, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotIn(List<BigDecimal> values) {
            addCriterion("official_price not in", values, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("official_price between", value1, value2, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("official_price not between", value1, value2, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceIsNull() {
            addCriterion("super_price is null");
            return (Criteria) this;
        }

        public Criteria andSuperPriceIsNotNull() {
            addCriterion("super_price is not null");
            return (Criteria) this;
        }

        public Criteria andSuperPriceEqualTo(BigDecimal value) {
            addCriterion("super_price =", value, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperPriceNotEqualTo(BigDecimal value) {
            addCriterion("super_price <>", value, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperPriceGreaterThan(BigDecimal value) {
            addCriterion("super_price >", value, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("super_price >=", value, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperPriceLessThan(BigDecimal value) {
            addCriterion("super_price <", value, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("super_price <=", value, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperPriceIn(List<BigDecimal> values) {
            addCriterion("super_price in", values, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceNotIn(List<BigDecimal> values) {
            addCriterion("super_price not in", values, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_price between", value1, value2, "superPrice");
            return (Criteria) this;
        }

        public Criteria andSuperPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_price not between", value1, value2, "superPrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceIsNull() {
            addCriterion("node_price is null");
            return (Criteria) this;
        }

        public Criteria andNodePriceIsNotNull() {
            addCriterion("node_price is not null");
            return (Criteria) this;
        }

        public Criteria andNodePriceEqualTo(BigDecimal value) {
            addCriterion("node_price =", value, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodePriceNotEqualTo(BigDecimal value) {
            addCriterion("node_price <>", value, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodePriceGreaterThan(BigDecimal value) {
            addCriterion("node_price >", value, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("node_price >=", value, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodePriceLessThan(BigDecimal value) {
            addCriterion("node_price <", value, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("node_price <=", value, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodePriceIn(List<BigDecimal> values) {
            addCriterion("node_price in", values, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceNotIn(List<BigDecimal> values) {
            addCriterion("node_price not in", values, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("node_price between", value1, value2, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andNodePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("node_price not between", value1, value2, "nodePrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceIsNull() {
            addCriterion("general_price is null");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceIsNotNull() {
            addCriterion("general_price is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceEqualTo(BigDecimal value) {
            addCriterion("general_price =", value, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("general_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGeneralPriceNotEqualTo(BigDecimal value) {
            addCriterion("general_price <>", value, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("general_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGeneralPriceGreaterThan(BigDecimal value) {
            addCriterion("general_price >", value, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("general_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGeneralPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("general_price >=", value, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("general_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGeneralPriceLessThan(BigDecimal value) {
            addCriterion("general_price <", value, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("general_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGeneralPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("general_price <=", value, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("general_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGeneralPriceIn(List<BigDecimal> values) {
            addCriterion("general_price in", values, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceNotIn(List<BigDecimal> values) {
            addCriterion("general_price not in", values, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("general_price between", value1, value2, "generalPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("general_price not between", value1, value2, "generalPrice");
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

        public Criteria andCreateTimeEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
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

        public Criteria andOfficalCountIsNull() {
            addCriterion("offical_count is null");
            return (Criteria) this;
        }

        public Criteria andOfficalCountIsNotNull() {
            addCriterion("offical_count is not null");
            return (Criteria) this;
        }

        public Criteria andOfficalCountEqualTo(Integer value) {
            addCriterion("offical_count =", value, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("offical_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficalCountNotEqualTo(Integer value) {
            addCriterion("offical_count <>", value, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("offical_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficalCountGreaterThan(Integer value) {
            addCriterion("offical_count >", value, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("offical_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("offical_count >=", value, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("offical_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficalCountLessThan(Integer value) {
            addCriterion("offical_count <", value, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("offical_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficalCountLessThanOrEqualTo(Integer value) {
            addCriterion("offical_count <=", value, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("offical_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfficalCountIn(List<Integer> values) {
            addCriterion("offical_count in", values, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountNotIn(List<Integer> values) {
            addCriterion("offical_count not in", values, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountBetween(Integer value1, Integer value2) {
            addCriterion("offical_count between", value1, value2, "officalCount");
            return (Criteria) this;
        }

        public Criteria andOfficalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("offical_count not between", value1, value2, "officalCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountIsNull() {
            addCriterion("super_count is null");
            return (Criteria) this;
        }

        public Criteria andSuperCountIsNotNull() {
            addCriterion("super_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuperCountEqualTo(Integer value) {
            addCriterion("super_count =", value, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperCountNotEqualTo(Integer value) {
            addCriterion("super_count <>", value, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperCountGreaterThan(Integer value) {
            addCriterion("super_count >", value, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_count >=", value, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperCountLessThan(Integer value) {
            addCriterion("super_count <", value, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperCountLessThanOrEqualTo(Integer value) {
            addCriterion("super_count <=", value, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("super_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSuperCountIn(List<Integer> values) {
            addCriterion("super_count in", values, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountNotIn(List<Integer> values) {
            addCriterion("super_count not in", values, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountBetween(Integer value1, Integer value2) {
            addCriterion("super_count between", value1, value2, "superCount");
            return (Criteria) this;
        }

        public Criteria andSuperCountNotBetween(Integer value1, Integer value2) {
            addCriterion("super_count not between", value1, value2, "superCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountIsNull() {
            addCriterion("node_count is null");
            return (Criteria) this;
        }

        public Criteria andNodeCountIsNotNull() {
            addCriterion("node_count is not null");
            return (Criteria) this;
        }

        public Criteria andNodeCountEqualTo(Integer value) {
            addCriterion("node_count =", value, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodeCountNotEqualTo(Integer value) {
            addCriterion("node_count <>", value, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodeCountGreaterThan(Integer value) {
            addCriterion("node_count >", value, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_count >=", value, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodeCountLessThan(Integer value) {
            addCriterion("node_count <", value, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodeCountLessThanOrEqualTo(Integer value) {
            addCriterion("node_count <=", value, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("node_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNodeCountIn(List<Integer> values) {
            addCriterion("node_count in", values, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountNotIn(List<Integer> values) {
            addCriterion("node_count not in", values, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountBetween(Integer value1, Integer value2) {
            addCriterion("node_count between", value1, value2, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andNodeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("node_count not between", value1, value2, "nodeCount");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("unit = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("unit <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("unit > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("unit >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("unit < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualToColumn(SuperiorGoodsDetail.Column column) {
            addCriterion(new StringBuilder("unit <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SuperiorGoodsDetailExample example;

        protected Criteria(SuperiorGoodsDetailExample example) {
            super();
            this.example = example;
        }

        public SuperiorGoodsDetailExample example() {
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
        void example(com.zsl.malluserdb.po.SuperiorGoodsDetailExample example);
    }
}