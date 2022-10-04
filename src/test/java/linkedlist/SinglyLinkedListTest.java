package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
    @Test
    @DisplayName("Empty list returns -1")
    public void emptyList() {
        SinglyLinkedList sll = new SinglyLinkedList();
        Assertions.assertEquals(sll.get(1), -1);
    }

    @Test
    @DisplayName("addAtHead adds element at head")
    public void addAtHeadTest() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addAtHead(10);
        Assertions.assertEquals(sll.toArrayString(), "[10]");
    }

    @Test
    @DisplayName("addAtTail adds element at tail")
    public void addAtTailTest() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addAtTail(10);
        Assertions.assertEquals(sll.toArrayString(), "[10]");
    }

    @Test
    public void addAtIndexTest() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addAtIndex(0, 10);
        sll.addAtIndex(1, 20);
        sll.addAtIndex(2, 30);
        Assertions.assertEquals(sll.toArrayString(), "[10, 20, 30]");
    }

    @Test
    public void getTest() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addAtIndex(0, 10);
        sll.addAtIndex(1, 20);
        sll.addAtIndex(2, 30);
        Assertions.assertEquals(sll.get(0), 10);
        Assertions.assertEquals(sll.get(1), 20);
        Assertions.assertEquals(sll.get(2), 30);
    }

    @Test
    public void deleteAtIndexTest() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addAtIndex(0, 10);
        sll.addAtIndex(1, 20);
        sll.addAtIndex(2, 30);
        sll.deleteAtIndex(0);
        Assertions.assertEquals(sll.toArrayString(), "[20, 30]");
        sll.deleteAtIndex(1);
        Assertions.assertEquals(sll.toArrayString(), "[20]");
        sll.deleteAtIndex(0);
        Assertions.assertEquals(sll.toArrayString(), "[]");
    }
}