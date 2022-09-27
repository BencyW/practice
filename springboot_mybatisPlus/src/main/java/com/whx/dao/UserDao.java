package com.whx.dao;

import com.whx.entity.User;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/21 10:25 上午
 * @Version 1.0
 */
public interface UserDao {
    List<User> findAll();

    User findById(Integer id);

    void delete(Integer id);

}
