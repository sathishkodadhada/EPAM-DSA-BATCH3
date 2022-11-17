package com.epam.dsa.day5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentElectionProgramTest {
    private final StudentElectionProgram electionProgram = new StudentElectionProgram();

    @Test
    void whoIsElected() {
        Assertions.assertEquals(1, electionProgram.whoIsElected(4, 2));
    }

    @Test
    void whoIsElectedFor1Studnet() {
        Assertions.assertEquals(1, electionProgram.whoIsElected(1, 2));
    }

    @Test
    void whoIsElectedFor5Studnet() {
        Assertions.assertEquals(3, electionProgram.whoIsElected(5, 2));
    }


}