package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareRootTest {
    private final SquareRoot squareRoot = new SquareRoot();

    @Test
    void squareRoot() {
        Assertions.assertEquals(2.0, squareRoot.squareRoot(4));
    }

    @Test
    void squareRootWithPrecision() {
        Assertions.assertEquals(1.414, squareRoot.squareRoot(2));
    }

    @Test
    void squareRootWithNegVal() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> squareRoot.squareRoot(-1));
    }
}