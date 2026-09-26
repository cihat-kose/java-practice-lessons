package _18_Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialCalculatorTest {

    @Test
    void calculatesFactorialForPositiveNumber() {
        assertEquals(120, _02_FactorialCalculator.factorial(5));
    }

    @Test
    void returnsOneForZeroFactorial() {
        assertEquals(1, _02_FactorialCalculator.factorial(0));
    }

    @Test
    void returnsMinusOneForNegativeNumber() {
        assertEquals(-1, _02_FactorialCalculator.factorial(-3));
    }
}
