package com.springrestapi.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("com.springrestapi.springrestapi.entities")
//@EnableJpaRepositories(basePackages = "com.springrestapi.springrestapi.dao")
//@ComponentScan(basePackages = "com.springrestapi.springrestapi")
public class SpringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);
	}

}
