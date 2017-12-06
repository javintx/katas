package org.katas.codewars;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        if (principal < desired) {
            double increaseAmount = principal * interest;
            double decreaseAmount = increaseAmount * tax;
            return 1 + calculateYears(principal + increaseAmount - decreaseAmount, interest, tax, desired);
        }
        return 0;
    }
}
