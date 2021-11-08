package com.example.demo.service;

import com.example.demo.db.wx.entity.Cdk;
public interface CdkService{


    int deleteByPrimaryKey(Integer id);

    int insert(Cdk record);

    int insertSelective(Cdk record);

    Cdk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cdk record);

    int updateByPrimaryKey(Cdk record);

}
