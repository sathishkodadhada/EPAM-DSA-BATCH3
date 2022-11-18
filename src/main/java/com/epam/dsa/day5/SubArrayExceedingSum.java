package com.epam.dsa.day5;

public class SubArrayExceedingSum {
    public int subArrayExceedsSum(int[] array, int target) {
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        int n = array.length;
        while (end < n) {
            while (sum <= target && end < n) {
                sum += array[end++];
            }
            while (start < end && sum > target) {
                len = Math.min(len, end - start);
                sum -= array[start];
                start++;
            }
        }
        return len;
    }
}
