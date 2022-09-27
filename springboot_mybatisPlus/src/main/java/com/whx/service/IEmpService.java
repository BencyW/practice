package com.whx.service;

import com.whx.entity.Emp;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/21 2:22 下午
 * @Version 1.0
 */
public interface IEmpService {
    List<Emp> findAll();
}
