package com.github.amitsk.todosbatch.functions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TodosCommandLineRunner implements CommandLineRunner, Ordered {
    Logger logger = LoggerFactory.getLogger(TodosCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info(" First command...");
    }

    @Override
    public int getOrder() {
        return 1000;
    }
}
