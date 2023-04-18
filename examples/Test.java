package examples;
import java.util.Scanner;
class Test {
    static void printArr(int[] arr, int i){
        if(i == arr.length) {
            return;
        }
        System.out.printf("%d ", arr[i]);
        printArr(arr, i + 1);
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = stdin.nextInt();
        }
        printArr(arr, 0);
        stdin.close();
    }
}