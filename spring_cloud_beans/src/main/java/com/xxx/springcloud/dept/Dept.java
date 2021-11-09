package com.xxx.springcloud.dept;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dept {
    private Integer deptno;
    private String dname;
    private String db_source;
}
