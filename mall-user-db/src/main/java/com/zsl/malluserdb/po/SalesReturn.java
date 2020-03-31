package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class SalesReturn implements Serializable {
    private Integer id;

    private Integer refundOrderId;

    private String shopContact;

    private String shopNumber;

    private String shopSite;

    private String barterName;

    private String barterPhone;

    private String barterSite;

    private String barterSiteDetail;

    private Integer returnsCompanyId;

    private String returnsLogistics;

    private String returnsPicture;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(Integer refundOrderId) {
        this.refundOrderId = refundOrderId;
    }

    public String getShopContact() {
        return shopContact;
    }

    public void setShopContact(String shopContact) {
        this.shopContact = shopContact == null ? null : shopContact.trim();
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber == null ? null : shopNumber.trim();
    }

    public String getShopSite() {
        return shopSite;
    }

    public void setShopSite(String shopSite) {
        this.shopSite = shopSite == null ? null : shopSite.trim();
    }

    public String getBarterName() {
        return barterName;
    }

    public void setBarterName(String barterName) {
        this.barterName = barterName == null ? null : barterName.trim();
    }

    public String getBarterPhone() {
        return barterPhone;
    }

    public void setBarterPhone(String barterPhone) {
        this.barterPhone = barterPhone == null ? null : barterPhone.trim();
    }

    public String getBarterSite() {
        return barterSite;
    }

    public void setBarterSite(String barterSite) {
        this.barterSite = barterSite == null ? null : barterSite.trim();
    }

    public String getBarterSiteDetail() {
        return barterSiteDetail;
    }

    public void setBarterSiteDetail(String barterSiteDetail) {
        this.barterSiteDetail = barterSiteDetail == null ? null : barterSiteDetail.trim();
    }

    public Integer getReturnsCompanyId() {
        return returnsCompanyId;
    }

    public void setReturnsCompanyId(Integer returnsCompanyId) {
        this.returnsCompanyId = returnsCompanyId;
    }

    public String getReturnsLogistics() {
        return returnsLogistics;
    }

    public void setReturnsLogistics(String returnsLogistics) {
        this.returnsLogistics = returnsLogistics == null ? null : returnsLogistics.trim();
    }

    public String getReturnsPicture() {
        return returnsPicture;
    }

    public void setReturnsPicture(String returnsPicture) {
        this.returnsPicture = returnsPicture == null ? null : returnsPicture.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", refundOrderId=").append(refundOrderId);
        sb.append(", shopContact=").append(shopContact);
        sb.append(", shopNumber=").append(shopNumber);
        sb.append(", shopSite=").append(shopSite);
        sb.append(", barterName=").append(barterName);
        sb.append(", barterPhone=").append(barterPhone);
        sb.append(", barterSite=").append(barterSite);
        sb.append(", barterSiteDetail=").append(barterSiteDetail);
        sb.append(", returnsCompanyId=").append(returnsCompanyId);
        sb.append(", returnsLogistics=").append(returnsLogistics);
        sb.append(", returnsPicture=").append(returnsPicture);
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
        SalesReturn other = (SalesReturn) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRefundOrderId() == null ? other.getRefundOrderId() == null : this.getRefundOrderId().equals(other.getRefundOrderId()))
            && (this.getShopContact() == null ? other.getShopContact() == null : this.getShopContact().equals(other.getShopContact()))
            && (this.getShopNumber() == null ? other.getShopNumber() == null : this.getShopNumber().equals(other.getShopNumber()))
            && (this.getShopSite() == null ? other.getShopSite() == null : this.getShopSite().equals(other.getShopSite()))
            && (this.getBarterName() == null ? other.getBarterName() == null : this.getBarterName().equals(other.getBarterName()))
            && (this.getBarterPhone() == null ? other.getBarterPhone() == null : this.getBarterPhone().equals(other.getBarterPhone()))
            && (this.getBarterSite() == null ? other.getBarterSite() == null : this.getBarterSite().equals(other.getBarterSite()))
            && (this.getBarterSiteDetail() == null ? other.getBarterSiteDetail() == null : this.getBarterSiteDetail().equals(other.getBarterSiteDetail()))
            && (this.getReturnsCompanyId() == null ? other.getReturnsCompanyId() == null : this.getReturnsCompanyId().equals(other.getReturnsCompanyId()))
            && (this.getReturnsLogistics() == null ? other.getReturnsLogistics() == null : this.getReturnsLogistics().equals(other.getReturnsLogistics()))
            && (this.getReturnsPicture() == null ? other.getReturnsPicture() == null : this.getReturnsPicture().equals(other.getReturnsPicture()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRefundOrderId() == null) ? 0 : getRefundOrderId().hashCode());
        result = prime * result + ((getShopContact() == null) ? 0 : getShopContact().hashCode());
        result = prime * result + ((getShopNumber() == null) ? 0 : getShopNumber().hashCode());
        result = prime * result + ((getShopSite() == null) ? 0 : getShopSite().hashCode());
        result = prime * result + ((getBarterName() == null) ? 0 : getBarterName().hashCode());
        result = prime * result + ((getBarterPhone() == null) ? 0 : getBarterPhone().hashCode());
        result = prime * result + ((getBarterSite() == null) ? 0 : getBarterSite().hashCode());
        result = prime * result + ((getBarterSiteDetail() == null) ? 0 : getBarterSiteDetail().hashCode());
        result = prime * result + ((getReturnsCompanyId() == null) ? 0 : getReturnsCompanyId().hashCode());
        result = prime * result + ((getReturnsLogistics() == null) ? 0 : getReturnsLogistics().hashCode());
        result = prime * result + ((getReturnsPicture() == null) ? 0 : getReturnsPicture().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        refundOrderId("refund_order_id", "refundOrderId", "INTEGER", false),
        shopContact("shop_contact", "shopContact", "VARCHAR", false),
        shopNumber("shop_number", "shopNumber", "VARCHAR", false),
        shopSite("shop_site", "shopSite", "VARCHAR", false),
        barterName("barter_name", "barterName", "VARCHAR", false),
        barterPhone("barter_phone", "barterPhone", "VARCHAR", false),
        barterSite("barter_site", "barterSite", "VARCHAR", false),
        barterSiteDetail("barter_site_detail", "barterSiteDetail", "VARCHAR", false),
        returnsCompanyId("returns_company_id", "returnsCompanyId", "INTEGER", false),
        returnsLogistics("returns_logistics", "returnsLogistics", "VARCHAR", false),
        returnsPicture("returns_picture", "returnsPicture", "VARCHAR", false);

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