package com.xxx.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.springcloud.dept.Dept;
import com.xxx.springcloud.service.DeptTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deptOne")
public class DeptTwoController {

    @Autowired
    DeptTwoService deptTwoService;

    @GetMapping("/findAll")
    public List<Dept> findAllTwo(){
        return deptTwoService.findAllTwo();
    }

    @GetMapping("/{deptno}")
    @HystrixCommand(fallbackMethod = "hystrixGetByIdTwo")
    public Dept getByIdTwo(@PathVariable("deptno") int deptno){
        Dept byIdTwo = deptTwoService.getByIdTwo(deptno);
        if(byIdTwo == null){
            throw new RuntimeException("该用户不存在");
        }
        return byIdTwo;
    }

    public Dept hystrixGetByIdTwo(@PathVariable("deptno") int deptno){
        return new Dept()
                .setDeptno(deptno)
                .setDname("deptno=>" + deptno + "没有该数据信息")
                .setDb_source("no this database mysql");
    }

}
