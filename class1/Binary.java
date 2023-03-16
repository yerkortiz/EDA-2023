package class1;
import java.lang.Math;
import java.util.Arrays;

public class Binary {
    static void binaryRecursive(int N) {
        if(N == 0 || N == 1) {
            System.out.print(N%2);
            return;
        };
        binaryRecursive(N / 2);
        System.out.print(N%2);
    }

    static void binaryIterative(int N) {
        int binarySize = (N != 0)? ((int) (Math.floor(Math.log(N) / Math.log(2)) + 1)) : 1;
        int[] binary = new int[binarySize];
        while(N > 1) {
            binary[(binarySize--) - 1] = N % 2;
            N /= 2;
        }
        binary[binarySize - 1] = N % 2;
        System.out.println(Arrays.toString(binary));
    }
     public static void main(String[] args) {
        binaryIterative(8);
    }
}
