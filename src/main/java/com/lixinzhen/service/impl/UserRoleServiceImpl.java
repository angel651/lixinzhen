package com.lixinzhen.service.impl;

import com.lixinzhen.dao.UserRoleMapper;
import com.lixinzhen.pojo.UserRoleKey;
import com.lixinzhen.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述     角色分配实现层
 *
 * @author lixinzhen
 * @create 2021/9/7 17:47
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleMapper userRoleMapper;
    @Override
    public int deleteByPrimaryKey(UserRoleKey key) {
        return userRoleMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(UserRoleKey record) {
        return userRoleMapper.insert(record);
    }
}
