package com.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Emp implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer empId;
	private String empName;
	private Integer empSex;
	private Double empSalary;
	private Integer deptId;
	private Dept dept;

}
