package com.namish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		student st=new student("namish",21);
		System.out.println(st.getName());
		System.out.println(st.getAge());
	}

}
