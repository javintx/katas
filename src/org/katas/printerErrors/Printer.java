package org.katas.printerErrors;

public class Printer {
    private static final String COLORS = "abcdefghijklm";
    private static final char FRACTION_CHAR = '/';

    public static String printerError3(String s) {
        return s.chars().filter(x -> x > 'm').count() + "/" + s.length();
    }

    public static String printerError2(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

    public static String printerError(String s) {
        int iPrinterLength = s.length();
        int iErrorLength = 0;
        char sequence[] = s.toCharArray();
        for (char c : sequence) {
            if (!COLORS.contains(String.valueOf(c))) iErrorLength++;
        }
        return getPrinterErrorResult(iErrorLength, iPrinterLength);
    }

    private static String getPrinterErrorResult(int errorLength, int printerLength) {
        return new StringBuilder().append(errorLength).append(FRACTION_CHAR).append(printerLength).toString();
    }
}
