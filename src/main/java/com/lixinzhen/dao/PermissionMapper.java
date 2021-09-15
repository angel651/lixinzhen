package com.lixinzhen.dao;

import com.lixinzhen.pojo.Permission;
import com.lixinzhen.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

}