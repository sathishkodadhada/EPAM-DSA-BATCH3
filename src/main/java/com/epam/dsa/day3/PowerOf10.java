package com.epam.dsa.day3;

public class PowerOf10 {
    public boolean isPowerOf10(int n) {
        while (n > 1) {
            int rem = n % 10;
            if (rem != 0) return false;
            n = n / 10;
        }
        return true;
    }
}
