package com.github.amitsk.todosbatch.functions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

record Rectangle(double length, double width) { }
@Component
public class TodosCommandLineRunner implements CommandLineRunner, Ordered {
    Logger logger = LoggerFactory.getLogger(TodosCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        var rect = new Rectangle(100.0, 200.0);
        logger.info(" Printing a rectangle...{}", rect);
    }

    @Override
    public int getOrder() {
        return 1000;
    }
}
