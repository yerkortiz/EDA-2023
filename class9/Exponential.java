package class9;

public class Exponential {
    public static int F1(int A, int N){
        if(N == 0) {
            return 1;
        }
        return A * F1(A, N - 1);
    }

    static int f1(int N) {
        if(N == 0) {
            return 1;
        }
        return f1(N - 1) + f1(N - 1);
    }  
}
