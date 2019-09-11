package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class OrderDetail implements Serializable {
    private Integer id;

    private String tradeNo;

    private Integer memberId;

    private Byte currentStatus;

    private Byte payWay;

    private Float totalAmount;

    private Integer totalCount;

    private Integer totalPoint;

    private String remark;

    private Boolean evaluate;

    private Date tradeTime;

    private Date paymentTime;

    private Date finishTime;

    private Date endTime;

    private Date shipmentsTime;

    private BigDecimal freightCharge;

    private String orderNo;

    private Boolean currentState;

    private BigDecimal childAmount;

    private Integer childCount;

    private Integer childPoint;

    private String skuName;

    private BigDecimal price;

    private String pictureUrl;

    private String specValue;

    private String specName;

    private String shopName;

    private String fullSite;

    private String address;

    private String consignee;

    private String mobile;

    private Boolean isDefault;

    private Long shopId;

    private Long skuId;

    private Integer totalCoin;

    private Integer presentCoin;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Byte getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Byte currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Boolean evaluate) {
        this.evaluate = evaluate;
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

    public BigDecimal getFreightCharge() {
        return freightCharge;
    }

    public void setFreightCharge(BigDecimal freightCharge) {
        this.freightCharge = freightCharge;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Boolean getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Boolean currentState) {
        this.currentState = currentState;
    }

    public BigDecimal getChildAmount() {
        return childAmount;
    }

    public void setChildAmount(BigDecimal childAmount) {
        this.childAmount = childAmount;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Integer getChildPoint() {
        return childPoint;
    }

    public void setChildPoint(Integer childPoint) {
        this.childPoint = childPoint;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public String getSpecValue() {
        return specValue;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue == null ? null : specValue.trim();
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getFullSite() {
        return fullSite;
    }

    public void setFullSite(String fullSite) {
        this.fullSite = fullSite == null ? null : fullSite.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getTotalCoin() {
        return totalCoin;
    }

    public void setTotalCoin(Integer totalCoin) {
        this.totalCoin = totalCoin;
    }

    public Integer getPresentCoin() {
        return presentCoin;
    }

    public void setPresentCoin(Integer presentCoin) {
        this.presentCoin = presentCoin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", memberId=").append(memberId);
        sb.append(", currentStatus=").append(currentStatus);
        sb.append(", payWay=").append(payWay);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", totalPoint=").append(totalPoint);
        sb.append(", remark=").append(remark);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", shipmentsTime=").append(shipmentsTime);
        sb.append(", freightCharge=").append(freightCharge);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", currentState=").append(currentState);
        sb.append(", childAmount=").append(childAmount);
        sb.append(", childCount=").append(childCount);
        sb.append(", childPoint=").append(childPoint);
        sb.append(", skuName=").append(skuName);
        sb.append(", price=").append(price);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", specValue=").append(specValue);
        sb.append(", specName=").append(specName);
        sb.append(", shopName=").append(shopName);
        sb.append(", fullSite=").append(fullSite);
        sb.append(", address=").append(address);
        sb.append(", consignee=").append(consignee);
        sb.append(", mobile=").append(mobile);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", shopId=").append(shopId);
        sb.append(", skuId=").append(skuId);
        sb.append(", totalCoin=").append(totalCoin);
        sb.append(", presentCoin=").append(presentCoin);
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
        OrderDetail other = (OrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getCurrentStatus() == null ? other.getCurrentStatus() == null : this.getCurrentStatus().equals(other.getCurrentStatus()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getTotalPoint() == null ? other.getTotalPoint() == null : this.getTotalPoint().equals(other.getTotalPoint()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getEvaluate() == null ? other.getEvaluate() == null : this.getEvaluate().equals(other.getEvaluate()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getFinishTime() == null ? other.getFinishTime() == null : this.getFinishTime().equals(other.getFinishTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getShipmentsTime() == null ? other.getShipmentsTime() == null : this.getShipmentsTime().equals(other.getShipmentsTime()))
            && (this.getFreightCharge() == null ? other.getFreightCharge() == null : this.getFreightCharge().equals(other.getFreightCharge()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getCurrentState() == null ? other.getCurrentState() == null : this.getCurrentState().equals(other.getCurrentState()))
            && (this.getChildAmount() == null ? other.getChildAmount() == null : this.getChildAmount().equals(other.getChildAmount()))
            && (this.getChildCount() == null ? other.getChildCount() == null : this.getChildCount().equals(other.getChildCount()))
            && (this.getChildPoint() == null ? other.getChildPoint() == null : this.getChildPoint().equals(other.getChildPoint()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPictureUrl() == null ? other.getPictureUrl() == null : this.getPictureUrl().equals(other.getPictureUrl()))
            && (this.getSpecValue() == null ? other.getSpecValue() == null : this.getSpecValue().equals(other.getSpecValue()))
            && (this.getSpecName() == null ? other.getSpecName() == null : this.getSpecName().equals(other.getSpecName()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()))
            && (this.getFullSite() == null ? other.getFullSite() == null : this.getFullSite().equals(other.getFullSite()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getConsignee() == null ? other.getConsignee() == null : this.getConsignee().equals(other.getConsignee()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getTotalCoin() == null ? other.getTotalCoin() == null : this.getTotalCoin().equals(other.getTotalCoin()))
            && (this.getPresentCoin() == null ? other.getPresentCoin() == null : this.getPresentCoin().equals(other.getPresentCoin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getTotalPoint() == null) ? 0 : getTotalPoint().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getShipmentsTime() == null) ? 0 : getShipmentsTime().hashCode());
        result = prime * result + ((getFreightCharge() == null) ? 0 : getFreightCharge().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        result = prime * result + ((getChildAmount() == null) ? 0 : getChildAmount().hashCode());
        result = prime * result + ((getChildCount() == null) ? 0 : getChildCount().hashCode());
        result = prime * result + ((getChildPoint() == null) ? 0 : getChildPoint().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPictureUrl() == null) ? 0 : getPictureUrl().hashCode());
        result = prime * result + ((getSpecValue() == null) ? 0 : getSpecValue().hashCode());
        result = prime * result + ((getSpecName() == null) ? 0 : getSpecName().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        result = prime * result + ((getFullSite() == null) ? 0 : getFullSite().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getConsignee() == null) ? 0 : getConsignee().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getTotalCoin() == null) ? 0 : getTotalCoin().hashCode());
        result = prime * result + ((getPresentCoin() == null) ? 0 : getPresentCoin().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        tradeNo("trade_no", "tradeNo", "VARCHAR", false),
        memberId("member_id", "memberId", "INTEGER", false),
        currentStatus("current_status", "currentStatus", "TINYINT", false),
        payWay("pay_way", "payWay", "TINYINT", false),
        totalAmount("total_amount", "totalAmount", "REAL", false),
        totalCount("total_count", "totalCount", "INTEGER", false),
        totalPoint("total_point", "totalPoint", "INTEGER", false),
        remark("remark", "remark", "VARCHAR", false),
        evaluate("evaluate", "evaluate", "BIT", false),
        tradeTime("trade_time", "tradeTime", "TIMESTAMP", false),
        paymentTime("payment_time", "paymentTime", "TIMESTAMP", false),
        finishTime("finish_time", "finishTime", "TIMESTAMP", false),
        endTime("end_time", "endTime", "TIMESTAMP", false),
        shipmentsTime("shipments_time", "shipmentsTime", "TIMESTAMP", false),
        freightCharge("freight_charge", "freightCharge", "DECIMAL", false),
        orderNo("order_no", "orderNo", "VARCHAR", false),
        currentState("current_state", "currentState", "BIT", false),
        childAmount("child_amount", "childAmount", "DECIMAL", false),
        childCount("child_count", "childCount", "INTEGER", false),
        childPoint("child_point", "childPoint", "INTEGER", false),
        skuName("sku_name", "skuName", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        pictureUrl("picture_url", "pictureUrl", "VARCHAR", false),
        specValue("spec_value", "specValue", "VARCHAR", false),
        specName("spec_name", "specName", "VARCHAR", false),
        shopName("shop_name", "shopName", "VARCHAR", false),
        fullSite("full_site", "fullSite", "VARCHAR", false),
        address("address", "address", "VARCHAR", false),
        consignee("consignee", "consignee", "VARCHAR", false),
        mobile("mobile", "mobile", "CHAR", false),
        isDefault("is_default", "isDefault", "BIT", false),
        shopId("shop_id", "shopId", "BIGINT", false),
        skuId("sku_id", "skuId", "BIGINT", false),
        totalCoin("total_coin", "totalCoin", "INTEGER", false),
        presentCoin("present_coin", "presentCoin", "INTEGER", false);

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