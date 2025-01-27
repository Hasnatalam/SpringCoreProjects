package com.hasnat.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		IOC_container ic = ctx.getBean("ioc",IOC_container.class);
		ic.printTime();
		ctx.close();
	}
}
