package class14;

import java.util.ArrayDeque;
import java.util.Deque;

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

    int x = 10;

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

    boolean search(int key) {
        Node aux = root;
        while(aux != null){
            if(aux.val == key) {
                return true;
            }

            if(aux.val < key){
                aux = aux.right;
            } else {
                aux = aux.left;
            }
        }
        return false;
    }

    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }        
        preOrder(root.left);
        System.out.println(root.val);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.val);
    }

    void levelOrder(){
        Deque<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node aux = q.poll();
            System.out.println(aux.val);

            if(aux.left != null)
                q.add(aux.left);

            if(aux.right != null)
                q.add(aux.right);
        }
    }
    
    int maxHeight(Node node) {
        if (node == null)
            return 0;
        else {
            int lHeight = maxHeight(node.left);
            int rHeight = maxHeight(node.right);
 
            if (lHeight > rHeight) return (lHeight + 1);
            else return (rHeight + 1);
        }
    }
}

