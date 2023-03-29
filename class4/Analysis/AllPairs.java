package Analysis;

import java.util.ArrayList;

public class AllPairs {
    public static void allPairs(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j ++) {
                System.out.printf("%d , %d", arr.get(i), arr.get(i));
            }
        }
    }
}
