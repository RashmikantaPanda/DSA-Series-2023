package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class OccurrenceOfEachNoTest {
    @Test
    public void occurrenceOfEachNoTestCase(){
        int[] arr={1,2,1,2,1,3,4,3,5,6,4,5,2};
        OccurrenceOfEachNo occurrenceOfEachNo=new OccurrenceOfEachNo();
        HashMap<Integer,Integer> actualMap=occurrenceOfEachNo.occurrenceOfIntUsingCollection(arr);
        HashMap<Integer,Integer> expextedMap=new HashMap<>();
        expextedMap.put(1,3);
        expextedMap.put(2,3);
        expextedMap.put(3,2);
        expextedMap.put(4,2);
        expextedMap.put(5,2);
        expextedMap.put(6,1);
        Assert.assertEquals(expextedMap,actualMap);



    }


}