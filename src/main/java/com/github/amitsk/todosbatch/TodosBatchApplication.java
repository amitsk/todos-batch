package com.github.amitsk.todosbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosBatchApplication {
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(TodosBatchApplication.class, args)));
	}

}
