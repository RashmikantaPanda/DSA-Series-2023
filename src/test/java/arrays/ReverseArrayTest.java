package arrays;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {
    @Test
    public void reverseArray(){
        int[] givenArray={1,2,3,4,5};
        ReverseArray reverseArray=new ReverseArray();
        int[] actualArray= reverseArray.reverseTheArray(givenArray);
        int[] expectedArray={5,4,3,2,1};
        //Assert.assertEquals(expectedArray,actualArray);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void reverseArray1(){
        int[] arr={1,1,2,2,3,3};
        ReverseArray reverseArray=new ReverseArray();
        int[] actualArray=reverseArray.reverseTheArray(arr);
        int[] expectedArray={3,3,2,2,1,1};
        Assert.assertArrayEquals(expectedArray,actualArray);

    }

}