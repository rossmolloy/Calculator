package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator(15, 10);

    @Test
    void justAnExample() {}

    @Test
    void testAdd() {
        assertEquals(25, calculator.add());
    }
}