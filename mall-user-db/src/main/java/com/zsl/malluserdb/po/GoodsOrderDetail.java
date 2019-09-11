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

    private Long totalFreight;

    private Integer presentCoin;

    private Boolean degreeOfSatisfaction;

    private String evaluationContent;

    private String evaluationImageUrl;

    private Boolean anonymity;

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

    public Long getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(Long totalFreight) {
        this.totalFreight = totalFreight;
    }

    public Integer getPresentCoin() {
        return presentCoin;
    }

    public void setPresentCoin(Integer presentCoin) {
        this.presentCoin = presentCoin;
    }

    public Boolean getDegreeOfSatisfaction() {
        return degreeOfSatisfaction;
    }

    public void setDegreeOfSatisfaction(Boolean degreeOfSatisfaction) {
        this.degreeOfSatisfaction = degreeOfSatisfaction;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public String getEvaluationImageUrl() {
        return evaluationImageUrl;
    }

    public void setEvaluationImageUrl(String evaluationImageUrl) {
        this.evaluationImageUrl = evaluationImageUrl == null ? null : evaluationImageUrl.trim();
    }

    public Boolean getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(Boolean anonymity) {
        this.anonymity = anonymity;
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
        sb.append(", presentCoin=").append(presentCoin);
        sb.append(", degreeOfSatisfaction=").append(degreeOfSatisfaction);
        sb.append(", evaluationContent=").append(evaluationContent);
        sb.append(", evaluationImageUrl=").append(evaluationImageUrl);
        sb.append(", anonymity=").append(anonymity);
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
            && (this.getPresentCoin() == null ? other.getPresentCoin() == null : this.getPresentCoin().equals(other.getPresentCoin()))
            && (this.getDegreeOfSatisfaction() == null ? other.getDegreeOfSatisfaction() == null : this.getDegreeOfSatisfaction().equals(other.getDegreeOfSatisfaction()))
            && (this.getEvaluationContent() == null ? other.getEvaluationContent() == null : this.getEvaluationContent().equals(other.getEvaluationContent()))
            && (this.getEvaluationImageUrl() == null ? other.getEvaluationImageUrl() == null : this.getEvaluationImageUrl().equals(other.getEvaluationImageUrl()))
            && (this.getAnonymity() == null ? other.getAnonymity() == null : this.getAnonymity().equals(other.getAnonymity()));
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
        result = prime * result + ((getPresentCoin() == null) ? 0 : getPresentCoin().hashCode());
        result = prime * result + ((getDegreeOfSatisfaction() == null) ? 0 : getDegreeOfSatisfaction().hashCode());
        result = prime * result + ((getEvaluationContent() == null) ? 0 : getEvaluationContent().hashCode());
        result = prime * result + ((getEvaluationImageUrl() == null) ? 0 : getEvaluationImageUrl().hashCode());
        result = prime * result + ((getAnonymity() == null) ? 0 : getAnonymity().hashCode());
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
        presentCoin("present_coin", "presentCoin", "INTEGER", false),
        degreeOfSatisfaction("degree_of_satisfaction", "degreeOfSatisfaction", "BIT", false),
        evaluationContent("evaluation_content", "evaluationContent", "VARCHAR", false),
        evaluationImageUrl("evaluation_image_url", "evaluationImageUrl", "VARCHAR", false),
        anonymity("anonymity", "anonymity", "BIT", false);

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