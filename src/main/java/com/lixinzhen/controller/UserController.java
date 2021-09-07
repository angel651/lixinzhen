package com.lixinzhen.controller;

import com.lixinzhen.pojo.User;
import com.lixinzhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述     用户管理
 *
 * @author lixinzhen
 * @create 2021/9/7 11:19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public String user(@RequestParam Integer id) {
        return userService.selectByPrimaryKey(id).toString();
    }

    @GetMapping("/addUser")
    @ResponseBody
    public int addUser(User user) {
        int record = 0;
        if (user != null) {
            record++;
            return userService.insert(user);
        }
        return record;
    }

    @GetMapping("/delUser")
    @ResponseBody
    public int delUser(User user) {
        return userService.deleteByPrimaryKey(user.getId());
    }

    @GetMapping("/updateUser")
    @ResponseBody
    public int updateUser(User user) {
        return userService.updateByPrimaryKey(user);
    }
}
