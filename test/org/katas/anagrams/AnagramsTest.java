package org.katas.anagrams;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {
    @Test
    public void noCharacters() {
        assertEquals(List.of(""), Anagrams.run(""));
    }

    @Test
    public void oneCharacter() {
        assertEquals(List.of("A"), Anagrams.run("A"));
    }

    @Test
    public void twoCharacters() {
        assertEquals(List.of("AB", "BA"), Anagrams.run("AB"));
    }

    @Test
    public void threeCharacters() {
        assertEquals(List.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"), Anagrams.run("ABC"));
    }

    @Test
    public void fourCharacters() {
        assertEquals(24, Anagrams.run("ABCD").size());
    }
}
