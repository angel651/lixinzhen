package com.lixinzhen.service;

import com.lixinzhen.pojo.Permission;
import com.lixinzhen.pojo.Role;
import com.lixinzhen.pojo.RolePermissionKey;

import java.util.List;

/**
 * 描述     RoleService
 *
 * @author lixinzhen
 * @create 2021/9/7 11:24
 */
public interface RoleService {

    Role selectByPrimaryKey(Integer id);

//    RolePermissionKey selectByRoleIdAndPermission(Role id);

//    Permission selectByRoleIdAndPermission(Role role);

    List<String> selectByRoleIdAndPermission(Integer id);

    int insert(Role record);

    int updateByPrimaryKeySelective(Role record);

    int deleteByPrimaryKey(Integer id);

}
