package com.xxx.springcloud.service;

import com.xxx.springcloud.dept.Dept;

import java.util.List;

public interface DeptOneService {
    List<Dept> findAll();

    Dept getById(int deptno);
}
