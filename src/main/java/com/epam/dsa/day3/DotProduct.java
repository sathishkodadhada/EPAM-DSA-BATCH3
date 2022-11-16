package com.epam.dsa.day3;

public class DotProduct {
    public long dotProduct(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 != n2)
            return 0;
        long product = 0;
        for (int i = 0; i < n1; i++) {
            product += (long) arr2[i] * arr1[i];
        }
        return product;
    }
}
