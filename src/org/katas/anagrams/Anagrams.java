package org.katas.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

    public static List<String> run(String characters) {
        if (characters.length() <= 1) {
            return List.of(characters);
        } else {
            List<String> anagrams = new ArrayList<>();
            for (int i = 0; i < characters.length(); i++) {
                String dropCharacter = characters.substring(i, i + 1);
                List<String> restAnagrams = Anagrams.run(dropCharacter(characters, i));
                for (String restAnagram : restAnagrams) {
                    anagrams.add(dropCharacter + restAnagram);
                }
            }
            return anagrams;
        }
    }

    private static String dropCharacter(String s, int index) {
        String before = s.substring(0, index);
        String after = s.substring(index + 1, s.length());
        return before + after;
    }
}
