package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    void mergeSort() {
        int[] arr = new int[]{4, 5, 1, 26, 7};
        mergeSort.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(), arr);
    }
}