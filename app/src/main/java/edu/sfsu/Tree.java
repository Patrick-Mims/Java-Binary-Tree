package edu.sfsu;

public class Tree {
    private Node root;

    public void delete(int id) {

    }

    public void display() {

    }

    public void find(int key) {

    }

    public void insert(int data) {
        Node node = new Node();

        node.data = data;

        if(root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;

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
