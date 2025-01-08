package com.example.junit_testing.Testing_Tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingTutorialApplication {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.addManyNumbers(1, 2, 3));
		System.out.println(c.addManyNumbers(1, 2));
		SpringApplication.run(TestingTutorialApplication.class, args);
	}

}
