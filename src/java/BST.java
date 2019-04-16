package src.java;

public class BST {

    static class Node {
        int data;
        Node left, right = null;

        public Node(int value){
            this.data = value;
            left = right = null;
        }
    }

    private Node root;


}
