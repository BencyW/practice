package com.whx.service.impl;

import com.whx.dao.EmpDao;
import com.whx.entity.Emp;
import com.whx.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author whx
 * @Date 2022/9/21 2:23 下午
 * @Version 1.0
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }
}
