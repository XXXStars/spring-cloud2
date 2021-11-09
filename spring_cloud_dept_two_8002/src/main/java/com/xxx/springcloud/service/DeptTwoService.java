package com.xxx.springcloud.service;

import com.xxx.springcloud.dept.Dept;

import java.util.List;

public interface DeptTwoService {
    List<Dept> findAllTwo();

    Dept getByIdTwo(int deptno);
}
