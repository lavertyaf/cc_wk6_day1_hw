import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator myCalculator;

    @Before
    public  void before() {
        myCalculator = new Calculator();
    }

    @Test
    public void multiply() {
        assertEquals(50, myCalculator.multiply(10, 5));
    }

    @Test
    public void divide() {
        assertEquals(2, myCalculator.divide(10, 5));
    }

    @Test
    public void add() {
        assertEquals(15, myCalculator.add(10, 5));
    }

    @Test
    public void subtract() {
        assertEquals(5, myCalculator.subtract(10, 5));
    }



}


