package com.epam.dsa.day5;

public class WalkingRobot {
    //TC: O(n) && SC: O(1)
    public int[] walk(String path) {
        int i = 0;
        int j = 0;
        for (char c : path.toCharArray()) {
            if (c == 'U') {
                j++;
            } else if (c == 'D') {
                j--;
            } else if (c == 'L') {
                i--;
            } else {
                i++;
            }
        }
        return new int[]{i, j};
    }
}
