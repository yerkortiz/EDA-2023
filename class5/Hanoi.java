package class5;

public class Hanoi {
    public static void hanoiTowers(int n, char src, char dst, char tmp) {
        if(n == 1) {
            System.out.printf("%s -> %s\n", src, dst);
            return;
        }
        hanoiTowers(n - 1, src, tmp, dst);
        System.out.printf("%s -> %s\n", src, dst);
        hanoiTowers(n - 1, tmp, dst, src);
    }
}
