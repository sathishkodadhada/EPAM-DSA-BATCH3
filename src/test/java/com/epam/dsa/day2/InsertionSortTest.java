package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertionSortTest {
    InsertionSort insertionSort = new InsertionSort();

    @Test
    void insertionSort() {
        int[] arr = new int[]{4, 5, 1, 26, 7};
        insertionSort.insertionSort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(), arr);
    }
}