package com.epam.dsa.day3;

public class SquareRoot {
    public double squareRoot(int x) {
        if (x < 0) throw new IllegalArgumentException("Need a positive value but found negative");
        int low = 1;
        int high = x;
        double ans = 0;
        if (x == 0) return ans;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        double precision = 0.1;
        for (int i = 0; i < 3; i++) {
            while (ans * ans <= x) {
                ans += precision;
            }
            ans -= precision;
            precision /= 10;
        }
        return ans;
    }

}
