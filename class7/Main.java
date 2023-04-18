package class7;

public class Main {
    static void printArray(int[] arr, int i){
        if(i == arr.length) {
            return;
        }
        System.out.printf("%d ", arr[i]);
        printArray(arr, i + 1);
    }
    public static void main(String[] args) {
        
    }
}
