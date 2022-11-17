package com.epam.dsa.day4;

public class Pangram {
    public String findMissingLetters(String input) {
        StringBuilder res = new StringBuilder();
        int[] count = new int[26];
        for (char ch : input.toCharArray()) {
            if (ch != ' ')
                count[ch - 'a'] = 1;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0)
                res.append((char) (i + 'a'));
        }
        return res.toString();
    }
}
