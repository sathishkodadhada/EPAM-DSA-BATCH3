package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {
    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void pascalTest1() {
        Assertions.assertEquals(1, pascalsTriangle.pascal(0, 0));
    }

    @Test
    void pascalWithNegRow() {
        Assertions.assertEquals(-1, pascalsTriangle.pascal(-1, 0));
    }

    @Test
    void pascalTest2() {
        Assertions.assertEquals(6, pascalsTriangle.pascal(4, 2));
    }
}