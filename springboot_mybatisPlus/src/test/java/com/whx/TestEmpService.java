package com.whx;

import com.whx.entity.Emp;
import com.whx.entity.User;
import com.whx.service.IEmpService;
import com.whx.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/1 3:34 下午
 * @Version 1.0
 */


@SpringBootTest(classes = SpringbootRedisApplication.class)
public class TestEmpService {
    @Autowired
    private IEmpService empService;

    @Test
    public void testMD5(){
        String key = "1175156340:2589033332:com.whx.dao.EmpDao.findAll:0:2147483647:select id,name from t_emp:SqlSessionFactoryBean";
        //利用Spring框架提供的一个MD5工具类
        String s = DigestUtils.md5DigestAsHex(key.getBytes());
        System.out.println(s);
    }

    @Test
    public void testFindAll(){
        List<Emp> all = empService.findAll();
        System.out.println("1:" + all);
        System.out.println("=============");
        List<Emp> all1 = empService.findAll();
        System.out.println("2:" + all1);
    }


}