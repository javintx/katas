package org.katas.kataStringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private static final int REGEX_GROUP_NUMBER_OF_DELIMITERS = 1;
    private static final int REGEX_GROUP_NUMBER_OF_NUMBER_STRINGS = 2;
    private static final String PREDEFINED_DELIMITERS_REGEX = ",|\n";
    private static final String USER_DEFINED_DELIMITERS_REGEX = "^//(.)\n(.*)";
    private static final String NEGATIVE_NUMBERS_NOT_ALLOWED_MESSAGE = "negatives not allowed";
    private static final String SPACE = " ";

    public int run(String numbers) {
        Matcher m = Pattern.compile(USER_DEFINED_DELIMITERS_REGEX).matcher(numbers);
        String delimiters = getDelimiters(m);
        String numberString = getNumberStrings(numbers, m.reset());
        return getSum(getAllNumbers(numberString, delimiters));
    }

    private String getNumberStrings(String numbers, Matcher m) {
        if (m.find()) {
            return m.group(REGEX_GROUP_NUMBER_OF_NUMBER_STRINGS);
        } else {
            return numbers;
        }
    }

    private String getDelimiters(Matcher m) {
        if (m.find()) {
            return Pattern.quote(m.group(REGEX_GROUP_NUMBER_OF_DELIMITERS));
        } else {
            return PREDEFINED_DELIMITERS_REGEX;
        }
    }

    private String[] getAllNumbers(String numbers, String delimiters) {
        if (numbers.isEmpty()) {
            return new String[0];
        } else {
            return numbers.split(delimiters);
        }
    }

    private int getSum(String numbers[]) {
        int sum = 0;
        StringBuffer error = new StringBuffer();
        for (String number : numbers) {
            sum += toIntAndAddNegativeToError(number, error);
        }
        throwNegativeNumbersException(error);
        return sum;
    }

    private void throwNegativeNumbersException(StringBuffer error) {
        if (error.length() > 0) throw new RuntimeException(NEGATIVE_NUMBERS_NOT_ALLOWED_MESSAGE + error);
    }

    private int toIntAndAddNegativeToError(String number, StringBuffer error) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            error.append(SPACE).append(num);
        }
        return num;
    }
}
