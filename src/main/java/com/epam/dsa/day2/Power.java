package com.epam.dsa.day2;

public class Power {
    public double getPowerOfN(int a, int n) {
        if (a == 0) return 0;
        boolean isNeg = n < 0;
        n = Math.abs(n);
        double res = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                res = res * a;
            }
            n = n >> 1;
            a = a * a;
        }
        return isNeg ? 1 / res : res;
    }

    public double getPowerOfNUsingDivideAndConquer(int a, int n) {
        if (a == 0) return 0;
        boolean isNeg = n < 0;
        n = Math.abs(n);
        int res = getPowerUtil(a, n);
        return isNeg ? 1.0 / res : res;
    }

    private int getPowerUtil(int x, int y) {
        int temp;
        if (y == 0) return 1;
        temp = getPowerUtil(x, y / 2);
        if (y % 2 == 0) return temp * temp;
        else return x * temp * temp;
    }

}
