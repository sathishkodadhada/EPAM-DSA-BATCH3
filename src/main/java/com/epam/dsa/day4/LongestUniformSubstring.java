package com.epam.dsa.day4;

public class LongestUniformSubstring {
    public int[] repeatedSubstring(String str) {
        if (str.length() == 1) return new int[]{0, 1};
        int idx = -1, maxCnt = 0;
        int i = 0;
        int n = str.length();
        while (i < n) {
            int cnt = 0;
            char ch = str.charAt(i);
            int start = i;
            while (i < n && ch == str.charAt(i)) {
                i++;
                cnt++;
            }
            if (maxCnt < cnt) {
                idx = start;
                maxCnt = cnt;
            }
        }

        return new int[]{idx, maxCnt};
    }
}
