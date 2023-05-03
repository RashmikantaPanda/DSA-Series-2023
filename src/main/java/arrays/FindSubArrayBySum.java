package arrays;

import java.util.Arrays;

public class FindSubArrayBySum {
    public int[] findSubArray1(int[] arr, int targetSum) {

        int sum = 0;
        int[] subArrIndex = {0, -1};
        int startIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            startIndex = i;
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == targetSum) {
                    lastIndex = j;
                    return Arrays.copyOfRange(arr, startIndex, lastIndex + 1);
                } else if (sum > targetSum) {
                    break;
                }
            }
        }
        return subArrIndex;
    }

    public int[] findSubArray2(int[] arr, int sum) {
        int start = 0;
        int end = -1;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            while (currSum > sum && start <= i) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == sum) {
                end = i;
                break;
            }
        }
        if (end == -1) {
            return new int[]{0, -1};
        } else {
            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }
}
