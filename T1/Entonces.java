package T1;
import java.util.*;
public class Entonces {
    //solucion generando el subarray
    public static void genSubArray(ArrayList<Integer> arr, ArrayList<Integer> sub, int N, int M, int S){
        if(S == 0) {
            return;
        }
        sub.add(arr.get(M % N));
        genSubArray(arr, sub, N, M + 1, S - 1);
    }
    //solucion imprimiendo directo el subarray
    public static void printSubArr(ArrayList<Integer> arr, int N, int M, int S){
        if(S == 0) {
            return;
        }
        System.out.printf("%d ", arr.get(M % N));
        printSubArr(arr, N, M + 1, S - 1);
        
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt(); 
        int M = stdin.nextInt();
        int S = stdin.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            arr.add(stdin.nextInt());
        }
        ArrayList<Integer> sub = new ArrayList<Integer>();
        genSubArray(arr, sub, N, M, S);
        for(Integer i: sub){
            System.out.printf("%d ", i);
        }
        //printSubArr(arr, N, M, S);
        stdin.close();
    }
}
