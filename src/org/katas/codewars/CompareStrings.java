package org.katas.codewars;

public class CompareStrings {
    private static final String ONLY_LETTERS_UPPERCASE_PATTERN = "[A-Z]*";

    public static Boolean compare(String s1, String s2) {
        return checkConditions(s1).toUpperCase().chars().sum() == checkConditions(s2).toUpperCase().chars().sum();
    }

    private static String checkConditions(String s) {
        return s == null || !s.toUpperCase().matches(ONLY_LETTERS_UPPERCASE_PATTERN) ? "" : s;
    }
}
