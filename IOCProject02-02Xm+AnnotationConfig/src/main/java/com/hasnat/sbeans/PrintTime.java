package com.hasnat.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pt")
public class PrintTime {

	@Autowired
    @Qualifier("ltime") // Specify the exact bean to inject
    LocalTime lt1;
	LocalTime lt2;
    LocalTime lt3;
    LocalTime lt4;

    @Autowired
    public PrintTime(@Qualifier("ltime1") LocalTime lt2) {
        this.lt2 = lt2;
    }
    @Autowired
    @Qualifier("ltime2") 
	public void setLt3(LocalTime lt3) {
		this.lt3 = lt3;
	}
    
    @Autowired
    @Qualifier("ltime3") 
	public void assign(LocalTime lt4) {
		this.lt4 = lt4;
	}

    
	public void printTime() {
		
		System.out.println(lt1);
		System.out.println(lt2);
		System.out.println(lt3);
		System.out.println(lt4);
	}



}
