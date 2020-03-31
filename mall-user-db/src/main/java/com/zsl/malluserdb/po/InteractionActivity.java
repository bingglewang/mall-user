package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class InteractionActivity implements Serializable {
    private Integer id;

    private String activityName;

    private String shareTitle;

    private String shareImage;

    private String shareContext;

    private Integer coin;

    private Integer gold;

    private Integer extractTimes;

    private Integer extractLimit;

    private Integer recommendCoin;

    private Integer recommendedCoin;

    private Integer recommendTimes;

    private Integer recommendLimit;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle == null ? null : shareTitle.trim();
    }

    public String getShareImage() {
        return shareImage;
    }

    public void setShareImage(String shareImage) {
        this.shareImage = shareImage == null ? null : shareImage.trim();
    }

    public String getShareContext() {
        return shareContext;
    }

    public void setShareContext(String shareContext) {
        this.shareContext = shareContext == null ? null : shareContext.trim();
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getExtractTimes() {
        return extractTimes;
    }

    public void setExtractTimes(Integer extractTimes) {
        this.extractTimes = extractTimes;
    }

    public Integer getExtractLimit() {
        return extractLimit;
    }

    public void setExtractLimit(Integer extractLimit) {
        this.extractLimit = extractLimit;
    }

    public Integer getRecommendCoin() {
        return recommendCoin;
    }

    public void setRecommendCoin(Integer recommendCoin) {
        this.recommendCoin = recommendCoin;
    }

    public Integer getRecommendedCoin() {
        return recommendedCoin;
    }

    public void setRecommendedCoin(Integer recommendedCoin) {
        this.recommendedCoin = recommendedCoin;
    }

    public Integer getRecommendTimes() {
        return recommendTimes;
    }

    public void setRecommendTimes(Integer recommendTimes) {
        this.recommendTimes = recommendTimes;
    }

    public Integer getRecommendLimit() {
        return recommendLimit;
    }

    public void setRecommendLimit(Integer recommendLimit) {
        this.recommendLimit = recommendLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activityName=").append(activityName);
        sb.append(", shareTitle=").append(shareTitle);
        sb.append(", shareImage=").append(shareImage);
        sb.append(", shareContext=").append(shareContext);
        sb.append(", coin=").append(coin);
        sb.append(", gold=").append(gold);
        sb.append(", extractTimes=").append(extractTimes);
        sb.append(", extractLimit=").append(extractLimit);
        sb.append(", recommendCoin=").append(recommendCoin);
        sb.append(", recommendedCoin=").append(recommendedCoin);
        sb.append(", recommendTimes=").append(recommendTimes);
        sb.append(", recommendLimit=").append(recommendLimit);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
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
        InteractionActivity other = (InteractionActivity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActivityName() == null ? other.getActivityName() == null : this.getActivityName().equals(other.getActivityName()))
            && (this.getShareTitle() == null ? other.getShareTitle() == null : this.getShareTitle().equals(other.getShareTitle()))
            && (this.getShareImage() == null ? other.getShareImage() == null : this.getShareImage().equals(other.getShareImage()))
            && (this.getShareContext() == null ? other.getShareContext() == null : this.getShareContext().equals(other.getShareContext()))
            && (this.getCoin() == null ? other.getCoin() == null : this.getCoin().equals(other.getCoin()))
            && (this.getGold() == null ? other.getGold() == null : this.getGold().equals(other.getGold()))
            && (this.getExtractTimes() == null ? other.getExtractTimes() == null : this.getExtractTimes().equals(other.getExtractTimes()))
            && (this.getExtractLimit() == null ? other.getExtractLimit() == null : this.getExtractLimit().equals(other.getExtractLimit()))
            && (this.getRecommendCoin() == null ? other.getRecommendCoin() == null : this.getRecommendCoin().equals(other.getRecommendCoin()))
            && (this.getRecommendedCoin() == null ? other.getRecommendedCoin() == null : this.getRecommendedCoin().equals(other.getRecommendedCoin()))
            && (this.getRecommendTimes() == null ? other.getRecommendTimes() == null : this.getRecommendTimes().equals(other.getRecommendTimes()))
            && (this.getRecommendLimit() == null ? other.getRecommendLimit() == null : this.getRecommendLimit().equals(other.getRecommendLimit()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActivityName() == null) ? 0 : getActivityName().hashCode());
        result = prime * result + ((getShareTitle() == null) ? 0 : getShareTitle().hashCode());
        result = prime * result + ((getShareImage() == null) ? 0 : getShareImage().hashCode());
        result = prime * result + ((getShareContext() == null) ? 0 : getShareContext().hashCode());
        result = prime * result + ((getCoin() == null) ? 0 : getCoin().hashCode());
        result = prime * result + ((getGold() == null) ? 0 : getGold().hashCode());
        result = prime * result + ((getExtractTimes() == null) ? 0 : getExtractTimes().hashCode());
        result = prime * result + ((getExtractLimit() == null) ? 0 : getExtractLimit().hashCode());
        result = prime * result + ((getRecommendCoin() == null) ? 0 : getRecommendCoin().hashCode());
        result = prime * result + ((getRecommendedCoin() == null) ? 0 : getRecommendedCoin().hashCode());
        result = prime * result + ((getRecommendTimes() == null) ? 0 : getRecommendTimes().hashCode());
        result = prime * result + ((getRecommendLimit() == null) ? 0 : getRecommendLimit().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        activityName("activity_name", "activityName", "VARCHAR", false),
        shareTitle("share_title", "shareTitle", "VARCHAR", false),
        shareImage("share_image", "shareImage", "VARCHAR", false),
        shareContext("share_context", "shareContext", "VARCHAR", false),
        coin("coin", "coin", "INTEGER", false),
        gold("gold", "gold", "INTEGER", false),
        extractTimes("extract_times", "extractTimes", "INTEGER", false),
        extractLimit("extract_limit", "extractLimit", "INTEGER", false),
        recommendCoin("recommend_coin", "recommendCoin", "INTEGER", false),
        recommendedCoin("recommended_coin", "recommendedCoin", "INTEGER", false),
        recommendTimes("recommend_times", "recommendTimes", "INTEGER", false),
        recommendLimit("recommend_limit", "recommendLimit", "INTEGER", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        remark("remark", "remark", "LONGVARCHAR", false);

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