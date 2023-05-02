package arrays;

public class LargestNumberInArray {

    public int solution(int[] arr) {
        int max = -1;
        for (int element : arr) {
            max = Math.max(element, max);
        }
        return max;
    }
}
