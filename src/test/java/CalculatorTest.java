import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void testSummeZweiPositiveIsOk() {
        calculator = new Calculator();
        assertEquals(calculator.sum(10,25), 35);
    }
}
