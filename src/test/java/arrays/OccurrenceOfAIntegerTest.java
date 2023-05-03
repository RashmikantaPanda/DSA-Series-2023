package arrays;

import org.junit.Assert;
import org.junit.Test;

public class OccurrenceOfAIntegerTest {
    @Test
    public void solution1(){
        int[] arr={1,1,2,3,4,5,6,5,6,78,9,5,1,2,5,6,4,5,3,5,2,5,6,45};
        OccurrenceOfAInteger occrOfInt=new OccurrenceOfAInteger();
        int searchValue=5;
        int actualValue=occrOfInt.occurrenceOfIntegerInArray(arr,searchValue);
        int expectedValue=7;
        Assert.assertEquals(expectedValue,actualValue);

    }

}