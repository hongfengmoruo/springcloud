package com.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor  //添加无参的构造方法
@Data	//添加getter（），setter（），hashCode(),equals()
public class Dept implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer deptId;
	private String deptName;
	
}
