package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest {
    QuickSort quickSort = new QuickSort();

    @Test
    void quickSort() {
        int[] arr = new int[]{4, 5, 1, 26, 7};
        quickSort.quickSort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(), arr);
    }
}