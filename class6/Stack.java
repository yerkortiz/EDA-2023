package class6;

public class Stack {
    StackNode top;
    public class StackNode {
        int value;
        StackNode next;
        StackNode(int x) {
            this.value = x;
            this.next = null;
        }
        StackNode(int x, StackNode next) {
            this.value = x;
            this.next = next;
        }
    }

    public void Push(int x){
        if (this.top == null) {
            this.top = new StackNode(x);
            return;
        } 
        StackNode aux = new StackNode(x, this.top);
        this.top = aux;
    }

    public void Pop(int x){
        if (this.top == null) {
            return;
        } 
        this.top = this.top.next;
    }

    public static void main(String[] args) {
    }
}

