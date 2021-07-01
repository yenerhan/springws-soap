package com.yener.springwssaopv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yener.springwssaopv2"})
public class SpringwsSaopV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringwsSaopV2Application.class, args);
	}

}
