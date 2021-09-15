package com.lixinzhen.service;

import com.lixinzhen.pojo.Permission;

/**
 * 描述     TODO
 *
 * @author  lixinzhen
 * @create 2021/9/7 11:26
 */
public interface PermissionService {

    Permission selectByPrimaryKey(Integer id);

    int insert(Permission record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Permission record);
}
