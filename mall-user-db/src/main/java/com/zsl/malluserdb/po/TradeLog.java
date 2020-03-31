package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TradeLog implements Serializable {
    private Integer tradeLogId;

    private Date tradeTime;

    private String millTime;

    private String resTime;

    private Integer resCode;

    private String resDesc;

    private String tradeInfo;

    private String resData;

    private static final long serialVersionUID = 1L;

    public Integer getTradeLogId() {
        return tradeLogId;
    }

    public void setTradeLogId(Integer tradeLogId) {
        this.tradeLogId = tradeLogId;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getMillTime() {
        return millTime;
    }

    public void setMillTime(String millTime) {
        this.millTime = millTime == null ? null : millTime.trim();
    }

    public String getResTime() {
        return resTime;
    }

    public void setResTime(String resTime) {
        this.resTime = resTime == null ? null : resTime.trim();
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc == null ? null : resDesc.trim();
    }

    public String getTradeInfo() {
        return tradeInfo;
    }

    public void setTradeInfo(String tradeInfo) {
        this.tradeInfo = tradeInfo == null ? null : tradeInfo.trim();
    }

    public String getResData() {
        return resData;
    }

    public void setResData(String resData) {
        this.resData = resData == null ? null : resData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tradeLogId=").append(tradeLogId);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", millTime=").append(millTime);
        sb.append(", resTime=").append(resTime);
        sb.append(", resCode=").append(resCode);
        sb.append(", resDesc=").append(resDesc);
        sb.append(", tradeInfo=").append(tradeInfo);
        sb.append(", resData=").append(resData);
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
        TradeLog other = (TradeLog) that;
        return (this.getTradeLogId() == null ? other.getTradeLogId() == null : this.getTradeLogId().equals(other.getTradeLogId()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getMillTime() == null ? other.getMillTime() == null : this.getMillTime().equals(other.getMillTime()))
            && (this.getResTime() == null ? other.getResTime() == null : this.getResTime().equals(other.getResTime()))
            && (this.getResCode() == null ? other.getResCode() == null : this.getResCode().equals(other.getResCode()))
            && (this.getResDesc() == null ? other.getResDesc() == null : this.getResDesc().equals(other.getResDesc()))
            && (this.getTradeInfo() == null ? other.getTradeInfo() == null : this.getTradeInfo().equals(other.getTradeInfo()))
            && (this.getResData() == null ? other.getResData() == null : this.getResData().equals(other.getResData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTradeLogId() == null) ? 0 : getTradeLogId().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getMillTime() == null) ? 0 : getMillTime().hashCode());
        result = prime * result + ((getResTime() == null) ? 0 : getResTime().hashCode());
        result = prime * result + ((getResCode() == null) ? 0 : getResCode().hashCode());
        result = prime * result + ((getResDesc() == null) ? 0 : getResDesc().hashCode());
        result = prime * result + ((getTradeInfo() == null) ? 0 : getTradeInfo().hashCode());
        result = prime * result + ((getResData() == null) ? 0 : getResData().hashCode());
        return result;
    }

    public enum Column {
        tradeLogId("trade_log_id", "tradeLogId", "INTEGER", false),
        tradeTime("trade_time", "tradeTime", "TIMESTAMP", false),
        millTime("mill_time", "millTime", "VARCHAR", false),
        resTime("res_time", "resTime", "VARCHAR", false),
        resCode("res_code", "resCode", "INTEGER", false),
        resDesc("res_desc", "resDesc", "VARCHAR", false),
        tradeInfo("trade_info", "tradeInfo", "LONGVARCHAR", false),
        resData("res_data", "resData", "LONGVARCHAR", false);

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