package com.epam.dsa.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        Assertions.assertEquals(Arrays.stream(elements).sum(), sumArray.sum(elements));
    }

    @Test
    void sumUsingRecursion() {
        Assertions.assertEquals(Arrays.stream(elements).sum(), sumArray.sumUsingRecursion(elements));
    }

    @Test
    void sumWithEmptyArray() {
        Assertions.assertEquals(0, sumArray.sum(new int[]{}));
    }

    @Test
    void sumUsingRecursionWithEmptyArray() {
        Assertions.assertEquals(0, sumArray.sumUsingRecursion(new int[]{}));
    }
}