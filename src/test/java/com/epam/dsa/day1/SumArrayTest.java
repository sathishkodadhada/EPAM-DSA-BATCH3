package com.epam.dsa.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SumArrayTest {
    private static int[] elements;
    private static SumArray sumArray;

    @BeforeAll
    static void before() {
        elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumArray = new SumArray();
    }

    @Test
    void sum() {
        int expected = 55;
        Assertions.assertEquals(expected, sumArray.sum(elements));
    }

    @Test
    void sumUsingRecursion() {
        int expected = 55;
        Assertions.assertEquals(expected, sumArray.sumUsingRecursion(elements));
    }

    @Test
    void sumWithEmptyArray() {
        int expected = 0;
        Assertions.assertEquals(expected, sumArray.sum(new int[]{}));
    }

    @Test
    void sumUsingRecursionWithEmptyArray() {
        int expected = 0;
        Assertions.assertEquals(expected, sumArray.sumUsingRecursion(new int[]{}));
    }
}