package com.example;

import com.example.service.JsonService;

/**
 * Entry point for the multi-module Maven application.
 */
public class App {

    public static void main(String[] args) {
        JsonService jsonService = new JsonService();
        String json = jsonService.capitalizeAndEncode(
                "hello maven",
                new String[]{"common", "service", "app"});
        System.out.println(json);
    }
}
