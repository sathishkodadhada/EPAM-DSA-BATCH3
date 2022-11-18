package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstNonRepeatingCharacterTest {
    private final FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();

    @Test
    void findFirstNonRepeatingCharacterTest1() {
        Assertions.assertEquals('a', firstNonRepeatingCharacter.findFirstNonRepeatingCharacter("apple"));
    }

    @Test
    void findFirstNonRepeatingCharacterTest2() {
        Assertions.assertEquals('e', firstNonRepeatingCharacter.findFirstNonRepeatingCharacter("racecars"));
    }
}