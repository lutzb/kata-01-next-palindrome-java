package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import palindrome.NextPalindrome;

class NextPalindromeText {

	@Test
	void testNextPalindromeWithOneDigit() {
		assertEquals(2, NextPalindrome.getNextPalindrome(1));
	}
	
	@Test
	void testNextPalindromeWithTwoDigits() {
		assertEquals(33, NextPalindrome.getNextPalindrome(31));
	}
	
	@Test
	void testNextPalindromeWithThreeDigits() {
		assertEquals(525, NextPalindrome.getNextPalindrome(519));
	}

	@Test
	void testNextPalindromeWithFourDigits() {
		assertEquals(7337, NextPalindrome.getNextPalindrome(7236));
	}
	
	@Test
	void testNextPalindromeWithFiveDigits() {
		assertEquals(23632, NextPalindrome.getNextPalindrome(23608));
	}
	
	@Test
	void testNextPalindromeWithDigitRollover() {
		assertEquals(101, NextPalindrome.getNextPalindrome(99));
	}
	
	@Test
	void testNextPalindromeWithPalindrome() {
		assertEquals(111, NextPalindrome.getNextPalindrome(101));
	}
}
