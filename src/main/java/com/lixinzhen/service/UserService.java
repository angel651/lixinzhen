package com.lixinzhen.service;

import com.lixinzhen.Exception.UserException;
import com.lixinzhen.pojo.User;

import java.util.List;

/**
 * 描述     用户业务层
 *
 * @author lixinzhen
 * @create 2021/9/7 11:21
 */
public interface UserService {

    void register(String userName, String passWord) throws UserException;

    User login(String userName, String passWord) throws UserException;

    User selectByPrimaryKey(Integer id);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int deleteByPrimaryKey(Integer id);

    List<String> selectByRoleIdAndPermission(Integer id);

}
