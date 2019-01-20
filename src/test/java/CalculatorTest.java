import org.junit.Before;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        assertEquals(calculator.sum(10, 25), 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        assertEquals(calculator.subtraction(25, 10), 15);
    }

    @Test
    public void testMultiplicationZweiPositiveIsOk() {
        assertEquals(calculator.multiplication(25, 10), 250);
    }

    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertEquals(calculator.division(30, 10), 3);
    }
}
