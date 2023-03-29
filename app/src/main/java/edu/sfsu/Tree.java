package edu.sfsu;

public class Tree {
    private Node root;

    public void delete(int id) {

    }

    public void display() {

    }

    public Node find(int key) {
        Node current = root;

        while(current.data != key) {
            if(key < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if(current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int data) {
        Node node = new Node();

        node.data = data;

        if(root == null) {
            root = node;
        } else {
            Node parent = null;
            Node current = root;

            while(true) {
                parent = current;

                if(data < current.data) {
                    current = current.leftChild;

                    if(current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;

                    if(current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }
}