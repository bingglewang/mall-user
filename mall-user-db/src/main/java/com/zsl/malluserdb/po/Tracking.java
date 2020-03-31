package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Tracking implements Serializable {
    private Integer trackingId;

    private String trackingCompanyName;

    private String trackingCode;

    private static final long serialVersionUID = 1L;

    public Integer getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(Integer trackingId) {
        this.trackingId = trackingId;
    }

    public String getTrackingCompanyName() {
        return trackingCompanyName;
    }

    public void setTrackingCompanyName(String trackingCompanyName) {
        this.trackingCompanyName = trackingCompanyName == null ? null : trackingCompanyName.trim();
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode == null ? null : trackingCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trackingId=").append(trackingId);
        sb.append(", trackingCompanyName=").append(trackingCompanyName);
        sb.append(", trackingCode=").append(trackingCode);
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
        Tracking other = (Tracking) that;
        return (this.getTrackingId() == null ? other.getTrackingId() == null : this.getTrackingId().equals(other.getTrackingId()))
            && (this.getTrackingCompanyName() == null ? other.getTrackingCompanyName() == null : this.getTrackingCompanyName().equals(other.getTrackingCompanyName()))
            && (this.getTrackingCode() == null ? other.getTrackingCode() == null : this.getTrackingCode().equals(other.getTrackingCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrackingId() == null) ? 0 : getTrackingId().hashCode());
        result = prime * result + ((getTrackingCompanyName() == null) ? 0 : getTrackingCompanyName().hashCode());
        result = prime * result + ((getTrackingCode() == null) ? 0 : getTrackingCode().hashCode());
        return result;
    }

    public enum Column {
        trackingId("tracking_id", "trackingId", "INTEGER", false),
        trackingCompanyName("tracking_company_name", "trackingCompanyName", "VARCHAR", false),
        trackingCode("tracking_code", "trackingCode", "VARCHAR", false);

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