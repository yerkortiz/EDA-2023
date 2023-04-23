public class Node {
    int val;
    Node next;

    Node(int x){
        this.val = x;
        this.next = null;
    }

    Node(int x, Node next){
        this.val = x;
        this.next = next;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node temp = new Node(0); 
        Node aux = temp;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; 
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){ 
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; 
            carry = sum/10; 
            Node node = new Node(sum % 10); 

            aux.next = node; 
            aux = aux.next; 
        }
        return temp.next; 
    }
}


