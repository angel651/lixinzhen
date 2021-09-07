package com.lixinzhen.controller;

import com.lixinzhen.pojo.Permission;
import com.lixinzhen.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述     权限管理
 *
 * @author lixinzhen
 * @create 2021/9/7 11:20
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    PermissionService permissionService;
    @GetMapping("/permission")
    @ResponseBody
    public String permission(Permission permission){
        return permissionService.selectByPrimaryKey(permission.getId()).toString();
    }
    @GetMapping("/addPermission")
    @ResponseBody
    public int addPermission(Permission permission){
        int count = 0;
        if (permission!=null){
            return permissionService.insert(permission);
        }
        return count;
    }
    @GetMapping("/delPermission")
    @ResponseBody
    public int delPermission(Permission permission){
        return permissionService.deleteByPrimaryKey(permission.getId());
    }
    @GetMapping("/updatePermission")
    @ResponseBody
    public int updatePermission(Permission permission){
        return permissionService.updateByPrimaryKey(permission);
    }

}
