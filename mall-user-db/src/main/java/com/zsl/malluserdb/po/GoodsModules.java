package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class GoodsModules implements Serializable {
    private Integer goodsModulesId;

    private Integer modulesId;

    private Long goodsId;

    private BigDecimal promotionPrice;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsModulesId() {
        return goodsModulesId;
    }

    public void setGoodsModulesId(Integer goodsModulesId) {
        this.goodsModulesId = goodsModulesId;
    }

    public Integer getModulesId() {
        return modulesId;
    }

    public void setModulesId(Integer modulesId) {
        this.modulesId = modulesId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsModulesId=").append(goodsModulesId);
        sb.append(", modulesId=").append(modulesId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", promotionPrice=").append(promotionPrice);
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
        GoodsModules other = (GoodsModules) that;
        return (this.getGoodsModulesId() == null ? other.getGoodsModulesId() == null : this.getGoodsModulesId().equals(other.getGoodsModulesId()))
            && (this.getModulesId() == null ? other.getModulesId() == null : this.getModulesId().equals(other.getModulesId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getPromotionPrice() == null ? other.getPromotionPrice() == null : this.getPromotionPrice().equals(other.getPromotionPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsModulesId() == null) ? 0 : getGoodsModulesId().hashCode());
        result = prime * result + ((getModulesId() == null) ? 0 : getModulesId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getPromotionPrice() == null) ? 0 : getPromotionPrice().hashCode());
        return result;
    }

    public enum Column {
        goodsModulesId("goods_modules_id", "goodsModulesId", "INTEGER", false),
        modulesId("modules_id", "modulesId", "INTEGER", false),
        goodsId("goods_id", "goodsId", "BIGINT", false),
        promotionPrice("promotion_price", "promotionPrice", "DECIMAL", false);

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