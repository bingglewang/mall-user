package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class OrderDetailRate implements Serializable {
    private Integer id;

    private Long orderDetailId;

    private Integer memberId;

    private Byte degreeOfSatisfaction;

    private String evaluationContent;

    private String evaluationImageUrl;

    private Byte anonymity;

    private String sellerReply;

    private String additionalEvaluation;

    private Integer contentUpdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Byte getDegreeOfSatisfaction() {
        return degreeOfSatisfaction;
    }

    public void setDegreeOfSatisfaction(Byte degreeOfSatisfaction) {
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

    public Byte getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(Byte anonymity) {
        this.anonymity = anonymity;
    }

    public String getSellerReply() {
        return sellerReply;
    }

    public void setSellerReply(String sellerReply) {
        this.sellerReply = sellerReply == null ? null : sellerReply.trim();
    }

    public String getAdditionalEvaluation() {
        return additionalEvaluation;
    }

    public void setAdditionalEvaluation(String additionalEvaluation) {
        this.additionalEvaluation = additionalEvaluation == null ? null : additionalEvaluation.trim();
    }

    public Integer getContentUpdate() {
        return contentUpdate;
    }

    public void setContentUpdate(Integer contentUpdate) {
        this.contentUpdate = contentUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderDetailId=").append(orderDetailId);
        sb.append(", memberId=").append(memberId);
        sb.append(", degreeOfSatisfaction=").append(degreeOfSatisfaction);
        sb.append(", evaluationContent=").append(evaluationContent);
        sb.append(", evaluationImageUrl=").append(evaluationImageUrl);
        sb.append(", anonymity=").append(anonymity);
        sb.append(", sellerReply=").append(sellerReply);
        sb.append(", additionalEvaluation=").append(additionalEvaluation);
        sb.append(", contentUpdate=").append(contentUpdate);
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
        OrderDetailRate other = (OrderDetailRate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderDetailId() == null ? other.getOrderDetailId() == null : this.getOrderDetailId().equals(other.getOrderDetailId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getDegreeOfSatisfaction() == null ? other.getDegreeOfSatisfaction() == null : this.getDegreeOfSatisfaction().equals(other.getDegreeOfSatisfaction()))
            && (this.getEvaluationContent() == null ? other.getEvaluationContent() == null : this.getEvaluationContent().equals(other.getEvaluationContent()))
            && (this.getEvaluationImageUrl() == null ? other.getEvaluationImageUrl() == null : this.getEvaluationImageUrl().equals(other.getEvaluationImageUrl()))
            && (this.getAnonymity() == null ? other.getAnonymity() == null : this.getAnonymity().equals(other.getAnonymity()))
            && (this.getSellerReply() == null ? other.getSellerReply() == null : this.getSellerReply().equals(other.getSellerReply()))
            && (this.getAdditionalEvaluation() == null ? other.getAdditionalEvaluation() == null : this.getAdditionalEvaluation().equals(other.getAdditionalEvaluation()))
            && (this.getContentUpdate() == null ? other.getContentUpdate() == null : this.getContentUpdate().equals(other.getContentUpdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderDetailId() == null) ? 0 : getOrderDetailId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getDegreeOfSatisfaction() == null) ? 0 : getDegreeOfSatisfaction().hashCode());
        result = prime * result + ((getEvaluationContent() == null) ? 0 : getEvaluationContent().hashCode());
        result = prime * result + ((getEvaluationImageUrl() == null) ? 0 : getEvaluationImageUrl().hashCode());
        result = prime * result + ((getAnonymity() == null) ? 0 : getAnonymity().hashCode());
        result = prime * result + ((getSellerReply() == null) ? 0 : getSellerReply().hashCode());
        result = prime * result + ((getAdditionalEvaluation() == null) ? 0 : getAdditionalEvaluation().hashCode());
        result = prime * result + ((getContentUpdate() == null) ? 0 : getContentUpdate().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        orderDetailId("order_detail_id", "orderDetailId", "BIGINT", false),
        memberId("member_id", "memberId", "INTEGER", false),
        degreeOfSatisfaction("degree_of_satisfaction", "degreeOfSatisfaction", "TINYINT", false),
        evaluationContent("evaluation_content", "evaluationContent", "VARCHAR", false),
        evaluationImageUrl("evaluation_image_url", "evaluationImageUrl", "VARCHAR", false),
        anonymity("anonymity", "anonymity", "TINYINT", false),
        sellerReply("seller_reply", "sellerReply", "VARCHAR", false),
        additionalEvaluation("additional_evaluation", "additionalEvaluation", "VARCHAR", false),
        contentUpdate("content_update", "contentUpdate", "INTEGER", false);

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