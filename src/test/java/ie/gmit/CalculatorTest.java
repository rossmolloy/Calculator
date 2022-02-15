package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void justAnExample() {}

    @Test
    void testAdd() {
        assertEquals(25, calculator.add(15, 10));
    }

    @Test
    void testAddErrorFirstBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.add(-1, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testAddErrorSecondBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.add(15, -1); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testAddErrorFirstAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.add(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testAddErrorSecondAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.add(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(15, 10));
    }

    @Test
    void testSubtractErrorFirstBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.subtract(-1, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testSubtractErrorSecondBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.subtract(15, -1); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testSubtractErrorFirstAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.subtract(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testSubtractErrorSecondAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.subtract(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testDivide() {
        assertEquals(1.5, calculator.divide(15, 10));
    }

    @Test
    void testDivideErrorFirstBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.divide(-1, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testDivideErrorSecondBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.divide(15, -1); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testDivideErrorFirstAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.divide(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testDivideErrorSecondAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.divide(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testMultiply() {
        assertEquals(150, calculator.multiply(15, 10));
    }

    @Test
    void testMultiplyErrorFirstBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.multiply(-1, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testMultiplyErrorSecondBelow0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.multiply(15, -1); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testMultiplyErrorFirstAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.multiply(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testMultiplyErrorSecondAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.multiply(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }
}
