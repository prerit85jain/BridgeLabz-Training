package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutTest {
	TimeOut time = new TimeOut();
	
	@Test
	@Timeout(value = 3, unit = TimeUnit.SECONDS)
	void testLongRunningTask() {
		String result = time.longRunningTask();
		assertEquals("Task Completed", result);
	}
}
