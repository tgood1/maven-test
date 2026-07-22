package com.example.service;

import com.example.common.StringHelper;
import com.google.gson.Gson;

/**
 * Service that formats messages and serializes them as JSON.
 */
public class JsonService {

    private final Gson gson = new Gson();

    public String capitalizeAndEncode(String message, String[] values) {
        String capitalized = StringHelper.capitalize(message);
        return gson.toJson(new Result(capitalized, values));
    }

    private static final class Result {
        final String message;
        final String[] values;

        Result(String message, String[] values) {
            this.message = message;
            this.values = values;
        }
    }
}
