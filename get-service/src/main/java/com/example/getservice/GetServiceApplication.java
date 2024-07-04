package com.example.getservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class GetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetServiceApplication.class, args);
	}

}
