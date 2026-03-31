package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
	public DatabaseConnection db;
	@BeforeEach
	void setUp() {
		db = new DatabaseConnection();
		db.connect();
	}
	
	@AfterEach
	void tearDown() {
		db.disconnect();
	}
	
	@Test
	void testConnectionEstablished() {
		assertTrue(db.isConnected());
	}
	
	@Test
    void testMultipleOperations() {
        assertTrue(db.isConnected());
        db.disconnect();
        assertFalse(db.isConnected());
        db.connect();
        assertTrue(db.isConnected());
    }

}
