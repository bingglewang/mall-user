package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GoodsTradeInfo implements Serializable {
    private Integer id;

    private String tradeNo;

    private String outTradeNo;

    private Integer memberId;

    private Integer addressId;

    private Byte payWay;

    private Boolean source;

    private Byte preStatus;

    private Byte currentStatus;

    private Boolean evaluate;

    private Float totalAmount;

    private BigDecimal freightCharge;

    private BigDecimal moneyOff;

    private BigDecimal totalDeduction;

    private Integer totalCount;

    private Integer totalPoint;

    private Integer totalCoin;

    private String remark;

    private Date tradeTime;

    private Date paymentTime;

    private Date finishTime;

    private Date endTime;

    private Date shipmentsTime;

    private Boolean hidden;

    private String recipients;

    private String recipientsPhone;

    private String shippingAddress;

    private String shippingAddressDetail;

    private BigDecimal presentMoney;

    private BigDecimal fatherMoney;

    private BigDecimal grandfatherMoney;

    private Integer fatherCoin;

    private Integer grandfatherCoin;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    public Byte getPreStatus() {
        return preStatus;
    }

    public void setPreStatus(Byte preStatus) {
        this.preStatus = preStatus;
    }

    public Byte getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Byte currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Boolean getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Boolean evaluate) {
        this.evaluate = evaluate;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getFreightCharge() {
        return freightCharge;
    }

    public void setFreightCharge(BigDecimal freightCharge) {
        this.freightCharge = freightCharge;
    }

    public BigDecimal getMoneyOff() {
        return moneyOff;
    }

    public void setMoneyOff(BigDecimal moneyOff) {
        this.moneyOff = moneyOff;
    }

    public BigDecimal getTotalDeduction() {
        return totalDeduction;
    }

    public void setTotalDeduction(BigDecimal totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Integer getTotalCoin() {
        return totalCoin;
    }

    public void setTotalCoin(Integer totalCoin) {
        this.totalCoin = totalCoin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getShipmentsTime() {
        return shipmentsTime;
    }

    public void setShipmentsTime(Date shipmentsTime) {
        this.shipmentsTime = shipmentsTime;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public String getRecipientsPhone() {
        return recipientsPhone;
    }

    public void setRecipientsPhone(String recipientsPhone) {
        this.recipientsPhone = recipientsPhone == null ? null : recipientsPhone.trim();
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    public String getShippingAddressDetail() {
        return shippingAddressDetail;
    }

    public void setShippingAddressDetail(String shippingAddressDetail) {
        this.shippingAddressDetail = shippingAddressDetail == null ? null : shippingAddressDetail.trim();
    }

    public BigDecimal getPresentMoney() {
        return presentMoney;
    }

    public void setPresentMoney(BigDecimal presentMoney) {
        this.presentMoney = presentMoney;
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

    public Integer getFatherCoin() {
        return fatherCoin;
    }

    public void setFatherCoin(Integer fatherCoin) {
        this.fatherCoin = fatherCoin;
    }

    public Integer getGrandfatherCoin() {
        return grandfatherCoin;
    }

    public void setGrandfatherCoin(Integer grandfatherCoin) {
        this.grandfatherCoin = grandfatherCoin;
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
        sb.append(", memberId=").append(memberId);
        sb.append(", addressId=").append(addressId);
        sb.append(", payWay=").append(payWay);
        sb.append(", source=").append(source);
        sb.append(", preStatus=").append(preStatus);
        sb.append(", currentStatus=").append(currentStatus);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", freightCharge=").append(freightCharge);
        sb.append(", moneyOff=").append(moneyOff);
        sb.append(", totalDeduction=").append(totalDeduction);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", totalPoint=").append(totalPoint);
        sb.append(", totalCoin=").append(totalCoin);
        sb.append(", remark=").append(remark);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", shipmentsTime=").append(shipmentsTime);
        sb.append(", hidden=").append(hidden);
        sb.append(", recipients=").append(recipients);
        sb.append(", recipientsPhone=").append(recipientsPhone);
        sb.append(", shippingAddress=").append(shippingAddress);
        sb.append(", shippingAddressDetail=").append(shippingAddressDetail);
        sb.append(", presentMoney=").append(presentMoney);
        sb.append(", fatherMoney=").append(fatherMoney);
        sb.append(", grandfatherMoney=").append(grandfatherMoney);
        sb.append(", fatherCoin=").append(fatherCoin);
        sb.append(", grandfatherCoin=").append(grandfatherCoin);
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
        GoodsTradeInfo other = (GoodsTradeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getOutTradeNo() == null ? other.getOutTradeNo() == null : this.getOutTradeNo().equals(other.getOutTradeNo()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getPreStatus() == null ? other.getPreStatus() == null : this.getPreStatus().equals(other.getPreStatus()))
            && (this.getCurrentStatus() == null ? other.getCurrentStatus() == null : this.getCurrentStatus().equals(other.getCurrentStatus()))
            && (this.getEvaluate() == null ? other.getEvaluate() == null : this.getEvaluate().equals(other.getEvaluate()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getFreightCharge() == null ? other.getFreightCharge() == null : this.getFreightCharge().equals(other.getFreightCharge()))
            && (this.getMoneyOff() == null ? other.getMoneyOff() == null : this.getMoneyOff().equals(other.getMoneyOff()))
            && (this.getTotalDeduction() == null ? other.getTotalDeduction() == null : this.getTotalDeduction().equals(other.getTotalDeduction()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getTotalPoint() == null ? other.getTotalPoint() == null : this.getTotalPoint().equals(other.getTotalPoint()))
            && (this.getTotalCoin() == null ? other.getTotalCoin() == null : this.getTotalCoin().equals(other.getTotalCoin()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getFinishTime() == null ? other.getFinishTime() == null : this.getFinishTime().equals(other.getFinishTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getShipmentsTime() == null ? other.getShipmentsTime() == null : this.getShipmentsTime().equals(other.getShipmentsTime()))
            && (this.getHidden() == null ? other.getHidden() == null : this.getHidden().equals(other.getHidden()))
            && (this.getRecipients() == null ? other.getRecipients() == null : this.getRecipients().equals(other.getRecipients()))
            && (this.getRecipientsPhone() == null ? other.getRecipientsPhone() == null : this.getRecipientsPhone().equals(other.getRecipientsPhone()))
            && (this.getShippingAddress() == null ? other.getShippingAddress() == null : this.getShippingAddress().equals(other.getShippingAddress()))
            && (this.getShippingAddressDetail() == null ? other.getShippingAddressDetail() == null : this.getShippingAddressDetail().equals(other.getShippingAddressDetail()))
            && (this.getPresentMoney() == null ? other.getPresentMoney() == null : this.getPresentMoney().equals(other.getPresentMoney()))
            && (this.getFatherMoney() == null ? other.getFatherMoney() == null : this.getFatherMoney().equals(other.getFatherMoney()))
            && (this.getGrandfatherMoney() == null ? other.getGrandfatherMoney() == null : this.getGrandfatherMoney().equals(other.getGrandfatherMoney()))
            && (this.getFatherCoin() == null ? other.getFatherCoin() == null : this.getFatherCoin().equals(other.getFatherCoin()))
            && (this.getGrandfatherCoin() == null ? other.getGrandfatherCoin() == null : this.getGrandfatherCoin().equals(other.getGrandfatherCoin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getOutTradeNo() == null) ? 0 : getOutTradeNo().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getPreStatus() == null) ? 0 : getPreStatus().hashCode());
        result = prime * result + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        result = prime * result + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getFreightCharge() == null) ? 0 : getFreightCharge().hashCode());
        result = prime * result + ((getMoneyOff() == null) ? 0 : getMoneyOff().hashCode());
        result = prime * result + ((getTotalDeduction() == null) ? 0 : getTotalDeduction().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getTotalPoint() == null) ? 0 : getTotalPoint().hashCode());
        result = prime * result + ((getTotalCoin() == null) ? 0 : getTotalCoin().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getShipmentsTime() == null) ? 0 : getShipmentsTime().hashCode());
        result = prime * result + ((getHidden() == null) ? 0 : getHidden().hashCode());
        result = prime * result + ((getRecipients() == null) ? 0 : getRecipients().hashCode());
        result = prime * result + ((getRecipientsPhone() == null) ? 0 : getRecipientsPhone().hashCode());
        result = prime * result + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        result = prime * result + ((getShippingAddressDetail() == null) ? 0 : getShippingAddressDetail().hashCode());
        result = prime * result + ((getPresentMoney() == null) ? 0 : getPresentMoney().hashCode());
        result = prime * result + ((getFatherMoney() == null) ? 0 : getFatherMoney().hashCode());
        result = prime * result + ((getGrandfatherMoney() == null) ? 0 : getGrandfatherMoney().hashCode());
        result = prime * result + ((getFatherCoin() == null) ? 0 : getFatherCoin().hashCode());
        result = prime * result + ((getGrandfatherCoin() == null) ? 0 : getGrandfatherCoin().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        tradeNo("trade_no", "tradeNo", "VARCHAR", false),
        outTradeNo("out_trade_no", "outTradeNo", "VARCHAR", false),
        memberId("member_id", "memberId", "INTEGER", false),
        addressId("address_id", "addressId", "INTEGER", false),
        payWay("pay_way", "payWay", "TINYINT", false),
        source("source", "source", "BIT", true),
        preStatus("pre_status", "preStatus", "TINYINT", false),
        currentStatus("current_status", "currentStatus", "TINYINT", false),
        evaluate("evaluate", "evaluate", "BIT", false),
        totalAmount("total_amount", "totalAmount", "REAL", false),
        freightCharge("freight_charge", "freightCharge", "DECIMAL", false),
        moneyOff("money_off", "moneyOff", "DECIMAL", false),
        totalDeduction("total_deduction", "totalDeduction", "DECIMAL", false),
        totalCount("total_count", "totalCount", "INTEGER", false),
        totalPoint("total_point", "totalPoint", "INTEGER", false),
        totalCoin("total_coin", "totalCoin", "INTEGER", false),
        remark("remark", "remark", "VARCHAR", false),
        tradeTime("trade_time", "tradeTime", "TIMESTAMP", false),
        paymentTime("payment_time", "paymentTime", "TIMESTAMP", false),
        finishTime("finish_time", "finishTime", "TIMESTAMP", false),
        endTime("end_time", "endTime", "TIMESTAMP", false),
        shipmentsTime("shipments_time", "shipmentsTime", "TIMESTAMP", false),
        hidden("hidden", "hidden", "BIT", false),
        recipients("recipients", "recipients", "VARCHAR", false),
        recipientsPhone("recipients_phone", "recipientsPhone", "VARCHAR", false),
        shippingAddress("shipping_address", "shippingAddress", "VARCHAR", false),
        shippingAddressDetail("shipping_address_detail", "shippingAddressDetail", "VARCHAR", false),
        presentMoney("present_money", "presentMoney", "DECIMAL", false),
        fatherMoney("father_money", "fatherMoney", "DECIMAL", false),
        grandfatherMoney("grandfather_money", "grandfatherMoney", "DECIMAL", false),
        fatherCoin("father_coin", "fatherCoin", "INTEGER", false),
        grandfatherCoin("grandfather_coin", "grandfatherCoin", "INTEGER", false);

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