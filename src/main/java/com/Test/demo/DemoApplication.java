package com.Test.demo;

import com.Test.demo.demo.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

		Doctor doctor= context.getBean(Doctor.class);
		doctor.assist();
//		SpringApplication.run(DemoApplication.class, args);
	}

}
