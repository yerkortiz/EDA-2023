package class5;

public class Binary {
    public static String decToBin(int N) {
        if(N < 2) {
            return String.valueOf(N % 2); 
        }
        return decToBin(N/2) + N%2;
    } 
}
