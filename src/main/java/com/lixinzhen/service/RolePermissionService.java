package com.lixinzhen.service;

import com.lixinzhen.pojo.Role;
import com.lixinzhen.pojo.RolePermissionKey;

/**
 * 描述     RolePermissionService
 *
 * @author lixinzhen
 * @create 2021/9/7 17:42
 */
public interface RolePermissionService {
    RolePermissionKey selectByRoleIdAndPermission(Role id);
}
