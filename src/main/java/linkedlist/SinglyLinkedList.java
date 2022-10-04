package linkedlist;

import java.util.Arrays;

public class SinglyLinkedList {

    class Node {
        int value;
        Node next;

        Node(int v) {
            value = v;
            next = null;
        }
    }
    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        Node current = head;

        for (int i = 0; i < index; i++)
            current = current.next;

        return current.value;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;

        Node current = head;
        Node newNode = new Node(val);

        if (index == 0) {
            newNode.next = current;
            head = newNode;
        }
        else {
            for (int i = 0; i < index-1; i++)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        Node current = head;

        if (index == 0)
            head = head.next;
        else {
            for (int i = 0; i < index-1; i++)
                current = current.next;

            current.next = current.next.next;
        }
        size--;
    }

    public String toArrayString() {
        int[] array = new int[size];
        var current = head;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return Arrays.toString(array);
    }
}
