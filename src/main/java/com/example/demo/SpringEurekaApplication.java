package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringEurekaApplication.class).web(true).run(args);
	}
}
