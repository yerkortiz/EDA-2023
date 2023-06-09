class LinkedList {
    Node head;

    LinkedList(){}
    LinkedList(int x){
        this.head = new Node(x);
    }

    void printList(){
        if(head == null){
            return;
        }

        Node aux = head;
        while(aux != null){
            System.out.printf("%d ", aux.val);
            aux = aux.next;
        }
    }

    // insert al inicio
    void push(int x){
        if(head == null) {
            this.head = new Node(x, null);
            return;
        }
        this.head = new Node(x, head);
    }

    // insert al final
    void pushBack(int x){
        if(head == null){
            this.head = new Node(x, null);
            return;
        }

        Node aux = head;
        while(aux.next != null){
            aux = aux.next;
        }
        aux.next = new Node(x, null);
    }

    //verificar si esta ordenada
    boolean isSorted(){
        if(head == null){
            return false;
        }
        
        Node aux = head;
        while(aux.next != null){
            if(aux.val > aux.next.val){
                return false;
            }
            aux = aux.next;
        }
        return true;
    }

    boolean remove(int x){
        if(head == null){
            return false;
        }

        if(head.val == x){
            this.head = head.next;
            return true;
        }

        Node aux = head;
        while(aux.next != null){
            if(aux.next.val == x){
                aux.next = aux.next.next;
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    static Node reverse(Node head){
        if(head == null){
            return head;
        }
        Node prev = null;
        Node aux = head;
        Node temp = null;
        while(aux != null){
            //guardo el siguiente para no perderlo
            temp=aux.next;
            //cambio la direccion del next
            aux.next = prev;
            //avanzo el prev
            prev = aux;
            //avanzo el aux
            aux = temp;
        } 
        head = prev;
        return head;
    }

    static Node Push(Node head, int x){
        return new Node(x, head);
    }
    static Node sumLists(Node l1, Node l2){
        if(l1 == null){ // 1
            return l2; // 1
        }
        if(l2 == null){ // 1
            return l1; // 1
        }

        Node head = null; // 1

        l1 = reverse(l1); // N
        l2 = reverse(l2); //N
        int carry = 0; // 1
        int val = 0; // 1
        while(l1 != null && l2 != null){ // N
            val = (l1.val + l2.val + carry) % 10; // 1
            head = Push(head, val); //1

            carry = (l1.val + l2.val + carry) / 10; // 1
            l1 = l1.next; // 1
            l2 = l2.next; // 1
        }
        if(carry > 0){ // 1
            head = Push(head, carry); // 1
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList(); 
        l1.pushBack(7);
        l1.pushBack(0);
        l1.pushBack(0);
        
        l2.pushBack(9);
        l2.pushBack(0);
        l2.pushBack(0);

        // l1.printList();
        // l1.head = reverse(l1.head);
        // l1.printList();
        LinkedList l3 = new LinkedList();
        l3.head = sumLists(l1.head, l2.head);
        l3.printList();
    }
}