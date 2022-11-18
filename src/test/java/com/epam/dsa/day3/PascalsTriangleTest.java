package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {
    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void pascal() {
        Assertions.assertEquals(1, pascalsTriangle.pascal(0, 0));
    }
}