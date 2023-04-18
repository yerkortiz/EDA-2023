package class9;

public class LinkedList {
    class LinkedListNode {
        int val;
        LinkedListNode next;
        LinkedListNode(int val, LinkedListNode next){
            this.val = val;
            this.next = next;
        }
    }

    LinkedListNode head;

    boolean isEmpty(){
        if(this.head == null) {
            return true;
        }
        return false;
    }

    void pushBack(int x){
        if(isEmpty()){
            this.head = new LinkedListNode(x, null);
            return;
        }
        LinkedListNode aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        aux.next = new LinkedListNode(x, null);
    }

    void printList(){
        LinkedListNode aux = this.head;
        while(aux != null){
            System.out.printf("%d ", aux.val);
            aux = aux.next;
        }
    }

    void printList2(){
        for(LinkedListNode aux = this.head; aux != null; aux = aux.next){
            System.out.printf("%d", aux.val);
        }
        
    }

    void printReverseList3(LinkedListNode aux){
        if(aux == null){
            return;
        }
        printReverseList3(aux.next);
        System.out.printf("%d", aux.val);

    }

    static LinkedListNode F(LinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode prev = null;
        LinkedListNode aux = F(head.next);
        head.next.next = head;
        head.next = prev;
        return aux;
    }
}
