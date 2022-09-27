package com.whx.dao;

import com.whx.entity.Emp;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/21 2:19 下午
 * @Version 1.0
 */
public interface EmpDao {
    List<Emp> findAll();

}
