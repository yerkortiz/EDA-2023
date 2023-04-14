package class8;

public class MergeSort {
    static void mergeSort(int[] arr, int lo, int hi) {
        if(lo >= hi) {
            //System.out.println(arr[(lo + hi) / 2]);
            return;
        }
        mergeSort(arr, lo, (lo + hi) / 2);
        mergeSort(arr, (lo + hi) / 2 + 1, hi);
    }
}
