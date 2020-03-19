package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class GoodsOrderDetail implements Serializable {
    private Long id;

    private Long skuId;

    private String orderNo;

    private BigDecimal totalAmount;

    private Integer totalCount;

    private Integer totalPoint;

    private BigDecimal totalFreight;

    private String freightInfo;

    private Integer presentCoin;

    private Boolean returned;

    private Integer surplusValidCount;

    private String goodsName;

    private String goodsPicture;

    private String goodsSpec;

    private BigDecimal presentMoney;

    private BigDecimal fatherMoney;

    private BigDecimal grandfatherMoney;

    private BigDecimal deduction;

    private BigDecimal deductionGoodsAmount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
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

    public BigDecimal getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(BigDecimal totalFreight) {
        this.totalFreight = totalFreight;
    }

    public String getFreightInfo() {
        return freightInfo;
    }

    public void setFreightInfo(String freightInfo) {
        this.freightInfo = freightInfo == null ? null : freightInfo.trim();
    }

    public Integer getPresentCoin() {
        return presentCoin;
    }

    public void setPresentCoin(Integer presentCoin) {
        this.presentCoin = presentCoin;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public Integer getSurplusValidCount() {
        return surplusValidCount;
    }

    public void setSurplusValidCount(Integer surplusValidCount) {
        this.surplusValidCount = surplusValidCount;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsPicture() {
        return goodsPicture;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture == null ? null : goodsPicture.trim();
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec == null ? null : goodsSpec.trim();
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

    public BigDecimal getDeduction() {
        return deduction;
    }

    public void setDeduction(BigDecimal deduction) {
        this.deduction = deduction;
    }

    public BigDecimal getDeductionGoodsAmount() {
        return deductionGoodsAmount;
    }

    public void setDeductionGoodsAmount(BigDecimal deductionGoodsAmount) {
        this.deductionGoodsAmount = deductionGoodsAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", totalPoint=").append(totalPoint);
        sb.append(", totalFreight=").append(totalFreight);
        sb.append(", freightInfo=").append(freightInfo);
        sb.append(", presentCoin=").append(presentCoin);
        sb.append(", returned=").append(returned);
        sb.append(", surplusValidCount=").append(surplusValidCount);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsPicture=").append(goodsPicture);
        sb.append(", goodsSpec=").append(goodsSpec);
        sb.append(", presentMoney=").append(presentMoney);
        sb.append(", fatherMoney=").append(fatherMoney);
        sb.append(", grandfatherMoney=").append(grandfatherMoney);
        sb.append(", deduction=").append(deduction);
        sb.append(", deductionGoodsAmount=").append(deductionGoodsAmount);
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
        GoodsOrderDetail other = (GoodsOrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getTotalPoint() == null ? other.getTotalPoint() == null : this.getTotalPoint().equals(other.getTotalPoint()))
            && (this.getTotalFreight() == null ? other.getTotalFreight() == null : this.getTotalFreight().equals(other.getTotalFreight()))
            && (this.getFreightInfo() == null ? other.getFreightInfo() == null : this.getFreightInfo().equals(other.getFreightInfo()))
            && (this.getPresentCoin() == null ? other.getPresentCoin() == null : this.getPresentCoin().equals(other.getPresentCoin()))
            && (this.getReturned() == null ? other.getReturned() == null : this.getReturned().equals(other.getReturned()))
            && (this.getSurplusValidCount() == null ? other.getSurplusValidCount() == null : this.getSurplusValidCount().equals(other.getSurplusValidCount()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsPicture() == null ? other.getGoodsPicture() == null : this.getGoodsPicture().equals(other.getGoodsPicture()))
            && (this.getGoodsSpec() == null ? other.getGoodsSpec() == null : this.getGoodsSpec().equals(other.getGoodsSpec()))
            && (this.getPresentMoney() == null ? other.getPresentMoney() == null : this.getPresentMoney().equals(other.getPresentMoney()))
            && (this.getFatherMoney() == null ? other.getFatherMoney() == null : this.getFatherMoney().equals(other.getFatherMoney()))
            && (this.getGrandfatherMoney() == null ? other.getGrandfatherMoney() == null : this.getGrandfatherMoney().equals(other.getGrandfatherMoney()))
            && (this.getDeduction() == null ? other.getDeduction() == null : this.getDeduction().equals(other.getDeduction()))
            && (this.getDeductionGoodsAmount() == null ? other.getDeductionGoodsAmount() == null : this.getDeductionGoodsAmount().equals(other.getDeductionGoodsAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getTotalPoint() == null) ? 0 : getTotalPoint().hashCode());
        result = prime * result + ((getTotalFreight() == null) ? 0 : getTotalFreight().hashCode());
        result = prime * result + ((getFreightInfo() == null) ? 0 : getFreightInfo().hashCode());
        result = prime * result + ((getPresentCoin() == null) ? 0 : getPresentCoin().hashCode());
        result = prime * result + ((getReturned() == null) ? 0 : getReturned().hashCode());
        result = prime * result + ((getSurplusValidCount() == null) ? 0 : getSurplusValidCount().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsPicture() == null) ? 0 : getGoodsPicture().hashCode());
        result = prime * result + ((getGoodsSpec() == null) ? 0 : getGoodsSpec().hashCode());
        result = prime * result + ((getPresentMoney() == null) ? 0 : getPresentMoney().hashCode());
        result = prime * result + ((getFatherMoney() == null) ? 0 : getFatherMoney().hashCode());
        result = prime * result + ((getGrandfatherMoney() == null) ? 0 : getGrandfatherMoney().hashCode());
        result = prime * result + ((getDeduction() == null) ? 0 : getDeduction().hashCode());
        result = prime * result + ((getDeductionGoodsAmount() == null) ? 0 : getDeductionGoodsAmount().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "BIGINT", false),
        skuId("sku_id", "skuId", "BIGINT", false),
        orderNo("order_no", "orderNo", "VARCHAR", false),
        totalAmount("total_amount", "totalAmount", "DECIMAL", false),
        totalCount("total_count", "totalCount", "INTEGER", false),
        totalPoint("total_point", "totalPoint", "INTEGER", false),
        totalFreight("total_freight", "totalFreight", "DECIMAL", false),
        freightInfo("freight_info", "freightInfo", "VARCHAR", false),
        presentCoin("present_coin", "presentCoin", "INTEGER", false),
        returned("returned", "returned", "BIT", false),
        surplusValidCount("surplus_valid_count", "surplusValidCount", "INTEGER", false),
        goodsName("goods_name", "goodsName", "VARCHAR", false),
        goodsPicture("goods_picture", "goodsPicture", "VARCHAR", false),
        goodsSpec("goods_spec", "goodsSpec", "VARCHAR", false),
        presentMoney("present_money", "presentMoney", "DECIMAL", false),
        fatherMoney("father_money", "fatherMoney", "DECIMAL", false),
        grandfatherMoney("grandfather_money", "grandfatherMoney", "DECIMAL", false),
        deduction("deduction", "deduction", "DECIMAL", false),
        deductionGoodsAmount("deduction_goods_amount", "deductionGoodsAmount", "DECIMAL", false);

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