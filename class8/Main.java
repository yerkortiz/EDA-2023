package class8;
import java.util.*;
//

public class Main {
    public static void main(String[] args) {
        //int[] arr = new int[8];
        int N = 4;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = (int) (Math.random() * (100));
        }
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        //System.out.println(MergeSort.K);
        //MergeSort.merge(arr, 0, 4);
        System.out.println(Exp.exp(2, 3));
        System.out.println(Exp.powerOfTwo(3));
        System.out.println(Exp.slowerPowerOfTwo(3));
    }
}
