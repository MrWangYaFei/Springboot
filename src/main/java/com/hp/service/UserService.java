package com.hp.service;

import com.hp.mapper.UserMapper;
import com.hp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id) {

        return userMapper.selectByPrimaryKey(id);
    }

    public void deleteUserById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
