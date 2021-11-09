package com.xxx.springcloud.DeptController;

import com.xxx.springcloud.dept.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    RestTemplate restTemplate;

    private static final String URL = "http://SPRING-CLOUD-LIAN";

    @GetMapping("/consumer/findAll")
    public List<Dept> findAll(){
        String url = URL + "/deptOne/findAll";
        return restTemplate.getForObject(url,List.class);
    }

    @GetMapping("/consumer/{deptno}")
    public Dept getById(@PathVariable("deptno") int deptno){
        String url = URL + "/deptOne/" + deptno;
        return restTemplate.getForObject(url,Dept.class);
    }

}
