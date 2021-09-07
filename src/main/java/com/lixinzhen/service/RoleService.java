package com.lixinzhen.service;

import com.lixinzhen.pojo.Role;

/**
 * 描述     RoleService
 *
 * @author lixinzhen
 * @create 2021/9/7 11:24
 */
public interface RoleService {
    Role selectByPrimaryKey(Integer id);
    int insert(Role record);
    int updateByPrimaryKey(Role record);
    int deleteByPrimaryKey(Integer id);
}
