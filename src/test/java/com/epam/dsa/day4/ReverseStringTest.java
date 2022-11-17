package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    @Test
    void reverseString() {
        Assertions.assertEquals("bbbaa", reverseString.reverseString("aabbb"));
    }

    @Test
    void reverseStringWithEmptyString() {
        Assertions.assertEquals("", reverseString.reverseString(""));
    }

    @Test
    void reverseStringUsingStringBuilder() {
        Assertions.assertEquals("bbbaa", reverseString.reverseStringUsingStringBuilder("aabbb"));
    }
}