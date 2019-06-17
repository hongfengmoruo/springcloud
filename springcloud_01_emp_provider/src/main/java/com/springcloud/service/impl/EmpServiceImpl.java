package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.dao.EmpMapper;
import com.springcloud.entity.Emp;
import com.springcloud.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public PageInfo<Emp> select(Emp emp, Integer pageNumber) {
		// 为查询条件empName两端添加%
		emp.setEmpName("%"+emp.getEmpName()+"%");
		//
		PageHelper.startPage(pageNumber, PageUtils.PAGE_ROW_COUNT);
		//
		List<Emp> list = empMapper.selectLike(emp);
		//
		return new PageInfo<>(list);
	}

	@Transactional
	@Override
	public Integer insert(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.insert(emp);
	}

	@Transactional
	@Override
	public Integer delete(Integer empId) {
		// TODO Auto-generated method stub
		return empMapper.deleteByPrimaryKey(empId);
	}

	@Transactional
	@Override
	public Integer update(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.updateByPrimaryKey(emp);
	}

}
