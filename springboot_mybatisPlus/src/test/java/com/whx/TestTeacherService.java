package com.whx;

import com.whx.entity.Teacher;
import com.whx.service.IteacherService;
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
public class TestTeacherService {
    @Autowired
    private IteacherService teacherService;

    @Test
    public void testFindAll(){
        List<Teacher> all = teacherService.findAll();
        System.out.println("1:" + all);


    }

    @Test
    public  void testLimitTeacher(){
        List<Teacher> teachers = teacherService.limitTeacher();
        System.out.println(teachers);
    }

}