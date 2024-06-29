package in.almeerait;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {
	@ParameterizedTest
	@ValueSource(strings = {"racecar","madam","garag","gowtham"})
	public void isPalindromeTest(String str) {
		Palindrome p = new Palindrome();
		boolean flag = p.isPalindrome(str);
		if(flag) {
			assertTrue(flag);
		}else {
			assertFalse(flag);
		}
		
		
	}

}
