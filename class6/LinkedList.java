package class6;

public class LinkedList {
    LinkedListNode head;
    public class LinkedListNode {
        int value;
        LinkedListNode next;
        LinkedListNode(int x) {
            this.value = x;
            this.next = null;
        }
        LinkedListNode(int x, LinkedListNode next) {
            this.value = x;
            this.next = next;
        }
    }

    public void InsertFirst(int x){
        if (this.head == null) {
            this.head = new LinkedListNode(x);
            return;
        } 
        LinkedListNode aux = new LinkedListNode(x, this.head);
        this.head = aux;
    }

    public boolean Search(int target){
        LinkedListNode aux = this.head;
        while(aux != null) {
            if(aux.value == target) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    public void DeleteFirst(){
        if (this.head == null) {
            return;
        } 
        this.head = this.head.next;
    }

    public void PrintLinkedList(){
        LinkedListNode aux = this.head;
        while(aux != null) {
            System.out.println(aux.value);
            aux = aux.next;
        }
    }

    public void RecursivePrint(){
        AuxRecursivePrint(this.head);
    }

    public void AuxRecursivePrint(LinkedListNode aux){
        if (aux == null) {
            return;
        }
        System.out.println(aux.value);
        AuxRecursivePrint(aux.next);
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertFirst(0);
        ll.InsertFirst(1);
        ll.InsertFirst(2);
        ll.RecursivePrint();
        //ll.DeleteFirst();
        //ll.RecursivePrint();
    }
}
