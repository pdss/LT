package com.st.lt.service.impl;

import com.st.lt.entity.User;
import com.st.lt.mapper.UserMapper;
import com.st.lt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-23 00:21
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getUsers();
    }
}
