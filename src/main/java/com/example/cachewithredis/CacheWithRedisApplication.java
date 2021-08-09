package com.example.cachewithredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheWithRedisApplication.class, args);
	}

}
