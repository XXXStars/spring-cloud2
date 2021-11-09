package com.xxx.springcloud.service.impl;

import com.xxx.springcloud.dept.Dept;
import com.xxx.springcloud.mapper.DeptTwo;
import com.xxx.springcloud.service.DeptTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptTwoServiceImpl implements DeptTwoService {

    @Autowired
    DeptTwo deptTwo;

    @Override
    public List<Dept> findAllTwo() {
        return deptTwo.findAllTwo();
    }

    @Override
    public Dept getByIdTwo(int deptno) {
        return deptTwo.getByIdTwo(deptno);
    }
}
