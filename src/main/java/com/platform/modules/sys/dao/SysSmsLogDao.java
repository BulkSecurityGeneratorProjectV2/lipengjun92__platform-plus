/*
 * 项目名称:platform-plus
 * 类名称:SysSmsLogDao.java
 * 包名称:com.platform.modules.sys.dao
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-02-12 09:51:15        李鹏军     初版做成
 *
 * Copyright (c) 2018-2019 微同软件
 */
package com.platform.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.platform.modules.sys.entity.SysSmsLogEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 短信发送日志Dao
 *
 * @author 李鹏军
 * @date 2019-02-12 09:51:15
 */
@Mapper
public interface SysSmsLogDao extends BaseMapper<SysSmsLogEntity> {

    /**
     * 查询所有列表
     *
     * @param params
     * @return
     */
    List<SysSmsLogEntity> queryAll(Map<String, Object> params);

    /**
     * 自定义分页查询
     *
     * @param page
     * @param params
     * @return
     */
    List<SysSmsLogEntity> selectSysSmsLogPage(Pagination page, Map<String, Object> params);
}
