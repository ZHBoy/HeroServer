package com.hao.m.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "zh_user", schema = "h_weapon", catalog = "")
public class ZhUserEntity {
    private int id;
    private String userId;
    private String userName;
    private int armType;
    private String rank;
    private Date bornTime;
    private Date deadTime;
    private Date enlistTime;
    private String description;

    public void setArmType(Integer armType) {
        this.armType = armType;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "arm_type")
    public int getArmType() {
        return armType;
    }

    public void setArmType(int armType) {
        this.armType = armType;
    }

    @Basic
    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "born_time")
    public Date getBornTime() {
        return bornTime;
    }

    public void setBornTime(Date bornTime) {
        this.bornTime = bornTime;
    }

    @Basic
    @Column(name = "dead_time")
    public Date getDeadTime() {
        return deadTime;
    }

    public void setDeadTime(Date deadTime) {
        this.deadTime = deadTime;
    }

    @Basic
    @Column(name = "enlist_time")
    public Date getEnlistTime() {
        return enlistTime;
    }

    public void setEnlistTime(Date enlistTime) {
        this.enlistTime = enlistTime;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZhUserEntity that = (ZhUserEntity) o;

        if (id != that.id) return false;
        if (armType != that.armType) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;
        if (bornTime != null ? !bornTime.equals(that.bornTime) : that.bornTime != null) return false;
        if (deadTime != null ? !deadTime.equals(that.deadTime) : that.deadTime != null) return false;
        if (enlistTime != null ? !enlistTime.equals(that.enlistTime) : that.enlistTime != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + armType;
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (bornTime != null ? bornTime.hashCode() : 0);
        result = 31 * result + (deadTime != null ? deadTime.hashCode() : 0);
        result = 31 * result + (enlistTime != null ? enlistTime.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
