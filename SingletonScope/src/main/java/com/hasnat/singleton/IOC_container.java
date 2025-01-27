package com.hasnat.singleton;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("ioc")
public class IOC_container {
	
	@Autowired
	@Qualifier("dt")	 //Rule 2
	LocalDate ld;
	public void printTime() {
		System.out.println("Time :"+ld);
	}

}
