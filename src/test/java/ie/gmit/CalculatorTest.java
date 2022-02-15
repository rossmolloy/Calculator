package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void justAnExample() {}

    @Test
    void testAdd() {
        assertEquals(25, calculator.add(15, 10));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(15, 10));
    }

    @Test
    void testDivide() {
        assertEquals(1.5, calculator.divide(15, 10));
    }

    @Test
    void testMultiply() {
        assertEquals(150, calculator.multiply(15, 10));
    }
}
