package com.example.demo.service.impl;

import com.example.demo.entity.Cdk;
import com.example.demo.dao.CdkDao;
import com.example.demo.service.CdkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cdk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-08 16:32:37
 */
@Service("cdkService")
public class CdkServiceImpl implements CdkService {
    @Resource
    private CdkDao cdkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Cdk queryById(Object id) {
        return this.cdkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Cdk> queryAllByLimit(int offset, int limit) {
        return this.cdkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cdk 实例对象
     * @return 实例对象
     */
    @Override
    public Cdk insert(Cdk cdk) {
        this.cdkDao.insert(cdk);
        return cdk;
    }

    /**
     * 修改数据
     *
     * @param cdk 实例对象
     * @return 实例对象
     */
    @Override
    public Cdk update(Cdk cdk) {
        this.cdkDao.update(cdk);
        return this.queryById(cdk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.cdkDao.deleteById(id) > 0;
    }
}