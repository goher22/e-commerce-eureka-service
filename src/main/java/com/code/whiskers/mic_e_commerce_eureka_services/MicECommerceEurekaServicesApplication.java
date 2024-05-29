package com.code.whiskers.mic_e_commerce_eureka_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicECommerceEurekaServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicECommerceEurekaServicesApplication.class, args);
	}

}
