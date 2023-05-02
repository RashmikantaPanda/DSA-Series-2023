package arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testReverseWord() {
        String str="Rashmikanta";
        ReverseString reverseString=new ReverseString();
        String actualString=reverseString.reverseWord(str);
        String expectedString="atnakimhsaR";
        Assert.assertEquals(actualString,expectedString);
    }

    @Test
    public void testReverseWord1() {
        String str="000111222333";
        ReverseString reverseString=new ReverseString();
        String actualString=reverseString.reverseWord(str);
        String expectedString="333222111000";
        Assert.assertEquals(actualString,expectedString);
    }


}