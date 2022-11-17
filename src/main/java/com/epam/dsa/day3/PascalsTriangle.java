package com.epam.dsa.day3;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static int pascal(int row, int col) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= row + 1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++)
                list.add(1);
            result.add(list);
        }
        for (int i = 3; i <= row + 1; i++) {
            List<Integer> list = result.get(i - 1);
            List<Integer> prev = result.get(i - 2);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, prev.get(j - 1) + prev.get(j));
            }
        }
        return result.get(row).get(col);
    }
}
