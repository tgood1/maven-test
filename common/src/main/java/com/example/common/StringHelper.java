package com.example.common;

import org.apache.commons.lang3.StringUtils;

/**
 * Shared string helpers backed by Apache Commons Lang.
 */
public final class StringHelper {

    private StringHelper() {
    }

    public static String capitalize(String value) {
        return StringUtils.capitalize(value);
    }
}
