package com.whx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author whx
 * @Date 2022/9/1 1:42 下午
 * @Version 1.0
 */
@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/user")
    public String redisTest(){
        stringRedisTemplate.opsForValue().set("age","18");
        System.out.println(stringRedisTemplate.opsForValue().get("age"));
        return "123";
    }
}
