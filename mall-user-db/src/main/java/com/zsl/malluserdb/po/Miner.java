package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Miner implements Serializable {
    private Integer minerId;

    private Integer preMakeIntegral;

    private Integer tradeId;

    private Integer producedIntegral;

    private Integer userId;

    private Integer receivedIntegral;

    private Integer status;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getMinerId() {
        return minerId;
    }

    public void setMinerId(Integer minerId) {
        this.minerId = minerId;
    }

    public Integer getPreMakeIntegral() {
        return preMakeIntegral;
    }

    public void setPreMakeIntegral(Integer preMakeIntegral) {
        this.preMakeIntegral = preMakeIntegral;
    }

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getProducedIntegral() {
        return producedIntegral;
    }

    public void setProducedIntegral(Integer producedIntegral) {
        this.producedIntegral = producedIntegral;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReceivedIntegral() {
        return receivedIntegral;
    }

    public void setReceivedIntegral(Integer receivedIntegral) {
        this.receivedIntegral = receivedIntegral;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", minerId=").append(minerId);
        sb.append(", preMakeIntegral=").append(preMakeIntegral);
        sb.append(", tradeId=").append(tradeId);
        sb.append(", producedIntegral=").append(producedIntegral);
        sb.append(", userId=").append(userId);
        sb.append(", receivedIntegral=").append(receivedIntegral);
        sb.append(", status=").append(status);
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
        Miner other = (Miner) that;
        return (this.getMinerId() == null ? other.getMinerId() == null : this.getMinerId().equals(other.getMinerId()))
            && (this.getPreMakeIntegral() == null ? other.getPreMakeIntegral() == null : this.getPreMakeIntegral().equals(other.getPreMakeIntegral()))
            && (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
            && (this.getProducedIntegral() == null ? other.getProducedIntegral() == null : this.getProducedIntegral().equals(other.getProducedIntegral()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getReceivedIntegral() == null ? other.getReceivedIntegral() == null : this.getReceivedIntegral().equals(other.getReceivedIntegral()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMinerId() == null) ? 0 : getMinerId().hashCode());
        result = prime * result + ((getPreMakeIntegral() == null) ? 0 : getPreMakeIntegral().hashCode());
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getProducedIntegral() == null) ? 0 : getProducedIntegral().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getReceivedIntegral() == null) ? 0 : getReceivedIntegral().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    public enum Column {
        minerId("miner_id", "minerId", "INTEGER", false),
        preMakeIntegral("pre_make_integral", "preMakeIntegral", "INTEGER", false),
        tradeId("trade_id", "tradeId", "INTEGER", false),
        producedIntegral("produced_integral", "producedIntegral", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        receivedIntegral("received_integral", "receivedIntegral", "INTEGER", false),
        status("status", "status", "INTEGER", true),
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