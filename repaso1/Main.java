class Main{

    // metodo iterativo
    static void PrintList(Node head){
        if(head == null){
            return;
        }

        Node aux = head;
        while(aux != null){
            System.out.printf("%d ", aux.val);
            aux = aux.next;
        }
    }

    static void PrintListRecursive(Node head){
        if(head == null){
            return;
        }

        PrintListRecursive(head.next);       
        System.out.printf("%d ",head.val); 
    }

    static Node Push(Node head, int x){
        return new Node(x, head);
    }
    public static void main(String[] args) {
        // Node n4 = new Node(4, null);
        // Node n3 = new Node(3, n4);
        // Node n2 = new Node(2, n3);
        // Node n1 = new Node(1, n2);
        // PrintList(n1);
        // System.out.println();
        // PrintListRecursive(n1);
        Node n1 = Push(null, 1);
        Node n2 = Push(n1, 2);
        Node n3 = Push(n2, 3);
        PrintList(n3);
    }
}