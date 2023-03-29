package Search;
import java.lang.Math;
public class Search {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random()*(1.1e1));
        }

        for (int e : arr) {
            System.out.println(e);
        }

        LinearSearch.linearSearch(arr, 2);
    }
}
