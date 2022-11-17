package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    private final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void search() {
        Assertions.assertTrue(binarySearch.search(arr, 9));
    }

    @Test
    void searchWhenKeyNotPresent() {
        Assertions.assertFalse(binarySearch.search(arr, 15));
    }
}