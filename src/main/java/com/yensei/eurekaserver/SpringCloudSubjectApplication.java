package com.yensei.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSubjectApplication.class, args);
	}

}
