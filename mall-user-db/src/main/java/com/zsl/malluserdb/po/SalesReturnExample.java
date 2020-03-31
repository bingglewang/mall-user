package com.zsl.malluserdb.po;

import java.util.ArrayList;
import java.util.List;

public class SalesReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesReturnExample() {
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

    public SalesReturnExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SalesReturnExample orderBy(String ... orderByClauses) {
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
        SalesReturnExample example = new SalesReturnExample();
        return example.createCriteria();
    }

    public SalesReturnExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SalesReturnExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(SalesReturn.Column column) {
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

        public Criteria andRefundOrderIdIsNull() {
            addCriterion("refund_order_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdIsNotNull() {
            addCriterion("refund_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdEqualTo(Integer value) {
            addCriterion("refund_order_id =", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("refund_order_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotEqualTo(Integer value) {
            addCriterion("refund_order_id <>", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("refund_order_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThan(Integer value) {
            addCriterion("refund_order_id >", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("refund_order_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_order_id >=", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("refund_order_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThan(Integer value) {
            addCriterion("refund_order_id <", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("refund_order_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_order_id <=", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("refund_order_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdIn(List<Integer> values) {
            addCriterion("refund_order_id in", values, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotIn(List<Integer> values) {
            addCriterion("refund_order_id not in", values, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_order_id between", value1, value2, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_order_id not between", value1, value2, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andShopContactIsNull() {
            addCriterion("shop_contact is null");
            return (Criteria) this;
        }

        public Criteria andShopContactIsNotNull() {
            addCriterion("shop_contact is not null");
            return (Criteria) this;
        }

        public Criteria andShopContactEqualTo(String value) {
            addCriterion("shop_contact =", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_contact = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopContactNotEqualTo(String value) {
            addCriterion("shop_contact <>", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_contact <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopContactGreaterThan(String value) {
            addCriterion("shop_contact >", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_contact > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopContactGreaterThanOrEqualTo(String value) {
            addCriterion("shop_contact >=", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_contact >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopContactLessThan(String value) {
            addCriterion("shop_contact <", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_contact < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopContactLessThanOrEqualTo(String value) {
            addCriterion("shop_contact <=", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_contact <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopContactLike(String value) {
            addCriterion("shop_contact like", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotLike(String value) {
            addCriterion("shop_contact not like", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactIn(List<String> values) {
            addCriterion("shop_contact in", values, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotIn(List<String> values) {
            addCriterion("shop_contact not in", values, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactBetween(String value1, String value2) {
            addCriterion("shop_contact between", value1, value2, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotBetween(String value1, String value2) {
            addCriterion("shop_contact not between", value1, value2, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNull() {
            addCriterion("shop_number is null");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNotNull() {
            addCriterion("shop_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopNumberEqualTo(String value) {
            addCriterion("shop_number =", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNumberNotEqualTo(String value) {
            addCriterion("shop_number <>", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThan(String value) {
            addCriterion("shop_number >", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThanOrEqualTo(String value) {
            addCriterion("shop_number >=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThan(String value) {
            addCriterion("shop_number <", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThanOrEqualTo(String value) {
            addCriterion("shop_number <=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNumberLike(String value) {
            addCriterion("shop_number like", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotLike(String value) {
            addCriterion("shop_number not like", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberIn(List<String> values) {
            addCriterion("shop_number in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotIn(List<String> values) {
            addCriterion("shop_number not in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberBetween(String value1, String value2) {
            addCriterion("shop_number between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotBetween(String value1, String value2) {
            addCriterion("shop_number not between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopSiteIsNull() {
            addCriterion("shop_site is null");
            return (Criteria) this;
        }

        public Criteria andShopSiteIsNotNull() {
            addCriterion("shop_site is not null");
            return (Criteria) this;
        }

        public Criteria andShopSiteEqualTo(String value) {
            addCriterion("shop_site =", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_site = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopSiteNotEqualTo(String value) {
            addCriterion("shop_site <>", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_site <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopSiteGreaterThan(String value) {
            addCriterion("shop_site >", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_site > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopSiteGreaterThanOrEqualTo(String value) {
            addCriterion("shop_site >=", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_site >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopSiteLessThan(String value) {
            addCriterion("shop_site <", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_site < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopSiteLessThanOrEqualTo(String value) {
            addCriterion("shop_site <=", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("shop_site <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopSiteLike(String value) {
            addCriterion("shop_site like", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteNotLike(String value) {
            addCriterion("shop_site not like", value, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteIn(List<String> values) {
            addCriterion("shop_site in", values, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteNotIn(List<String> values) {
            addCriterion("shop_site not in", values, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteBetween(String value1, String value2) {
            addCriterion("shop_site between", value1, value2, "shopSite");
            return (Criteria) this;
        }

        public Criteria andShopSiteNotBetween(String value1, String value2) {
            addCriterion("shop_site not between", value1, value2, "shopSite");
            return (Criteria) this;
        }

        public Criteria andBarterNameIsNull() {
            addCriterion("barter_name is null");
            return (Criteria) this;
        }

        public Criteria andBarterNameIsNotNull() {
            addCriterion("barter_name is not null");
            return (Criteria) this;
        }

        public Criteria andBarterNameEqualTo(String value) {
            addCriterion("barter_name =", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterNameNotEqualTo(String value) {
            addCriterion("barter_name <>", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterNameGreaterThan(String value) {
            addCriterion("barter_name >", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterNameGreaterThanOrEqualTo(String value) {
            addCriterion("barter_name >=", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterNameLessThan(String value) {
            addCriterion("barter_name <", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterNameLessThanOrEqualTo(String value) {
            addCriterion("barter_name <=", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterNameLike(String value) {
            addCriterion("barter_name like", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameNotLike(String value) {
            addCriterion("barter_name not like", value, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameIn(List<String> values) {
            addCriterion("barter_name in", values, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameNotIn(List<String> values) {
            addCriterion("barter_name not in", values, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameBetween(String value1, String value2) {
            addCriterion("barter_name between", value1, value2, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterNameNotBetween(String value1, String value2) {
            addCriterion("barter_name not between", value1, value2, "barterName");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneIsNull() {
            addCriterion("barter_phone is null");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneIsNotNull() {
            addCriterion("barter_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneEqualTo(String value) {
            addCriterion("barter_phone =", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterPhoneNotEqualTo(String value) {
            addCriterion("barter_phone <>", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterPhoneGreaterThan(String value) {
            addCriterion("barter_phone >", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("barter_phone >=", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterPhoneLessThan(String value) {
            addCriterion("barter_phone <", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterPhoneLessThanOrEqualTo(String value) {
            addCriterion("barter_phone <=", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterPhoneLike(String value) {
            addCriterion("barter_phone like", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneNotLike(String value) {
            addCriterion("barter_phone not like", value, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneIn(List<String> values) {
            addCriterion("barter_phone in", values, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneNotIn(List<String> values) {
            addCriterion("barter_phone not in", values, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneBetween(String value1, String value2) {
            addCriterion("barter_phone between", value1, value2, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterPhoneNotBetween(String value1, String value2) {
            addCriterion("barter_phone not between", value1, value2, "barterPhone");
            return (Criteria) this;
        }

        public Criteria andBarterSiteIsNull() {
            addCriterion("barter_site is null");
            return (Criteria) this;
        }

        public Criteria andBarterSiteIsNotNull() {
            addCriterion("barter_site is not null");
            return (Criteria) this;
        }

        public Criteria andBarterSiteEqualTo(String value) {
            addCriterion("barter_site =", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteNotEqualTo(String value) {
            addCriterion("barter_site <>", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteGreaterThan(String value) {
            addCriterion("barter_site >", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteGreaterThanOrEqualTo(String value) {
            addCriterion("barter_site >=", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteLessThan(String value) {
            addCriterion("barter_site <", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteLessThanOrEqualTo(String value) {
            addCriterion("barter_site <=", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteLike(String value) {
            addCriterion("barter_site like", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteNotLike(String value) {
            addCriterion("barter_site not like", value, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteIn(List<String> values) {
            addCriterion("barter_site in", values, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteNotIn(List<String> values) {
            addCriterion("barter_site not in", values, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteBetween(String value1, String value2) {
            addCriterion("barter_site between", value1, value2, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteNotBetween(String value1, String value2) {
            addCriterion("barter_site not between", value1, value2, "barterSite");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailIsNull() {
            addCriterion("barter_site_detail is null");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailIsNotNull() {
            addCriterion("barter_site_detail is not null");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailEqualTo(String value) {
            addCriterion("barter_site_detail =", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site_detail = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailNotEqualTo(String value) {
            addCriterion("barter_site_detail <>", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site_detail <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailGreaterThan(String value) {
            addCriterion("barter_site_detail >", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site_detail > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailGreaterThanOrEqualTo(String value) {
            addCriterion("barter_site_detail >=", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site_detail >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailLessThan(String value) {
            addCriterion("barter_site_detail <", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site_detail < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailLessThanOrEqualTo(String value) {
            addCriterion("barter_site_detail <=", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("barter_site_detail <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailLike(String value) {
            addCriterion("barter_site_detail like", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailNotLike(String value) {
            addCriterion("barter_site_detail not like", value, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailIn(List<String> values) {
            addCriterion("barter_site_detail in", values, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailNotIn(List<String> values) {
            addCriterion("barter_site_detail not in", values, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailBetween(String value1, String value2) {
            addCriterion("barter_site_detail between", value1, value2, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andBarterSiteDetailNotBetween(String value1, String value2) {
            addCriterion("barter_site_detail not between", value1, value2, "barterSiteDetail");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdIsNull() {
            addCriterion("returns_company_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdIsNotNull() {
            addCriterion("returns_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdEqualTo(Integer value) {
            addCriterion("returns_company_id =", value, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_company_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdNotEqualTo(Integer value) {
            addCriterion("returns_company_id <>", value, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_company_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdGreaterThan(Integer value) {
            addCriterion("returns_company_id >", value, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_company_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("returns_company_id >=", value, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_company_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdLessThan(Integer value) {
            addCriterion("returns_company_id <", value, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_company_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("returns_company_id <=", value, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_company_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdIn(List<Integer> values) {
            addCriterion("returns_company_id in", values, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdNotIn(List<Integer> values) {
            addCriterion("returns_company_id not in", values, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("returns_company_id between", value1, value2, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("returns_company_id not between", value1, value2, "returnsCompanyId");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsIsNull() {
            addCriterion("returns_logistics is null");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsIsNotNull() {
            addCriterion("returns_logistics is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsEqualTo(String value) {
            addCriterion("returns_logistics =", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_logistics = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsNotEqualTo(String value) {
            addCriterion("returns_logistics <>", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_logistics <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsGreaterThan(String value) {
            addCriterion("returns_logistics >", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_logistics > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsGreaterThanOrEqualTo(String value) {
            addCriterion("returns_logistics >=", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_logistics >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsLessThan(String value) {
            addCriterion("returns_logistics <", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_logistics < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsLessThanOrEqualTo(String value) {
            addCriterion("returns_logistics <=", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_logistics <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsLike(String value) {
            addCriterion("returns_logistics like", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsNotLike(String value) {
            addCriterion("returns_logistics not like", value, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsIn(List<String> values) {
            addCriterion("returns_logistics in", values, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsNotIn(List<String> values) {
            addCriterion("returns_logistics not in", values, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsBetween(String value1, String value2) {
            addCriterion("returns_logistics between", value1, value2, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsLogisticsNotBetween(String value1, String value2) {
            addCriterion("returns_logistics not between", value1, value2, "returnsLogistics");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureIsNull() {
            addCriterion("returns_picture is null");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureIsNotNull() {
            addCriterion("returns_picture is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureEqualTo(String value) {
            addCriterion("returns_picture =", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_picture = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsPictureNotEqualTo(String value) {
            addCriterion("returns_picture <>", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureNotEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_picture <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsPictureGreaterThan(String value) {
            addCriterion("returns_picture >", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureGreaterThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_picture > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("returns_picture >=", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureGreaterThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_picture >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsPictureLessThan(String value) {
            addCriterion("returns_picture <", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureLessThanColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_picture < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsPictureLessThanOrEqualTo(String value) {
            addCriterion("returns_picture <=", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureLessThanOrEqualToColumn(SalesReturn.Column column) {
            addCriterion(new StringBuilder("returns_picture <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnsPictureLike(String value) {
            addCriterion("returns_picture like", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureNotLike(String value) {
            addCriterion("returns_picture not like", value, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureIn(List<String> values) {
            addCriterion("returns_picture in", values, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureNotIn(List<String> values) {
            addCriterion("returns_picture not in", values, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureBetween(String value1, String value2) {
            addCriterion("returns_picture between", value1, value2, "returnsPicture");
            return (Criteria) this;
        }

        public Criteria andReturnsPictureNotBetween(String value1, String value2) {
            addCriterion("returns_picture not between", value1, value2, "returnsPicture");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SalesReturnExample example;

        protected Criteria(SalesReturnExample example) {
            super();
            this.example = example;
        }

        public SalesReturnExample example() {
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
        void example(com.zsl.malluserdb.po.SalesReturnExample example);
    }
}