package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.db.wx.dao.CdkMapper;
import com.example.demo.db.wx.entity.Cdk;
import com.example.demo.service.CdkService;
@Service
public class CdkServiceImpl implements CdkService{

    @Resource
    private CdkMapper cdkMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cdkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cdk record) {
        return cdkMapper.insert(record);
    }

    @Override
    public int insertSelective(Cdk record) {
        return cdkMapper.insertSelective(record);
    }

    @Override
    public Cdk selectByPrimaryKey(Integer id) {
        return cdkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cdk record) {
        return cdkMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cdk record) {
        return cdkMapper.updateByPrimaryKey(record);
    }

}
