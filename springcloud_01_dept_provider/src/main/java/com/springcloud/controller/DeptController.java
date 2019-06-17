package com.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Dept;
import com.springcloud.service.DeptService;

@RestController	//当前类所有方法的返回值均为json的字符串
@RequestMapping("dept")
public class DeptController {

	@Autowired
	private DeptService deptService;
	@GetMapping(value="/selectAll")
	public List<Dept> selectAll(){
		//获得所有部门信息并返回
		return deptService.selectAll();
		
	}
}
