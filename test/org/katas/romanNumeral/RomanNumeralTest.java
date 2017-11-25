package org.katas.romanNumeral;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {
    private RomanNumeral romanNumeral;

    @Before
    public void getRomanNumeral() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void one() {
        assertEquals("I", romanNumeral.arabicToRoman(1));
    }

    @Test
    public void two() {
        assertEquals("II", romanNumeral.arabicToRoman(2));
    }

    @Test
    public void three() {
        assertEquals("III", romanNumeral.arabicToRoman(3));
    }

    @Test
    public void four() {
        assertEquals("IV", romanNumeral.arabicToRoman(4));
    }

    @Test
    public void five() {
        assertEquals("V", romanNumeral.arabicToRoman(5));
    }

    @Test
    public void six() {
        assertEquals("VI", romanNumeral.arabicToRoman(6));
    }

    @Test
    public void seven() {
        assertEquals("VII", romanNumeral.arabicToRoman(7));
    }

    @Test
    public void eight() {
        assertEquals("VIII", romanNumeral.arabicToRoman(8));
    }

    @Test
    public void nine() {
        assertEquals("IX", romanNumeral.arabicToRoman(9));
    }

    @Test
    public void ten() {
        assertEquals("X", romanNumeral.arabicToRoman(10));
    }

    @Test
    public void ninentyNine() {
        assertEquals("XCIX", romanNumeral.arabicToRoman(99));
    }

    @Test
    public void otherRomanNumerals() {
        assertEquals("XLV", romanNumeral.arabicToRoman(45));
        assertEquals("CDXCV", romanNumeral.arabicToRoman(495));
        assertEquals("CDL", romanNumeral.arabicToRoman(450));
        assertEquals("MCM", romanNumeral.arabicToRoman(1900));
        assertEquals("XLIX", romanNumeral.arabicToRoman(49));
        assertEquals("XXXIX", romanNumeral.arabicToRoman(39));
    }
}
