package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SuperiorTradeInfo implements Serializable {
    private Integer id;

    private String tradeNo;

    private String outTradeNo;

    private Integer userMemberId;

    private Boolean payWay;

    private Date tradeTime;

    private Integer goodsSpuId;

    private BigDecimal unitPrice;

    private Integer count;

    private BigDecimal totolAmount;

    private String shareId;

    private Date paymentTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Integer getUserMemberId() {
        return userMemberId;
    }

    public void setUserMemberId(Integer userMemberId) {
        this.userMemberId = userMemberId;
    }

    public Boolean getPayWay() {
        return payWay;
    }

    public void setPayWay(Boolean payWay) {
        this.payWay = payWay;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Integer getGoodsSpuId() {
        return goodsSpuId;
    }

    public void setGoodsSpuId(Integer goodsSpuId) {
        this.goodsSpuId = goodsSpuId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getTotolAmount() {
        return totolAmount;
    }

    public void setTotolAmount(BigDecimal totolAmount) {
        this.totolAmount = totolAmount;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId == null ? null : shareId.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", userMemberId=").append(userMemberId);
        sb.append(", payWay=").append(payWay);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", goodsSpuId=").append(goodsSpuId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", count=").append(count);
        sb.append(", totolAmount=").append(totolAmount);
        sb.append(", shareId=").append(shareId);
        sb.append(", paymentTime=").append(paymentTime);
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
        SuperiorTradeInfo other = (SuperiorTradeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getOutTradeNo() == null ? other.getOutTradeNo() == null : this.getOutTradeNo().equals(other.getOutTradeNo()))
            && (this.getUserMemberId() == null ? other.getUserMemberId() == null : this.getUserMemberId().equals(other.getUserMemberId()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getGoodsSpuId() == null ? other.getGoodsSpuId() == null : this.getGoodsSpuId().equals(other.getGoodsSpuId()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getTotolAmount() == null ? other.getTotolAmount() == null : this.getTotolAmount().equals(other.getTotolAmount()))
            && (this.getShareId() == null ? other.getShareId() == null : this.getShareId().equals(other.getShareId()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getOutTradeNo() == null) ? 0 : getOutTradeNo().hashCode());
        result = prime * result + ((getUserMemberId() == null) ? 0 : getUserMemberId().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getGoodsSpuId() == null) ? 0 : getGoodsSpuId().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getTotolAmount() == null) ? 0 : getTotolAmount().hashCode());
        result = prime * result + ((getShareId() == null) ? 0 : getShareId().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        tradeNo("trade_no", "tradeNo", "VARCHAR", false),
        outTradeNo("out_trade_no", "outTradeNo", "VARCHAR", false),
        userMemberId("user_member_id", "userMemberId", "INTEGER", false),
        payWay("pay_way", "payWay", "BIT", false),
        tradeTime("trade_time", "tradeTime", "TIMESTAMP", false),
        goodsSpuId("goods_spu_id", "goodsSpuId", "INTEGER", false),
        unitPrice("unit_price", "unitPrice", "DECIMAL", false),
        count("count", "count", "INTEGER", true),
        totolAmount("totol_amount", "totolAmount", "DECIMAL", false),
        shareId("share_id", "shareId", "VARCHAR", false),
        paymentTime("payment_time", "paymentTime", "TIMESTAMP", false);

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