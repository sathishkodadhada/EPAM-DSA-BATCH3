package com.epam.dsa.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuples {
    //TC: O(n * len) & SC: O(1)
    public Set<String> uniqueTuples(String str, int len) {
        int n = str.length();
        Set<String> set = new LinkedHashSet<>();
        if (n < len) return set;
        for (int i = 0; i < n - len + 1; i++) {
            String subStr = str.substring(i, i + len);
            set.add(subStr);
        }
        return set;
    }

}
