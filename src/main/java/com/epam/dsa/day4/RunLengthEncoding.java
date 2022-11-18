package com.epam.dsa.day4;

public class RunLengthEncoding {
    //TC: O(n) && SC: O(1)
    public String runLengthEncoding(String str) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = str.length();
        while (i < n) {
            int cnt = 0;
            char ch = str.charAt(i);
            while (i < n && ch == str.charAt(i)) {
                i++;
                cnt++;
            }
            res.append(ch).append(cnt);
        }
        return res.toString();
    }
}
