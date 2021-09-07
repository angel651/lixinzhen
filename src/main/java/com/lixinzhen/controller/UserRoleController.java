package com.lixinzhen.controller;

import com.lixinzhen.pojo.UserRoleKey;
import com.lixinzhen.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述     角色分配
 *
 * @author lixinzhen
 * @create 2021/9/7 17:50
 */
@Controller
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;
    @GetMapping("/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(UserRoleKey key){
        return userRoleService.deleteByPrimaryKey(key);
    }
    @GetMapping("/insert")
    @ResponseBody
    public int insert(UserRoleKey record){
        return userRoleService.insert(record);
    }
}
