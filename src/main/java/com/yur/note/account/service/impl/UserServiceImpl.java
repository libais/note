package com.yur.note.account.service.impl;

import com.yur.note.account.dao.UserMapper;
import com.yur.note.account.entity.User;
import com.yur.note.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) throws Exception{
        return userMapper.getUserById(userId);
    }
}
