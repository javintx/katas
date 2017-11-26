package org.katas.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    private static final int ROUNDS = 100;

    @Test
    public void test100() {
        assertTrue(FizzBuzz.run(ROUNDS).contains("97"));
    }

    @Test
    public void testFizz() {
        assertTrue(FizzBuzz.run(ROUNDS).contains(FizzBuzz.FIZZ));
    }

    @Test
    public void testBuzz() {
        assertTrue(FizzBuzz.run(ROUNDS).contains(FizzBuzz.BUZZ));
    }

    @Test
    public void testFizzBuzz() {
        assertTrue(FizzBuzz.run(ROUNDS).contains(FizzBuzz.FIZZ_BUZZ));
    }
}
