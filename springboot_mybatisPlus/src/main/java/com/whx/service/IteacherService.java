package com.whx.service;

import com.whx.entity.Teacher;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/23 1:48 下午
 * @Version 1.0
 */
public interface IteacherService {
    List<Teacher> findAll();

   List<Teacher> limitTeacher();

   List<Teacher> findAllTeacher();

   void saveTeacher(Teacher teacher);
   void insertTeacher(Teacher teacher);


}
