package com.whx.service.impl;

import com.whx.dao.UserDao;
import com.whx.entity.User;
import com.whx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/21 10:42 上午
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }


}
