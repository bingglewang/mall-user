package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Divisions implements Serializable {
    private Integer divisionId;

    private Integer showType;

    private String name;

    private String subName;

    private Integer area;

    private Integer categoryId;

    private String externalImage;

    private String internalImage;

    private String externalLink;

    private Byte skipType;

    private Byte openReduction;

    private Date startTime;

    private Date endTime;

    private BigDecimal conditionAmount;

    private BigDecimal deductionAmount;

    private String shareIcon;

    private String shareName;

    private static final long serialVersionUID = 1L;

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getExternalImage() {
        return externalImage;
    }

    public void setExternalImage(String externalImage) {
        this.externalImage = externalImage == null ? null : externalImage.trim();
    }

    public String getInternalImage() {
        return internalImage;
    }

    public void setInternalImage(String internalImage) {
        this.internalImage = internalImage == null ? null : internalImage.trim();
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink == null ? null : externalLink.trim();
    }

    public Byte getSkipType() {
        return skipType;
    }

    public void setSkipType(Byte skipType) {
        this.skipType = skipType;
    }

    public Byte getOpenReduction() {
        return openReduction;
    }

    public void setOpenReduction(Byte openReduction) {
        this.openReduction = openReduction;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getConditionAmount() {
        return conditionAmount;
    }

    public void setConditionAmount(BigDecimal conditionAmount) {
        this.conditionAmount = conditionAmount;
    }

    public BigDecimal getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(BigDecimal deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public String getShareIcon() {
        return shareIcon;
    }

    public void setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon == null ? null : shareIcon.trim();
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName == null ? null : shareName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", divisionId=").append(divisionId);
        sb.append(", showType=").append(showType);
        sb.append(", name=").append(name);
        sb.append(", subName=").append(subName);
        sb.append(", area=").append(area);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", externalImage=").append(externalImage);
        sb.append(", internalImage=").append(internalImage);
        sb.append(", externalLink=").append(externalLink);
        sb.append(", skipType=").append(skipType);
        sb.append(", openReduction=").append(openReduction);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", conditionAmount=").append(conditionAmount);
        sb.append(", deductionAmount=").append(deductionAmount);
        sb.append(", shareIcon=").append(shareIcon);
        sb.append(", shareName=").append(shareName);
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
        Divisions other = (Divisions) that;
        return (this.getDivisionId() == null ? other.getDivisionId() == null : this.getDivisionId().equals(other.getDivisionId()))
            && (this.getShowType() == null ? other.getShowType() == null : this.getShowType().equals(other.getShowType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSubName() == null ? other.getSubName() == null : this.getSubName().equals(other.getSubName()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getExternalImage() == null ? other.getExternalImage() == null : this.getExternalImage().equals(other.getExternalImage()))
            && (this.getInternalImage() == null ? other.getInternalImage() == null : this.getInternalImage().equals(other.getInternalImage()))
            && (this.getExternalLink() == null ? other.getExternalLink() == null : this.getExternalLink().equals(other.getExternalLink()))
            && (this.getSkipType() == null ? other.getSkipType() == null : this.getSkipType().equals(other.getSkipType()))
            && (this.getOpenReduction() == null ? other.getOpenReduction() == null : this.getOpenReduction().equals(other.getOpenReduction()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getConditionAmount() == null ? other.getConditionAmount() == null : this.getConditionAmount().equals(other.getConditionAmount()))
            && (this.getDeductionAmount() == null ? other.getDeductionAmount() == null : this.getDeductionAmount().equals(other.getDeductionAmount()))
            && (this.getShareIcon() == null ? other.getShareIcon() == null : this.getShareIcon().equals(other.getShareIcon()))
            && (this.getShareName() == null ? other.getShareName() == null : this.getShareName().equals(other.getShareName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDivisionId() == null) ? 0 : getDivisionId().hashCode());
        result = prime * result + ((getShowType() == null) ? 0 : getShowType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSubName() == null) ? 0 : getSubName().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getExternalImage() == null) ? 0 : getExternalImage().hashCode());
        result = prime * result + ((getInternalImage() == null) ? 0 : getInternalImage().hashCode());
        result = prime * result + ((getExternalLink() == null) ? 0 : getExternalLink().hashCode());
        result = prime * result + ((getSkipType() == null) ? 0 : getSkipType().hashCode());
        result = prime * result + ((getOpenReduction() == null) ? 0 : getOpenReduction().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getConditionAmount() == null) ? 0 : getConditionAmount().hashCode());
        result = prime * result + ((getDeductionAmount() == null) ? 0 : getDeductionAmount().hashCode());
        result = prime * result + ((getShareIcon() == null) ? 0 : getShareIcon().hashCode());
        result = prime * result + ((getShareName() == null) ? 0 : getShareName().hashCode());
        return result;
    }

    public enum Column {
        divisionId("division_id", "divisionId", "INTEGER", false),
        showType("show_type", "showType", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        subName("sub_name", "subName", "VARCHAR", false),
        area("area", "area", "INTEGER", false),
        categoryId("category_id", "categoryId", "INTEGER", false),
        externalImage("external_image", "externalImage", "VARCHAR", false),
        internalImage("internal_image", "internalImage", "VARCHAR", false),
        externalLink("external_link", "externalLink", "VARCHAR", false),
        skipType("skip_type", "skipType", "TINYINT", false),
        openReduction("open_reduction", "openReduction", "TINYINT", false),
        startTime("start_time", "startTime", "TIMESTAMP", false),
        endTime("end_time", "endTime", "TIMESTAMP", false),
        conditionAmount("condition_amount", "conditionAmount", "DECIMAL", false),
        deductionAmount("deduction_amount", "deductionAmount", "DECIMAL", false),
        shareIcon("share_icon", "shareIcon", "VARCHAR", false),
        shareName("share_name", "shareName", "VARCHAR", false);

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