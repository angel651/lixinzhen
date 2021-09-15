package com.lixinzhen.service.impl;

import com.lixinzhen.Exception.ExceptionEnum;
import com.lixinzhen.Exception.UserException;
import com.lixinzhen.dao.UserMapper;
import com.lixinzhen.pojo.User;
import com.lixinzhen.service.UserService;
import com.lixinzhen.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * 描述     用户实现层
 *
 * @author lixinzhen
 * @create 2021/9/7 11:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 注册
     * @param userName
     * @param passWord
     * @throws
     */
    @Override
    public void register(String userName, String passWord) throws UserException {
        //查询用户名是否存在
        User result = userMapper.selectByName(userName);
        if (result!=null){
            throw new UserException(ExceptionEnum.NAME_EXISTED);
        }
        //写到数据库
        User user = new User();
        user.setUsername(userName);
        try {
            user.setPassword(MD5Utils.getMD5Str(passWord));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        int count = userMapper.insertSelective(user);
        if (count==0){
            throw new UserException(ExceptionEnum.INSERT_FAILED);
        }
    }

    /**
     * 登录
     * @param userName
     * @param passWord
     * @return
     * @throws
     */
    @Override
    public User login(String userName, String passWord) throws UserException {
        String md5Password = null;
        try {
            md5Password = MD5Utils.getMD5Str(passWord);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        User user = userMapper.selectLogin(userName, md5Password);
        if (user == null) {
            throw new UserException(ExceptionEnum.WRONG_PASSWORD);
        }
        return user;
    }

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id查询角色和权限信息
     * @param id
     * @return
     */
    @Override
    public List<String> selectByRoleIdAndPermission(Integer id) {
        return userMapper.selectByRoleIdAndPermission(id);
    }

    /**
     * 添加用户信息
     * @param record
     * @return
     */
    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    /**
     * 更新用户信息
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

}
