package org.katas.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTesterTest {

    @Test
    public void publicTests() {
        assertEquals(TriangleTester.isTriangle(1, 2, 2), true);
        assertEquals(TriangleTester.isTriangle(7, 2, 2), false);
    }
}
