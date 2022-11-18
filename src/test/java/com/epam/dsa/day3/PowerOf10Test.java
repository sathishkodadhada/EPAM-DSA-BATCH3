package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerOf10Test {
    private final PowerOf10 power = new PowerOf10();

    @Test
    void isPowerOf10() {
        Assertions.assertTrue(power.isPowerOf10(1000));
    }

    @Test
    void isPowerOf10WhenGiven10() {
        Assertions.assertTrue(power.isPowerOf10(1));
    }

    @Test
    void isPowerOf10WithInvalidVal() {
        Assertions.assertFalse(power.isPowerOf10(1010));
    }

    @Test
    void isPowerOf10WithNegVal() {
        Assertions.assertFalse(power.isPowerOf10(-1));
    }
}