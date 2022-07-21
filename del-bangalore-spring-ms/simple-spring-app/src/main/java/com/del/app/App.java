package com.del.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        car.showCarInfo();
        car.playMusic();
        car.brake();
        
//        Scanner scan = context.getBean(Scanner.class);
//        System.out.println("Enter a vlaue");
//        String value = scan.nextLine();
//        System.out.println(value);
        
    }
}
