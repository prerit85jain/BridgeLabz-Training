package javaStream;

import java.io.*;

/**
* Demonstrates use of ByteArrayInputStream and ByteArrayOutputStream.
*
* File and Memory Stream Operations Covered:
*
* ByteArrayInputStream:
* - Reads data from a byte array as an input stream
* - Methods: read(), available(), reset(), skip()
*
* ByteArrayOutputStream:
* - Writes data to a byte array in memory
* - Methods: write(int), toByteArray(), toString(), reset()
*
* Related I/O classes :
* - FileInputStream / FileOutputStream: For file-based byte I/O
* - ObjectInputStream / ObjectOutputStream: For reading/writing objects
* - DataInputStream / DataOutputStream: For reading/writing primitive data types
* - InputStream / OutputStream: Abstract classes for all byte streams
*
* Common Methods for Byte Streams:
* - read(): Reads a byte of data
* - write(int b): Writes a byte of data
* - close(): Closes the stream and releases system resources
* - flush(): Forces any buffered output bytes to be written
*/

public class ByteArrayStreamExample {
public static void main(String[] args) {
// Input string to simulate byte data
String input = "hello world!";
byte[] data = input.getBytes(); // Convert string to byte array

// Using try-with-resources to automatically close the streams
try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

int b;

// Read each byte from ByteArrayInputStream
while ((b = bais.read()) != -1) {
// Convert to uppercase and write to ByteArrayOutputStream
baos.write(Character.toUpperCase(b));
}

// Display original and transformed strings
System.out.println("Original: " + input);
System.out.println("Uppercase: " + baos.toString());

} catch (IOException e) {
// IOException is unlikely with memory streams, but handled for completeness
e.printStackTrace();
}
}
}