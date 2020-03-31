package com.zsl.malluserdb.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsActivityExample() {
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

    public GoodsActivityExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GoodsActivityExample orderBy(String ... orderByClauses) {
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
        GoodsActivityExample example = new GoodsActivityExample();
        return example.createCriteria();
    }

    public GoodsActivityExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GoodsActivityExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sku_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sku_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sku_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sku_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sku_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sku_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinIsNull() {
            addCriterion("consume_coin is null");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinIsNotNull() {
            addCriterion("consume_coin is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinEqualTo(Integer value) {
            addCriterion("consume_coin =", value, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("consume_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsumeCoinNotEqualTo(Integer value) {
            addCriterion("consume_coin <>", value, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("consume_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsumeCoinGreaterThan(Integer value) {
            addCriterion("consume_coin >", value, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("consume_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsumeCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_coin >=", value, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("consume_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsumeCoinLessThan(Integer value) {
            addCriterion("consume_coin <", value, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("consume_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsumeCoinLessThanOrEqualTo(Integer value) {
            addCriterion("consume_coin <=", value, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("consume_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsumeCoinIn(List<Integer> values) {
            addCriterion("consume_coin in", values, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinNotIn(List<Integer> values) {
            addCriterion("consume_coin not in", values, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinBetween(Integer value1, Integer value2) {
            addCriterion("consume_coin between", value1, value2, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andConsumeCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_coin not between", value1, value2, "consumeCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinIsNull() {
            addCriterion("present_coin is null");
            return (Criteria) this;
        }

        public Criteria andPresentCoinIsNotNull() {
            addCriterion("present_coin is not null");
            return (Criteria) this;
        }

        public Criteria andPresentCoinEqualTo(Integer value) {
            addCriterion("present_coin =", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_coin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualTo(Integer value) {
            addCriterion("present_coin <>", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_coin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThan(Integer value) {
            addCriterion("present_coin >", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_coin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("present_coin >=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_coin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThan(Integer value) {
            addCriterion("present_coin <", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_coin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualTo(Integer value) {
            addCriterion("present_coin <=", value, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_coin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentCoinIn(List<Integer> values) {
            addCriterion("present_coin in", values, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotIn(List<Integer> values) {
            addCriterion("present_coin not in", values, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinBetween(Integer value1, Integer value2) {
            addCriterion("present_coin between", value1, value2, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("present_coin not between", value1, value2, "presentCoin");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyIsNull() {
            addCriterion("present_money is null");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyIsNotNull() {
            addCriterion("present_money is not null");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyEqualTo(BigDecimal value) {
            addCriterion("present_money =", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("present_money <>", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThan(BigDecimal value) {
            addCriterion("present_money >", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("present_money >=", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThan(BigDecimal value) {
            addCriterion("present_money <", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("present_money <=", value, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("present_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPresentMoneyIn(List<BigDecimal> values) {
            addCriterion("present_money in", values, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("present_money not in", values, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("present_money between", value1, value2, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andPresentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("present_money not between", value1, value2, "presentMoney");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("freight = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("freight <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("freight > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("freight >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("freight < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("freight <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andRestrictCountIsNull() {
            addCriterion("restrict_count is null");
            return (Criteria) this;
        }

        public Criteria andRestrictCountIsNotNull() {
            addCriterion("restrict_count is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictCountEqualTo(Integer value) {
            addCriterion("restrict_count =", value, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("restrict_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRestrictCountNotEqualTo(Integer value) {
            addCriterion("restrict_count <>", value, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("restrict_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRestrictCountGreaterThan(Integer value) {
            addCriterion("restrict_count >", value, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("restrict_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRestrictCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("restrict_count >=", value, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("restrict_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRestrictCountLessThan(Integer value) {
            addCriterion("restrict_count <", value, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("restrict_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRestrictCountLessThanOrEqualTo(Integer value) {
            addCriterion("restrict_count <=", value, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("restrict_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRestrictCountIn(List<Integer> values) {
            addCriterion("restrict_count in", values, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountNotIn(List<Integer> values) {
            addCriterion("restrict_count not in", values, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountBetween(Integer value1, Integer value2) {
            addCriterion("restrict_count between", value1, value2, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andRestrictCountNotBetween(Integer value1, Integer value2) {
            addCriterion("restrict_count not between", value1, value2, "restrictCount");
            return (Criteria) this;
        }

        public Criteria andActivityStockIsNull() {
            addCriterion("activity_stock is null");
            return (Criteria) this;
        }

        public Criteria andActivityStockIsNotNull() {
            addCriterion("activity_stock is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStockEqualTo(Integer value) {
            addCriterion("activity_stock =", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_stock = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityStockNotEqualTo(Integer value) {
            addCriterion("activity_stock <>", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_stock <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityStockGreaterThan(Integer value) {
            addCriterion("activity_stock >", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_stock > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_stock >=", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_stock >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityStockLessThan(Integer value) {
            addCriterion("activity_stock <", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_stock < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityStockLessThanOrEqualTo(Integer value) {
            addCriterion("activity_stock <=", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_stock <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityStockIn(List<Integer> values) {
            addCriterion("activity_stock in", values, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotIn(List<Integer> values) {
            addCriterion("activity_stock not in", values, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockBetween(Integer value1, Integer value2) {
            addCriterion("activity_stock between", value1, value2, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_stock not between", value1, value2, "activityStock");
            return (Criteria) this;
        }

        public Criteria andSoldIsNull() {
            addCriterion("sold is null");
            return (Criteria) this;
        }

        public Criteria andSoldIsNotNull() {
            addCriterion("sold is not null");
            return (Criteria) this;
        }

        public Criteria andSoldEqualTo(Integer value) {
            addCriterion("sold =", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sold = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldNotEqualTo(Integer value) {
            addCriterion("sold <>", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sold <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThan(Integer value) {
            addCriterion("sold >", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sold > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("sold >=", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sold >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldLessThan(Integer value) {
            addCriterion("sold <", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sold < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldLessThanOrEqualTo(Integer value) {
            addCriterion("sold <=", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("sold <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldIn(List<Integer> values) {
            addCriterion("sold in", values, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotIn(List<Integer> values) {
            addCriterion("sold not in", values, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldBetween(Integer value1, Integer value2) {
            addCriterion("sold between", value1, value2, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("sold not between", value1, value2, "sold");
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

        public Criteria andCreateTimeEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(GoodsActivity.Column column) {
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("start_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("start_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("start_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("start_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("start_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("start_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andActivityOpenIsNull() {
            addCriterion("activity_open is null");
            return (Criteria) this;
        }

        public Criteria andActivityOpenIsNotNull() {
            addCriterion("activity_open is not null");
            return (Criteria) this;
        }

        public Criteria andActivityOpenEqualTo(Integer value) {
            addCriterion("activity_open =", value, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_open = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityOpenNotEqualTo(Integer value) {
            addCriterion("activity_open <>", value, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_open <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityOpenGreaterThan(Integer value) {
            addCriterion("activity_open >", value, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_open > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_open >=", value, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_open >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityOpenLessThan(Integer value) {
            addCriterion("activity_open <", value, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_open < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityOpenLessThanOrEqualTo(Integer value) {
            addCriterion("activity_open <=", value, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("activity_open <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityOpenIn(List<Integer> values) {
            addCriterion("activity_open in", values, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenNotIn(List<Integer> values) {
            addCriterion("activity_open not in", values, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenBetween(Integer value1, Integer value2) {
            addCriterion("activity_open between", value1, value2, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andActivityOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_open not between", value1, value2, "activityOpen");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyIsNull() {
            addCriterion("father_money is null");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyIsNotNull() {
            addCriterion("father_money is not null");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyEqualTo(BigDecimal value) {
            addCriterion("father_money =", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("father_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("father_money <>", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("father_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("father_money >", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("father_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money >=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("father_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThan(BigDecimal value) {
            addCriterion("father_money <", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("father_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("father_money <=", value, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("father_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFatherMoneyIn(List<BigDecimal> values) {
            addCriterion("father_money in", values, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotIn(List<BigDecimal> values) {
            addCriterion("father_money not in", values, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("father_money between", value1, value2, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andFatherMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("father_money not between", value1, value2, "fatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyIsNull() {
            addCriterion("grandfather_money is null");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyIsNotNull() {
            addCriterion("grandfather_money is not null");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyEqualTo(BigDecimal value) {
            addCriterion("grandfather_money =", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("grandfather_money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <>", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("grandfather_money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThan(BigDecimal value) {
            addCriterion("grandfather_money >", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("grandfather_money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money >=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyGreaterThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("grandfather_money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThan(BigDecimal value) {
            addCriterion("grandfather_money <", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("grandfather_money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grandfather_money <=", value, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyLessThanOrEqualToColumn(GoodsActivity.Column column) {
            addCriterion(new StringBuilder("grandfather_money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyIn(List<BigDecimal> values) {
            addCriterion("grandfather_money in", values, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotIn(List<BigDecimal> values) {
            addCriterion("grandfather_money not in", values, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grandfather_money between", value1, value2, "grandfatherMoney");
            return (Criteria) this;
        }

        public Criteria andGrandfatherMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grandfather_money not between", value1, value2, "grandfatherMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GoodsActivityExample example;

        protected Criteria(GoodsActivityExample example) {
            super();
            this.example = example;
        }

        public GoodsActivityExample example() {
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
        void example(com.zsl.malluserdb.po.GoodsActivityExample example);
    }
}