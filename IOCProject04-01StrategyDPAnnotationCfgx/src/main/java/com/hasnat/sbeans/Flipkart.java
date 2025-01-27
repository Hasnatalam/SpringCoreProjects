package com.hasnat.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	@Autowired
	@Qualifier("bd")
	ICourier courier;

	public Flipkart() {
		super();
	}
	
	public String shoping(String items[], double prices[]) {
		double bill=0.0;
		for(double p :prices) {
			bill+=p;
		}
		int oid = new Random().nextInt(10000000);
		String msg= courier.deliver(oid);
		
		return " "+Arrays.toString(items)+"are shopped having bill amount "+bill+" "+msg;
	}
	
}
