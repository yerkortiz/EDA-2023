package class8;

public class MergeSort {
  // mejor y peor caso N lg N
    static void mergeSort(int[] arr, int lo, int hi) { // lg(N)
        if(lo >= hi) { //1
            //System.out.println(arr[(lo + hi) / 2]);
            return; // 1
        }
        mergeSort(arr, lo, (lo + hi) / 2); 
        mergeSort(arr, (lo + hi) / 2 + 1, hi);
        merge(arr, lo, (lo + hi) / 2, hi); // N
    }

    // O(N)
    static void merge(int array[], int p, int q, int r) {

        int n1 = q - p + 1; // mid - lo + 1
        int n2 = r - q; // hi - mid
    
        int L[] = new int[n1];
        int M[] = new int[n2];
    
        for (int i = 0; i < n1; i++)
          L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
          M[j] = array[q + 1 + j];
    
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
    
        while (i < n1 && j < n2) {
          if (L[i] <= M[j]) {
            array[k] = L[i];
            i++;
          } else {
            array[k] = M[j];
            j++;
          }
          k++;
        }
    
        while (i < n1) {
          array[k] = L[i];
          i++;
          k++;
        }
    
        while (j < n2) {
          array[k] = M[j];
          j++;
          k++;
        }
      }
}
