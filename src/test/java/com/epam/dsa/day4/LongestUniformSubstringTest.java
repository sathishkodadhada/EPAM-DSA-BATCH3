package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestUniformSubstringTest {
    private final LongestUniformSubstring longestUniformSubstring = new LongestUniformSubstring();

    @Test
    void repeatedSubstringTest1() {
        Assertions.assertArrayEquals(new int[]{1, 3}, longestUniformSubstring.repeatedSubstring("abbbccda"));
    }

    @Test
    void repeatedSubstringTest2() {
        Assertions.assertArrayEquals(new int[]{2, 5}, longestUniformSubstring.repeatedSubstring("aabbbbbCdAA"));
    }

    @Test
    void repeatedSubstringTest3() {
        Assertions.assertArrayEquals(new int[]{0, 1}, longestUniformSubstring.repeatedSubstring("abcd"));
    }

    @Test
    void repeatedSubstringWithEmptyString() {
        Assertions.assertArrayEquals(new int[]{-1, 0}, longestUniformSubstring.repeatedSubstring(""));
    }
}