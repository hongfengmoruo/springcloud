package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Emp;

public interface EmpService {

	/**
	 * 查询满足条件的员工信息（分页功能）
	 * @param emp
	 * @param pageNumber
	 * @return 返回java.util.list类型的是咧
	 */
	public PageInfo<Emp> select(Emp emp,Integer pageNumber);
	
	/**
	 * 添加员工信息
	 * @param emp
	 * @return 成功返回1，失败返回0
	 */
	public Integer insert(Emp emp);
	
	/**
	 * 删除员工信息
	 * @param empId
	 * @return	成功返回1，失败返回0
	 */
	public Integer delete(Integer empId);
	
	/**
	 * 修改员工信息
	 * @param emp 
	 * @return 成功返回1，失败返回0
	 */
	public Integer update(Emp emp);
}
