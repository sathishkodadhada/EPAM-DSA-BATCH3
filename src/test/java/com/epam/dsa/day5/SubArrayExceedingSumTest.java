package com.epam.dsa.day5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArrayExceedingSumTest {
    private final SubArrayExceedingSum subArrayExceedingSum = new SubArrayExceedingSum();

    @Test
    void subArrayExceedsSumTest1() {
        Assertions.assertEquals(2, subArrayExceedingSum.subArrayExceedsSum(new int[]{1, 2, 3, 4}, 6));
    }

    @Test
    void subArrayExceedsSumTest2() {
        Assertions.assertEquals(Integer.MAX_VALUE, subArrayExceedingSum.subArrayExceedsSum(new int[]{1, 2, 3, 4}, 12));
    }

    @Test
    void subArrayExceedsSumTest3() {
        Assertions.assertEquals(1, subArrayExceedingSum.subArrayExceedsSum(new int[]{13, 2, 3, 4}, 12));
    }
}