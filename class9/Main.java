package class9;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Exp.F1(2, 3));
        //System.out.println(Exp.F1(2, 4));
        //System.out.println(Exp.F1(3, 2));

        // var ll = new LinkedList();
        // ll.pushBack(1);
        // ll.pushBack(2);
        // ll.pushBack(3);
        // ll.printList();
        // var h = LinkedList.F(ll.head);
        // var ll2 = new LinkedList();
        // ll2.head = h;
        // ll2.printList();
        int[] a = {5, 7, 2, 4};
        BadBubble.PrintArr(a);
        BadBubble.bubbleSort(a);
        BadBubble.PrintArr(a);
    }
}
