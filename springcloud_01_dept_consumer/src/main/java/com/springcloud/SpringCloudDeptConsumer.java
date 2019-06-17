package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient		//使用Eureka的服务发现
public class SpringCloudDeptConsumer {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDeptConsumer.class, args);
	}
}
