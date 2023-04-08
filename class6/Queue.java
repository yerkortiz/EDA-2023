package class6;

public class Queue {
    QueueNode front;
    QueueNode tail;
    public class QueueNode {
        int value;
        QueueNode next;
        QueueNode(int x) {
            this.value = x;
            this.next = null;
        }
        QueueNode(int x, QueueNode next) {
            this.value = x;
            this.next = next;
        }
    }

    public void Enqueue(int x){
        if (this.front == null) {
            this.front = new QueueNode(x);
            this.tail = this.front;
            return;
        } 
        QueueNode aux = new QueueNode(x, this.tail);
        this.tail.next = aux;
    }

    public void Dequeue(int x){
        if (this.front == null) {
            return;
        } 

        if(this.front == this.tail) {
            this.front = null;
            this.tail = null;
            return;
        }
        
        this.front = this.front.next;
    }

    public static void main(String[] args) {
    }
}

