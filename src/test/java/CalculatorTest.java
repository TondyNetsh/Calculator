import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        //Calculator.add(1,5);
        Assert.assertEquals(Calculator.add(2,3,4,5), 14);
    }
    @Test
    public void multiplyTest(){
        //Calculator.multiply(2,5);
        Assert.assertEquals(Calculator.multiply(2,3), 6);
    }
}

