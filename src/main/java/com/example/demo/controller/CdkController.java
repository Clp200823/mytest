package com.example.demo.controller;

import com.example.demo.entity.Cdk;
import com.example.demo.service.CdkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cdk)表控制层
 *
 * @author makejava
 * @since 2021-11-08 16:32:37
 */
@RestController
@RequestMapping("cdk")
@Api("测试")
public class CdkController {
    /**
     * 服务对象
     */
    @Resource
    private CdkService cdkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation(value = "查询所有信息",notes = "查询数据库中某个学生的信息")
    public Cdk selectOne(Object id) {
        return this.cdkService.queryById(id);
    }

}