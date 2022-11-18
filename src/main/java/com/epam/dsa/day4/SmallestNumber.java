package com.epam.dsa.day4;

public class SmallestNumber {
    //TC: O(log n) && SC: O(1)
    public int findMin(int[] a) {
        if (a.length == 0) return 0;
        int pivot = getPivot(a);
        return a[(pivot + 1) % a.length];
    }

    public static int getPivot(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (low == high) return low;
            if (mid < high && arr[mid] > arr[mid + 1]) return mid;
            if (mid > low && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[low] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
