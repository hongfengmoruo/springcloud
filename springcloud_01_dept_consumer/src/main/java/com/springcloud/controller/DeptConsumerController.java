package com.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.entity.Dept;

@RestController
@RequestMapping("dept")
public class DeptConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static final String URL_PREFIX="http://SPRINGCLOUD-01-DEPT-PROVIDER/dept";	//ctrl+shift+x 将小写换成大写
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/selectAll")
	public List<Dept> selectAll() {
		//在方法中发出http的请求，访问部门服务提供者的方法，获得所有部门的信息
		return this.restTemplate.getForObject(URL_PREFIX + "/selectAll", List.class);
	}
}
