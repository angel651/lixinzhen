package com.lixinzhen.service.impl;

import com.lixinzhen.dao.RoleMapper;
import com.lixinzhen.pojo.Role;
import com.lixinzhen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述     角色业务层
 *
 * @author lixinzhen
 * @create 2021/9/7 16:40
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }
}
