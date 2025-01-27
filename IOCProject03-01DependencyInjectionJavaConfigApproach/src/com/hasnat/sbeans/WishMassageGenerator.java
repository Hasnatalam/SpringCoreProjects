package com.hasnat.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMassageGenerator {
	@Autowired
	private LocalTime lt;
	@Autowired
	private LocalDate ld;
	public WishMassageGenerator() {
		System.out.println("WishMassageGenerator.WishMassageGenerator() 0- param constructor");
	}
	public String generateWishMassage(String user) {
		int hour = lt.getHour();
		if (hour<12)return "Good morning "+user+"\n"+ld ;
		else if(hour<16) return "Good Afternoon "+user+"\n"+ld;
		else if(hour<20) return "Good evening "+user+"\n"+ld;
		else return "Good night "+user+"\n"+ld;
	}
}
