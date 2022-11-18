package com.epam.dsa.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianTwoSortedArrays {
    //    TC: O(nlogn) & SC: (m+n)
    public double findMedianOfSortedArrays(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(array1).forEach(list::add);
        Arrays.stream(array2).forEach(list::add);
        Collections.sort(list);
        int size = list.size();
        if (size % 2 == 0) {
            return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
        }
        return list.get(size / 2);
    }

    //    TC: O(n) & SC: (1)
    public double findMedianOfSortedArraysUsingCount(int[] array1, int[] array2) {
        int m1 = 0;
        int m2 = 0;
        int n1 = array1.length;
        int n2 = array2.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        while (cnt <= (n1 + n2) / 2) {
            m1 = m2;
            if (i != n1 && j != n2) {
                m2 = array1[i] > array2[j] ? array2[j++] : array1[i++];
            } else if (i < n1) {
                m2 = array1[i++];
            } else {
                m2 = array2[j++];
            }
            cnt++;
        }
        return (n1 + n2) % 2 == 1 ? m2 : (m1 + m2) / 2.0;
    }

}
