package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenOrNotTest {
	EvenOrNot util = new EvenOrNot();
	@ParameterizedTest
	@ValueSource(ints= {2,4,6})
	void testIsEvenWithEvenNo(int num) {
		assertTrue(util.isEven(num));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {7, 9})
	void testIsEvenWithOddNo(int nums) {
		assertFalse(util.isEven(nums));
	}
}
