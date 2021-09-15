package com.lixinzhen.controller;

import com.lixinzhen.pojo.Permission;
import com.lixinzhen.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述     权限管理
 *
 * @author lixinzhen
 * @create 2021/9/7 11:20
 */
@Controller
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    /**
     * 查询权限信息
     * @param permission
     * @return
     */
    @GetMapping("/permission/selectByPrimaryKey")
    @ResponseBody
    public Permission selectByPrimaryKey(Permission permission){
        return permissionService.selectByPrimaryKey(permission.getId());
    }

    /**
     * 添加权限信息
     * @param permission
     * @return
     */
    @PostMapping("/permission/addPermission")
    @ResponseBody
    public int addPermission(Permission permission){
        int count = 0;
        if (permission!=null){
            return permissionService.insert(permission);
        }
        return count;
    }

    /**
     * 删除权限信息
     * @param permission
     * @return
     */
    @PostMapping("/permission/delPermission")
    @ResponseBody
    public int delPermission(Permission permission){
        return permissionService.deleteByPrimaryKey(permission.getId());
    }

    /**
     * 更新权限信息
     * @param permission
     * @return
     */
    @PostMapping("/permission/updatePermission")
    @ResponseBody
    public int updatePermission(Permission permission){
        return permissionService.updateByPrimaryKey(permission);
    }

}
