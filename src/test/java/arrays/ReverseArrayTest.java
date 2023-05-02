package arrays;
import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {
    @Test
    public void reverseArray(){
        int[] givenArray={1,2,3,4,5};
        ReverseArray reverseArray=new ReverseArray();
        int[] actualArray= reverseArray.reverseTheArray(givenArray);
        int[] expectedArray={5,4,3,2,1};
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
    @Test
    public void reverseArray2() {
        int[] arr = {0,10,5,2,1,0};
        ReverseArray reverseArray = new ReverseArray();
        int[] actualArray = reverseArray.reverseTheArray(arr);
        int[] expectedArray = {0,1,2,5,10,0};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

}