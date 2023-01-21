package com.github.amitsk.todosbatch;

import java.util.function.Function;
public class TodosBatchFunction implements Function<String, String>{
    @Override
    public String apply(String name) {
        return "Hello " + name;
    }
}
