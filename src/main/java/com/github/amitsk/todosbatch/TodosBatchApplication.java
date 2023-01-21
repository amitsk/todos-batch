package com.github.amitsk.todosbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosBatchApplication {
	private static final Logger logger = LoggerFactory.getLogger(TodosBatchApplication.class);
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(TodosBatchApplication.class, args)));
	}

}
