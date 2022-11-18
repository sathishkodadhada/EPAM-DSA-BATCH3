package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BestAverageGradeTest {
    private final BestAverageGrade bestAverageGrade = new BestAverageGrade();

    @Test
    void getBestGradeTest1() {
        List<List<String>> scores = new ArrayList<>();
        scores.add(List.of("Bobby", "87"));
        scores.add(List.of("Charles", "100"));
        scores.add(List.of("Eric", "64"));
        scores.add(List.of("Charles", "22"));
        Assertions.assertEquals(87, bestAverageGrade.getBestGrade(scores));
    }

    @Test
    void getBestGradeTest2() {
        List<List<String>> scores = new ArrayList<>();
        scores.add(List.of("Sarah", "91"));
        scores.add(List.of("Goldie", "92"));
        scores.add(List.of("Elaine", "93"));
        scores.add(List.of("Elaine", "95"));
        scores.add(List.of("Goldie", "94"));
        scores.add(List.of("Sarah", "93"));
        Assertions.assertEquals(94, bestAverageGrade.getBestGrade(scores));
    }
}