package arrays;

import org.junit.Assert;
import org.junit.Test;

public class FIndMaxMinTest {

    @Test
    public void solution1(){
        int[] arr = {55, 33, 22, 0, -89, 3, 2, 556};
        FIndMaxMin fIndMaxMin = new FIndMaxMin();
        Pair actualPair = fIndMaxMin.findMaxMinValue(arr);
        Pair expectedPair = new Pair(556, -89);
        Assert.assertEquals(expectedPair.max, actualPair.max);
        Assert.assertEquals(expectedPair.min, actualPair.min);
    }

}