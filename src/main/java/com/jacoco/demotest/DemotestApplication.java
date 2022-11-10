package com.jacoco.demotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.jacoco.demotest.dao")
public class DemotestApplication {

	@RequestMapping("/")
	String home(){
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemotestApplication.class, args);
	}
}
