package arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindSubArrayBySumTest {


    FindSubArrayBySum findSubArr = new FindSubArrayBySum();
    int[] actualSubArr;
    int[] expectedSubArr;

    @Test
    public void findSubArrByMethod1() {
        int[] arr = {5, 6, 7, 9, 4, 4, 10, 11};
        int targetSum = 26;
        actualSubArr = findSubArr.findSubArray1(arr, targetSum);
        expectedSubArr = new int[]{6, 7, 9, 4};
        Assert.assertArrayEquals(expectedSubArr, actualSubArr);

    }

    @Test
    public void findSubArrByMethod1_1() {
        int[] arr = {5, 6, 7, 9, 4, 4, 10, 11};
        int targetSum = 216;
        actualSubArr = findSubArr.findSubArray1(arr, targetSum);
        expectedSubArr = new int[]{0, -1};
        Assert.assertArrayEquals(expectedSubArr, actualSubArr);

    }

    @Test
    public void findSubArrByMethod2() {
        int[] arr = {15, 2, 3, 4, 5, 8, 7, 9, 6, 2, 5, 4, 2, 6, 3, 2, 1, 5, 0, 1, 2, 4};
        int targetSum = 36;
        actualSubArr = findSubArr.findSubArray2(arr, targetSum);
        expectedSubArr = new int[]{3, 4, 5, 8, 7, 9};
        Assert.assertArrayEquals(expectedSubArr, actualSubArr);

    }

    @Test
    public void findSubArrByMethod2_1() {
        int[] arr = {15, 2, 3, 4, 5, 8, 7, 9, 6, 2, 5, 4, 2, 6, 3, 2, 1, 5, 0, 1, 2, 4};
        int targetSum = 306;
        actualSubArr = findSubArr.findSubArray2(arr, targetSum);
        expectedSubArr = new int[]{0, -1};
        Assert.assertArrayEquals(expectedSubArr, actualSubArr);

    }


}