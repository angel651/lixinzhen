package com.lixinzhen.service.impl;

import com.lixinzhen.dao.PermissionMapper;
import com.lixinzhen.dao.RoleMapper;
import com.lixinzhen.pojo.Permission;
import com.lixinzhen.pojo.Role;
import com.lixinzhen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    PermissionMapper permissionMapper;

    /**
     * 查询角色信息
     * @param id
     * @return
     */
    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询角色对应的权限
     * @param
     * @return
     */
    @Override
    public List<String> selectByRoleIdAndPermission(Integer id) {
        return roleMapper.selectByRoleIdAndPermission(id);
    }

    /**
     * 添加角色信息
     * @param record
     * @return
     */
    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    /**
     * 更新角色信息
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 删除角色信息
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

}
