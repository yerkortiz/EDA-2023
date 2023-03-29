package Analysis;

public class IterateArray {
    public static void iterateArray (int[] arr, int i) {
        if(i == arr.length) {
            return;
        }
        iterateArray(arr, i + 1);
        System.out.printf("%d ", arr[i]);
    }
}
