package com.epam.dsa.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerTest {
    Power power = new Power();

    @Test
    void getPowerOfN() {
        Assertions.assertEquals(Math.pow(2, 8), power.getPowerOfN(2, 8));
    }

    @Test
    void getPowerOfNWhenBaseIsZero() {
        Assertions.assertEquals(Math.pow(0, 8), power.getPowerOfN(0, 8));
    }

    @Test
    void getPowerOfNWhenPowIsZero() {
        Assertions.assertEquals(Math.pow(2, 0), power.getPowerOfN(2, 0));
    }

    @Test
    void getPowerOfNWhenPowIsNegative() {
        Assertions.assertEquals(Math.pow(2, -8), power.getPowerOfN(2, -8));
    }

    @Test
    void getPowerOfNUsingDivideAndConquer() {
        Assertions.assertEquals(Math.pow(2, 8), power.getPowerOfNUsingDivideAndConquer(2, 8));
    }

    @Test
    void getPowerOfNUsingDivideAndConquerWhenBaseIsZero() {
        Assertions.assertEquals(Math.pow(0, 8), power.getPowerOfNUsingDivideAndConquer(0, 8));
    }

    @Test
    void getPowerOfNUsingDivideAndConquerWhenPowIsZero() {
        Assertions.assertEquals(Math.pow(2, 0), power.getPowerOfNUsingDivideAndConquer(2, 0));
    }

    @Test
    void getPowerOfNUsingDivideAndConquerWhenPowIsNegative() {
        Assertions.assertEquals(Math.pow(2, -8), power.getPowerOfNUsingDivideAndConquer(2, -8));
    }
}