package com.hasnat.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.hasnat.sbeans")

public class AppConfig {

	public AppConfig() {
		super();
	}
	@Bean(name="ltime")
	public LocalDate createDate() {
		return LocalDate.now();
	}
	

}
