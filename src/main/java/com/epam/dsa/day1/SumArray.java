package com.epam.dsa.day1;

public class SumArray {
    public int sum(int[] elements) {
        int sum = 0;
        for (int ele : elements) {
            sum += ele;
        }
        return sum;
//        return Arrays.stream(elements).sum();
    }

    public int sumUsingRecursion(int[] elements) {
        return sum(elements, 0, elements.length);
    }

    private int sum(int[] elements, int ind, int length) {
        if (ind == length) return 0;
        return elements[ind] + sum(elements, ind + 1, length);
    }
}
