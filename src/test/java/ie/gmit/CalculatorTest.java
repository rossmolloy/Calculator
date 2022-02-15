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
    void testSubtractError1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.subtract(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testSubtractError2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.subtract(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testDivide() {
        assertEquals(1.5, calculator.divide(15, 10));
    }

    @Test
    void testDivideError1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.divide(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testDivideError2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.divide(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testMultiply() {
        assertEquals(150, calculator.multiply(15, 10));
    }

    @Test
    void testMultiplyError1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.multiply(1001, 10); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }

    @Test
    void testMultiplyError2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { calculator.multiply(15, 1001); });
        assertEquals("Number(s) must be between 0 and 1000", exception.getMessage());
    }
}
