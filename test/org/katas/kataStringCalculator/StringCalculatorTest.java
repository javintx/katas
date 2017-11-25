package org.katas.kataStringCalculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private StringCalculator stringCalculator;

    @Before
    public void getStringCalculator() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void emptyStringShouldReturn0() {
        assertEquals(0, stringCalculator.run(""));
    }

    @Test
    public void oneNumberShouldReturnThisNumber() {
        assertEquals(1, stringCalculator.run("1"));
    }

    @Test
    public void twoNumbersShouldReturnSum() {
        assertEquals(3, stringCalculator.run("1,2"));
    }

    @Test
    public void multipleNumbersShouldReturnSum() {
        assertEquals(6, stringCalculator.run("1,2,3"));
    }

    @Test
    public void newDelimiterShouldBeHandled() {
        assertEquals(6, stringCalculator.run("1\n2,3"));
    }

    @Test
    public void userDelimiterShouldBeHandled() {
        assertEquals(3, stringCalculator.run("//;\n1;2"));
    }

    @Test
    public void userAndPredefinedDelimiterShouldBeHandled() {
        assertEquals(3, stringCalculator.run("//?\n1?2"));
    }

    @Test
    public void negativeNumberShouldBeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("negatives not allowed -1");
        stringCalculator.run("-1");
    }

    @Test
    public void multipleNegativeNumbersShouldBeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("negatives not allowed -1 -3");
        stringCalculator.run("-1,2,-3");
    }
}
