package com.epam.dsa.day2;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbers {
    public List<Integer> getNFibonacciNumbers(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) return List.of(0);
        if (n == 2) return List.of(0, 1);
        n -= 2;
        int f1 = 0, f2 = 1, f3;
        res.add(0);
        res.add(1);
        while (n-- > 0) {
            f3 = f1 + f2;
            res.add(f3);
            f1 = f2;
            f2 = f3;
        }
        return res;
    }
}
