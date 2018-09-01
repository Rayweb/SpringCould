package com.rayweb.disoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DisoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisoveryServerApplication.class, args);
	}
}
