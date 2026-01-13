package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileProcessorTest {
	FileProcessor processor = new FileProcessor();
	
	@Test
	void testWriteAndReadFile() throws IOException {
		String fileName = "testFileProcessor.txt";
		String content = "Hello! this is check call";
		
		processor.writeToFile(fileName, content);
		String readContent = processor.readFromFile(fileName);
		
		assertEquals(content, readContent);
	}
}
