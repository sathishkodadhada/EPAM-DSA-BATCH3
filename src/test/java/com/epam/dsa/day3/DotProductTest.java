package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DotProductTest {
    private final DotProduct dotProduct = new DotProduct();

    @Test
    void dotProductTest1() {
        Assertions.assertEquals(8, dotProduct.dotProduct(new int[]{1, 2}, new int[]{2, 3}));
    }

    @Test
    void dotProductTest2() {
        Assertions.assertEquals(2, dotProduct.dotProduct(new int[]{1}, new int[]{2, 3}));
    }


}