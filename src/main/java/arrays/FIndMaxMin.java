package arrays;

import java.util.Map;

class Pair {
    int max;
    int min;

    public Pair(int max, int min) {
        this.max = max;
        this.min = min;
    }
}

public class FIndMaxMin {
    public Pair findMaxMinValue(int[] arr) {
        int max = -1;
        int min = 999999999;
        for (int item : arr) {
            max = Math.max(item, max);
            min = Math.min(item, min);
        }
        return new Pair(max, min);
    }
}
