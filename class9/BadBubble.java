package class9;

public class BadBubble {
    public static void badBubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++) {
            for(int j = 0; j < arr.length - i - 1; j ++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void PrintArr(int[] arr){
        for(int i = 0; i < arr.length; i ++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
