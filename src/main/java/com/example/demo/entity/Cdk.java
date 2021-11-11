package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Cdk)实体类
 *
 * @author makejava
 * @since 2021-11-08 16:32:35
 */
public class Cdk implements Serializable {
    private static final long serialVersionUID = 702795638929544086L;
    /**
    * 自增主键
    */
    private Object id;
    /**
    * cdk的名字
    */
    private String cdkName;
    /**
    * cdk的发放渠道
    */
    private String cdkChannel;
    /**
    * cdk的有效期开始时间
    */
    private Date beginTime;
    /**
    * cdk的有效期结束时间
    */
    private Date endTime;
    /**
    * cdk的状态。1-作废，0-不作废
    */
    private Object state;
    /**
    * cdk的备注
    */
    private String remake;
    /**
    * cdk的创建时间 默认当前时间
    */
    private Date createTime;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getCdkName() {
        return cdkName;
    }

    public void setCdkName(String cdkName) {
        this.cdkName = cdkName;
    }

    public String getCdkChannel() {
        return cdkChannel;
    }

    public void setCdkChannel(String cdkChannel) {
        this.cdkChannel = cdkChannel;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}