package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ShopFreightTemplateShipping implements Serializable {
    private Integer shippingId;

    private Integer configId;

    private BigDecimal freightFixed;

    private BigDecimal amountDiscount;

    private BigDecimal amountFree;

    private BigDecimal freightDiscount;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public BigDecimal getFreightFixed() {
        return freightFixed;
    }

    public void setFreightFixed(BigDecimal freightFixed) {
        this.freightFixed = freightFixed;
    }

    public BigDecimal getAmountDiscount() {
        return amountDiscount;
    }

    public void setAmountDiscount(BigDecimal amountDiscount) {
        this.amountDiscount = amountDiscount;
    }

    public BigDecimal getAmountFree() {
        return amountFree;
    }

    public void setAmountFree(BigDecimal amountFree) {
        this.amountFree = amountFree;
    }

    public BigDecimal getFreightDiscount() {
        return freightDiscount;
    }

    public void setFreightDiscount(BigDecimal freightDiscount) {
        this.freightDiscount = freightDiscount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shippingId=").append(shippingId);
        sb.append(", configId=").append(configId);
        sb.append(", freightFixed=").append(freightFixed);
        sb.append(", amountDiscount=").append(amountDiscount);
        sb.append(", amountFree=").append(amountFree);
        sb.append(", freightDiscount=").append(freightDiscount);
        sb.append(", createTime=").append(createTime);
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
        ShopFreightTemplateShipping other = (ShopFreightTemplateShipping) that;
        return (this.getShippingId() == null ? other.getShippingId() == null : this.getShippingId().equals(other.getShippingId()))
            && (this.getConfigId() == null ? other.getConfigId() == null : this.getConfigId().equals(other.getConfigId()))
            && (this.getFreightFixed() == null ? other.getFreightFixed() == null : this.getFreightFixed().equals(other.getFreightFixed()))
            && (this.getAmountDiscount() == null ? other.getAmountDiscount() == null : this.getAmountDiscount().equals(other.getAmountDiscount()))
            && (this.getAmountFree() == null ? other.getAmountFree() == null : this.getAmountFree().equals(other.getAmountFree()))
            && (this.getFreightDiscount() == null ? other.getFreightDiscount() == null : this.getFreightDiscount().equals(other.getFreightDiscount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShippingId() == null) ? 0 : getShippingId().hashCode());
        result = prime * result + ((getConfigId() == null) ? 0 : getConfigId().hashCode());
        result = prime * result + ((getFreightFixed() == null) ? 0 : getFreightFixed().hashCode());
        result = prime * result + ((getAmountDiscount() == null) ? 0 : getAmountDiscount().hashCode());
        result = prime * result + ((getAmountFree() == null) ? 0 : getAmountFree().hashCode());
        result = prime * result + ((getFreightDiscount() == null) ? 0 : getFreightDiscount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    public enum Column {
        shippingId("shipping_id", "shippingId", "INTEGER", false),
        configId("config_id", "configId", "INTEGER", false),
        freightFixed("freight_fixed", "freightFixed", "DECIMAL", false),
        amountDiscount("amount_discount", "amountDiscount", "DECIMAL", false),
        amountFree("amount_free", "amountFree", "DECIMAL", false),
        freightDiscount("freight_discount", "freightDiscount", "DECIMAL", false),
        createTime("create_time", "createTime", "TIMESTAMP", false);

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