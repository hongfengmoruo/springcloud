package com.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.entity.Emp;
import com.springcloud.service.EmpConsumerService;

@RestController
@RequestMapping("emp")
public class EmpConsumerController {
	
	@Autowired
	private EmpConsumerService empConsumerService;
	
	@RequestMapping("/insert")
	//当insert方法发生异常时，调用方法insertError方法，并返回预期的值
	@HystrixCommand(fallbackMethod = "insertError")
	public Integer insert(Emp emp) {
		return this.empConsumerService.insert(emp);
		
	}
	
	
	@RequestMapping(value="/select")
	public List<Emp> select(Emp emp,@RequestParam("pageNumber") Integer pageNumber){
		return this.empConsumerService.select(emp, pageNumber);
		
	}
	
	@RequestMapping("/update")
	public Integer update(Emp emp) {
		return this.empConsumerService.update(emp);
		
	}
	
	@RequestMapping(value="/delete")
	public Integer delete(@PathVariable("id") Integer empId) {
		return this.empConsumerService.delete(empId);	
	}
	

	public Integer insertError(Emp emp) {
		return -1;
		
	}
	
}
