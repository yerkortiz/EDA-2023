package examples;

public class Circular {
    static void circular(int[] arr, int N, int M, int S){
        for(int i = M; S > 0; S --){
            i = i % N;
            System.out.printf("%d ", arr[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        circular(arr, 4, 30, 20);
    }
}
