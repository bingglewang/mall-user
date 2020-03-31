package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class SuperiorBanner implements Serializable {
    private Integer id;

    private Integer goodsSpuId;

    private String imgBanner;

    private String imgDetail;

    private String imgPoster;

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

    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner == null ? null : imgBanner.trim();
    }

    public String getImgDetail() {
        return imgDetail;
    }

    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail == null ? null : imgDetail.trim();
    }

    public String getImgPoster() {
        return imgPoster;
    }

    public void setImgPoster(String imgPoster) {
        this.imgPoster = imgPoster == null ? null : imgPoster.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsSpuId=").append(goodsSpuId);
        sb.append(", imgBanner=").append(imgBanner);
        sb.append(", imgDetail=").append(imgDetail);
        sb.append(", imgPoster=").append(imgPoster);
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
        SuperiorBanner other = (SuperiorBanner) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsSpuId() == null ? other.getGoodsSpuId() == null : this.getGoodsSpuId().equals(other.getGoodsSpuId()))
            && (this.getImgBanner() == null ? other.getImgBanner() == null : this.getImgBanner().equals(other.getImgBanner()))
            && (this.getImgDetail() == null ? other.getImgDetail() == null : this.getImgDetail().equals(other.getImgDetail()))
            && (this.getImgPoster() == null ? other.getImgPoster() == null : this.getImgPoster().equals(other.getImgPoster()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsSpuId() == null) ? 0 : getGoodsSpuId().hashCode());
        result = prime * result + ((getImgBanner() == null) ? 0 : getImgBanner().hashCode());
        result = prime * result + ((getImgDetail() == null) ? 0 : getImgDetail().hashCode());
        result = prime * result + ((getImgPoster() == null) ? 0 : getImgPoster().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        goodsSpuId("goods_spu_id", "goodsSpuId", "INTEGER", false),
        imgBanner("img_banner", "imgBanner", "VARCHAR", false),
        imgDetail("img_detail", "imgDetail", "VARCHAR", false),
        imgPoster("img_poster", "imgPoster", "VARCHAR", false);

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