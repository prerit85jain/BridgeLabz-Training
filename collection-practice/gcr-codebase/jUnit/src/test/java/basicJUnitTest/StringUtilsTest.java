package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class StringUtilsTest {
	StringUtils su = new StringUtils();
	@Test
	public void checkReverse() {
		assertEquals("olleH", su.reverseWord("Hello"));
	}
	
	@Test
	public void checkIsPalindrome() {
		assertEquals(true, su.isPalindrome("bob"));
	}
	
	@Test
	public void checkUpperCase() {
		assertEquals("PRERIT", su.convertToUpperCase("Prerit"));
	}
}
