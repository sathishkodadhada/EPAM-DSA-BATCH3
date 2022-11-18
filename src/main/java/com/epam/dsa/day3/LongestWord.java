package com.epam.dsa.day3;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {
    //TC: O(n) & SC: O(1)
    public String[] longestWord(List<String> dictionary, String letters) {
        List<String> res = new ArrayList<>();
        int[] count = getFrequency(letters);
        int maxLen = 0;
        for (String word : dictionary) {
            int[] temp = getFrequency(word);
            if (matchesFrequency(count, temp)) {
                int len = word.length();
                if (maxLen < len) {
                    maxLen = len;
                    res.clear();
                }
                if (maxLen == len) {
                    res.add(word);
                }
            }
        }
        return res.toArray(new String[0]);
    }

    private static boolean matchesFrequency(int[] count, int[] temp) {
        for (int i = 0; i < 26; i++) {
            if (temp[i] > count[i]) return false;
        }
        return true;
    }

    private static int[] getFrequency(String word) {
        int[] count = new int[26];
        for (char ch : word.toCharArray()) {
            count[ch - 'a']++;
        }
        return count;
    }
}
