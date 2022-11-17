package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestNumberTest {
    private final SmallestNumber smallestNumber = new SmallestNumber();

    @Test
    void findMinWithEmptyArray() {
        Assertions.assertEquals(0, smallestNumber.findMin(new int[0]));
    }

    @Test
    void findMinWithRotatedArray() {
        Assertions.assertEquals(1, smallestNumber.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void findMinWithUnRotatedArray() {
        Assertions.assertEquals(1, smallestNumber.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void findMinWithSingleVal() {
        Assertions.assertEquals(1, smallestNumber.findMin(new int[]{1}));
    }
}