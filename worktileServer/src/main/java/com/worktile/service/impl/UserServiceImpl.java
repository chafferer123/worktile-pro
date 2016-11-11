package com.snowin.service.impl;

import com.snowin.mappers.UserMapper;
import com.snowin.model.User;

import com.snowin.model.UserExample;
import com.snowin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Snowin on 2016/11/5 0005.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByName(String username) {

        return userMapper.selectByPrimaryKey(username);
    }


}
