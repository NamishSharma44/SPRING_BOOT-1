package com.namish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		student st=context.getBean(student.class);
		st.setName("Namish");
		st.setAge(20);
		System.out.println(st.getName());
		System.out.println(st.getAge());

	}

}
