package com.epam.dsa.day4;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    //TC: O(n) && SC: O(1)
    public char findFirstNonRepeatingCharacter(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) return ch;
        }
        return '0';
    }
}
