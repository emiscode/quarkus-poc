package com.example.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public static String greeting(final String name) {
        return "hello " + name;
    }
}