package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SuperiorGoodsDetail implements Serializable {
    private Integer id;

    private Integer goodsSpuId;

    private BigDecimal officialPrice;

    private BigDecimal superPrice;

    private BigDecimal nodePrice;

    private BigDecimal generalPrice;

    private Date createTime;

    private Integer officalCount;

    private Integer superCount;

    private Integer nodeCount;

    private String unit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsSpuId() {
        return goodsSpuId;
    }

    public void setGoodsSpuId(Integer goodsSpuId) {
        this.goodsSpuId = goodsSpuId;
    }

    public BigDecimal getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(BigDecimal officialPrice) {
        this.officialPrice = officialPrice;
    }

    public BigDecimal getSuperPrice() {
        return superPrice;
    }

    public void setSuperPrice(BigDecimal superPrice) {
        this.superPrice = superPrice;
    }

    public BigDecimal getNodePrice() {
        return nodePrice;
    }

    public void setNodePrice(BigDecimal nodePrice) {
        this.nodePrice = nodePrice;
    }

    public BigDecimal getGeneralPrice() {
        return generalPrice;
    }

    public void setGeneralPrice(BigDecimal generalPrice) {
        this.generalPrice = generalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOfficalCount() {
        return officalCount;
    }

    public void setOfficalCount(Integer officalCount) {
        this.officalCount = officalCount;
    }

    public Integer getSuperCount() {
        return superCount;
    }

    public void setSuperCount(Integer superCount) {
        this.superCount = superCount;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsSpuId=").append(goodsSpuId);
        sb.append(", officialPrice=").append(officialPrice);
        sb.append(", superPrice=").append(superPrice);
        sb.append(", nodePrice=").append(nodePrice);
        sb.append(", generalPrice=").append(generalPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", officalCount=").append(officalCount);
        sb.append(", superCount=").append(superCount);
        sb.append(", nodeCount=").append(nodeCount);
        sb.append(", unit=").append(unit);
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
        SuperiorGoodsDetail other = (SuperiorGoodsDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsSpuId() == null ? other.getGoodsSpuId() == null : this.getGoodsSpuId().equals(other.getGoodsSpuId()))
            && (this.getOfficialPrice() == null ? other.getOfficialPrice() == null : this.getOfficialPrice().equals(other.getOfficialPrice()))
            && (this.getSuperPrice() == null ? other.getSuperPrice() == null : this.getSuperPrice().equals(other.getSuperPrice()))
            && (this.getNodePrice() == null ? other.getNodePrice() == null : this.getNodePrice().equals(other.getNodePrice()))
            && (this.getGeneralPrice() == null ? other.getGeneralPrice() == null : this.getGeneralPrice().equals(other.getGeneralPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOfficalCount() == null ? other.getOfficalCount() == null : this.getOfficalCount().equals(other.getOfficalCount()))
            && (this.getSuperCount() == null ? other.getSuperCount() == null : this.getSuperCount().equals(other.getSuperCount()))
            && (this.getNodeCount() == null ? other.getNodeCount() == null : this.getNodeCount().equals(other.getNodeCount()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsSpuId() == null) ? 0 : getGoodsSpuId().hashCode());
        result = prime * result + ((getOfficialPrice() == null) ? 0 : getOfficialPrice().hashCode());
        result = prime * result + ((getSuperPrice() == null) ? 0 : getSuperPrice().hashCode());
        result = prime * result + ((getNodePrice() == null) ? 0 : getNodePrice().hashCode());
        result = prime * result + ((getGeneralPrice() == null) ? 0 : getGeneralPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOfficalCount() == null) ? 0 : getOfficalCount().hashCode());
        result = prime * result + ((getSuperCount() == null) ? 0 : getSuperCount().hashCode());
        result = prime * result + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        goodsSpuId("goods_spu_id", "goodsSpuId", "INTEGER", false),
        officialPrice("official_price", "officialPrice", "DECIMAL", false),
        superPrice("super_price", "superPrice", "DECIMAL", false),
        nodePrice("node_price", "nodePrice", "DECIMAL", false),
        generalPrice("general_price", "generalPrice", "DECIMAL", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        officalCount("offical_count", "officalCount", "INTEGER", false),
        superCount("super_count", "superCount", "INTEGER", false),
        nodeCount("node_count", "nodeCount", "INTEGER", false),
        unit("unit", "unit", "VARCHAR", false);

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