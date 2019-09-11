package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsBrandExample() {
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

    public GoodsBrandExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsBrandExample orderBy(String ... orderByClauses) {
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
        GoodsBrandExample example = new GoodsBrandExample();
        return example.createCriteria();
    }

    public GoodsBrandExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsBrandExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(GoodsBrand.Column column) {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("company_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("company_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("company_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("company_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("company_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("company_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andInitialLetterIsNull() {
            addCriterion("initial_letter is null");
            return (Criteria) this;
        }

        public Criteria andInitialLetterIsNotNull() {
            addCriterion("initial_letter is not null");
            return (Criteria) this;
        }

        public Criteria andInitialLetterEqualTo(String value) {
            addCriterion("initial_letter =", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("initial_letter = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInitialLetterNotEqualTo(String value) {
            addCriterion("initial_letter <>", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("initial_letter <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInitialLetterGreaterThan(String value) {
            addCriterion("initial_letter >", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("initial_letter > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInitialLetterGreaterThanOrEqualTo(String value) {
            addCriterion("initial_letter >=", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("initial_letter >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInitialLetterLessThan(String value) {
            addCriterion("initial_letter <", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("initial_letter < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInitialLetterLessThanOrEqualTo(String value) {
            addCriterion("initial_letter <=", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterLessThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("initial_letter <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInitialLetterLike(String value) {
            addCriterion("initial_letter like", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterNotLike(String value) {
            addCriterion("initial_letter not like", value, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterIn(List<String> values) {
            addCriterion("initial_letter in", values, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterNotIn(List<String> values) {
            addCriterion("initial_letter not in", values, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterBetween(String value1, String value2) {
            addCriterion("initial_letter between", value1, value2, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andInitialLetterNotBetween(String value1, String value2) {
            addCriterion("initial_letter not between", value1, value2, "initialLetter");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionIsNull() {
            addCriterion("brand_description is null");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionIsNotNull() {
            addCriterion("brand_description is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionEqualTo(String value) {
            addCriterion("brand_description =", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_description = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionNotEqualTo(String value) {
            addCriterion("brand_description <>", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_description <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionGreaterThan(String value) {
            addCriterion("brand_description >", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_description > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("brand_description >=", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_description >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionLessThan(String value) {
            addCriterion("brand_description <", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_description < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionLessThanOrEqualTo(String value) {
            addCriterion("brand_description <=", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionLessThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_description <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionLike(String value) {
            addCriterion("brand_description like", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionNotLike(String value) {
            addCriterion("brand_description not like", value, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionIn(List<String> values) {
            addCriterion("brand_description in", values, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionNotIn(List<String> values) {
            addCriterion("brand_description not in", values, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionBetween(String value1, String value2) {
            addCriterion("brand_description between", value1, value2, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandDescriptionNotBetween(String value1, String value2) {
            addCriterion("brand_description not between", value1, value2, "brandDescription");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIsNull() {
            addCriterion("brand_logo is null");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIsNotNull() {
            addCriterion("brand_logo is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLogoEqualTo(String value) {
            addCriterion("brand_logo =", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_logo = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotEqualTo(String value) {
            addCriterion("brand_logo <>", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_logo <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThan(String value) {
            addCriterion("brand_logo >", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_logo > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThanOrEqualTo(String value) {
            addCriterion("brand_logo >=", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_logo >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThan(String value) {
            addCriterion("brand_logo <", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_logo < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThanOrEqualTo(String value) {
            addCriterion("brand_logo <=", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("brand_logo <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLogoLike(String value) {
            addCriterion("brand_logo like", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotLike(String value) {
            addCriterion("brand_logo not like", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIn(List<String> values) {
            addCriterion("brand_logo in", values, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotIn(List<String> values) {
            addCriterion("brand_logo not in", values, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoBetween(String value1, String value2) {
            addCriterion("brand_logo between", value1, value2, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotBetween(String value1, String value2) {
            addCriterion("brand_logo not between", value1, value2, "brandLogo");
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

        public Criteria andSortWeightEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("sort_weight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightNotEqualTo(Integer value) {
            addCriterion("sort_weight <>", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("sort_weight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThan(Integer value) {
            addCriterion("sort_weight >", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("sort_weight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_weight >=", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("sort_weight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThan(Integer value) {
            addCriterion("sort_weight <", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("sort_weight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThanOrEqualTo(Integer value) {
            addCriterion("sort_weight <=", value, "sortWeight");
            return (Criteria) this;
        }

        public Criteria andSortWeightLessThanOrEqualToColumn(GoodsBrand.Column column) {
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

        public Criteria andCreateTimeEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(GoodsBrand.Column column) {
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

        public Criteria andUpdateTimeEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(GoodsBrand.Column column) {
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

        public Criteria andStatusEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(GoodsBrand.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(GoodsBrand.Column column) {
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
        private GoodsBrandExample example;

        protected Criteria(GoodsBrandExample example) {
            super();
            this.example = example;
        }

        public GoodsBrandExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsBrandExample example);
    }
}