package com.whx;

import com.whx.entity.User;
import com.whx.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/1 3:34 下午
 * @Version 1.0
 */


@SpringBootTest(classes = SpringbootRedisApplication.class)
public class TestUserService {
    @Autowired
    private IUserService UserService;

    @Test
    public void testDelete(){
        UserService.delete(2);
    }

    @Test
    public void testFindById(){
        System.out.println(UserService.findById(1));
    }

    @Test
    public void testFindAll(){
        List<User> all = UserService.findAll();
        System.out.println("1:" + all);
        System.out.println("=============");
        List<User> all1 = UserService.findAll();
        System.out.println("2:" + all1);
    }


}