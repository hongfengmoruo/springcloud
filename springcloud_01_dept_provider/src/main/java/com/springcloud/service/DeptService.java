package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.Dept;

/**
 * @author WM
 *
 */
public interface DeptService {
	/**
	 * 查询满足条件的部门信息（分页功能）
	 * @return 返回java.util.list类型的是咧
	 */
	public List<Dept> selectAll();
	
	/**
	 * 添加部门信息
	 * @param dept
	 * @return 成功返回1，失败返回0
	 *//*
	public Integer insert(Dept dept);
	
	*//**
	 * 删除员工信息
	 * @param deptId
	 * @return	成功返回1，失败返回0
	 *//*
	public Integer delete(Integer deptId);
	
	*//**
	 * 修改部门信息
	 * @param dept 
	 * @return 成功返回1，失败返回0
	 *//*
	public Integer update(Dept dept);*/
	
}
