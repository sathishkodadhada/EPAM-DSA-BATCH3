package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PangramTest {
    private final Pangram pangram = new Pangram();

    @Test
    void findMissingLetters() {
        Assertions.assertEquals("bfgjkvz", pangram.findMissingLetters("the slow purple oryx meanders past the quiescent canine"));
    }

    @Test
    void findMissingLettersWithEmptyString() {
        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", pangram.findMissingLetters(""));
    }
}