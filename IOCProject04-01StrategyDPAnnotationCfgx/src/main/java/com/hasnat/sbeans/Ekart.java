package com.hasnat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ek")
@Lazy
public class Ekart implements ICourier {
	

	public Ekart() {
		super();
	}

	@Override
	public String deliver(int oid) {
		return "Ekart courier is ready for deliver "+oid+" order number products";
	}

}
