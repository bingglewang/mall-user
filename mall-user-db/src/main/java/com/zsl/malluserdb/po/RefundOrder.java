package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class RefundOrder implements Serializable {
    private Integer id;

    private String refundTradeNo;

    private String refundOutTradeNo;

    private String orderNo;

    private BigDecimal refundTotalAmount;

    private BigDecimal realityRefundTotalAmout;

    private Integer refundTotalCoin;

    private Integer realityRefundTotalCoin;

    private Integer regainTotalCoin;

    private Integer realityRegainTotalCoin;

    private Integer regainFatherTotalCoin;

    private Integer realityRegainFatherTotalCoin;

    private Integer regainGrandfatherTotalCoin;

    private Integer realityRegainGrandfatherTotalCoin;

    private BigDecimal regainTotalAmount;

    private BigDecimal realityRegainTotalAmount;

    private BigDecimal regainFatherTotalAmount;

    private BigDecimal realityRegainFatherTotalAmount;

    private BigDecimal regainGrandfatherTotalAmount;

    private BigDecimal realityRegainGrandfatherTotalAmount;

    private BigDecimal regainReducion;

    private BigDecimal realityRegainReducion;

    private Date applyTime;

    private Date allowTime;

    private Date passTime;

    private Date finishTime;

    private String refundReason;

    private String refundDescription;

    private String refundImages;

    private Integer refundType;

    private Byte refundStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefundTradeNo() {
        return refundTradeNo;
    }

    public void setRefundTradeNo(String refundTradeNo) {
        this.refundTradeNo = refundTradeNo == null ? null : refundTradeNo.trim();
    }

    public String getRefundOutTradeNo() {
        return refundOutTradeNo;
    }

    public void setRefundOutTradeNo(String refundOutTradeNo) {
        this.refundOutTradeNo = refundOutTradeNo == null ? null : refundOutTradeNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getRefundTotalAmount() {
        return refundTotalAmount;
    }

    public void setRefundTotalAmount(BigDecimal refundTotalAmount) {
        this.refundTotalAmount = refundTotalAmount;
    }

    public BigDecimal getRealityRefundTotalAmout() {
        return realityRefundTotalAmout;
    }

    public void setRealityRefundTotalAmout(BigDecimal realityRefundTotalAmout) {
        this.realityRefundTotalAmout = realityRefundTotalAmout;
    }

    public Integer getRefundTotalCoin() {
        return refundTotalCoin;
    }

    public void setRefundTotalCoin(Integer refundTotalCoin) {
        this.refundTotalCoin = refundTotalCoin;
    }

    public Integer getRealityRefundTotalCoin() {
        return realityRefundTotalCoin;
    }

    public void setRealityRefundTotalCoin(Integer realityRefundTotalCoin) {
        this.realityRefundTotalCoin = realityRefundTotalCoin;
    }

    public Integer getRegainTotalCoin() {
        return regainTotalCoin;
    }

    public void setRegainTotalCoin(Integer regainTotalCoin) {
        this.regainTotalCoin = regainTotalCoin;
    }

    public Integer getRealityRegainTotalCoin() {
        return realityRegainTotalCoin;
    }

    public void setRealityRegainTotalCoin(Integer realityRegainTotalCoin) {
        this.realityRegainTotalCoin = realityRegainTotalCoin;
    }

    public Integer getRegainFatherTotalCoin() {
        return regainFatherTotalCoin;
    }

    public void setRegainFatherTotalCoin(Integer regainFatherTotalCoin) {
        this.regainFatherTotalCoin = regainFatherTotalCoin;
    }

    public Integer getRealityRegainFatherTotalCoin() {
        return realityRegainFatherTotalCoin;
    }

    public void setRealityRegainFatherTotalCoin(Integer realityRegainFatherTotalCoin) {
        this.realityRegainFatherTotalCoin = realityRegainFatherTotalCoin;
    }

    public Integer getRegainGrandfatherTotalCoin() {
        return regainGrandfatherTotalCoin;
    }

    public void setRegainGrandfatherTotalCoin(Integer regainGrandfatherTotalCoin) {
        this.regainGrandfatherTotalCoin = regainGrandfatherTotalCoin;
    }

    public Integer getRealityRegainGrandfatherTotalCoin() {
        return realityRegainGrandfatherTotalCoin;
    }

    public void setRealityRegainGrandfatherTotalCoin(Integer realityRegainGrandfatherTotalCoin) {
        this.realityRegainGrandfatherTotalCoin = realityRegainGrandfatherTotalCoin;
    }

    public BigDecimal getRegainTotalAmount() {
        return regainTotalAmount;
    }

    public void setRegainTotalAmount(BigDecimal regainTotalAmount) {
        this.regainTotalAmount = regainTotalAmount;
    }

    public BigDecimal getRealityRegainTotalAmount() {
        return realityRegainTotalAmount;
    }

    public void setRealityRegainTotalAmount(BigDecimal realityRegainTotalAmount) {
        this.realityRegainTotalAmount = realityRegainTotalAmount;
    }

    public BigDecimal getRegainFatherTotalAmount() {
        return regainFatherTotalAmount;
    }

    public void setRegainFatherTotalAmount(BigDecimal regainFatherTotalAmount) {
        this.regainFatherTotalAmount = regainFatherTotalAmount;
    }

    public BigDecimal getRealityRegainFatherTotalAmount() {
        return realityRegainFatherTotalAmount;
    }

    public void setRealityRegainFatherTotalAmount(BigDecimal realityRegainFatherTotalAmount) {
        this.realityRegainFatherTotalAmount = realityRegainFatherTotalAmount;
    }

    public BigDecimal getRegainGrandfatherTotalAmount() {
        return regainGrandfatherTotalAmount;
    }

    public void setRegainGrandfatherTotalAmount(BigDecimal regainGrandfatherTotalAmount) {
        this.regainGrandfatherTotalAmount = regainGrandfatherTotalAmount;
    }

    public BigDecimal getRealityRegainGrandfatherTotalAmount() {
        return realityRegainGrandfatherTotalAmount;
    }

    public void setRealityRegainGrandfatherTotalAmount(BigDecimal realityRegainGrandfatherTotalAmount) {
        this.realityRegainGrandfatherTotalAmount = realityRegainGrandfatherTotalAmount;
    }

    public BigDecimal getRegainReducion() {
        return regainReducion;
    }

    public void setRegainReducion(BigDecimal regainReducion) {
        this.regainReducion = regainReducion;
    }

    public BigDecimal getRealityRegainReducion() {
        return realityRegainReducion;
    }

    public void setRealityRegainReducion(BigDecimal realityRegainReducion) {
        this.realityRegainReducion = realityRegainReducion;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getAllowTime() {
        return allowTime;
    }

    public void setAllowTime(Date allowTime) {
        this.allowTime = allowTime;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getRefundDescription() {
        return refundDescription;
    }

    public void setRefundDescription(String refundDescription) {
        this.refundDescription = refundDescription == null ? null : refundDescription.trim();
    }

    public String getRefundImages() {
        return refundImages;
    }

    public void setRefundImages(String refundImages) {
        this.refundImages = refundImages == null ? null : refundImages.trim();
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Byte getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Byte refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", refundTradeNo=").append(refundTradeNo);
        sb.append(", refundOutTradeNo=").append(refundOutTradeNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", refundTotalAmount=").append(refundTotalAmount);
        sb.append(", realityRefundTotalAmout=").append(realityRefundTotalAmout);
        sb.append(", refundTotalCoin=").append(refundTotalCoin);
        sb.append(", realityRefundTotalCoin=").append(realityRefundTotalCoin);
        sb.append(", regainTotalCoin=").append(regainTotalCoin);
        sb.append(", realityRegainTotalCoin=").append(realityRegainTotalCoin);
        sb.append(", regainFatherTotalCoin=").append(regainFatherTotalCoin);
        sb.append(", realityRegainFatherTotalCoin=").append(realityRegainFatherTotalCoin);
        sb.append(", regainGrandfatherTotalCoin=").append(regainGrandfatherTotalCoin);
        sb.append(", realityRegainGrandfatherTotalCoin=").append(realityRegainGrandfatherTotalCoin);
        sb.append(", regainTotalAmount=").append(regainTotalAmount);
        sb.append(", realityRegainTotalAmount=").append(realityRegainTotalAmount);
        sb.append(", regainFatherTotalAmount=").append(regainFatherTotalAmount);
        sb.append(", realityRegainFatherTotalAmount=").append(realityRegainFatherTotalAmount);
        sb.append(", regainGrandfatherTotalAmount=").append(regainGrandfatherTotalAmount);
        sb.append(", realityRegainGrandfatherTotalAmount=").append(realityRegainGrandfatherTotalAmount);
        sb.append(", regainReducion=").append(regainReducion);
        sb.append(", realityRegainReducion=").append(realityRegainReducion);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", allowTime=").append(allowTime);
        sb.append(", passTime=").append(passTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", refundDescription=").append(refundDescription);
        sb.append(", refundImages=").append(refundImages);
        sb.append(", refundType=").append(refundType);
        sb.append(", refundStatus=").append(refundStatus);
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
        RefundOrder other = (RefundOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRefundTradeNo() == null ? other.getRefundTradeNo() == null : this.getRefundTradeNo().equals(other.getRefundTradeNo()))
            && (this.getRefundOutTradeNo() == null ? other.getRefundOutTradeNo() == null : this.getRefundOutTradeNo().equals(other.getRefundOutTradeNo()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getRefundTotalAmount() == null ? other.getRefundTotalAmount() == null : this.getRefundTotalAmount().equals(other.getRefundTotalAmount()))
            && (this.getRealityRefundTotalAmout() == null ? other.getRealityRefundTotalAmout() == null : this.getRealityRefundTotalAmout().equals(other.getRealityRefundTotalAmout()))
            && (this.getRefundTotalCoin() == null ? other.getRefundTotalCoin() == null : this.getRefundTotalCoin().equals(other.getRefundTotalCoin()))
            && (this.getRealityRefundTotalCoin() == null ? other.getRealityRefundTotalCoin() == null : this.getRealityRefundTotalCoin().equals(other.getRealityRefundTotalCoin()))
            && (this.getRegainTotalCoin() == null ? other.getRegainTotalCoin() == null : this.getRegainTotalCoin().equals(other.getRegainTotalCoin()))
            && (this.getRealityRegainTotalCoin() == null ? other.getRealityRegainTotalCoin() == null : this.getRealityRegainTotalCoin().equals(other.getRealityRegainTotalCoin()))
            && (this.getRegainFatherTotalCoin() == null ? other.getRegainFatherTotalCoin() == null : this.getRegainFatherTotalCoin().equals(other.getRegainFatherTotalCoin()))
            && (this.getRealityRegainFatherTotalCoin() == null ? other.getRealityRegainFatherTotalCoin() == null : this.getRealityRegainFatherTotalCoin().equals(other.getRealityRegainFatherTotalCoin()))
            && (this.getRegainGrandfatherTotalCoin() == null ? other.getRegainGrandfatherTotalCoin() == null : this.getRegainGrandfatherTotalCoin().equals(other.getRegainGrandfatherTotalCoin()))
            && (this.getRealityRegainGrandfatherTotalCoin() == null ? other.getRealityRegainGrandfatherTotalCoin() == null : this.getRealityRegainGrandfatherTotalCoin().equals(other.getRealityRegainGrandfatherTotalCoin()))
            && (this.getRegainTotalAmount() == null ? other.getRegainTotalAmount() == null : this.getRegainTotalAmount().equals(other.getRegainTotalAmount()))
            && (this.getRealityRegainTotalAmount() == null ? other.getRealityRegainTotalAmount() == null : this.getRealityRegainTotalAmount().equals(other.getRealityRegainTotalAmount()))
            && (this.getRegainFatherTotalAmount() == null ? other.getRegainFatherTotalAmount() == null : this.getRegainFatherTotalAmount().equals(other.getRegainFatherTotalAmount()))
            && (this.getRealityRegainFatherTotalAmount() == null ? other.getRealityRegainFatherTotalAmount() == null : this.getRealityRegainFatherTotalAmount().equals(other.getRealityRegainFatherTotalAmount()))
            && (this.getRegainGrandfatherTotalAmount() == null ? other.getRegainGrandfatherTotalAmount() == null : this.getRegainGrandfatherTotalAmount().equals(other.getRegainGrandfatherTotalAmount()))
            && (this.getRealityRegainGrandfatherTotalAmount() == null ? other.getRealityRegainGrandfatherTotalAmount() == null : this.getRealityRegainGrandfatherTotalAmount().equals(other.getRealityRegainGrandfatherTotalAmount()))
            && (this.getRegainReducion() == null ? other.getRegainReducion() == null : this.getRegainReducion().equals(other.getRegainReducion()))
            && (this.getRealityRegainReducion() == null ? other.getRealityRegainReducion() == null : this.getRealityRegainReducion().equals(other.getRealityRegainReducion()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getAllowTime() == null ? other.getAllowTime() == null : this.getAllowTime().equals(other.getAllowTime()))
            && (this.getPassTime() == null ? other.getPassTime() == null : this.getPassTime().equals(other.getPassTime()))
            && (this.getFinishTime() == null ? other.getFinishTime() == null : this.getFinishTime().equals(other.getFinishTime()))
            && (this.getRefundReason() == null ? other.getRefundReason() == null : this.getRefundReason().equals(other.getRefundReason()))
            && (this.getRefundDescription() == null ? other.getRefundDescription() == null : this.getRefundDescription().equals(other.getRefundDescription()))
            && (this.getRefundImages() == null ? other.getRefundImages() == null : this.getRefundImages().equals(other.getRefundImages()))
            && (this.getRefundType() == null ? other.getRefundType() == null : this.getRefundType().equals(other.getRefundType()))
            && (this.getRefundStatus() == null ? other.getRefundStatus() == null : this.getRefundStatus().equals(other.getRefundStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRefundTradeNo() == null) ? 0 : getRefundTradeNo().hashCode());
        result = prime * result + ((getRefundOutTradeNo() == null) ? 0 : getRefundOutTradeNo().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getRefundTotalAmount() == null) ? 0 : getRefundTotalAmount().hashCode());
        result = prime * result + ((getRealityRefundTotalAmout() == null) ? 0 : getRealityRefundTotalAmout().hashCode());
        result = prime * result + ((getRefundTotalCoin() == null) ? 0 : getRefundTotalCoin().hashCode());
        result = prime * result + ((getRealityRefundTotalCoin() == null) ? 0 : getRealityRefundTotalCoin().hashCode());
        result = prime * result + ((getRegainTotalCoin() == null) ? 0 : getRegainTotalCoin().hashCode());
        result = prime * result + ((getRealityRegainTotalCoin() == null) ? 0 : getRealityRegainTotalCoin().hashCode());
        result = prime * result + ((getRegainFatherTotalCoin() == null) ? 0 : getRegainFatherTotalCoin().hashCode());
        result = prime * result + ((getRealityRegainFatherTotalCoin() == null) ? 0 : getRealityRegainFatherTotalCoin().hashCode());
        result = prime * result + ((getRegainGrandfatherTotalCoin() == null) ? 0 : getRegainGrandfatherTotalCoin().hashCode());
        result = prime * result + ((getRealityRegainGrandfatherTotalCoin() == null) ? 0 : getRealityRegainGrandfatherTotalCoin().hashCode());
        result = prime * result + ((getRegainTotalAmount() == null) ? 0 : getRegainTotalAmount().hashCode());
        result = prime * result + ((getRealityRegainTotalAmount() == null) ? 0 : getRealityRegainTotalAmount().hashCode());
        result = prime * result + ((getRegainFatherTotalAmount() == null) ? 0 : getRegainFatherTotalAmount().hashCode());
        result = prime * result + ((getRealityRegainFatherTotalAmount() == null) ? 0 : getRealityRegainFatherTotalAmount().hashCode());
        result = prime * result + ((getRegainGrandfatherTotalAmount() == null) ? 0 : getRegainGrandfatherTotalAmount().hashCode());
        result = prime * result + ((getRealityRegainGrandfatherTotalAmount() == null) ? 0 : getRealityRegainGrandfatherTotalAmount().hashCode());
        result = prime * result + ((getRegainReducion() == null) ? 0 : getRegainReducion().hashCode());
        result = prime * result + ((getRealityRegainReducion() == null) ? 0 : getRealityRegainReducion().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getAllowTime() == null) ? 0 : getAllowTime().hashCode());
        result = prime * result + ((getPassTime() == null) ? 0 : getPassTime().hashCode());
        result = prime * result + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        result = prime * result + ((getRefundReason() == null) ? 0 : getRefundReason().hashCode());
        result = prime * result + ((getRefundDescription() == null) ? 0 : getRefundDescription().hashCode());
        result = prime * result + ((getRefundImages() == null) ? 0 : getRefundImages().hashCode());
        result = prime * result + ((getRefundType() == null) ? 0 : getRefundType().hashCode());
        result = prime * result + ((getRefundStatus() == null) ? 0 : getRefundStatus().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        refundTradeNo("refund_trade_no", "refundTradeNo", "VARCHAR", false),
        refundOutTradeNo("refund_out_trade_no", "refundOutTradeNo", "VARCHAR", false),
        orderNo("order_no", "orderNo", "VARCHAR", false),
        refundTotalAmount("refund_total_amount", "refundTotalAmount", "DECIMAL", false),
        realityRefundTotalAmout("reality_refund_total_amout", "realityRefundTotalAmout", "DECIMAL", false),
        refundTotalCoin("refund_total_coin", "refundTotalCoin", "INTEGER", false),
        realityRefundTotalCoin("reality_refund_total_coin", "realityRefundTotalCoin", "INTEGER", false),
        regainTotalCoin("regain_total_coin", "regainTotalCoin", "INTEGER", false),
        realityRegainTotalCoin("reality_regain_total_coin", "realityRegainTotalCoin", "INTEGER", false),
        regainFatherTotalCoin("regain_father_total_coin", "regainFatherTotalCoin", "INTEGER", false),
        realityRegainFatherTotalCoin("reality_regain_father_total_coin", "realityRegainFatherTotalCoin", "INTEGER", false),
        regainGrandfatherTotalCoin("regain_grandfather_total_coin", "regainGrandfatherTotalCoin", "INTEGER", false),
        realityRegainGrandfatherTotalCoin("reality_regain_grandfather_total_coin", "realityRegainGrandfatherTotalCoin", "INTEGER", false),
        regainTotalAmount("regain_total_amount", "regainTotalAmount", "DECIMAL", false),
        realityRegainTotalAmount("reality_regain_total_amount", "realityRegainTotalAmount", "DECIMAL", false),
        regainFatherTotalAmount("regain_father_total_amount", "regainFatherTotalAmount", "DECIMAL", false),
        realityRegainFatherTotalAmount("reality_regain_father_total_amount", "realityRegainFatherTotalAmount", "DECIMAL", false),
        regainGrandfatherTotalAmount("regain_grandfather_total_amount", "regainGrandfatherTotalAmount", "DECIMAL", false),
        realityRegainGrandfatherTotalAmount("reality_regain_grandfather_total_amount", "realityRegainGrandfatherTotalAmount", "DECIMAL", false),
        regainReducion("regain_reducion", "regainReducion", "DECIMAL", false),
        realityRegainReducion("reality_regain_reducion", "realityRegainReducion", "DECIMAL", false),
        applyTime("apply_time", "applyTime", "TIMESTAMP", false),
        allowTime("allow_time", "allowTime", "TIMESTAMP", false),
        passTime("pass_time", "passTime", "TIMESTAMP", false),
        finishTime("finish_time", "finishTime", "TIMESTAMP", false),
        refundReason("refund_reason", "refundReason", "VARCHAR", false),
        refundDescription("refund_description", "refundDescription", "VARCHAR", false),
        refundImages("refund_images", "refundImages", "VARCHAR", false),
        refundType("refund_type", "refundType", "INTEGER", false),
        refundStatus("refund_status", "refundStatus", "TINYINT", false);

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