package org.katas.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray_MIO(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (String a1 : array1) {
            if (Arrays.stream(array2).anyMatch(s -> s.contains(a1))) result.add(a1);
        }
        Collections.sort(result);
        return result.toArray(new String[result.size()]);
    }

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str ->
                        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

}
