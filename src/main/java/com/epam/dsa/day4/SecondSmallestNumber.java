package com.epam.dsa.day4;

public class SecondSmallestNumber {
    //TC: O(log n) && SC: O(1)
    public int findMin(int[] a) {
        int length = a.length;
        if (length < 2) return 0;
        int pivot = SmallestNumber.getPivot(a);
        return a[(pivot + 2) % length];
    }
}
