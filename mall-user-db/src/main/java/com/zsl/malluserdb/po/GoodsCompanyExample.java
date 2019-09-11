package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCompanyExample() {
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

    public GoodsCompanyExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsCompanyExample orderBy(String ... orderByClauses) {
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
        GoodsCompanyExample example = new GoodsCompanyExample();
        return example.createCriteria();
    }

    public GoodsCompanyExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsCompanyExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNull() {
            addCriterion("company_logo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNotNull() {
            addCriterion("company_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoEqualTo(String value) {
            addCriterion("company_logo =", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_logo = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotEqualTo(String value) {
            addCriterion("company_logo <>", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_logo <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThan(String value) {
            addCriterion("company_logo >", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_logo > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo >=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_logo >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThan(String value) {
            addCriterion("company_logo <", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_logo < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanOrEqualTo(String value) {
            addCriterion("company_logo <=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_logo <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLike(String value) {
            addCriterion("company_logo like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotLike(String value) {
            addCriterion("company_logo not like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIn(List<String> values) {
            addCriterion("company_logo in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotIn(List<String> values) {
            addCriterion("company_logo not in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoBetween(String value1, String value2) {
            addCriterion("company_logo between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotBetween(String value1, String value2) {
            addCriterion("company_logo not between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeIsNull() {
            addCriterion("company_home is null");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeIsNotNull() {
            addCriterion("company_home is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeEqualTo(String value) {
            addCriterion("company_home =", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_home = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyHomeNotEqualTo(String value) {
            addCriterion("company_home <>", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_home <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyHomeGreaterThan(String value) {
            addCriterion("company_home >", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_home > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyHomeGreaterThanOrEqualTo(String value) {
            addCriterion("company_home >=", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_home >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyHomeLessThan(String value) {
            addCriterion("company_home <", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_home < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyHomeLessThanOrEqualTo(String value) {
            addCriterion("company_home <=", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_home <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyHomeLike(String value) {
            addCriterion("company_home like", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeNotLike(String value) {
            addCriterion("company_home not like", value, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeIn(List<String> values) {
            addCriterion("company_home in", values, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeNotIn(List<String> values) {
            addCriterion("company_home not in", values, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeBetween(String value1, String value2) {
            addCriterion("company_home between", value1, value2, "companyHome");
            return (Criteria) this;
        }

        public Criteria andCompanyHomeNotBetween(String value1, String value2) {
            addCriterion("company_home not between", value1, value2, "companyHome");
            return (Criteria) this;
        }

        public Criteria andSortWeightIsNull() {
            addCriterion("sort_weight is null");
            return (Criteria) this;
        }

        public Criteria andSortWeightIsNotNull() {
            addCriterion("sort_weight is not null");
            return (Criteria) this;
        }

        public Criteria andSortWeightEqualTo(Integer value) {
            addCriterion("sort_weight =", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("sort_weight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightNotEqualTo(Integer value) {
            addCriterion("sort_weight <>", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("sort_weight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThan(Integer value) {
            addCriterion("sort_weight >", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("sort_weight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_weight >=", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("sort_weight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThan(Integer value) {
            addCriterion("sort_weight <", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("sort_weight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThanOrEqualTo(Integer value) {
            addCriterion("sort_weight <=", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("sort_weight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightIn(List<Integer> values) {
            addCriterion("sort_weight in", values, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightNotIn(List<Integer> values) {
            addCriterion("sort_weight not in", values, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightBetween(Integer value1, Integer value2) {
            addCriterion("sort_weight between", value1, value2, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_weight not between", value1, value2, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIsNull() {
            addCriterion("company_description is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIsNotNull() {
            addCriterion("company_description is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionEqualTo(String value) {
            addCriterion("company_description =", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_description = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotEqualTo(String value) {
            addCriterion("company_description <>", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_description <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionGreaterThan(String value) {
            addCriterion("company_description >", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_description > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("company_description >=", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_description >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLessThan(String value) {
            addCriterion("company_description <", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_description < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("company_description <=", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("company_description <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLike(String value) {
            addCriterion("company_description like", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotLike(String value) {
            addCriterion("company_description not like", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIn(List<String> values) {
            addCriterion("company_description in", values, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotIn(List<String> values) {
            addCriterion("company_description not in", values, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionBetween(String value1, String value2) {
            addCriterion("company_description between", value1, value2, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotBetween(String value1, String value2) {
            addCriterion("company_description not between", value1, value2, "companyDescription");
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

        public Criteria andCreateTimeEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(GoodsCompany.Column column) {
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

        public Criteria andMallUpdateIsNull() {
            addCriterion("mall_update is null");
            return (Criteria) this;
        }

        public Criteria andMallUpdateIsNotNull() {
            addCriterion("mall_update is not null");
            return (Criteria) this;
        }

        public Criteria andMallUpdateEqualTo(Date value) {
            addCriterion("mall_update =", value, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("mall_update = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallUpdateNotEqualTo(Date value) {
            addCriterion("mall_update <>", value, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("mall_update <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallUpdateGreaterThan(Date value) {
            addCriterion("mall_update >", value, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("mall_update > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mall_update >=", value, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("mall_update >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallUpdateLessThan(Date value) {
            addCriterion("mall_update <", value, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("mall_update < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallUpdateLessThanOrEqualTo(Date value) {
            addCriterion("mall_update <=", value, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("mall_update <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallUpdateIn(List<Date> values) {
            addCriterion("mall_update in", values, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateNotIn(List<Date> values) {
            addCriterion("mall_update not in", values, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateBetween(Date value1, Date value2) {
            addCriterion("mall_update between", value1, value2, "mallUpdate");
            return (Criteria) this;
        }

        public Criteria andMallUpdateNotBetween(Date value1, Date value2) {
            addCriterion("mall_update not between", value1, value2, "mallUpdate");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(GoodsCompany.Column column) {
            addCriterion(new StringBuilder("`status` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsCompanyExample example;

        protected Criteria(GoodsCompanyExample example) {
            super();
            this.example = example;
        }

        public GoodsCompanyExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsCompanyExample example);
    }
}