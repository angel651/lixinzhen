package com.lixinzhen.service;

import com.lixinzhen.pojo.User;

/**
 * 描述     用户业务层
 *
 * @author lixinzhen
 * @create 2021/9/7 11:21
 */
public interface UserService {
    User selectByPrimaryKey(Integer id);
    int insert(User record);
    int updateByPrimaryKey(User record);
    int deleteByPrimaryKey(Integer id);
}
