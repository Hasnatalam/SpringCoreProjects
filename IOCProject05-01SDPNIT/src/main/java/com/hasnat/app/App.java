package com.hasnat.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hasnat.config.AppConfig;
import com.hasnat.sbeans.NareshIT;

public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	NareshIT nit = ctx.getBean("nit",NareshIT.class);
    	String result = nit.takeAdmission("Sohana", 30000);
    	System.out.println(result);
    	ctx.close();
    }
}
