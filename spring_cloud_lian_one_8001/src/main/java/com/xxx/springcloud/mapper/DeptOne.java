package com.xxx.springcloud.mapper;

import com.xxx.springcloud.dept.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptOne {
    @Select("select * from dept")
    List<Dept> findAll();

    @Select("select * from dept where deptno = #{deptno}")
    Dept getById(int deptno);
}
