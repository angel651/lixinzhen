package com.lixinzhen.service;

import com.lixinzhen.pojo.UserRoleKey;

/**
 * 描述     UserRoleService
 *
 * @author lixinzhen
 * @create 2021/9/7 17:42
 */
public interface UserRoleService {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);
}
