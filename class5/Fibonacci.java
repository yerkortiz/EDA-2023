package class5;

public class Fibonacci {

    public static int fibonacci(int N) {
        if(N <= 0) {
            return 0;
        } else if(N == 1) {
            return 1;
        } 
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
