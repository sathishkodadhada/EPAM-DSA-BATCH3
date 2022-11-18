package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LongestWordTest {
    private final LongestWord longestWord = new LongestWord();

    @Test
    void longestWordTest1() {
        List<String> dictionary = List.of("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
        String letters = "oetdg";
        Assertions.assertArrayEquals(new String[]{"toe", "doe", "dog", "god"}, longestWord.longestWord(dictionary, letters));
    }

    @Test
    void longestWordTest2() {
        List<String> dictionary = List.of("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
        String letters = "oet";
        Assertions.assertArrayEquals(new String[]{"toe"}, longestWord.longestWord(dictionary, letters));
    }

}