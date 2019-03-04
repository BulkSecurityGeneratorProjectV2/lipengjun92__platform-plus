/*
 * 项目名称:platform-plus
 * 类名称:SysMenuDao.java
 * 包名称:com.platform.modules.sys.dao
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    李鹏军      初版完成
 *
 * Copyright (c) 2019-2019 微同软件
 */
package com.platform.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.platform.modules.sys.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单管理
 *
 * @author 李鹏军
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

    /**
     * 根据父菜单，查询子菜单
     *
     * @param parentId
     * @return
     */
    List<SysMenuEntity> queryListParentId(String parentId);

    /**
     * 获取不包含按钮的菜单列表
     *
     * @return
     */
    List<SysMenuEntity> queryNotButtonList();

    /**
     * 查询所有菜单
     *
     * @return
     */
    List<SysMenuEntity> queryList();

    /**
     * 查询用户的权限列表
     *
     * @param parentId
     * @return
     */
    String queryMaxIdByParentId(String parentId);
}
