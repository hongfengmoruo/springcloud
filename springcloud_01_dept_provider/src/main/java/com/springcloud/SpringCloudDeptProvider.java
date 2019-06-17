package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.springcloud.dao")
@EnableEurekaClient 	//当前项目启用Eureka的客户端
public class SpringCloudDeptProvider {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDeptProvider.class, args);
	}
}
