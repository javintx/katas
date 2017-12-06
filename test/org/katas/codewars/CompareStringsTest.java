package org.katas.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareStringsTest {
    @Test
    public void BasicTests() {
        assertEquals(true, CompareStrings.compare("AD", "BC"));
        assertEquals(false, CompareStrings.compare("AD", "DD"));
        assertEquals(true, CompareStrings.compare(null, ""));
        assertEquals(true, CompareStrings.compare("zz1", ""));
        assertEquals(true, CompareStrings.compare("gf", "FG"));
    }
}
