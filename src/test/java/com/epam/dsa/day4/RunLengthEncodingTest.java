package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunLengthEncodingTest {
    private final RunLengthEncoding runLengthEncoding = new RunLengthEncoding();

    @Test
    void runLengthEncodingTest1() {
        Assertions.assertEquals("a3b3a2d1", runLengthEncoding.runLengthEncoding("aaabbbaad"));
    }

    @Test
    void runLengthEncodingTest2() {
        Assertions.assertEquals("a2b3", runLengthEncoding.runLengthEncoding("aabbb"));
    }

    @Test
    void runLengthEncodingTest3() {
        Assertions.assertEquals("a1", runLengthEncoding.runLengthEncoding("a"));
    }

    @Test
    void runLengthEncodingEmptyString() {
        Assertions.assertEquals("", runLengthEncoding.runLengthEncoding(""));
    }
}