package datastructures.trees;

public class BinarySearchTree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while(true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + " " );
        inOrderTraversal(root.rightChild);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " " );
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + " " );
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        if (root.leftChild == null && root.rightChild == null)
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

}
