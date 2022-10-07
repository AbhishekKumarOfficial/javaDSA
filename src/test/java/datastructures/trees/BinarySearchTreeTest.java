package datastructures.trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BinarySearchTreeTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void findTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        Assertions.assertTrue(bst.find(10));
    }

    @Test
    public void inOrderTraversalTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        bst.inOrderTraversal();
        Assertions.assertEquals("1 4 6 7 8 9 10", outputStreamCaptor.toString().trim());
    }

    @Test
    public void preOrderTraversalTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        bst.preOrderTraversal();
        Assertions.assertEquals("7 4 1 6 9 8 10", outputStreamCaptor.toString().trim());
    }

    @Test
    public void postOrderTraversalTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        bst.postOrderTraversal();
        Assertions.assertEquals("1 6 4 8 10 9 7", outputStreamCaptor.toString().trim());
    }

    @Test
    public void heightTest() {
        BinarySearchTree bst = new BinarySearchTree();
        Assertions.assertEquals(bst.height(), -1);
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        Assertions.assertEquals(bst.height(), 2);
    }
}