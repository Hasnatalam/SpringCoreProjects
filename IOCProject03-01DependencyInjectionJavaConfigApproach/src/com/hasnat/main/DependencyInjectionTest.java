package com.hasnat.main;
import com.hasnat.config.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hasnat.sbeans.WishMassageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//IOC container creation
		AnnotationConfigApplicationContext actx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//getting target bean class obj ref
		WishMassageGenerator generator = (WishMassageGenerator) actx.getBean("wmg");
		
		//calling  wish message generator (bussiness) method
		String msg = generator.generateWishMassage("Scott");
		
		//printig message
		System.out.println(msg);
		//closing ioc ref
		actx.close();
	}
}
