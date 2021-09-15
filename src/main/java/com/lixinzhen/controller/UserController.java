package com.lixinzhen.controller;

import com.lixinzhen.Exception.ExceptionEnum;
import com.lixinzhen.Exception.UserException;
import com.lixinzhen.commom.ApiRestResponse;
import com.lixinzhen.pojo.User;
import com.lixinzhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述     用户管理
 *
 * @author lixinzhen
 * @create 2021/9/7 11:19
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 注册
     * @param userName
     * @param passWord
     * @return
     * @throws
     */
    @PostMapping("/register")
    @ResponseBody
    public ApiRestResponse register(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord) throws UserException {
        if (StringUtils.isEmpty(userName)){//进行两次校验判空
            return ApiRestResponse.error(ExceptionEnum.NEED_USER_NAME);
        }
        if (StringUtils.isEmpty(passWord)){//进行两次校验判空
            return ApiRestResponse.error(ExceptionEnum.NEED_PASSWORD);
        }
        //密码长度不能少于8位
        if (passWord.length()<8){
            return ApiRestResponse.error(ExceptionEnum.NEED_PASSWORD_TO_SHORT);
        }
        userService.register(userName,passWord);
        return ApiRestResponse.success();
    }

    /**
     * 用户登录
     * @param userName
     * @param passWord
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public ApiRestResponse login(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) throws UserException {
        if (StringUtils.isEmpty(userName)){//进行两次校验判空
            return ApiRestResponse.error(ExceptionEnum.NEED_USER_NAME);
        }
        if (StringUtils.isEmpty(passWord)){//进行两次校验判空
            return ApiRestResponse.error(ExceptionEnum.NEED_PASSWORD);
        }
        User user = userService.login(userName, passWord);
        return ApiRestResponse.success(user);
    }


    /**查询用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/user/selectByPrimaryKey")
    @ResponseBody
    public User selectByPrimaryKey(@RequestParam Integer id) {
        return userService.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id查询角色
     * @param id
     * @return
     */
    @GetMapping("/user/selectByRoleIdAndPermission")
    @ResponseBody
    public List<String> selectByRoleIdAndPermission(@RequestParam Integer id) {
        return userService.selectByRoleIdAndPermission(id);
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @PostMapping("/user/addUser")
    @ResponseBody
    public int addUser(User user) {
        int record = 0;
        if (user != null) {
            record++;
            return userService.insertSelective(user);
        }
        return record;
    }

    /**
     * 删除用户信息
     * @param user
     * @return
     */
    @PostMapping("/user/delUser")
    @ResponseBody
    public int delUser(User user) {
        return userService.deleteByPrimaryKey(user.getId());
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @PostMapping("/user/updateUser")
    @ResponseBody
    public int updateUser(User user) {
        return userService.updateByPrimaryKeySelective(user);
    }
}
