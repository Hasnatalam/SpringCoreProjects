package com.hasnat.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hasnat.config.AppConfig;
import com.hasnat.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		String resultMsg = fpkt.shoping(new String[] { "shirt", "trouser" }, new double[] { 3000.0, 6000.0 });
		System.out.println(resultMsg);
		ctx.close();
		}
	}

