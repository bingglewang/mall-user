package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class UserWeixinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWeixinExample() {
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

    public UserWeixinExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public UserWeixinExample orderBy(String ... orderByClauses) {
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
        UserWeixinExample example = new UserWeixinExample();
        return example.createCriteria();
    }

    public UserWeixinExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public UserWeixinExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(UserWeixin.Column column) {
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

        public Criteria andWxOpenidIsNull() {
            addCriterion("wx_openid is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNotNull() {
            addCriterion("wx_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualTo(String value) {
            addCriterion("wx_openid =", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_openid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualTo(String value) {
            addCriterion("wx_openid <>", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_openid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThan(String value) {
            addCriterion("wx_openid >", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_openid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_openid >=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_openid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThan(String value) {
            addCriterion("wx_openid <", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_openid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("wx_openid <=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_openid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxOpenidLike(String value) {
            addCriterion("wx_openid like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotLike(String value) {
            addCriterion("wx_openid not like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIn(List<String> values) {
            addCriterion("wx_openid in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotIn(List<String> values) {
            addCriterion("wx_openid not in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidBetween(String value1, String value2) {
            addCriterion("wx_openid between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotBetween(String value1, String value2) {
            addCriterion("wx_openid not between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxSexIsNull() {
            addCriterion("wx_sex is null");
            return (Criteria) this;
        }

        public Criteria andWxSexIsNotNull() {
            addCriterion("wx_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWxSexEqualTo(String value) {
            addCriterion("wx_sex =", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_sex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxSexNotEqualTo(String value) {
            addCriterion("wx_sex <>", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_sex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxSexGreaterThan(String value) {
            addCriterion("wx_sex >", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_sex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxSexGreaterThanOrEqualTo(String value) {
            addCriterion("wx_sex >=", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_sex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxSexLessThan(String value) {
            addCriterion("wx_sex <", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_sex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxSexLessThanOrEqualTo(String value) {
            addCriterion("wx_sex <=", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_sex <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxSexLike(String value) {
            addCriterion("wx_sex like", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotLike(String value) {
            addCriterion("wx_sex not like", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexIn(List<String> values) {
            addCriterion("wx_sex in", values, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotIn(List<String> values) {
            addCriterion("wx_sex not in", values, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexBetween(String value1, String value2) {
            addCriterion("wx_sex between", value1, value2, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotBetween(String value1, String value2) {
            addCriterion("wx_sex not between", value1, value2, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIsNull() {
            addCriterion("wx_province is null");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIsNotNull() {
            addCriterion("wx_province is not null");
            return (Criteria) this;
        }

        public Criteria andWxProvinceEqualTo(String value) {
            addCriterion("wx_province =", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_province = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotEqualTo(String value) {
            addCriterion("wx_province <>", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_province <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThan(String value) {
            addCriterion("wx_province >", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_province > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("wx_province >=", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_province >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThan(String value) {
            addCriterion("wx_province <", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_province < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThanOrEqualTo(String value) {
            addCriterion("wx_province <=", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_province <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxProvinceLike(String value) {
            addCriterion("wx_province like", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotLike(String value) {
            addCriterion("wx_province not like", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIn(List<String> values) {
            addCriterion("wx_province in", values, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotIn(List<String> values) {
            addCriterion("wx_province not in", values, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceBetween(String value1, String value2) {
            addCriterion("wx_province between", value1, value2, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotBetween(String value1, String value2) {
            addCriterion("wx_province not between", value1, value2, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxCityIsNull() {
            addCriterion("wx_city is null");
            return (Criteria) this;
        }

        public Criteria andWxCityIsNotNull() {
            addCriterion("wx_city is not null");
            return (Criteria) this;
        }

        public Criteria andWxCityEqualTo(String value) {
            addCriterion("wx_city =", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_city = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCityNotEqualTo(String value) {
            addCriterion("wx_city <>", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_city <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThan(String value) {
            addCriterion("wx_city >", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_city > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThanOrEqualTo(String value) {
            addCriterion("wx_city >=", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_city >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCityLessThan(String value) {
            addCriterion("wx_city <", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_city < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCityLessThanOrEqualTo(String value) {
            addCriterion("wx_city <=", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_city <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCityLike(String value) {
            addCriterion("wx_city like", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotLike(String value) {
            addCriterion("wx_city not like", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityIn(List<String> values) {
            addCriterion("wx_city in", values, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotIn(List<String> values) {
            addCriterion("wx_city not in", values, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityBetween(String value1, String value2) {
            addCriterion("wx_city between", value1, value2, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotBetween(String value1, String value2) {
            addCriterion("wx_city not between", value1, value2, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCountryIsNull() {
            addCriterion("wx_country is null");
            return (Criteria) this;
        }

        public Criteria andWxCountryIsNotNull() {
            addCriterion("wx_country is not null");
            return (Criteria) this;
        }

        public Criteria andWxCountryEqualTo(String value) {
            addCriterion("wx_country =", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_country = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCountryNotEqualTo(String value) {
            addCriterion("wx_country <>", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_country <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThan(String value) {
            addCriterion("wx_country >", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_country > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThanOrEqualTo(String value) {
            addCriterion("wx_country >=", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_country >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThan(String value) {
            addCriterion("wx_country <", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_country < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThanOrEqualTo(String value) {
            addCriterion("wx_country <=", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_country <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxCountryLike(String value) {
            addCriterion("wx_country like", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotLike(String value) {
            addCriterion("wx_country not like", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryIn(List<String> values) {
            addCriterion("wx_country in", values, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotIn(List<String> values) {
            addCriterion("wx_country not in", values, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryBetween(String value1, String value2) {
            addCriterion("wx_country between", value1, value2, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotBetween(String value1, String value2) {
            addCriterion("wx_country not between", value1, value2, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxNicknameIsNull() {
            addCriterion("wx_nickname is null");
            return (Criteria) this;
        }

        public Criteria andWxNicknameIsNotNull() {
            addCriterion("wx_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andWxNicknameEqualTo(String value) {
            addCriterion("wx_nickname =", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_nickname = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxNicknameNotEqualTo(String value) {
            addCriterion("wx_nickname <>", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_nickname <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxNicknameGreaterThan(String value) {
            addCriterion("wx_nickname >", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_nickname > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("wx_nickname >=", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_nickname >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxNicknameLessThan(String value) {
            addCriterion("wx_nickname <", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_nickname < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxNicknameLessThanOrEqualTo(String value) {
            addCriterion("wx_nickname <=", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_nickname <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxNicknameLike(String value) {
            addCriterion("wx_nickname like", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameNotLike(String value) {
            addCriterion("wx_nickname not like", value, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameIn(List<String> values) {
            addCriterion("wx_nickname in", values, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameNotIn(List<String> values) {
            addCriterion("wx_nickname not in", values, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameBetween(String value1, String value2) {
            addCriterion("wx_nickname between", value1, value2, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxNicknameNotBetween(String value1, String value2) {
            addCriterion("wx_nickname not between", value1, value2, "wxNickname");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageIsNull() {
            addCriterion("wx_headImage is null");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageIsNotNull() {
            addCriterion("wx_headImage is not null");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageEqualTo(String value) {
            addCriterion("wx_headImage =", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_headImage = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxHeadimageNotEqualTo(String value) {
            addCriterion("wx_headImage <>", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageNotEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_headImage <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxHeadimageGreaterThan(String value) {
            addCriterion("wx_headImage >", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageGreaterThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_headImage > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("wx_headImage >=", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageGreaterThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_headImage >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxHeadimageLessThan(String value) {
            addCriterion("wx_headImage <", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageLessThanColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_headImage < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxHeadimageLessThanOrEqualTo(String value) {
            addCriterion("wx_headImage <=", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageLessThanOrEqualToColumn(UserWeixin.Column column) {
            addCriterion(new StringBuilder("wx_headImage <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWxHeadimageLike(String value) {
            addCriterion("wx_headImage like", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageNotLike(String value) {
            addCriterion("wx_headImage not like", value, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageIn(List<String> values) {
            addCriterion("wx_headImage in", values, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageNotIn(List<String> values) {
            addCriterion("wx_headImage not in", values, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageBetween(String value1, String value2) {
            addCriterion("wx_headImage between", value1, value2, "wxHeadimage");
            return (Criteria) this;
        }

        public Criteria andWxHeadimageNotBetween(String value1, String value2) {
            addCriterion("wx_headImage not between", value1, value2, "wxHeadimage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private UserWeixinExample example;

        protected Criteria(UserWeixinExample example) {
            super();
            this.example = example;
        }

        public UserWeixinExample example() {
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
        void example(com.zsl.malluserdb.po.UserWeixinExample example);
    }
}