package class14;
class AVLTree {
    class Node {
        int val, height;
        Node left, right;
      
        Node(int d) {
          val = d;
          height = 1;
        }
      }
      
    Node root;
  
    int height(Node N) {
      if (N == null)
        return 0;
      return N.height;
    }
  
    int max(int a, int b) {
      return (a > b) ? a : b;
    }
  
    Node rightRotate(Node y) {
      Node x = y.left;
      Node T2 = x.right;
      x.right = y;
      y.left = T2;
      y.height = max(height(y.left), height(y.right)) + 1;
      x.height = max(height(x.left), height(x.right)) + 1;
      return x;
    }
  
    Node leftRotate(Node x) {
      Node y = x.right;
      Node T2 = y.left;
      y.left = x;
      x.right = T2;
      x.height = max(height(x.left), height(x.right)) + 1;
      y.height = max(height(y.left), height(y.right)) + 1;
      return y;
    }
  
    int getBalanceFactor(Node N) {
      if (N == null)
        return 0;
      return height(N.left) - height(N.right);
    }
  
    // Insert a node
    Node insertNode(Node node, int val) {
  
      if (node == null)
        return (new Node(val));
      if (val < node.val)
        node.left = insertNode(node.left, val);
      else if (val > node.val)
        node.right = insertNode(node.right, val);
      else
        return node;
  
      node.height = 1 + max(height(node.left), height(node.right));
      int balanceFactor = getBalanceFactor(node);
      if (balanceFactor > 1) {
        if (val < node.left.val) {
          return rightRotate(node);
        } else if (val > node.left.val) {
          node.left = leftRotate(node.left);
          return rightRotate(node);
        }
      }
      if (balanceFactor < -1) {
        if (val > node.right.val) {
          return leftRotate(node);
        } else if (val < node.right.val) {
          node.right = rightRotate(node.right);
          return leftRotate(node);
        }
      }
      return node;
    }
  
    Node nodeWithMimumValue(Node node) {
      Node current = node;
      while (current.left != null)
        current = current.left;
      return current;
    }
  
    Node deleteNode(Node root, int val) {
      if (root == null)
        return root;
      if (val < root.val)
        root.left = deleteNode(root.left, val);
      else if (val > root.val)
        root.right = deleteNode(root.right, val);
      else {
        if ((root.left == null) || (root.right == null)) {
          Node temp = null;
          if (temp == root.left)
            temp = root.right;
          else
            temp = root.left;
          if (temp == null) {
            temp = root;
            root = null;
          } else
            root = temp;
        } else {
          Node temp = nodeWithMimumValue(root.right);
          root.val = temp.val;
          root.right = deleteNode(root.right, temp.val);
        }
      }
      if (root == null)
        return root;
  
      root.height = max(height(root.left), height(root.right)) + 1;
      int balanceFactor = getBalanceFactor(root);
      if (balanceFactor > 1) {
        if (getBalanceFactor(root.left) >= 0) {
          return rightRotate(root);
        } else {
          root.left = leftRotate(root.left);
          return rightRotate(root);
        }
      }
      if (balanceFactor < -1) {
        if (getBalanceFactor(root.right) <= 0) {
          return leftRotate(root);
        } else {
          root.right = rightRotate(root.right);
          return leftRotate(root);
        }
      }
      return root;
    }
  
    void preOrder(Node node) {
      if (node != null) {
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
      }
    }
  
    private void printTree(Node currPtr, String indent, boolean last) {
      if (currPtr != null) {
        System.out.print(indent);
        if (last) {
          System.out.print("R----");
          indent += "   ";
        } else {
          System.out.print("L----");
          indent += "|  ";
        }
        System.out.println(currPtr.val);
        printTree(currPtr.left, indent, false);
        printTree(currPtr.right, indent, true);
      }
    }
  
    public static void main(String[] args) {
      AVLTree tree = new AVLTree();
      tree.root = tree.insertNode(tree.root, 33);
      tree.root = tree.insertNode(tree.root, 13);
      tree.root = tree.insertNode(tree.root, 53);
      tree.root = tree.insertNode(tree.root, 9);
      tree.root = tree.insertNode(tree.root, 21);
      tree.root = tree.insertNode(tree.root, 61);
      tree.root = tree.insertNode(tree.root, 8);
      tree.root = tree.insertNode(tree.root, 11);
      tree.printTree(tree.root, "", true);
      tree.root = tree.deleteNode(tree.root, 13);
      System.out.println("After Deletion: ");
      tree.printTree(tree.root, "", true);
    }
  }