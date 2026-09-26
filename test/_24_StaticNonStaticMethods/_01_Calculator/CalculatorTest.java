package _24_StaticNonStaticMethods._01_Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoIntegers() {
        assertEquals(9, Calculator.topla(4, 5));
    }

    @Test
    void subtractsToANegativeResult() {
        assertEquals(-3, Calculator.fark(4, 7));
    }

    @Test
    void multipliesTwoIntegers() {
        assertEquals(42, calculator.carp(6, 7));
    }

    @Test
    void dividesUsingIntegerArithmetic() {
        assertEquals(3, calculator.bol(7, 2));
    }
}
