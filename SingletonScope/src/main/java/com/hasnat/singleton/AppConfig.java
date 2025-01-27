package com.hasnat.singleton;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages ="com.hasnat.singleton" )
public class AppConfig {
	
	@Scope("singleton")
	
	//@Primary	//Rule 1
	@Bean(name="dt")
	
	public LocalDate localDate() {
		System.out.println("IOC_container.localDate(lt)");
		return LocalDate.now();
	}
	@Bean(name="dt1")
	@Scope("singlweton")
	public LocalDate localDate1() {
		System.out.println("IOC_container.localDate1(lt1)");
		return LocalDate.now();
	}
}
