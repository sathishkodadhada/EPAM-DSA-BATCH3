package com.epam.dsa.day2;

public class BinarySearch {
    public boolean search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return true;
            if (arr[mid] > key) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return false;
    }
}
