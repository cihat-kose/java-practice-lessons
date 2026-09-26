package _18_Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxValueFinderTest {

    @Test
    void findsLargestValueInMixedNumbers() {
        assertEquals(12, _04_MaxValueFinder.maxValue(new int[]{-4, 12, 3, 9}));
    }

    @Test
    void findsLargestValueWhenAllNumbersAreNegative() {
        assertEquals(-2, _04_MaxValueFinder.maxValue(new int[]{-9, -4, -2, -7}));
    }

    @Test
    void returnsOnlyValueForSingleElementArray() {
        assertEquals(42, _04_MaxValueFinder.maxValue(new int[]{42}));
    }
}
