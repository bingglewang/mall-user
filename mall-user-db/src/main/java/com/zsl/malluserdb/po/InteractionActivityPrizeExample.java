package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InteractionActivityPrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InteractionActivityPrizeExample() {
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

    public InteractionActivityPrizeExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public InteractionActivityPrizeExample orderBy(String ... orderByClauses) {
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
        InteractionActivityPrizeExample example = new InteractionActivityPrizeExample();
        return example.createCriteria();
    }

    public InteractionActivityPrizeExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public InteractionActivityPrizeExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
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

        public Criteria andInstanceIdIsNull() {
            addCriterion("instance_id is null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNotNull() {
            addCriterion("instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdEqualTo(Integer value) {
            addCriterion("instance_id =", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("instance_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotEqualTo(Integer value) {
            addCriterion("instance_id <>", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("instance_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThan(Integer value) {
            addCriterion("instance_id >", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("instance_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instance_id >=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("instance_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThan(Integer value) {
            addCriterion("instance_id <", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("instance_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("instance_id <=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("instance_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInstanceIdIn(List<Integer> values) {
            addCriterion("instance_id in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotIn(List<Integer> values) {
            addCriterion("instance_id not in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdBetween(Integer value1, Integer value2) {
            addCriterion("instance_id between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instance_id not between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdIsNull() {
            addCriterion("prize_dic_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdIsNotNull() {
            addCriterion("prize_dic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdEqualTo(Integer value) {
            addCriterion("prize_dic_id =", value, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_dic_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdNotEqualTo(Integer value) {
            addCriterion("prize_dic_id <>", value, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_dic_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdGreaterThan(Integer value) {
            addCriterion("prize_dic_id >", value, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_dic_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_dic_id >=", value, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_dic_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdLessThan(Integer value) {
            addCriterion("prize_dic_id <", value, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_dic_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdLessThanOrEqualTo(Integer value) {
            addCriterion("prize_dic_id <=", value, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_dic_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdIn(List<Integer> values) {
            addCriterion("prize_dic_id in", values, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdNotIn(List<Integer> values) {
            addCriterion("prize_dic_id not in", values, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdBetween(Integer value1, Integer value2) {
            addCriterion("prize_dic_id between", value1, value2, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeDicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_dic_id not between", value1, value2, "prizeDicId");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumIsNull() {
            addCriterion("prize_total_num is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumIsNotNull() {
            addCriterion("prize_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumEqualTo(Integer value) {
            addCriterion("prize_total_num =", value, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_total_num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumNotEqualTo(Integer value) {
            addCriterion("prize_total_num <>", value, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_total_num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumGreaterThan(Integer value) {
            addCriterion("prize_total_num >", value, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_total_num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_total_num >=", value, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_total_num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumLessThan(Integer value) {
            addCriterion("prize_total_num <", value, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_total_num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("prize_total_num <=", value, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_total_num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumIn(List<Integer> values) {
            addCriterion("prize_total_num in", values, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumNotIn(List<Integer> values) {
            addCriterion("prize_total_num not in", values, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("prize_total_num between", value1, value2, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_total_num not between", value1, value2, "prizeTotalNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNull() {
            addCriterion("prize_num is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNotNull() {
            addCriterion("prize_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumEqualTo(Integer value) {
            addCriterion("prize_num =", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotEqualTo(Integer value) {
            addCriterion("prize_num <>", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThan(Integer value) {
            addCriterion("prize_num >", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_num >=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThan(Integer value) {
            addCriterion("prize_num <", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThanOrEqualTo(Integer value) {
            addCriterion("prize_num <=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("prize_num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNumIn(List<Integer> values) {
            addCriterion("prize_num in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotIn(List<Integer> values) {
            addCriterion("prize_num not in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumBetween(Integer value1, Integer value2) {
            addCriterion("prize_num between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_num not between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumIsNull() {
            addCriterion("residue_num is null");
            return (Criteria) this;
        }

        public Criteria andResidueNumIsNotNull() {
            addCriterion("residue_num is not null");
            return (Criteria) this;
        }

        public Criteria andResidueNumEqualTo(Integer value) {
            addCriterion("residue_num =", value, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("residue_num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResidueNumNotEqualTo(Integer value) {
            addCriterion("residue_num <>", value, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("residue_num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResidueNumGreaterThan(Integer value) {
            addCriterion("residue_num >", value, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("residue_num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResidueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("residue_num >=", value, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("residue_num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResidueNumLessThan(Integer value) {
            addCriterion("residue_num <", value, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("residue_num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResidueNumLessThanOrEqualTo(Integer value) {
            addCriterion("residue_num <=", value, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("residue_num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResidueNumIn(List<Integer> values) {
            addCriterion("residue_num in", values, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumNotIn(List<Integer> values) {
            addCriterion("residue_num not in", values, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumBetween(Integer value1, Integer value2) {
            addCriterion("residue_num between", value1, value2, "residueNum");
            return (Criteria) this;
        }

        public Criteria andResidueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("residue_num not between", value1, value2, "residueNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("`status` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
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

        public Criteria andCreateTimeEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
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

        public Criteria andUpdateTimeEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(InteractionActivityPrize.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(InteractionActivityPrize.Column column) {
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
        private InteractionActivityPrizeExample example;

        protected Criteria(InteractionActivityPrizeExample example) {
            super();
            this.example = example;
        }

        public InteractionActivityPrizeExample example() {
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
        void example(com.zsl.malluserdb.po.InteractionActivityPrizeExample example);
    }
}