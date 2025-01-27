package com.hasnat.sbeans;

import java.time.LocalTime;

public class WishMassageGenerator {
	LocalTime lt; //Has a property
	
	public WishMassageGenerator() {
		System.out.println("WishMassageGenerator.0 param constructor");
	}
	
	
	//Setter method of for setter injection
	public void setLt(LocalTime lt) {
		System.out.println("WishMassageGenerator.setLt()");
		this.lt = lt;
	}
	
	//b.method
	public String generateWishMassage(String user) {
		System.out.println("WishMassageGenerator.generateWishMassage()");
		int hour = lt.getHour();
		if (hour<12)
		return "Good morning "+ user;
		else if(hour<16) return "Good afternoon "+user;
		else if(hour<20) return "Good evening "+user;
		
		else return "Good night "+user;
	}

}
