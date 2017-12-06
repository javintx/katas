package org.katas.codewars;

public class DnaStrand {
    private static final String COMODIN = "x";

    public static String makeComplement(String dna) {
        //Your code
        return dna
                .replaceAll("A", COMODIN)
                .replaceAll("T", "A")
                .replaceAll(COMODIN, "T")
                .replaceAll("C", COMODIN)
                .replaceAll("G", "C")
                .replaceAll(COMODIN, "G");
    }
}
