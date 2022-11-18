package com.epam.dsa.day5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianTwoSortedArraysTest {
    private final MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();

    @Test
    void findMedianOfSortedArraysTest1() {
        Assertions.assertEquals(2.5, medianTwoSortedArrays.findMedianOfSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void findMedianOfSortedArraysUsingCountTest1() {
        Assertions.assertEquals(2.5, medianTwoSortedArrays.findMedianOfSortedArraysUsingCount(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void findMedianOfSortedArraysTest2() {
        Assertions.assertEquals(3, medianTwoSortedArrays.findMedianOfSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3}));
    }

    @Test
    void findMedianOfSortedArraysUsingCountTest2() {
        Assertions.assertEquals(3, medianTwoSortedArrays.findMedianOfSortedArraysUsingCount(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3}));
    }
}