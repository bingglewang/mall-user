package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GoodsCompany implements Serializable {
    private Long id;

    private String companyName;

    private String companyLogo;

    private String companyHome;

    private Integer sortWeight;

    private String companyDescription;

    private Date createTime;

    private Date mallUpdate;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    public String getCompanyHome() {
        return companyHome;
    }

    public void setCompanyHome(String companyHome) {
        this.companyHome = companyHome == null ? null : companyHome.trim();
    }

    public Integer getSortWeight() {
        return sortWeight;
    }

    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription == null ? null : companyDescription.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getMallUpdate() {
        return mallUpdate;
    }

    public void setMallUpdate(Date mallUpdate) {
        this.mallUpdate = mallUpdate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyLogo=").append(companyLogo);
        sb.append(", companyHome=").append(companyHome);
        sb.append(", sortWeight=").append(sortWeight);
        sb.append(", companyDescription=").append(companyDescription);
        sb.append(", createTime=").append(createTime);
        sb.append(", mallUpdate=").append(mallUpdate);
        sb.append(", status=").append(status);
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
        GoodsCompany other = (GoodsCompany) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyLogo() == null ? other.getCompanyLogo() == null : this.getCompanyLogo().equals(other.getCompanyLogo()))
            && (this.getCompanyHome() == null ? other.getCompanyHome() == null : this.getCompanyHome().equals(other.getCompanyHome()))
            && (this.getSortWeight() == null ? other.getSortWeight() == null : this.getSortWeight().equals(other.getSortWeight()))
            && (this.getCompanyDescription() == null ? other.getCompanyDescription() == null : this.getCompanyDescription().equals(other.getCompanyDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getMallUpdate() == null ? other.getMallUpdate() == null : this.getMallUpdate().equals(other.getMallUpdate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyLogo() == null) ? 0 : getCompanyLogo().hashCode());
        result = prime * result + ((getCompanyHome() == null) ? 0 : getCompanyHome().hashCode());
        result = prime * result + ((getSortWeight() == null) ? 0 : getSortWeight().hashCode());
        result = prime * result + ((getCompanyDescription() == null) ? 0 : getCompanyDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getMallUpdate() == null) ? 0 : getMallUpdate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "BIGINT", false),
        companyName("company_name", "companyName", "VARCHAR", false),
        companyLogo("company_logo", "companyLogo", "VARCHAR", false),
        companyHome("company_home", "companyHome", "VARCHAR", false),
        sortWeight("sort_weight", "sortWeight", "INTEGER", false),
        companyDescription("company_description", "companyDescription", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        mallUpdate("mall_update", "mallUpdate", "TIMESTAMP", false),
        status("status", "status", "BIT", true);

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