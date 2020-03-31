package com.zsl.malluserdb.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class InteractionActivityPrize implements Serializable {
    private Integer id;

    private Integer instanceId;

    private Integer prizeDicId;

    private Integer prizeTotalNum;

    private Integer prizeNum;

    private Integer residueNum;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getPrizeDicId() {
        return prizeDicId;
    }

    public void setPrizeDicId(Integer prizeDicId) {
        this.prizeDicId = prizeDicId;
    }

    public Integer getPrizeTotalNum() {
        return prizeTotalNum;
    }

    public void setPrizeTotalNum(Integer prizeTotalNum) {
        this.prizeTotalNum = prizeTotalNum;
    }

    public Integer getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
    }

    public Integer getResidueNum() {
        return residueNum;
    }

    public void setResidueNum(Integer residueNum) {
        this.residueNum = residueNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", instanceId=").append(instanceId);
        sb.append(", prizeDicId=").append(prizeDicId);
        sb.append(", prizeTotalNum=").append(prizeTotalNum);
        sb.append(", prizeNum=").append(prizeNum);
        sb.append(", residueNum=").append(residueNum);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
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
        InteractionActivityPrize other = (InteractionActivityPrize) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInstanceId() == null ? other.getInstanceId() == null : this.getInstanceId().equals(other.getInstanceId()))
            && (this.getPrizeDicId() == null ? other.getPrizeDicId() == null : this.getPrizeDicId().equals(other.getPrizeDicId()))
            && (this.getPrizeTotalNum() == null ? other.getPrizeTotalNum() == null : this.getPrizeTotalNum().equals(other.getPrizeTotalNum()))
            && (this.getPrizeNum() == null ? other.getPrizeNum() == null : this.getPrizeNum().equals(other.getPrizeNum()))
            && (this.getResidueNum() == null ? other.getResidueNum() == null : this.getResidueNum().equals(other.getResidueNum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        result = prime * result + ((getPrizeDicId() == null) ? 0 : getPrizeDicId().hashCode());
        result = prime * result + ((getPrizeTotalNum() == null) ? 0 : getPrizeTotalNum().hashCode());
        result = prime * result + ((getPrizeNum() == null) ? 0 : getPrizeNum().hashCode());
        result = prime * result + ((getResidueNum() == null) ? 0 : getResidueNum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        instanceId("instance_id", "instanceId", "INTEGER", false),
        prizeDicId("prize_dic_id", "prizeDicId", "INTEGER", false),
        prizeTotalNum("prize_total_num", "prizeTotalNum", "INTEGER", false),
        prizeNum("prize_num", "prizeNum", "INTEGER", false),
        residueNum("residue_num", "residueNum", "INTEGER", false),
        status("status", "status", "INTEGER", true),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

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