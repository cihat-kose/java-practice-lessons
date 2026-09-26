package _18_Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckerTest {

    @Test
    void recognizesPalindromesIgnoringCase() {
        assertTrue(_05_PalindromeChecker.isPalindrome("Radar"));
    }

    @Test
    void recognizesPalindromesIgnoringSpaces() {
        assertTrue(_05_PalindromeChecker.isPalindrome("Never odd or even"));
    }

    @Test
    void rejectsNonPalindromes() {
        assertFalse(_05_PalindromeChecker.isPalindrome("Java"));
    }
}
