package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class UserWeixin implements Serializable {
    private Integer id;

    private String wxOpenid;

    private String wxSex;

    private String wxProvince;

    private String wxCity;

    private String wxCountry;

    private String wxNickname;

    private String wxHeadimage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getWxSex() {
        return wxSex;
    }

    public void setWxSex(String wxSex) {
        this.wxSex = wxSex == null ? null : wxSex.trim();
    }

    public String getWxProvince() {
        return wxProvince;
    }

    public void setWxProvince(String wxProvince) {
        this.wxProvince = wxProvince == null ? null : wxProvince.trim();
    }

    public String getWxCity() {
        return wxCity;
    }

    public void setWxCity(String wxCity) {
        this.wxCity = wxCity == null ? null : wxCity.trim();
    }

    public String getWxCountry() {
        return wxCountry;
    }

    public void setWxCountry(String wxCountry) {
        this.wxCountry = wxCountry == null ? null : wxCountry.trim();
    }

    public String getWxNickname() {
        return wxNickname;
    }

    public void setWxNickname(String wxNickname) {
        this.wxNickname = wxNickname == null ? null : wxNickname.trim();
    }

    public String getWxHeadimage() {
        return wxHeadimage;
    }

    public void setWxHeadimage(String wxHeadimage) {
        this.wxHeadimage = wxHeadimage == null ? null : wxHeadimage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wxOpenid=").append(wxOpenid);
        sb.append(", wxSex=").append(wxSex);
        sb.append(", wxProvince=").append(wxProvince);
        sb.append(", wxCity=").append(wxCity);
        sb.append(", wxCountry=").append(wxCountry);
        sb.append(", wxNickname=").append(wxNickname);
        sb.append(", wxHeadimage=").append(wxHeadimage);
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
        UserWeixin other = (UserWeixin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWxOpenid() == null ? other.getWxOpenid() == null : this.getWxOpenid().equals(other.getWxOpenid()))
            && (this.getWxSex() == null ? other.getWxSex() == null : this.getWxSex().equals(other.getWxSex()))
            && (this.getWxProvince() == null ? other.getWxProvince() == null : this.getWxProvince().equals(other.getWxProvince()))
            && (this.getWxCity() == null ? other.getWxCity() == null : this.getWxCity().equals(other.getWxCity()))
            && (this.getWxCountry() == null ? other.getWxCountry() == null : this.getWxCountry().equals(other.getWxCountry()))
            && (this.getWxNickname() == null ? other.getWxNickname() == null : this.getWxNickname().equals(other.getWxNickname()))
            && (this.getWxHeadimage() == null ? other.getWxHeadimage() == null : this.getWxHeadimage().equals(other.getWxHeadimage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWxOpenid() == null) ? 0 : getWxOpenid().hashCode());
        result = prime * result + ((getWxSex() == null) ? 0 : getWxSex().hashCode());
        result = prime * result + ((getWxProvince() == null) ? 0 : getWxProvince().hashCode());
        result = prime * result + ((getWxCity() == null) ? 0 : getWxCity().hashCode());
        result = prime * result + ((getWxCountry() == null) ? 0 : getWxCountry().hashCode());
        result = prime * result + ((getWxNickname() == null) ? 0 : getWxNickname().hashCode());
        result = prime * result + ((getWxHeadimage() == null) ? 0 : getWxHeadimage().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        wxOpenid("wx_openid", "wxOpenid", "VARCHAR", false),
        wxSex("wx_sex", "wxSex", "CHAR", false),
        wxProvince("wx_province", "wxProvince", "VARCHAR", false),
        wxCity("wx_city", "wxCity", "VARCHAR", false),
        wxCountry("wx_country", "wxCountry", "VARCHAR", false),
        wxNickname("wx_nickname", "wxNickname", "VARCHAR", false),
        wxHeadimage("wx_headImage", "wxHeadimage", "VARCHAR", false);

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