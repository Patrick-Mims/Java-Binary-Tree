package edu.sfsu;

public class App {
    public static void main( String[] args ) {
        Tree tree = new Tree();

        tree.insert(100);
        tree.insert(75);
        tree.insert(25);
        tree.insert(5);

        Node result = tree.find(25);

        if(result != null) {
            System.out.println("item found!");
        } else {
            System.out.println("Item NOT found");
        }
    }
}

/*
* A data structure with the quick insertion and deletion of a linked list, and also the quick searching
* of an ordered array. Trees provide both these characteristics, and are also one of the most interesting
* data structures.
*
* What is a Tree?
* 1. A Tree consists of nodes connected by edges.
* 2. In Java nodes are represented by Objects.
* 3. Lines (edges) between the nodes represent the way the nodes are related.
* 4. In Java edges are likely to be represented in a program by references.
* 5. Each node in a binary tree has a maximum of two children.
* 6. More general trees, in which nodes can have more than two children are called multiway trees.
*
* Tree Terminology
* 1. Path
* 2. Root
* 3. Parent
* 4. Child
* 5. Leaf
* 6. Subtree
* 7. Visiting
* 8. Traversing
* 9. Levels
* 10. Keys
* */
