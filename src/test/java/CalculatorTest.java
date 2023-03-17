import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {


    Calculator casio = new Calculator();

    @Test
    public void divide() {
        Assert.assertEquals(casio.divide(100, 50), 2);
    }

    @Test
    public void subtract() {
        Assert.assertEquals(casio.subtract(100, 50), 50);
    }

    @Test
    public void multyplay() {
        Assert.assertEquals(casio.multyply(50, 3), 150);
    }

    @Test
    public void sum() {
        Assert.assertEquals(casio.sum(50, 53), 103);
    }
}