package Analysis;
public class BinarySearch {
    public static boolean binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int mid = arr.length / 2;
        while(low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
