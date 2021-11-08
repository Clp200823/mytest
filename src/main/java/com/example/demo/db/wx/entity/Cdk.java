package com.example.demo.db.wx.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cdk implements Serializable {
    /**
    * 自增主键
    */
    private Integer id;

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
    private Byte state;

    /**
    * cdk的备注
    */
    private String remake;

    /**
    * cdk的创建时间 默认当前时间
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}