package stringer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringerTest {

    private final Stringer stringer = new Stringer();

    @Test
    public void testReverseStringNormalCase() {
        assertEquals("cba", stringer.reverseString("abc"));
        assertEquals("edcba", stringer.reverseString("abcde"));
    }

    @Test
    public void testReverseStringPalindrome() {
        assertEquals("radar", stringer.reverseString("radar"));
    }

    @Test
    public void testReverseStringEmptyString() {
        assertEquals("", stringer.reverseString(""));
    }

    @Test
    public void testReverseStringSingleCharacter() {
        assertEquals("a", stringer.reverseString("a"));
    }

    @Test
    public void testReverseStringWithSpaces() {
        assertEquals(" a man", stringer.reverseString("nam a "));
    }

    @Test
    public void testIsPalindromeValidPalindrome() {
        assertTrue(stringer.isPalindrome("Anita lava la tina"));
        assertTrue(stringer.isPalindrome("radar"));
    }

    @Test
    public void testIsPalindromeInvalidPalindrome() {
        assertFalse(stringer.isPalindrome("hola"));
        assertFalse(stringer.isPalindrome("casa roja"));
    }

    @Test
    public void testIsPalindromeSingleCharacter() {
        assertTrue(stringer.isPalindrome("a"));
    }

    @Test
    public void testIsPalindromeEmptyString() {
        assertFalse(stringer.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeNull() {
        assertFalse(stringer.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        assertTrue(stringer.isPalindrome(" "));
    }

    @Test
    public void testCountVowelsNormalString() {
        assertEquals(8, stringer.countVowels("Anita lava la tina"));
        assertEquals(2, stringer.countVowels("hola"));
    }

    @Test
    public void testCountVowelsEmptyString() {
        assertEquals(0, stringer.countVowels(""));
    }

    @Test
    public void testCountVowelsNull() {
        assertEquals(0, stringer.countVowels(null));
    }

    @Test
    public void testCountVowelsStringWithNoVowels() {
        assertEquals(0, stringer.countVowels("bcdfghjklmnpqrstvwxyz"));
    }

    @Test
    public void testCountVowelsStringWithAllVowels() {
        assertEquals(5, stringer.countVowels("aeiou"));
    }

    @Test
    public void testCountVowelsSingleCharacter() {
        assertEquals(1, stringer.countVowels("a"));
        assertEquals(0, stringer.countVowels("b"));
    }

    @Test
    public void testCountVowelsWithSpaces() {
        assertEquals(0, stringer.countVowels(" "));
    }

    @Test
    public void testCountVowelsWithSpecialCharacters() {
        assertEquals(8, stringer.countVowels("Anita! lava@ la# tina*"));
    }

    @Test
    public void testCombinedOperations() {
        String input = "Anita lava la tina";

        assertTrue(stringer.isPalindrome(input));

        assertEquals(8, stringer.countVowels(input));

        // Invertir la cadena
        assertEquals("anit al aval atinA", stringer.reverseString(input));

        String reversedInput = stringer.reverseString(input);
        assertTrue(stringer.isPalindrome(reversedInput));
    }

    @Test
    public void testEdgeCasesEmptyString() {
        assertFalse(stringer.isPalindrome(""));
        assertEquals(0, stringer.countVowels(""));
        assertEquals("", stringer.reverseString(""));
    }

    @Test
    public void testEdgeCasesSingleCharacter() {
        assertTrue(stringer.isPalindrome("a"));
        assertEquals(1, stringer.countVowels("a"));
        assertEquals("a", stringer.reverseString("a"));
    }

    @Test
    public void testEdgeCasesSpaceString() {
        assertTrue(stringer.isPalindrome(" "));
        assertEquals(0, stringer.countVowels(" "));
        assertEquals(" ", stringer.reverseString(" "));
    }
}
