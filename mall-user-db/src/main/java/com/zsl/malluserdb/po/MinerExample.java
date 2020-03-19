package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MinerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MinerExample() {
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

    public MinerExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MinerExample orderBy(String ... orderByClauses) {
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
        MinerExample example = new MinerExample();
        return example.createCriteria();
    }

    public MinerExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MinerExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andMinerIdIsNull() {
            addCriterion("miner_id is null");
            return (Criteria) this;
        }

        public Criteria andMinerIdIsNotNull() {
            addCriterion("miner_id is not null");
            return (Criteria) this;
        }

        public Criteria andMinerIdEqualTo(Integer value) {
            addCriterion("miner_id =", value, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("miner_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinerIdNotEqualTo(Integer value) {
            addCriterion("miner_id <>", value, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("miner_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinerIdGreaterThan(Integer value) {
            addCriterion("miner_id >", value, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("miner_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("miner_id >=", value, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("miner_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinerIdLessThan(Integer value) {
            addCriterion("miner_id <", value, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("miner_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinerIdLessThanOrEqualTo(Integer value) {
            addCriterion("miner_id <=", value, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("miner_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinerIdIn(List<Integer> values) {
            addCriterion("miner_id in", values, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdNotIn(List<Integer> values) {
            addCriterion("miner_id not in", values, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdBetween(Integer value1, Integer value2) {
            addCriterion("miner_id between", value1, value2, "minerId");
            return (Criteria) this;
        }

        public Criteria andMinerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("miner_id not between", value1, value2, "minerId");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralIsNull() {
            addCriterion("pre_make_integral is null");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralIsNotNull() {
            addCriterion("pre_make_integral is not null");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralEqualTo(Integer value) {
            addCriterion("pre_make_integral =", value, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("pre_make_integral = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralNotEqualTo(Integer value) {
            addCriterion("pre_make_integral <>", value, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("pre_make_integral <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralGreaterThan(Integer value) {
            addCriterion("pre_make_integral >", value, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("pre_make_integral > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_make_integral >=", value, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("pre_make_integral >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralLessThan(Integer value) {
            addCriterion("pre_make_integral <", value, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("pre_make_integral < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("pre_make_integral <=", value, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("pre_make_integral <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralIn(List<Integer> values) {
            addCriterion("pre_make_integral in", values, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralNotIn(List<Integer> values) {
            addCriterion("pre_make_integral not in", values, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralBetween(Integer value1, Integer value2) {
            addCriterion("pre_make_integral between", value1, value2, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andPreMakeIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_make_integral not between", value1, value2, "preMakeIntegral");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Integer value) {
            addCriterion("source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Integer value) {
            addCriterion("source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Integer value) {
            addCriterion("source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Integer value) {
            addCriterion("source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("source_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Integer> values) {
            addCriterion("source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Integer> values) {
            addCriterion("source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_id not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralIsNull() {
            addCriterion("produced_integral is null");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralIsNotNull() {
            addCriterion("produced_integral is not null");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralEqualTo(Integer value) {
            addCriterion("produced_integral =", value, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("produced_integral = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProducedIntegralNotEqualTo(Integer value) {
            addCriterion("produced_integral <>", value, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("produced_integral <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProducedIntegralGreaterThan(Integer value) {
            addCriterion("produced_integral >", value, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("produced_integral > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProducedIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("produced_integral >=", value, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("produced_integral >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProducedIntegralLessThan(Integer value) {
            addCriterion("produced_integral <", value, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("produced_integral < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProducedIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("produced_integral <=", value, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("produced_integral <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProducedIntegralIn(List<Integer> values) {
            addCriterion("produced_integral in", values, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralNotIn(List<Integer> values) {
            addCriterion("produced_integral not in", values, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralBetween(Integer value1, Integer value2) {
            addCriterion("produced_integral between", value1, value2, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andProducedIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("produced_integral not between", value1, value2, "producedIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralIsNull() {
            addCriterion("received_integral is null");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralIsNotNull() {
            addCriterion("received_integral is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralEqualTo(Integer value) {
            addCriterion("received_integral =", value, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("received_integral = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralNotEqualTo(Integer value) {
            addCriterion("received_integral <>", value, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("received_integral <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralGreaterThan(Integer value) {
            addCriterion("received_integral >", value, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("received_integral > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("received_integral >=", value, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("received_integral >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralLessThan(Integer value) {
            addCriterion("received_integral <", value, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("received_integral < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("received_integral <=", value, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralLessThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("received_integral <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralIn(List<Integer> values) {
            addCriterion("received_integral in", values, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralNotIn(List<Integer> values) {
            addCriterion("received_integral not in", values, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralBetween(Integer value1, Integer value2) {
            addCriterion("received_integral between", value1, value2, "receivedIntegral");
            return (Criteria) this;
        }

        public Criteria andReceivedIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("received_integral not between", value1, value2, "receivedIntegral");
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

        public Criteria andStatusEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(Miner.Column column) {
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

        public Criteria andCreateTimeEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(Miner.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(Miner.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(Miner.Column column) {
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
        private MinerExample example;

        protected Criteria(MinerExample example) {
            super();
            this.example = example;
        }

        public MinerExample example() {
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
        void example(com.zsl.malluserdb.po.MinerExample example);
    }
}