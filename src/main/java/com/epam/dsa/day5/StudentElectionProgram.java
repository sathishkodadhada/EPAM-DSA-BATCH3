package com.epam.dsa.day5;

import java.util.LinkedList;
import java.util.Queue;

public class StudentElectionProgram {
    //TC: O(numberOfStudents * songLength) && SC: O(numberOfStudents)
    public int whoIsElected(int numberOfStudents, int songLength) {
        if (numberOfStudents == 0) return -1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfStudents; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            int i = 1;
            while (!queue.isEmpty() && i < songLength) {
                queue.add(queue.poll());
                i++;
            }
            if (!queue.isEmpty()) queue.poll();
        }
        return queue.poll();
    }
}
