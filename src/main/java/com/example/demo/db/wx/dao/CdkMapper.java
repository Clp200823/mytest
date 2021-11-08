package com.example.demo.db.wx.dao;

import com.example.demo.db.wx.entity.Cdk;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CdkMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Cdk record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Cdk record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Cdk selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Cdk record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Cdk record);
}