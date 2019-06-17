package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.dao.DeptMapper;
import com.springcloud.entity.Dept;
import com.springcloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		return deptMapper.selectAll();
	}

}
