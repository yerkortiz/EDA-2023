package Analysis;

public class Binario {
    public static void decToBin(int N) {
        if(N < 2) {
            System.out.printf("%d", N % 2);
            return;
        }
        decToBin(N/2);
        System.out.printf("%d", N % 2);
    }

    public static int binToDec(String b){
        int N = 0;
        int twoPower = 1;
        for(int i = b.length() - 1; i >= 0; i--) {
            if(b.charAt(i) == '1') {
                N += twoPower;
            }
            twoPower = twoPower * 2;
        }
        return N;
    }
}
