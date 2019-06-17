package com.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.springcloud.entity.Emp;

@FeignClient(value="SPRINGCLOUD-01-EMP-PROVIDER")
public interface EmpConsumerService {

	@PostMapping(value="/emp/insert")
	public Integer insert(@RequestBody Emp emp);
	
	@PostMapping(value="/emp/select")
	public List<Emp> select(@RequestBody Emp emp,@RequestParam("pageNumber") Integer pageNumber);
	
	@PostMapping(value="/emp/delete")
	public Integer delete(@PathVariable("empId") Integer empId);
	
	@PostMapping(value="/emp/update")
	public Integer update(@RequestBody Emp emp);
}
