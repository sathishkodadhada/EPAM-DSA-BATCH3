package com.epam.dsa.day2;

public class QuickSort {
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int first, int last) {
        if (first < last) {
            int i = first;
            int pivot = first;
            int j = last;
            while (i < j) {
                while (arr[i] <= arr[pivot] && i < last) i++;
                while (arr[j] > arr[pivot]) j--;
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;
            quickSort(arr, first, j - 1);
            quickSort(arr, j + 1, last);
        }
    }
}
