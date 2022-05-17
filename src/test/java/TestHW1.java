import org.junit.Assert;
import org.junit.Test;

public class TestHW1 {

    @Test
    public void testOddEven1 () {
        String result = HW1.oddEven(-345);
        Assert.assertEquals ("Odd", result);
    }

    @Test
    public void testOddEven2 () {
        String result = HW1.oddEven(0);
        Assert.assertEquals ("Even", result);
    }

    @Test
    public void testOddEven3 () {
        String result = HW1.oddEven(22222);
        Assert.assertEquals ("Even", result);
    }

    @Test
    public void testOddEven4 () {
        String result = HW1.oddEven(2147483647 + 1);
        Assert.assertEquals ("Undefined", result);
    }

    @Test
    public void testOddEven3_1 () {
        String result = HW1.oddEven(22223);
        Assert.assertEquals ("Even", result);
    }



}


//Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”