package com.whx.service;

import com.whx.entity.User;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/21 10:41 上午
 * @Version 1.0
 */

public interface IUserService {
    List<User> findAll();

    User findById(Integer id);

    void delete(Integer id);
}
