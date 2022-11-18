package com.epam.dsa.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class UniqueTuplesTest {
    private final UniqueTuples uniqueTuples = new UniqueTuples();

    @Test
    void uniqueTuples() {
        Assertions.assertEquals(Set.of("ab", "bb", "bc", "cc", "cd", "de"), uniqueTuples.uniqueTuples("abbccde", 2));
    }

    @Test
    void uniqueTuplesWhenLenis3() {
        Assertions.assertEquals(Set.of("abb", "bbc", "bcc", "ccd", "cde"), uniqueTuples.uniqueTuples("abbccde", 3));
    }

    @Test
    void uniqueTuplesWithEmpty() {
        Assertions.assertEquals(Set.of(), uniqueTuples.uniqueTuples("", 3));
    }
}