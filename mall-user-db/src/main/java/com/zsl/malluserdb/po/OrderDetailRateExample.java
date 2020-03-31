package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailRateExample() {
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

    public OrderDetailRateExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public OrderDetailRateExample orderBy(String ... orderByClauses) {
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
        OrderDetailRateExample example = new OrderDetailRateExample();
        return example.createCriteria();
    }

    public OrderDetailRateExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public OrderDetailRateExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(OrderDetailRate.Column column) {
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

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(Long value) {
            addCriterion("order_detail_id =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("order_detail_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(Long value) {
            addCriterion("order_detail_id <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("order_detail_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(Long value) {
            addCriterion("order_detail_id >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("order_detail_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_detail_id >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("order_detail_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(Long value) {
            addCriterion("order_detail_id <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("order_detail_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("order_detail_id <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("order_detail_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<Long> values) {
            addCriterion("order_detail_id in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<Long> values) {
            addCriterion("order_detail_id not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(Long value1, Long value2) {
            addCriterion("order_detail_id between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("order_detail_id not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("member_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("member_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("member_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("member_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("member_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("member_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionIsNull() {
            addCriterion("degree_of_satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionIsNotNull() {
            addCriterion("degree_of_satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionEqualTo(Byte value) {
            addCriterion("degree_of_satisfaction =", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotEqualTo(Byte value) {
            addCriterion("degree_of_satisfaction <>", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThan(Byte value) {
            addCriterion("degree_of_satisfaction >", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThanOrEqualTo(Byte value) {
            addCriterion("degree_of_satisfaction >=", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThan(Byte value) {
            addCriterion("degree_of_satisfaction <", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThanOrEqualTo(Byte value) {
            addCriterion("degree_of_satisfaction <=", value, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("degree_of_satisfaction <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionIn(List<Byte> values) {
            addCriterion("degree_of_satisfaction in", values, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotIn(List<Byte> values) {
            addCriterion("degree_of_satisfaction not in", values, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionBetween(Byte value1, Byte value2) {
            addCriterion("degree_of_satisfaction between", value1, value2, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andDegreeOfSatisfactionNotBetween(Byte value1, Byte value2) {
            addCriterion("degree_of_satisfaction not between", value1, value2, "degreeOfSatisfaction");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNull() {
            addCriterion("evaluation_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNotNull() {
            addCriterion("evaluation_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentEqualTo(String value) {
            addCriterion("evaluation_content =", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotEqualTo(String value) {
            addCriterion("evaluation_content <>", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThan(String value) {
            addCriterion("evaluation_content >", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_content >=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThan(String value) {
            addCriterion("evaluation_content <", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanOrEqualTo(String value) {
            addCriterion("evaluation_content <=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLike(String value) {
            addCriterion("evaluation_content like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotLike(String value) {
            addCriterion("evaluation_content not like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIn(List<String> values) {
            addCriterion("evaluation_content in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotIn(List<String> values) {
            addCriterion("evaluation_content not in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentBetween(String value1, String value2) {
            addCriterion("evaluation_content between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotBetween(String value1, String value2) {
            addCriterion("evaluation_content not between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlIsNull() {
            addCriterion("evaluation_image_url is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlIsNotNull() {
            addCriterion("evaluation_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlEqualTo(String value) {
            addCriterion("evaluation_image_url =", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotEqualTo(String value) {
            addCriterion("evaluation_image_url <>", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThan(String value) {
            addCriterion("evaluation_image_url >", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_image_url >=", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThan(String value) {
            addCriterion("evaluation_image_url <", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThanOrEqualTo(String value) {
            addCriterion("evaluation_image_url <=", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("evaluation_image_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlLike(String value) {
            addCriterion("evaluation_image_url like", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotLike(String value) {
            addCriterion("evaluation_image_url not like", value, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlIn(List<String> values) {
            addCriterion("evaluation_image_url in", values, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotIn(List<String> values) {
            addCriterion("evaluation_image_url not in", values, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlBetween(String value1, String value2) {
            addCriterion("evaluation_image_url between", value1, value2, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andEvaluationImageUrlNotBetween(String value1, String value2) {
            addCriterion("evaluation_image_url not between", value1, value2, "evaluationImageUrl");
            return (Criteria) this;
        }

        public Criteria andAnonymityIsNull() {
            addCriterion("anonymity is null");
            return (Criteria) this;
        }

        public Criteria andAnonymityIsNotNull() {
            addCriterion("anonymity is not null");
            return (Criteria) this;
        }

        public Criteria andAnonymityEqualTo(Byte value) {
            addCriterion("anonymity =", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("anonymity = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityNotEqualTo(Byte value) {
            addCriterion("anonymity <>", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("anonymity <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThan(Byte value) {
            addCriterion("anonymity >", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("anonymity > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanOrEqualTo(Byte value) {
            addCriterion("anonymity >=", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("anonymity >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThan(Byte value) {
            addCriterion("anonymity <", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("anonymity < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanOrEqualTo(Byte value) {
            addCriterion("anonymity <=", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("anonymity <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnonymityIn(List<Byte> values) {
            addCriterion("anonymity in", values, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotIn(List<Byte> values) {
            addCriterion("anonymity not in", values, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityBetween(Byte value1, Byte value2) {
            addCriterion("anonymity between", value1, value2, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotBetween(Byte value1, Byte value2) {
            addCriterion("anonymity not between", value1, value2, "anonymity");
            return (Criteria) this;
        }

        public Criteria andSellerReplyIsNull() {
            addCriterion("seller_reply is null");
            return (Criteria) this;
        }

        public Criteria andSellerReplyIsNotNull() {
            addCriterion("seller_reply is not null");
            return (Criteria) this;
        }

        public Criteria andSellerReplyEqualTo(String value) {
            addCriterion("seller_reply =", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("seller_reply = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotEqualTo(String value) {
            addCriterion("seller_reply <>", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("seller_reply <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerReplyGreaterThan(String value) {
            addCriterion("seller_reply >", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("seller_reply > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerReplyGreaterThanOrEqualTo(String value) {
            addCriterion("seller_reply >=", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("seller_reply >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerReplyLessThan(String value) {
            addCriterion("seller_reply <", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("seller_reply < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerReplyLessThanOrEqualTo(String value) {
            addCriterion("seller_reply <=", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("seller_reply <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerReplyLike(String value) {
            addCriterion("seller_reply like", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotLike(String value) {
            addCriterion("seller_reply not like", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyIn(List<String> values) {
            addCriterion("seller_reply in", values, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotIn(List<String> values) {
            addCriterion("seller_reply not in", values, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyBetween(String value1, String value2) {
            addCriterion("seller_reply between", value1, value2, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotBetween(String value1, String value2) {
            addCriterion("seller_reply not between", value1, value2, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationIsNull() {
            addCriterion("additional_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationIsNotNull() {
            addCriterion("additional_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationEqualTo(String value) {
            addCriterion("additional_evaluation =", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("additional_evaluation = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotEqualTo(String value) {
            addCriterion("additional_evaluation <>", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("additional_evaluation <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationGreaterThan(String value) {
            addCriterion("additional_evaluation >", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("additional_evaluation > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("additional_evaluation >=", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("additional_evaluation >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLessThan(String value) {
            addCriterion("additional_evaluation <", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("additional_evaluation < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLessThanOrEqualTo(String value) {
            addCriterion("additional_evaluation <=", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("additional_evaluation <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLike(String value) {
            addCriterion("additional_evaluation like", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotLike(String value) {
            addCriterion("additional_evaluation not like", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationIn(List<String> values) {
            addCriterion("additional_evaluation in", values, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotIn(List<String> values) {
            addCriterion("additional_evaluation not in", values, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationBetween(String value1, String value2) {
            addCriterion("additional_evaluation between", value1, value2, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotBetween(String value1, String value2) {
            addCriterion("additional_evaluation not between", value1, value2, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andContentUpdateIsNull() {
            addCriterion("content_update is null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateIsNotNull() {
            addCriterion("content_update is not null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateEqualTo(Integer value) {
            addCriterion("content_update =", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("content_update = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotEqualTo(Integer value) {
            addCriterion("content_update <>", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("content_update <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentUpdateGreaterThan(Integer value) {
            addCriterion("content_update >", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateGreaterThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("content_update > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_update >=", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateGreaterThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("content_update >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentUpdateLessThan(Integer value) {
            addCriterion("content_update <", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateLessThanColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("content_update < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("content_update <=", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateLessThanOrEqualToColumn(OrderDetailRate.Column column) {
            addCriterion(new StringBuilder("content_update <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentUpdateIn(List<Integer> values) {
            addCriterion("content_update in", values, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotIn(List<Integer> values) {
            addCriterion("content_update not in", values, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateBetween(Integer value1, Integer value2) {
            addCriterion("content_update between", value1, value2, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("content_update not between", value1, value2, "contentUpdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private OrderDetailRateExample example;

        protected Criteria(OrderDetailRateExample example) {
            super();
            this.example = example;
        }

        public OrderDetailRateExample example() {
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
        void example(com.zsl.malluserdb.po.OrderDetailRateExample example);
    }
}