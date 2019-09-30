package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class GoodsOrderInfo implements Serializable {
    private Integer id;

    private String orderNo;

    private String tradeNo;

    private Long shopId;

    private Boolean preState;

    private Boolean currentState;

    private Integer trackingCompanyId;

    private String trackingNumber;

    private Boolean orderEvaluate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Boolean getPreState() {
        return preState;
    }

    public void setPreState(Boolean preState) {
        this.preState = preState;
    }

    public Boolean getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Boolean currentState) {
        this.currentState = currentState;
    }

    public Integer getTrackingCompanyId() {
        return trackingCompanyId;
    }

    public void setTrackingCompanyId(Integer trackingCompanyId) {
        this.trackingCompanyId = trackingCompanyId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber == null ? null : trackingNumber.trim();
    }

    public Boolean getOrderEvaluate() {
        return orderEvaluate;
    }

    public void setOrderEvaluate(Boolean orderEvaluate) {
        this.orderEvaluate = orderEvaluate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", shopId=").append(shopId);
        sb.append(", preState=").append(preState);
        sb.append(", currentState=").append(currentState);
        sb.append(", trackingCompanyId=").append(trackingCompanyId);
        sb.append(", trackingNumber=").append(trackingNumber);
        sb.append(", orderEvaluate=").append(orderEvaluate);
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
        GoodsOrderInfo other = (GoodsOrderInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getPreState() == null ? other.getPreState() == null : this.getPreState().equals(other.getPreState()))
            && (this.getCurrentState() == null ? other.getCurrentState() == null : this.getCurrentState().equals(other.getCurrentState()))
            && (this.getTrackingCompanyId() == null ? other.getTrackingCompanyId() == null : this.getTrackingCompanyId().equals(other.getTrackingCompanyId()))
            && (this.getTrackingNumber() == null ? other.getTrackingNumber() == null : this.getTrackingNumber().equals(other.getTrackingNumber()))
            && (this.getOrderEvaluate() == null ? other.getOrderEvaluate() == null : this.getOrderEvaluate().equals(other.getOrderEvaluate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getPreState() == null) ? 0 : getPreState().hashCode());
        result = prime * result + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        result = prime * result + ((getTrackingCompanyId() == null) ? 0 : getTrackingCompanyId().hashCode());
        result = prime * result + ((getTrackingNumber() == null) ? 0 : getTrackingNumber().hashCode());
        result = prime * result + ((getOrderEvaluate() == null) ? 0 : getOrderEvaluate().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        orderNo("order_no", "orderNo", "VARCHAR", false),
        tradeNo("trade_no", "tradeNo", "VARCHAR", false),
        shopId("shop_id", "shopId", "BIGINT", false),
        preState("pre_state", "preState", "BIT", false),
        currentState("current_state", "currentState", "BIT", false),
        trackingCompanyId("tracking_company_id", "trackingCompanyId", "INTEGER", false),
        trackingNumber("tracking_number", "trackingNumber", "VARCHAR", false),
        orderEvaluate("order_evaluate", "orderEvaluate", "BIT", false);

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