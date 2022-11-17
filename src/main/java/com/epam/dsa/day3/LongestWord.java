package com.epam.dsa.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestWord {
    public static String[] longestWord(List<String> dictionary, String letters) {
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

    public static void main(String[] args) {
        List<String> dictionary = List.of("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
        String letters = "oetdg";
        System.out.println(Arrays.toString(longestWord(dictionary, letters)));
    }
}
