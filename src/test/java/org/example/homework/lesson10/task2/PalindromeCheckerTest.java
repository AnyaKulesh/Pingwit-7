package org.example.homework.lesson10.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @ParameterizedTest
    @ValueSource(strings = {"899 8  ", "!%%!", "бубуб", "A bba", "   "})
    void testPalindrome(String word) {
        boolean actual = palindromeChecker.isPalindrome(word);
        boolean actual2 = palindromeChecker.checkPalindrome(word);
        assertThat(actual).isTrue();
        assertThat(actual2).isTrue();
    }
}