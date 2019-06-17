package com.springcloud.dao;

import com.springcloud.entity.Emp;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Emp record);

    Emp selectByPrimaryKey(Integer empId);

    List<Emp> selectAll();

    int updateByPrimaryKey(Emp record);
    
    /**
     * 查询满足条件的员工信息
     * @param emp 查询信息
     * @return 返回实例
     */
    public List<Emp> selectLike(Emp emp);
}