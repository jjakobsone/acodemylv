import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    Calculator casio;

    @Test(testName = "Testing some method from Calculator")
    public void testSum(){
        casio = new Calculator();
        Assert.assertEquals(casio.sum(20, 30), 50);
    }

    @Test
    public void testDivide(){
        casio = new Calculator();
        Assert.assertEquals(casio.divide(10, 2), 5);
    }

    @Test
    public void testSubtract(){
        casio = new Calculator();
        Assert.assertEquals(casio.subtract(10, 2), 8);
    }

    @Test
    public void testMultiply(){
        casio = new Calculator();
        Assert.assertEquals(casio.multiply(10, 2), 20);
    }

}
