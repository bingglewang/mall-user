package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class SuperiorPickUp implements Serializable {
    private Integer id;

    private Integer userMemberId;

    private Integer userAddressId;

    private Integer stockDecrementId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserMemberId() {
        return userMemberId;
    }

    public void setUserMemberId(Integer userMemberId) {
        this.userMemberId = userMemberId;
    }

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Integer getStockDecrementId() {
        return stockDecrementId;
    }

    public void setStockDecrementId(Integer stockDecrementId) {
        this.stockDecrementId = stockDecrementId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userMemberId=").append(userMemberId);
        sb.append(", userAddressId=").append(userAddressId);
        sb.append(", stockDecrementId=").append(stockDecrementId);
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
        SuperiorPickUp other = (SuperiorPickUp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserMemberId() == null ? other.getUserMemberId() == null : this.getUserMemberId().equals(other.getUserMemberId()))
            && (this.getUserAddressId() == null ? other.getUserAddressId() == null : this.getUserAddressId().equals(other.getUserAddressId()))
            && (this.getStockDecrementId() == null ? other.getStockDecrementId() == null : this.getStockDecrementId().equals(other.getStockDecrementId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserMemberId() == null) ? 0 : getUserMemberId().hashCode());
        result = prime * result + ((getUserAddressId() == null) ? 0 : getUserAddressId().hashCode());
        result = prime * result + ((getStockDecrementId() == null) ? 0 : getStockDecrementId().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        userMemberId("user_member_id", "userMemberId", "INTEGER", false),
        userAddressId("user_address_id", "userAddressId", "INTEGER", false),
        stockDecrementId("stock_decrement_id", "stockDecrementId", "INTEGER", false);

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