package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ItemFreightTemplate implements Serializable {
    private Integer freightTemplateId;

    private String templateName;

    private Integer merchantId;

    private Integer freeShipping;

    private Integer rule;

    private Integer defaultNum;

    private BigDecimal defaultFreight;

    private Integer defaultContinue;

    private BigDecimal defaultContinueFreight;

    private Integer firstNum;

    private BigDecimal firstFreight;

    private Integer continueNum;

    private BigDecimal continueFreight;

    private Integer freeCondition;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(Integer freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Integer getRule() {
        return rule;
    }

    public void setRule(Integer rule) {
        this.rule = rule;
    }

    public Integer getDefaultNum() {
        return defaultNum;
    }

    public void setDefaultNum(Integer defaultNum) {
        this.defaultNum = defaultNum;
    }

    public BigDecimal getDefaultFreight() {
        return defaultFreight;
    }

    public void setDefaultFreight(BigDecimal defaultFreight) {
        this.defaultFreight = defaultFreight;
    }

    public Integer getDefaultContinue() {
        return defaultContinue;
    }

    public void setDefaultContinue(Integer defaultContinue) {
        this.defaultContinue = defaultContinue;
    }

    public BigDecimal getDefaultContinueFreight() {
        return defaultContinueFreight;
    }

    public void setDefaultContinueFreight(BigDecimal defaultContinueFreight) {
        this.defaultContinueFreight = defaultContinueFreight;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public BigDecimal getFirstFreight() {
        return firstFreight;
    }

    public void setFirstFreight(BigDecimal firstFreight) {
        this.firstFreight = firstFreight;
    }

    public Integer getContinueNum() {
        return continueNum;
    }

    public void setContinueNum(Integer continueNum) {
        this.continueNum = continueNum;
    }

    public BigDecimal getContinueFreight() {
        return continueFreight;
    }

    public void setContinueFreight(BigDecimal continueFreight) {
        this.continueFreight = continueFreight;
    }

    public Integer getFreeCondition() {
        return freeCondition;
    }

    public void setFreeCondition(Integer freeCondition) {
        this.freeCondition = freeCondition;
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
        sb.append(", freightTemplateId=").append(freightTemplateId);
        sb.append(", templateName=").append(templateName);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", freeShipping=").append(freeShipping);
        sb.append(", rule=").append(rule);
        sb.append(", defaultNum=").append(defaultNum);
        sb.append(", defaultFreight=").append(defaultFreight);
        sb.append(", defaultContinue=").append(defaultContinue);
        sb.append(", defaultContinueFreight=").append(defaultContinueFreight);
        sb.append(", firstNum=").append(firstNum);
        sb.append(", firstFreight=").append(firstFreight);
        sb.append(", continueNum=").append(continueNum);
        sb.append(", continueFreight=").append(continueFreight);
        sb.append(", freeCondition=").append(freeCondition);
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
        ItemFreightTemplate other = (ItemFreightTemplate) that;
        return (this.getFreightTemplateId() == null ? other.getFreightTemplateId() == null : this.getFreightTemplateId().equals(other.getFreightTemplateId()))
            && (this.getTemplateName() == null ? other.getTemplateName() == null : this.getTemplateName().equals(other.getTemplateName()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getFreeShipping() == null ? other.getFreeShipping() == null : this.getFreeShipping().equals(other.getFreeShipping()))
            && (this.getRule() == null ? other.getRule() == null : this.getRule().equals(other.getRule()))
            && (this.getDefaultNum() == null ? other.getDefaultNum() == null : this.getDefaultNum().equals(other.getDefaultNum()))
            && (this.getDefaultFreight() == null ? other.getDefaultFreight() == null : this.getDefaultFreight().equals(other.getDefaultFreight()))
            && (this.getDefaultContinue() == null ? other.getDefaultContinue() == null : this.getDefaultContinue().equals(other.getDefaultContinue()))
            && (this.getDefaultContinueFreight() == null ? other.getDefaultContinueFreight() == null : this.getDefaultContinueFreight().equals(other.getDefaultContinueFreight()))
            && (this.getFirstNum() == null ? other.getFirstNum() == null : this.getFirstNum().equals(other.getFirstNum()))
            && (this.getFirstFreight() == null ? other.getFirstFreight() == null : this.getFirstFreight().equals(other.getFirstFreight()))
            && (this.getContinueNum() == null ? other.getContinueNum() == null : this.getContinueNum().equals(other.getContinueNum()))
            && (this.getContinueFreight() == null ? other.getContinueFreight() == null : this.getContinueFreight().equals(other.getContinueFreight()))
            && (this.getFreeCondition() == null ? other.getFreeCondition() == null : this.getFreeCondition().equals(other.getFreeCondition()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFreightTemplateId() == null) ? 0 : getFreightTemplateId().hashCode());
        result = prime * result + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getFreeShipping() == null) ? 0 : getFreeShipping().hashCode());
        result = prime * result + ((getRule() == null) ? 0 : getRule().hashCode());
        result = prime * result + ((getDefaultNum() == null) ? 0 : getDefaultNum().hashCode());
        result = prime * result + ((getDefaultFreight() == null) ? 0 : getDefaultFreight().hashCode());
        result = prime * result + ((getDefaultContinue() == null) ? 0 : getDefaultContinue().hashCode());
        result = prime * result + ((getDefaultContinueFreight() == null) ? 0 : getDefaultContinueFreight().hashCode());
        result = prime * result + ((getFirstNum() == null) ? 0 : getFirstNum().hashCode());
        result = prime * result + ((getFirstFreight() == null) ? 0 : getFirstFreight().hashCode());
        result = prime * result + ((getContinueNum() == null) ? 0 : getContinueNum().hashCode());
        result = prime * result + ((getContinueFreight() == null) ? 0 : getContinueFreight().hashCode());
        result = prime * result + ((getFreeCondition() == null) ? 0 : getFreeCondition().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    public enum Column {
        freightTemplateId("freight_template_id", "freightTemplateId", "INTEGER", false),
        templateName("template_name", "templateName", "VARCHAR", false),
        merchantId("merchant_id", "merchantId", "INTEGER", false),
        freeShipping("free_shipping", "freeShipping", "INTEGER", false),
        rule("rule", "rule", "INTEGER", true),
        defaultNum("default_num", "defaultNum", "INTEGER", false),
        defaultFreight("default_freight", "defaultFreight", "DECIMAL", false),
        defaultContinue("default_continue", "defaultContinue", "INTEGER", false),
        defaultContinueFreight("default_continue_freight", "defaultContinueFreight", "DECIMAL", false),
        firstNum("first_num", "firstNum", "INTEGER", false),
        firstFreight("first_freight", "firstFreight", "DECIMAL", false),
        continueNum("continue_num", "continueNum", "INTEGER", false),
        continueFreight("continue_freight", "continueFreight", "DECIMAL", false),
        freeCondition("free_condition", "freeCondition", "INTEGER", false),
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