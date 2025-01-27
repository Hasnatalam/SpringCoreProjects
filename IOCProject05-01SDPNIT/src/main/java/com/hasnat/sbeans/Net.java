package com.hasnat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("net")
@Lazy
public class Net implements ICourse  {

	public Net() {
		super();
	}

	@Override
	public String admission(String name) {
		return name +"took admission in .Net course";
	}

}
