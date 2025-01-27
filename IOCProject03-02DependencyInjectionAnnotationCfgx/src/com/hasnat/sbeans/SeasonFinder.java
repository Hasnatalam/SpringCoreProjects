package com.hasnat.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	LocalDate ld;
	public String easonFinder () {
		int month=ld.getMonthValue();
		if(month>2&&month<=6) {
			return "Date : "+ld+"\nThis is Sumer season";
		}
		else if (month>6&&month<=10) {
			return "Date : "+ld+"\nThis is Rainy season";
		}
		else {
			return "Date : "+ld+"\nThis is Winter season";
		}
	}
	

}
