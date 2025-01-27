package com.hasnat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hasnat.sbeans.*;
public class TimeTest {
    public static void main(String[] args) {

    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hasnat/config/XmlAppConfig.xml");
    	PrintTime pt = ctx.getBean("pt",PrintTime.class);
    	pt.printTime();
    	ctx.close();
    }
}
