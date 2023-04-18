package class5;

public class Octal {
    public static void decToOctal(int N) {
        if(N < 8) {
            System.out.printf("%d ", N % 8);
            return; 
        }
        decToOctal(N/8);
        System.out.printf("%d ", N % 8);
    } 
}
