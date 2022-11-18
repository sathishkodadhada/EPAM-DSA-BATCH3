package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DequeTest {
    private final Deque deque = new Deque();

    @Test
    void testIsEmpty() {
        Assertions.assertTrue(deque.isEmpty());
        deque.addFirst(1);
        deque.addLast(2);
        Assertions.assertFalse(deque.isEmpty());
    }

    @Test
    void testSize() {
        Assertions.assertEquals(0, deque.size());
        deque.addFirst(1);
        deque.addLast(2);
        Assertions.assertEquals(2, deque.size());
    }

    @Test
    void testRemoveFirst() {
        deque.addFirst(1);
        Assertions.assertEquals(1, deque.removeFirst());
        Assertions.assertThrows(RuntimeException.class, deque::removeFirst);
    }

    @Test
    void testRemoveLast() {
        deque.addLast(2);
        Assertions.assertEquals(2, deque.removeLast());
        Assertions.assertThrows(RuntimeException.class, deque::removeLast);
    }
}