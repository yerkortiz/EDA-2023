package Search;
import java.util.ArrayList;

public class LinearSearch {
    // int array method
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // integer arraylist method
    public static boolean linearSearch(ArrayList<Integer> arr, int target) {
        for (Integer e : arr) {
            if(e == target) {
                return true;
            } 
        }
        return false;
    }

    // generic arraylist method
    public static <T> boolean linearSearch(ArrayList<T> arr, T target) {
        for (T e : arr) {
           if(e.equals(target)) {
            return true;
           } 
        }
        return false;
    }
}
