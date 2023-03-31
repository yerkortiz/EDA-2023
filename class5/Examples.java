package class5;

import java.util.ArrayList;

public class Examples {
    static boolean isEven(int N) {
        if(N % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isOdd(int N) {
        if(!isEven(N)) {
            return true;
        } else {
            return false;
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sumNaturals(int N) {
        if(N == 1) {
            return 1;
        } 
        return N + sumNaturals(N - 1);
    }

    static void bubbleSort(int[] A, int N) {
        if(N == 1) {
            return;
        }
        for(int i = 0; i < N - 1; i++) {
            if(A[i] > A[i + 1]) {
                int temp = A[i];
                A[i] = A [i+1];
                A[i+1] = temp;
            }
        }
        bubbleSort(A, N - 1);
    }

    static int powerOfTwo(int N) {
        if(N == 0) {
            return 1;
        }
        return 2 * powerOfTwo(N - 1);
    }    

    static int slowerPowerOfTwo(int N) {
        if(N == 0) {
            return 1;
        }
        return slowerPowerOfTwo(N - 1) + slowerPowerOfTwo(N - 1);
    }    

    static int factorial(int N) {
        if(N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }

    public static String decimalToBinary(int N) {
        if(N < 2) {
            return String.valueOf(N % 2); 
        }
        return decimalToBinary(N/2) + N%2;
    } 

    public static int binaryToDecimal(String B){
        int N = 0;
        int twoPower = 1;
        for(int i = B.length() - 1; i >= 0; i--) {
            if(B.charAt(i) == '1') {
                N += twoPower;
            }
            twoPower = twoPower * 2;
        }
        return N;
    }

    static void bubbleSort(ArrayList<Integer> A, int N) {
        for(int i = 0; i < N - 1; i++) {
            if(A.get(i) > A.get(i + 1)) {
                int temp = A.get(i);
                A.set(i, A.get(i + 1));
                A.set(i+1, temp);
            }
        }
        if(N > 1) {
            bubbleSort(A, N - 1);
        }
    }

    static int slowerFactorial(int N) {
        if(N == 0) {
            return 1;
        }
        int sum = 0;
        for(int i = 0; i < N - 1; i++){
            sum += slowerFactorial(N - 1);
        }
        return sum + slowerFactorial(N - 1);
    }

    static int logTwo(int N) {
        if(N/2 < 2) {
            return 1;
        }
        return logTwo(N/2) + 1;
    }

    static int NLogTwo(int N) {
        if(N < 2) {
            return 1;
        }
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += NLogTwo(N); 
        }
        return sum;
    }
}
