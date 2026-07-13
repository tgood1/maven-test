package com.example;

import org.apache.commons.lang3.StringUtils;
import com.google.gson.Gson;

/**
 * A simple application demonstrating use of public Maven packages.
 */
public class App {

    public static void main(String[] args) {
        // Use Apache Commons Lang
        String message = "hello maven";
        System.out.println("Capitalized: " + StringUtils.capitalize(message));

        // Use Google Gson
        Gson gson = new Gson();
        String json = gson.toJson(new String[]{"apache-commons", "gson"});
        System.out.println("Dependencies as JSON: " + json);
    }
}
