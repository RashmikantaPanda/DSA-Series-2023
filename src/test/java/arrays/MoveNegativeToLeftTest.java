package arrays;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MoveNegativeToLeftTest {
    @Test
    public void moveNegativeWithoutSortingTestCase1(){
        int[] arr={-8,6,5,9,-8,-6,4,-3,-3,-1,6,8,3,4,9,-6,7};
        System.out.println("---WithoutUsingSorting---");
        System.out.println("Given array : "+Arrays.toString(arr));

        MoveNegativeToLeft moveNegativeToLeft=new MoveNegativeToLeft();
        int[] actualArray=moveNegativeToLeft.moveNegativeWithOutSorting(arr);
        int[] expectedArray={-8, -6, -1, -3, -8, -6, -3, 4, 9, 5, 6, 8, 3, 4, 9, 6, 7};
        Assert.assertArrayEquals(expectedArray,actualArray);

        System.out.println("Result array : "+Arrays.toString(actualArray));
    }

    @Test
    public void moveNegativeUsingSortingTestCase1(){
        int[] arr={-8,6,5,9,-8,-6,4,-3,-3,-1,6,8,3,4,9,-6,7};
        System.out.println("---Using Sortring---");
        System.out.println("Given array : "+Arrays.toString(arr));

        MoveNegativeToLeft moveNegativeToLeft=new MoveNegativeToLeft();
        int[] actualArray=moveNegativeToLeft.moveNegativeUsingSorting(arr);
        int[] expectedArray={-8, -8, -6, -6, -3, -3, -1, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9};
        Assert.assertArrayEquals(expectedArray,actualArray);

        System.out.println("Result array : "+Arrays.toString(actualArray));
    }




}