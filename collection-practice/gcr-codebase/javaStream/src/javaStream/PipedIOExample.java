package javaStream;

import java.io.*;

public class PipedIOExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create pipe pair
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);

        // Flag to signal completion (optional, for demonstration)
        final Object lock = new Object();
        final boolean[] writerDone = new boolean[]{false};

        // Writer thread: writes data into the pipe
        Thread writer = new Thread(() -> {
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(pos))) {
                String[] messages = {
                    "Hello", "World", "This", "is", "PipedIO", "Test"
                };
                for (String msg : messages) {
                    // Write message followed by newline to delineate records
                    bw.write(msg);
                    bw.newLine();
                    bw.flush(); // ensure data is sent promptly
                    // Optional small delay to simulate work
                    try { Thread.sleep(100); } catch (InterruptedException ignore) {}
                }
                // Signal end of data
                bw.write("<<END>>");
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                System.err.println("Writer encountered an IOException: " + e.getMessage());
                e.printStackTrace();
            } finally {
                // Notify reader that writer is done (best-effort)
                synchronized (lock) {
                    writerDone[0] = true;
                    lock.notifyAll();
                }
            }
        }, "PipeWriter");

        // Reader thread: reads data from the pipe
        Thread reader = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(pis))) {
                String line;
                while (true) {
                    line = br.readLine();
                    if (line == null) {
                        // End of stream reached
                        System.out.println("Reader reached end of stream (null line).");
                        break;
                    }
                    // Process the line
                    System.out.println("Reader got: " + line);

                    // Stop condition
                    if (line.equals("<<END>>")) {
                        System.out.println("Reader received END signal. Exiting.");
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println("Reader encountered an IOException: " + e.getMessage());
                e.printStackTrace();
            } finally {
                // If needed, ensure the sender is not blocked forever
                synchronized (lock) {
                    // no action required here for this simple example
                    lock.notifyAll();
                }
            }
        }, "PipeReader");

        // Start both threads
        reader.start();
        writer.start();

        // Optional: wait for both to finish to keep the main thread alive
        writer.join();
        reader.join();

        System.out.println("Piped I/O communication finished.");
    }
}