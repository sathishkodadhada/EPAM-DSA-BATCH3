package com.epam.dsa.day4;

class Node {
    int value;
    Node next;
    Node prev;
}

public class Deque {

    private Node head;
    private Node tail;

    public Deque() {
        head = tail = null;
    }

    //TC: O(1) && SC: O(1)
    boolean isEmpty() {
        return head == null;
    }

    //TC: O(1) && SC: O(1)
    int size() {
        if (isEmpty()) return 0;
        Node temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    //TC: O(1) && SC: O(1)
    void addFirst(int element) {

        Node temp = new Node();
        temp.value = element;

        if (head == null) {
            head = tail = temp;
            temp.next = temp.prev = null;
        } else {
            head.prev = temp;
            temp.next = head;
            temp.prev = null;
            head = temp;
        }
    }

    //TC: O(1) && SC: O(1)
    void addLast(int element) {
        Node temp = new Node();
        temp.value = element;

        if (head == null) {
            head = tail = temp;
            temp.next = temp.prev = null;
        } else {
            tail.next = temp;
            temp.next = null;
            temp.prev = tail;
            tail = temp;
        }
    }

    //TC: O(1) && SC: O(1)
    int removeFirst() {
        if (!isEmpty()) {
            int val = head.value;
            head = head.next;
            if (head != null) head.prev = null;
            return val;
        }
        throw new RuntimeException("Deque is Empty");
    }

    //TC: O(1) && SC: O(1)
    int removeLast() {
        if (!isEmpty()) {
            int val = tail.value;
            tail = tail.prev;
            if (tail != null) tail.next = null;
            return val;
        }
        throw new RuntimeException("Deque is Empty");
    }
}
