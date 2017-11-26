package org.katas.fizzbuzz;

public class FizzBuzz {

    private static final String SEPARATOR = " ";
    protected static final String FIZZ = "FIZZ";
    protected static final String BUZZ = "BUZZ";
    protected static final String FIZZ_BUZZ = FIZZ + BUZZ;

    public static String run(int rounds) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= rounds; i++) {
            result.append(SEPARATOR);
            if (isFizziAndBuzzi(i)) {
                result.append(FIZZ_BUZZ);
            } else if (isFizzi(i)) {
                result.append(FIZZ);
            } else if (isBuzzi(i)) {
                result.append(BUZZ);
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }

    private static boolean isFizzi(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzzi(int i) {
        return i % 5 == 0;
    }

    private static boolean isFizziAndBuzzi(int i) {
        return isFizzi(i) && isBuzzi(i);
    }
}
