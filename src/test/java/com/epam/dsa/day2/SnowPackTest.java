package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SnowPackTest {
    SnowPack snowPack = new SnowPack();

    @Test
    void solve() {
        int[] arr = new int[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0};
        Assertions.assertEquals(13, snowPack.solve(arr));
    }

    @Test
    void solveTest2() {
        int[] arr = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        Assertions.assertEquals(10, snowPack.solve(arr));
    }

    @Test
    void solveEmptyArray() {
        int[] arr = new int[0];
        Assertions.assertEquals(0, snowPack.solve(arr));
    }
}