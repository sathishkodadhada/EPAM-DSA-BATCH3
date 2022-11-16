package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FibonacciNumbersTest {
    FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();

    @Test
    void getNFibonacciNumbersWhenNis1() {
        Assertions.assertEquals(List.of(0), fibonacciNumbers.getNFibonacciNumbers(1));
    }

    @Test
    void getNFibonacciNumbersWhenNis2() {
        Assertions.assertEquals(List.of(0, 1), fibonacciNumbers.getNFibonacciNumbers(2));
    }

    @Test
    void getNFibonacciNumbersWhenNis5() {
        Assertions.assertEquals(List.of(0, 1, 1, 2, 3), fibonacciNumbers.getNFibonacciNumbers(5));
    }
}