public class HandshakeLemma {
    // suma de los N - 1 naturales
    static int handshakeLemma1(int N) {
        return (N*N - N) / 2; 
    }

    static int handshakeLemma2(int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(handshakeLemma1(5));
        System.out.println(handshakeLemma2(5));
    }
}
