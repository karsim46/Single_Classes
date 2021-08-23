import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(8, calculator.add(3, 5));

    }

    private void assertEquals(int integer, int add) {
    }


    @Test
    public void canSubtract() {
        assertEquals(3, calculator.subtract(6, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void canDivide(){
         assertEquals(8, calculator.divide(80, 10), 0.01));
        }

}


