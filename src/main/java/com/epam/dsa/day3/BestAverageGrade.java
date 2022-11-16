package com.epam.dsa.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAverageGrade {
    public static int getBestGrade(List<List<String>> scores) {
        Map<String, List<Integer>> scoreMap = new HashMap<>();
        scores.forEach(score -> {
            if (!scoreMap.containsKey(score.get(0))) {
                scoreMap.put(score.get(0), new ArrayList<>());
            }
            scoreMap.get(score.get(0)).add(Integer.parseInt(score.get(1)));
        });
        int maxGrade = 0;
        for (List<Integer> value : scoreMap.values()) {
            maxGrade = Math.max(value.stream().reduce(Integer::sum).get() / value.size(), maxGrade);
        }
        return maxGrade;
    }

    public static void main(String[] args) {
        List<List<String>> scores = new ArrayList<>();
//        scores.add(List.of("Bobby", "87"));
//        scores.add(List.of("Charles", "100"));
//        scores.add(List.of("Eric", "64"));
//        scores.add(List.of("Charles", "22"));

        scores.add(List.of("Sarah", "91"));
        scores.add(List.of("Goldie", "92"));
        scores.add(List.of("Elaine", "93"));
        scores.add(List.of("Elaine", "95"));
        scores.add(List.of("Goldie", "94"));
        scores.add(List.of("Sarah", "93"));

        System.out.println(getBestGrade(scores));
    }
}
