package com.del.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("car.properties")
public class AppConfig {

	@Bean("mrf")
	public Tyre getTyreBean() {
		return new Tyre();
	}
	
	@Bean("bose")
	public MusicSystem getMusicSystemBean() {
		return new MusicSystem();
	}
	
//	@Bean("audi")
//	public Car getCarBean() {
//		Car car= new Car();
//		car.setColor("Blue");
//		car.setRegNo("KA05-1029");
//		car.setModel("Audi A7");
//		car.setMusicSystem(getMusicSystemBean());
//		car.setTyres(getTyreBean());
//		return car;
//	}
	
	
	
	
}
