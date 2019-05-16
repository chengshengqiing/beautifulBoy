package com.yian.springboot.xiaofei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationXiaoFeiTest {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationXiaoFeiTest.class, args);
	}

}
