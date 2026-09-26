package _18_Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenNumberCheckerTest {

    @Test
    void recognizesEvenNumbers() {
        assertTrue(_03_EvenNumberChecker.isEven(8));
        assertTrue(_03_EvenNumberChecker.isEven(-4));
    }

    @Test
    void recognizesOddNumbers() {
        assertFalse(_03_EvenNumberChecker.isEven(15));
        assertFalse(_03_EvenNumberChecker.isEven(-11));
    }
}
