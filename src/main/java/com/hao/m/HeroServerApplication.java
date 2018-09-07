package com.hao.m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HeroServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroServerApplication.class, args);
	}
}
