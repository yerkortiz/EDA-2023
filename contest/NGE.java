import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;
import java.util.Collections;
public class NGE {
    // Next Greater Element es una función que calcula el siguiente
    // elemento mayor para un arraylist de enteros
    static ArrayList<Integer> NextGreaterElement(ArrayList<Integer> numbers) {
        ArrayList<Integer> nextGreaterElements = new ArrayList<Integer>(Collections.nCopies(numbers.size(), -1));
        Stack<Integer> st = new Stack<Integer>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if(st.empty()) {
                nextGreaterElements.set(i, -1);
                st.push(numbers.get(i));
                continue;
            } 

            if(st.peek() > numbers.get(i)){
                nextGreaterElements.set(i, st.peek());
                st.push(numbers.get(i));
                continue;
            }

            while(!st.empty()){
                if(st.peek() > numbers.get(i)){
                    nextGreaterElements.set(i, st.peek());
                    st.push(numbers.get(i));
                    break;
                }
                st.pop();
            }

            if(st.empty()) {
                nextGreaterElements.set(i, -1);
                st.push(numbers.get(i));
            }
        }
        return nextGreaterElements;
    }

    static void PrintArrayList(ArrayList<Integer> arr){
        for (Integer integer : arr) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        var numbers1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        var res1 = NextGreaterElement(numbers1);
        PrintArrayList(res1);

        var numbers2 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 2, 8, 1));
        var res2 = NextGreaterElement(numbers2);
        PrintArrayList(res2);

        var numbers3 = new ArrayList<Integer>(Arrays.asList(13, 7, 6, 12));
        var res3 = NextGreaterElement(numbers3);
        PrintArrayList(res3);
    }
}
