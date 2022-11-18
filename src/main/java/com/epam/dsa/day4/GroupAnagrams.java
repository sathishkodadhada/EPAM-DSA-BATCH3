package com.epam.dsa.day4;

import java.util.*;

public class GroupAnagrams {
    //TC: O( n * (n log n)) && SC: O(1)
    public Set<Set<String>> groupAnagrams(List<String> words) {
        Map<String, Set<String>> map = new HashMap<>();
        for (String str : words) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            Set<String> set = map.getOrDefault(new String(chars), new HashSet<>());
            set.add(str);
            map.put(new String(chars), set);
        }
        return new HashSet<>(map.values());
    }
}
