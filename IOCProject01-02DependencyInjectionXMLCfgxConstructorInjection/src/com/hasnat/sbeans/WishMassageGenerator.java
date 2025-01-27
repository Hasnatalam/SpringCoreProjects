package com.hasnat.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMassageGenerator {
	LocalTime lt; // Has a property
	LocalDate ld; // Has a property

	public WishMassageGenerator() {
		System.out.println("WishMassageGenerator.0 param constructor");
	}

	public WishMassageGenerator(LocalTime lt) {
		super();
		System.out.println("WishMassageGenerator.WishMassageGenerator() parametraized constructor");
		this.lt = lt;
	}

	public WishMassageGenerator(LocalTime lt, LocalDate ld) {
		super();
		System.out.println("WishMassageGenerator.WishMassageGenerator() parametraized constructor 2");
		this.lt = lt;
		this.ld = ld;
	}

	// b.method
	public String generateWishMassage(String user) {
		System.out.println("WishMassageGenerator.generateWishMassage()");
		int hour = lt.getHour();
		
		if (hour < 12)
			return "Good morning "+ld +" "+ user;
		else if (hour < 16)
			return "Good afternoon "+ld +" "+ user;
		else if (hour < 20)
			return "Good evening " +ld+" "+ user;

		else
			return "Good night "+ld +" "+ user;
	}

}
