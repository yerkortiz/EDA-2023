package bst;
public class BST {
    class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    Node root;

    void insert(int key) { 
        root = auxInsert(root, key); 
    }

    Node auxInsert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (key < root.val) {
            root.left = auxInsert(root.left, key);
        } else if (key > root.val) {
            root.right = auxInsert(root.right, key);
        }

        return root;
    }
}
