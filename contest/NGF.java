import java.util.*;

public class NGF {
    static ArrayList<Integer> NextGreaterFrecuencyElement(ArrayList<Integer> numbers) {
        ArrayList<Integer> nextGreaterFrecuencyElements = new ArrayList<Integer>(Collections.nCopies(numbers.size(), -1));
        Stack<Integer> st = new Stack<Integer>();
        Map<Integer, Integer> frecuencies = new HashMap<>();

        //calculate frecuencies
        for (Integer integer : numbers) {
            frecuencies.put(integer, frecuencies.getOrDefault(integer, 0) + 1);
        }

        for(int i = numbers.size() - 1; i >= 0; i--){
            if(st.empty()) {
                nextGreaterFrecuencyElements.set(i, -1);
                st.push(numbers.get(i));
                continue;
            }
            
            if(frecuencies.get(st.peek()) > frecuencies.get(numbers.get(i))){
                nextGreaterFrecuencyElements.set(i, st.peek());
                st.push(numbers.get(i));
                continue;
            }

            while(!st.empty()){
                if(frecuencies.get(st.peek()) > frecuencies.get(numbers.get(i))){
                    nextGreaterFrecuencyElements.set(i, st.peek());
                    st.push(numbers.get(i));
                    break;
                }
                st.pop();
            }
            if(st.empty()) {
                nextGreaterFrecuencyElements.set(i, -1);
                st.push(numbers.get(i));
            }
        }
        return nextGreaterFrecuencyElements;
    }


    static void PrintArrayList(ArrayList<Integer> arr){
        for (Integer integer : arr) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        var numbers1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 5));
        var res1 = NextGreaterFrecuencyElement(numbers1);
        PrintArrayList(res1);

        var numbers2 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 3, 4, 3, 5, 1));
        var res2 = NextGreaterFrecuencyElement(numbers2);
        PrintArrayList(res2);

        var numbers3 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 4, 2, 1));
        var res3 = NextGreaterFrecuencyElement(numbers3);
        PrintArrayList(res3);
    }
}
