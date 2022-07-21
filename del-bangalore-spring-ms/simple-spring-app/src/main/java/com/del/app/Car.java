package com.del.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Car {

	@Value("${car.regno}")
	private String regNo;
	@Value("${car.color}")
	private String color;
	@Value("${car.model}")
	private String model;
	@Autowired
	@Qualifier("ceat")
	private Tyre tyre;
	@Autowired
	@Qualifier("bose")
	private MusicSystem musicSystem;
	
	public void start() {
		System.out.println("Engine started..");
	}
	
	public void playMusic() {
		musicSystem.playMusic();
	}
	
	public void brake() {
		tyre.applyBrake();
	}
	
	public void showCarInfo() {
		System.out.println(this);
	}
	
}
