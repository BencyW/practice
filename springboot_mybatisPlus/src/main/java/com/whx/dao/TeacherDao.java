package com.whx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whx.entity.Teacher;
import com.whx.entity.User;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/23 1:45 下午
 * @Version 1.0
 */
public interface TeacherDao extends BaseMapper<Teacher> {
    void insertAll(Teacher teacher);

    List<Teacher> findAllTeacher();

}
