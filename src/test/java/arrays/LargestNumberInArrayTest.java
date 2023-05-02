package arrays;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberInArrayTest {

    @Test
    public void solution1() {
        int arr[] = {1, 5, 3, 7, 8, 9, 12, 30, 9, 8};
        LargestNumberInArray largestNumberInArray = new LargestNumberInArray();
        int actualValue = largestNumberInArray.solution(arr);
        Assert.assertEquals(30, actualValue);
    }
}