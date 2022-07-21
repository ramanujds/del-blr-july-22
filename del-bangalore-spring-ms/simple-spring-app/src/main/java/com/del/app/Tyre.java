package com.del.app;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component("ceat")
public class Tyre {

	public void applyBrake() {
		System.out.println("Brakes applied");
	}
	
}
