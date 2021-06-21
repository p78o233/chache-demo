package com.example.chachedemo.entity.po;

import java.util.Date;

public class Test {
    private Integer id;
    private String name;
    private int cdNum;
    private Date createTime;
    private float score;

    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cdNum=" + cdNum +
                ", createTime=" + createTime +
                ", score=" + score +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCdNum() {
        return cdNum;
    }

    public void setCdNum(int cdNum) {
        this.cdNum = cdNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Test(Integer id, String name, int cdNum, Date createTime, float score) {
        this.id = id;
        this.name = name;
        this.cdNum = cdNum;
        this.createTime = createTime;
        this.score = score;
    }
}
