package com.hasnat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nit")
public class NareshIT {
	@Autowired
	@Qualifier("java")
	ICourse course;
	
	public NareshIT() {
		super();
	}

	public String takeAdmission(String name,double price) {
		String msg = course.admission(name);
		return msg+"\nCourse price : "+price;
		
	}
}
