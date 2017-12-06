package org.katas.codewars;

import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        for (int i = 0; i < integers.length - 2; i++) {
            if (integers[i] % 2 == 0) {
                if (integers[i + 1] % 2 == 0) {
                    if (integers[i + 2] % 2 != 0) {
                        return integers[i + 2];
                    }
                } else {
                    if (integers[i + 2] % 2 == 0) {
                        return integers[i + 1];
                    } else {
                        return integers[i];
                    }
                }
            } else {
                if (integers[i + 1] % 2 == 0) {
                    if (integers[i + 2] % 2 == 0) {
                        return integers[i];
                    } else {
                        return integers[i + 1];
                    }
                } else {
                    if (integers[i + 2] % 2 == 0) {
                        return integers[i + 2];
                    }
                }
            }
        }
        return 0;
    }

    public static int find_otro(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.

        // Con los 3 primeros ya sabemos si son pares o impares
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();

        // Si sum es 0, son pares y buscamos impares.
        // Si sum es 1, son pares y buscamos impares.
        // Si sum es 2, son impares y buscamos pares.
        // Si sum es 3, son impares y buscamos pares.
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
