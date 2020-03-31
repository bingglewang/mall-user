package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GoodsActivity implements Serializable {
    private Integer activityId;

    private Long skuId;

    private BigDecimal price;

    private Integer consumeCoin;

    private Integer presentCoin;

    private BigDecimal presentMoney;

    private BigDecimal freight;

    private Integer restrictCount;

    private Integer activityStock;

    private Integer sold;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    private Integer activityOpen;

    private BigDecimal fatherMoney;

    private BigDecimal grandfatherMoney;

    private static final long serialVersionUID = 1L;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getConsumeCoin() {
        return consumeCoin;
    }

    public void setConsumeCoin(Integer consumeCoin) {
        this.consumeCoin = consumeCoin;
    }

    public Integer getPresentCoin() {
        return presentCoin;
    }

    public void setPresentCoin(Integer presentCoin) {
        this.presentCoin = presentCoin;
    }

    public BigDecimal getPresentMoney() {
        return presentMoney;
    }

    public void setPresentMoney(BigDecimal presentMoney) {
        this.presentMoney = presentMoney;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public Integer getRestrictCount() {
        return restrictCount;
    }

    public void setRestrictCount(Integer restrictCount) {
        this.restrictCount = restrictCount;
    }

    public Integer getActivityStock() {
        return activityStock;
    }

    public void setActivityStock(Integer activityStock) {
        this.activityStock = activityStock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getActivityOpen() {
        return activityOpen;
    }

    public void setActivityOpen(Integer activityOpen) {
        this.activityOpen = activityOpen;
    }

    public BigDecimal getFatherMoney() {
        return fatherMoney;
    }

    public void setFatherMoney(BigDecimal fatherMoney) {
        this.fatherMoney = fatherMoney;
    }

    public BigDecimal getGrandfatherMoney() {
        return grandfatherMoney;
    }

    public void setGrandfatherMoney(BigDecimal grandfatherMoney) {
        this.grandfatherMoney = grandfatherMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityId=").append(activityId);
        sb.append(", skuId=").append(skuId);
        sb.append(", price=").append(price);
        sb.append(", consumeCoin=").append(consumeCoin);
        sb.append(", presentCoin=").append(presentCoin);
        sb.append(", presentMoney=").append(presentMoney);
        sb.append(", freight=").append(freight);
        sb.append(", restrictCount=").append(restrictCount);
        sb.append(", activityStock=").append(activityStock);
        sb.append(", sold=").append(sold);
        sb.append(", createTime=").append(createTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", activityOpen=").append(activityOpen);
        sb.append(", fatherMoney=").append(fatherMoney);
        sb.append(", grandfatherMoney=").append(grandfatherMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GoodsActivity other = (GoodsActivity) that;
        return (this.getActivityId() == null ? other.getActivityId() == null : this.getActivityId().equals(other.getActivityId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getConsumeCoin() == null ? other.getConsumeCoin() == null : this.getConsumeCoin().equals(other.getConsumeCoin()))
            && (this.getPresentCoin() == null ? other.getPresentCoin() == null : this.getPresentCoin().equals(other.getPresentCoin()))
            && (this.getPresentMoney() == null ? other.getPresentMoney() == null : this.getPresentMoney().equals(other.getPresentMoney()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getRestrictCount() == null ? other.getRestrictCount() == null : this.getRestrictCount().equals(other.getRestrictCount()))
            && (this.getActivityStock() == null ? other.getActivityStock() == null : this.getActivityStock().equals(other.getActivityStock()))
            && (this.getSold() == null ? other.getSold() == null : this.getSold().equals(other.getSold()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getActivityOpen() == null ? other.getActivityOpen() == null : this.getActivityOpen().equals(other.getActivityOpen()))
            && (this.getFatherMoney() == null ? other.getFatherMoney() == null : this.getFatherMoney().equals(other.getFatherMoney()))
            && (this.getGrandfatherMoney() == null ? other.getGrandfatherMoney() == null : this.getGrandfatherMoney().equals(other.getGrandfatherMoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getConsumeCoin() == null) ? 0 : getConsumeCoin().hashCode());
        result = prime * result + ((getPresentCoin() == null) ? 0 : getPresentCoin().hashCode());
        result = prime * result + ((getPresentMoney() == null) ? 0 : getPresentMoney().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getRestrictCount() == null) ? 0 : getRestrictCount().hashCode());
        result = prime * result + ((getActivityStock() == null) ? 0 : getActivityStock().hashCode());
        result = prime * result + ((getSold() == null) ? 0 : getSold().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getActivityOpen() == null) ? 0 : getActivityOpen().hashCode());
        result = prime * result + ((getFatherMoney() == null) ? 0 : getFatherMoney().hashCode());
        result = prime * result + ((getGrandfatherMoney() == null) ? 0 : getGrandfatherMoney().hashCode());
        return result;
    }

    public enum Column {
        activityId("activity_id", "activityId", "INTEGER", false),
        skuId("sku_id", "skuId", "BIGINT", false),
        price("price", "price", "DECIMAL", false),
        consumeCoin("consume_coin", "consumeCoin", "INTEGER", false),
        presentCoin("present_coin", "presentCoin", "INTEGER", false),
        presentMoney("present_money", "presentMoney", "DECIMAL", false),
        freight("freight", "freight", "DECIMAL", false),
        restrictCount("restrict_count", "restrictCount", "INTEGER", false),
        activityStock("activity_stock", "activityStock", "INTEGER", false),
        sold("sold", "sold", "INTEGER", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        startTime("start_time", "startTime", "TIMESTAMP", false),
        endTime("end_time", "endTime", "TIMESTAMP", false),
        activityOpen("activity_open", "activityOpen", "INTEGER", false),
        fatherMoney("father_money", "fatherMoney", "DECIMAL", false),
        grandfatherMoney("grandfather_money", "grandfatherMoney", "DECIMAL", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}