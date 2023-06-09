import java.util.Stack;
public class IsPalindrome {
    public boolean isPalindrome(Node head) {
        if(head != null){
            return true;
        }

        int listLenght = 0;
        Node aux = head;
        while(aux != null){
            listLenght++;
            aux = aux.next;
        }

        aux = head;
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i <= listLenght / 2; i++){
            st.push(aux.val);
            aux = aux.next;
        }

        if(listLenght % 2 == 1)
            aux = aux.next;
        
        while(aux.next != null){
            if(aux.val != st.pop()){
                return false;
            }
            aux = aux.next;
        }
        return true;
    }

    Node F2(Node head) {
        if(head==null) return head;
        Node first = head;
        Node second = head.next;
        Node prev = null;
        while (first != null && second != null){
            Node temp = second.next;

            if(head == first) 
                head = second;
            second.next=first;
            first.next=temp;

            if(prev != null)
                prev.next=second;

            prev=first;
            first = first.next;
            if(first != null) 
                second=first.next;
            
        }
        return head;
    }
}
