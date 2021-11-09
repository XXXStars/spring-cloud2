package com.xxx.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.springcloud.dept.Dept;
import com.xxx.springcloud.service.DeptOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deptOne")
public class DeptOneController {
    @Autowired
    DeptOneService deptOneService;

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return deptOneService.findAll();
    }

    @GetMapping("/{deptno}")
    @HystrixCommand(fallbackMethod = "hystrixGetById")
    public Dept getById(@PathVariable("deptno") int deptno){

        Dept byId = deptOneService.getById(deptno);
        if(byId == null){
            throw new RuntimeException("该用户不存在");
        }
        return byId;
    }

    public Dept hystrixGetById(@PathVariable("deptno") int deptno){
        return new Dept()
                .setDeptno(deptno)
                .setDname("deptno=>"+deptno+"没有该数据信息")
                .setDb_source("no this database mysql");

    }
}
