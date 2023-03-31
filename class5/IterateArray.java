package class5;
import java.util.ArrayList;
public class IterateArray {
    public static void iterateArray(ArrayList<Integer> arr, int i) {
        if(i == arr.size()) {
            System.out.println();
            return;
        }
        System.out.printf("%d ", arr.get(i));
        iterateArray(arr, i + 1);
    }
}
