package com.hasnat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dt")
@Lazy
public class DTDC implements ICourier {
	

	public DTDC() {
		super();
	}

	@Override
	public String deliver(int oid) {
		return "DTDC courier is ready for deliver "+oid+" order number products";
	}

}
