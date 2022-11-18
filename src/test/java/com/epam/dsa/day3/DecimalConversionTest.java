package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecimalConversionTest {
    private final DecimalConversion decimalConversion = new DecimalConversion();

    @Test
    void toDecimalTest1() {
        Assertions.assertEquals("0.(3)", decimalConversion.toDecimal(1L, 3L));
    }

    @Test
    void toDecimalTest2() {
        Assertions.assertEquals("0.01(3)", decimalConversion.toDecimal(1L, 75L));
    }

    @Test
    void toDecimalTest3() {
        Assertions.assertEquals("", decimalConversion.toDecimal(1L, 0L));
    }
}