package com.hasnat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hasnat.sbeans.*;
public class DependencyInjection {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hasnat/config/ApplicationConfig.xml");
		TimeNow day = ctx.getBean("dt",TimeNow.class);
		day.getTime();
		ctx.close();
	}
}
