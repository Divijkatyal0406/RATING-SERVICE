package com.sb.rating_s.rating_s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingSApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingSApplication.class, args);
	}

}
