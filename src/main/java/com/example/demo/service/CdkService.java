package com.example.demo.service;

import com.example.demo.entity.Cdk;
import java.util.List;

/**
 * (Cdk)表服务接口
 *
 * @author makejava
 * @since 2021-11-08 16:32:36
 */
public interface CdkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cdk queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Cdk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cdk 实例对象
     * @return 实例对象
     */
    Cdk insert(Cdk cdk);

    /**
     * 修改数据
     *
     * @param cdk 实例对象
     * @return 实例对象
     */
    Cdk update(Cdk cdk);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}