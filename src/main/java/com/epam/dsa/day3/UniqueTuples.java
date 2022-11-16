package com.epam.dsa.day3;

import java.util.HashSet;
import java.util.Set;

public class UniqueTuples {
    public static Set<String> uniqueTuples(String str, int len) {
        int n = str.length();
        Set<String> set = new HashSet<>();
        if (n < len) return set;
        for (int i = 0; i < n - len + 1; i++) {
            String subStr = str.substring(i, i + len);
            set.add(subStr);
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(uniqueTuples("abbccde", 2));
    }
}
