package com.xxx.springcloud.mapper;

import com.xxx.springcloud.dept.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptTwo {
    @Select("select * from dept")
    List<Dept> findAllTwo();

    @Select("select * from dept where deptno = #{deptno}")
    Dept getByIdTwo(int deptno);
}
