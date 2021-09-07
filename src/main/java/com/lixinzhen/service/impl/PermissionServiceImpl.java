package com.lixinzhen.service.impl;

import com.lixinzhen.dao.PermissionMapper;
import com.lixinzhen.pojo.Permission;
import com.lixinzhen.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述     权限业务层
 *
 * @author lixinzhen
 * @create 2021/9/7 17:14
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public Permission selectByPrimaryKey(Integer id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Permission record) {
        int count = 0;
        if (record!=null){
            count++;
            return permissionMapper.insert(record);
        }
        return count;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return permissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return permissionMapper.updateByPrimaryKey(record);
    }
}
