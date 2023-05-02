package arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortingArrayTest {

    @Test
    public void testSortArray() {
        int[] arr = {1, 5, 3, 8, 4, 6, 5, 2, 7};
        SortingArray sortingArray = new SortingArray();
        int[] actualArray = sortingArray.sortArray(arr);
        int[] expectedArray = {1, 2, 3, 4, 5, 5, 6, 7, 8};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortArray1(){
        int[] arr={-8,7,9,6,4,5,2,0,3,-4,0};
        SortingArray sortingArray=new SortingArray();
        int[] acturalArray=sortingArray.sortArray(arr);
        int[] expectedArray={-8,-4,0,0,2,3,4,5,6,7,9};
        Assert.assertArrayEquals(expectedArray,acturalArray);
    }
}