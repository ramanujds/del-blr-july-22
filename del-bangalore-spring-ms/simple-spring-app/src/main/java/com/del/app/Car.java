package com.del.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

	private String regNo;
	private String color;
	private String model;
	private Tyre tyres;
	private MusicSystem musicSystem;
	
	public void start() {
		System.out.println("Engine started..");
	}
	
	public void playMusic() {
		musicSystem.playMusic();
	}
	
	public void brake() {
		tyres.applyBrake();
	}
	
	public void showCarInfo() {
		System.out.println(this);
	}
	
}
