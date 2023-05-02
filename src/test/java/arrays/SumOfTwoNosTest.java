package arrays;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoNosTest {
    @Test
    public void Addition() {
        int a=10,b=20;
        SumOfTwoNos sumOfTwoNos=new SumOfTwoNos();
        int actualValue=sumOfTwoNos.sum(a,b);
        Assert.assertEquals(30,actualValue);

    }

}