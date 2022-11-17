package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PrimeFactorizationTest {
    private final PrimeFactorization primeFactorization = new PrimeFactorization();

    @Test
    void primeFactorizationTest1() {
        Assertions.assertArrayEquals(new Integer[]{2, 3}, primeFactorization.primeFactorization(6));
    }

    @Test
    void primeFactorizationTest2() {
        Assertions.assertArrayEquals(new Integer[]{2, 7}, primeFactorization.primeFactorization(14));
    }

    @Test
    void primeFactorizationWhenGiven1() {
        Assertions.assertArrayEquals(new Integer[]{}, primeFactorization.primeFactorization(1));
    }

    @Test
    void primeFactorizationWhenGiven2() {
        System.out.println(Arrays.toString(primeFactorization.primeFactorization(20)));
        Assertions.assertArrayEquals(new Integer[]{2, 5}, primeFactorization.primeFactorization(20));
    }
}