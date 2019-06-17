package com.springcloud.dao;

import com.springcloud.entity.Dept;
import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Dept record);

    Dept selectByPrimaryKey(Integer deptId);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);
}