package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class SuperiorStockBalanceTransaction implements Serializable {
    private Integer id;

    private Integer stockIncrementId;

    private Integer stockDecrementId;

    private Integer balanceIncrementId;

    private Integer balanceDecrementId;

    private Integer tradeInfoId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStockIncrementId() {
        return stockIncrementId;
    }

    public void setStockIncrementId(Integer stockIncrementId) {
        this.stockIncrementId = stockIncrementId;
    }

    public Integer getStockDecrementId() {
        return stockDecrementId;
    }

    public void setStockDecrementId(Integer stockDecrementId) {
        this.stockDecrementId = stockDecrementId;
    }

    public Integer getBalanceIncrementId() {
        return balanceIncrementId;
    }

    public void setBalanceIncrementId(Integer balanceIncrementId) {
        this.balanceIncrementId = balanceIncrementId;
    }

    public Integer getBalanceDecrementId() {
        return balanceDecrementId;
    }

    public void setBalanceDecrementId(Integer balanceDecrementId) {
        this.balanceDecrementId = balanceDecrementId;
    }

    public Integer getTradeInfoId() {
        return tradeInfoId;
    }

    public void setTradeInfoId(Integer tradeInfoId) {
        this.tradeInfoId = tradeInfoId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stockIncrementId=").append(stockIncrementId);
        sb.append(", stockDecrementId=").append(stockDecrementId);
        sb.append(", balanceIncrementId=").append(balanceIncrementId);
        sb.append(", balanceDecrementId=").append(balanceDecrementId);
        sb.append(", tradeInfoId=").append(tradeInfoId);
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
        SuperiorStockBalanceTransaction other = (SuperiorStockBalanceTransaction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStockIncrementId() == null ? other.getStockIncrementId() == null : this.getStockIncrementId().equals(other.getStockIncrementId()))
            && (this.getStockDecrementId() == null ? other.getStockDecrementId() == null : this.getStockDecrementId().equals(other.getStockDecrementId()))
            && (this.getBalanceIncrementId() == null ? other.getBalanceIncrementId() == null : this.getBalanceIncrementId().equals(other.getBalanceIncrementId()))
            && (this.getBalanceDecrementId() == null ? other.getBalanceDecrementId() == null : this.getBalanceDecrementId().equals(other.getBalanceDecrementId()))
            && (this.getTradeInfoId() == null ? other.getTradeInfoId() == null : this.getTradeInfoId().equals(other.getTradeInfoId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStockIncrementId() == null) ? 0 : getStockIncrementId().hashCode());
        result = prime * result + ((getStockDecrementId() == null) ? 0 : getStockDecrementId().hashCode());
        result = prime * result + ((getBalanceIncrementId() == null) ? 0 : getBalanceIncrementId().hashCode());
        result = prime * result + ((getBalanceDecrementId() == null) ? 0 : getBalanceDecrementId().hashCode());
        result = prime * result + ((getTradeInfoId() == null) ? 0 : getTradeInfoId().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        stockIncrementId("stock_increment_id", "stockIncrementId", "INTEGER", false),
        stockDecrementId("stock_decrement_id", "stockDecrementId", "INTEGER", false),
        balanceIncrementId("balance_increment_id", "balanceIncrementId", "INTEGER", false),
        balanceDecrementId("balance_decrement_id", "balanceDecrementId", "INTEGER", false),
        tradeInfoId("trade_info_id", "tradeInfoId", "INTEGER", false);

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