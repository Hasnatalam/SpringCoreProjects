package com.hasnat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hasnat.config.AppConfig;
import com.hasnat.sbeans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acfx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasonFinder finder = acfx.getBean("sf",SeasonFinder.class);
		System.out.println(finder.easonFinder());
		acfx.close();
	}
}
