package com.epam.dsa.day5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WalkingRobotTest {
    private final WalkingRobot walkingRobot = new WalkingRobot();

    @Test
    void walkTest1() {
        Assertions.assertArrayEquals(new int[]{0, 0}, walkingRobot.walk(""));
    }

    @Test
    void walkTest2() {
        Assertions.assertArrayEquals(new int[]{-1, 0}, walkingRobot.walk("L"));
    }

    @Test
    void walkTest3() {
        Assertions.assertArrayEquals(new int[]{0, 0}, walkingRobot.walk("ULDR"));
    }

    @Test
    void walkTest4() {
        Assertions.assertArrayEquals(new int[]{0, 3}, walkingRobot.walk("UUU"));
    }
}