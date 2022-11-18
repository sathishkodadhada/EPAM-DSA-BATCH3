package com.epam.dsa.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAverageGrade {
    public int getBestGrade(List<List<String>> scores) {
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

}
