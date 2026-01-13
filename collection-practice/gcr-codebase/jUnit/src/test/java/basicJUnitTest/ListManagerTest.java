package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;;

public class ListManagerTest {
	ListManager lm = new ListManager();
	@Test
	public void testAddElement() {
		List<Integer> ls = new ArrayList<>();
		lm.addElement(ls, 10);
		lm.addElement(ls, 20);
		
		assertTrue(ls.contains(10));
		assertFalse(ls.contains(30));
	}
	
	@Test
	public void testRemoveElement() {
		List<Integer> ls = new ArrayList<>();
		ls.add(15);
		ls.add(20);
		lm.removeElement(ls, 15);
		
		
		assertTrue(ls.contains(20));
		assertFalse(ls.contains(15));
	}
	
	@Test
	public void testgetSize() {
		List<Integer> ls = new ArrayList<>();
		ls.add(15);
		ls.add(20);
		
		
		assertEquals(2, lm.getSize(ls));
	}
}
