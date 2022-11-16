package com.epam.dsa.day2;

public class MergeSort {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int l = low;
        int i = low;
        int m = mid + 1;
        while (l <= mid && m <= high) {
            if (arr[l] < arr[m]) {
                temp[i] = arr[l++];
            } else {
                temp[i] = arr[m++];
            }
            i++;
        }
        if (l > mid) {
            for (int k = m; k <= high; k++) {
                temp[i++] = arr[k];
            }
        } else {
            for (int k = l; k <= mid; k++) {
                temp[i++] = arr[k];
            }
        }
        for (int k = low; k <= high; k++) {
            arr[k] = temp[k];
        }
    }
}
