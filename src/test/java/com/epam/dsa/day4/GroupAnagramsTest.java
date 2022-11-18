package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

class GroupAnagramsTest {
    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void groupAnagrams() {
        Assertions.assertEquals(Set.of(Set.of("cat"), Set.of("dog", "god")), groupAnagrams.groupAnagrams(List.of("cat", "dog", "god")));
    }

    @Test
    void groupAnagramsWithEmptyList() {
        Assertions.assertEquals(Set.of(), groupAnagrams.groupAnagrams(List.of()));
    }
}