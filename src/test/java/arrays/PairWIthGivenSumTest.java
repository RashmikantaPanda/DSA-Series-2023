package arrays;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class PairWIthGivenSumTest {
    @Test
    public void solution1(){
        int[] arr={10,5,4,2,15,12,8,20,10,11,3,17};
        int sum=20;
        PairWIthGivenSum pairWIthGivenSum=new PairWIthGivenSum();
        HashMap<Integer,Integer> expectedData=pairWIthGivenSum.pairWithSum(arr,sum);
        HashMap<Integer,Integer> actualData=new HashMap<>();
        actualData.put(10,10);
        actualData.put(5,15);
        actualData.put(12,8);
        actualData.put(3,17);
        Assert.assertEquals(actualData,expectedData);
        Assert.assertEquals(expectedData,actualData);

    }

}