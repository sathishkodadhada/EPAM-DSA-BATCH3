package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecondSmallestNumberTest {

    private final SecondSmallestNumber secondSmallestNumber = new SecondSmallestNumber();

    @Test
    void findMinWithEmptyArray() {
        Assertions.assertEquals(0, secondSmallestNumber.findMin(new int[0]));
    }

    @Test
    void findMinWithRotatedArray() {
        Assertions.assertEquals(2, secondSmallestNumber.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void findMinWithUnRotatedArray() {
        Assertions.assertEquals(2, secondSmallestNumber.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void findMinWithRotatedArray1() {
        Assertions.assertEquals(2, secondSmallestNumber.findMin(new int[]{2, 3, 4, 5, 1}));
    }

    @Test
    void findMinWithSingleVal() {
        Assertions.assertEquals(0, secondSmallestNumber.findMin(new int[]{1}));
    }
}