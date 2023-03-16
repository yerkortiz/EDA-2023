package class1;

public class Collatz {
    static void collatzRecursive(int N) {
        System.out.println(N);
        if (N == 1) {
            return;
        }
        if(N % 2 == 0) {
            collatzRecursive(N / 2);
        } else {
            collatzRecursive(3 * N + 1);
        }
    }

    static void collatzIterative(int N){
        System.out.println(N);
        while(N != 1) {
            if(N % 2 == 0) {
                N = N/2;
            } else {
                N = 3 * N + 1;
            }
            System.out.println(N);
        }
    }
    public static void main(String[] args) {
        collatzIterative(7);
        collatzRecursive(5);
    }
}
