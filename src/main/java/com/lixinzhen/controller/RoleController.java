package com.lixinzhen.controller;

import com.lixinzhen.pojo.Permission;
import com.lixinzhen.pojo.Role;
import com.lixinzhen.service.PermissionService;
import com.lixinzhen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述     角色管理
 *
 * @author lixinzhen
 * @create 2021/9/7 11:20
 */
@Controller
public class RoleController {

    @Autowired
    RoleService roleService;

    /**
     * 查询角色信息
     * @param role
     * @return
     */
    @GetMapping("/role/selectByPrimaryKey")
    @ResponseBody
    public Role selectByPrimaryKey(Role role){
        return roleService.selectByPrimaryKey(role.getId());
    }

    /**
     * 查询角色所对应的权限
     * @param id
     * @return
     */
    @GetMapping("/role/selectByRoleIdAndPermission")
    @ResponseBody
    public List<String> selectByRoleIdAndPermission(@RequestParam Integer id){
        return roleService.selectByRoleIdAndPermission(id);
    }
    /**
     * 添加角色信息
     * @param role
     * @return
     */
    @PostMapping("/role/addRole")
    @ResponseBody
    public int addRole(Role role){
        int record = 0;
        if (role != null) {
            record++;
            return roleService.insert(role);
        }
        return record;
    }

    /**
     * 删除角色信息
     * @param role
     * @return
     */
    @PostMapping("/role/delRole")
    @ResponseBody
    public int delRole(Role role){
        return roleService.deleteByPrimaryKey(role.getId());
    }

    /**
     * 更新角色信息
     * @param role
     * @return
     */
    @PostMapping("/role/updateRole")
    @ResponseBody
    public int updateRole(Role role){
        return roleService.updateByPrimaryKeySelective(role);
    }

}
