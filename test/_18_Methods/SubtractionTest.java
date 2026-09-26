package _18_Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    @Test
    void subtractsPositiveNumbers() {
        assertEquals(6, _01_Subtraction.subtract(10, 4));
    }

    @Test
    void returnsNegativeResultWhenSecondNumberIsLarger() {
        assertEquals(-5, _01_Subtraction.subtract(25, 30));
    }

    @Test
    void subtractsNegativeNumbers() {
        assertEquals(-3, _01_Subtraction.subtract(-8, -5));
    }
}
