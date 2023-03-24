package class1;
import java.lang.Math;
import java.lang.Integer;
import java.util.Arrays;

public class Binary {
    static void binaryRecursive(int N) {
        if(N < 2) {
            System.out.print(N%2);
            return;
        };
        binaryRecursive(N / 2);
        System.out.print(N%2);
    }

    // divisions method
    static void binaryIterative(int N) {
        int maxSize = 32;
        int[] binary = new int[maxSize];
        Arrays.fill(binary, -1);
        while(N > 1) {
            binary[maxSize - 1] = N % 2;
            N /= 2;
            maxSize--;
        }
        binary[maxSize - 1] = N % 2;
        for(int i = 0; i < binary.length; i++) {
            if(binary[i] == -1) {
                continue;
            }
            System.out.printf("%d ", binary[i]);
        }
    }
    // substraction method
    static void binaryIterative2(int N){
        int maxSize = 32;
        int[] binary  = new int[maxSize];
        Arrays.fill(binary, -1);
        int powerOfTwo = (int) Math.pow(2, 10);
        int current = 0;
        while(N < powerOfTwo) {
            powerOfTwo = powerOfTwo / 2;
            current++;
        }

        while(powerOfTwo > 0) {
            if(N >= powerOfTwo) {
                binary[current] = 1;
                N = N - powerOfTwo;
            } else {
                binary[current] = 0;
            }
            powerOfTwo = powerOfTwo / 2;
            current++;
        }

        for(int i = 0; i < binary.length; i++) {
            if(binary[i] == -1) {
                continue;
            }
            System.out.printf("%d ", binary[i]);
        }
    }

    // cheese method
    static void binary(int N){
        System.out.printf(Integer.toBinaryString(N));
    }
     public static void main(String[] args) {
        //binaryIterative2(0);
        binary(10);
    }
}
