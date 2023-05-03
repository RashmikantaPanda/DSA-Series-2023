package arrays;

import java.util.*;

public class OccurrenceOfAInteger {
    public int occurrenceOfIntegerInArray(int[] arr, int n){
        int count=0;
        for (int j : arr) {
            if (j == n) {
                count++;
            }
        }
        return count;

    }


}
