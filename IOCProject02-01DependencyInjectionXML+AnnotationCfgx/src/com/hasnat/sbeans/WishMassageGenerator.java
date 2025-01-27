package com.hasnat.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMassageGenerator {
	LocalTime lt; // Has a property
	LocalDate ld; // Has a property

	@Autowired
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}

	@Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}

	// b.method
	public String generateWishMassage(String user) {
		System.out.println("WishMassageGenerator.generateWishMassage() project 4");
		int hour = lt.getHour();

		if (hour < 12)
			return "Good morning " + ld + " " + user;
		else if (hour < 16)
			return "Good afternoon " + ld + " " + user;
		else if (hour < 20)
			return "Good evening " + ld + " " + user;

		else
			return "Good night " + ld + " " + user;
	}

}
