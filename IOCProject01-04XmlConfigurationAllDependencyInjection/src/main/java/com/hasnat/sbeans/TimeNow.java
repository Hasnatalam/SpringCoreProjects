package com.hasnat.sbeans;

import java.time.LocalTime;

public class TimeNow {
    
	LocalTime lt;
	LocalTime lt1;
	

	public TimeNow() {
		super();
	}


	public TimeNow(LocalTime lt1) {
		super();
		this.lt1 = lt1;
	}


	public void setLt(LocalTime lt) {	
		this.lt = lt;
	}
	public void getTime() { 
		System.out.println(lt);
		System.out.println(lt1);
	}
	
}
