package com.hasnat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bd")
@Lazy
public class Bluedart implements ICourier {
	

	public Bluedart() {
		super();
	}

	@Override
	public String deliver(int oid) {
		return "BlueDart courier is ready for deliver "+oid+" order number products";
	}

}
