package com.hasnat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("java")
@Lazy
public class Java implements ICourse  {
	
	public Java() {
		super();
	}

	@Override
	public String admission(String name) {
		return name +"took admission in java course";
	}

}
