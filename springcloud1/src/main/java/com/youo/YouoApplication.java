package com.youo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class YouoApplication {

	
	public static void main(String[] args){
		SpringApplication.run(YouoApplication.class, args);
		
	}
}
