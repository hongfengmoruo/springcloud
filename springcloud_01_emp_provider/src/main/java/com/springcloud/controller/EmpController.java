package com.springcloud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Emp;
import com.springcloud.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmpController {

	@Autowired
	private EmpService empService;
	
	/**
	 * 添加员工
	 * @param emp 新的员工信息
	 * @return 成功返回1，失败返回0
	 */
	@PostMapping(value="/insert")
	public Integer insert(@RequestBody Emp emp){
		return empService.insert(emp);
	}
	
	
	/**
	 * 查询满足条件的员工信息（分页功能）
	 * @param emp
	 * @param pageNumber
	 * @return
	 */
	@PostMapping(value="/select")
	public List<Emp> select(@RequestBody Emp emp,@RequestParam("pageNumber") Integer pageNumber){
		
		return empService.select(emp, pageNumber).getList();
		
	}
	
	/**
	 * 删除指定编号的员工信息
	 * @param empId 员工编号
	 * @return 成功返回1，失败返回0
	 */
	
	@PostMapping(value="/delete")
	public Integer delete(@PathVariable("empId") Integer empId){
		return empService.delete(empId);
	}
	
	/**
	 * @param emp
	 * @return
	 */
	@PostMapping(value="/update")
	public Integer update(@RequestBody Emp emp){
		return empService.update(emp);
		
	}
	
}
