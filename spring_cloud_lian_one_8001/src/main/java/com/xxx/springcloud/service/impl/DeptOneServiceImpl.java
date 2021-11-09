package com.xxx.springcloud.service.impl;

import com.xxx.springcloud.dept.Dept;
import com.xxx.springcloud.mapper.DeptOne;
import com.xxx.springcloud.service.DeptOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptOneServiceImpl implements DeptOneService {

    @Autowired
    DeptOne deptOne;

    @Override
    public List<Dept> findAll() {
        return deptOne.findAll();
    }

    @Override
    public Dept getById(int deptno) {
        return deptOne.getById(deptno);
    }
}
