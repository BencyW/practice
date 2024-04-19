package com.whx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.whx.dao.TeacherDao;
import com.whx.entity.Teacher;
import com.whx.service.IteacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/23 1:49 下午
 * @Version 1.0
 */
@Service
public class TeacherServiceImpl implements IteacherService {
    @Autowired
    private TeacherDao teacherDao;


    @Override
    public List<Teacher> findAll() {
        return teacherDao.selectList(null);
    }

    @Override
    public List<Teacher> limitTeacher(){
        Page<Teacher> teacherPage = teacherDao.selectPage(new Page<>(1, 3),null);
        return  teacherPage.getRecords();
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return teacherDao.findAllTeacher();
    }

    @Override
    public void saveTeacher(Teacher teacher){
        teacherDao.insert(teacher);
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        teacherDao.insertAll(teacher);
    }


}
