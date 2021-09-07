package com.lixinzhen.controller;

import com.lixinzhen.pojo.Role;
import com.lixinzhen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述     角色管理
 *
 * @author lixinzhen
 * @create 2021/9/7 11:20
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/role")
    @ResponseBody
    public String role(Role role){
        return roleService.selectByPrimaryKey(role.getId()).toString();
    }
    @GetMapping("/addRole")
    @ResponseBody
    public int addRole(Role role){
        int record = 0;
        if (role != null) {
            record++;
            return roleService.insert(role);
        }
        return record;
    }
    @GetMapping("/delRole")
    @ResponseBody
    public int delRole(Role role){
        return roleService.deleteByPrimaryKey(role.getId());
    }
    @GetMapping("/updateRole")
    @ResponseBody
    public int updateRole(Role role){
        return roleService.updateByPrimaryKey(role);
    }


}
