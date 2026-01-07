package javaStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StoreAndRetrieve {
    public static void main(String[] args) {
        String filePath = "students.dat";

        // Prepare some sample students
        List<Student> studentsToWrite = new ArrayList<>();
        studentsToWrite.add(new Student(101, "Aman", 3.8));
        studentsToWrite.add(new Student(102, "Bobby", 3.65));
        studentsToWrite.add(new Student(103, "Chirag", 3.95));

        // Write using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)))) {
            // Option 1: write a count first to know how many records to read
            dos.writeInt(studentsToWrite.size());
            for (Student s : studentsToWrite) {
                dos.writeInt(s.getRoll());
                dos.writeUTF(s.getName());
                dos.writeDouble(s.getGpa());
            }
            System.out.println("Wrote " + studentsToWrite.size() + " students to " + filePath);
        } catch (IOException e) {
            System.err.println("IOException during writing: " + e.getMessage());
            e.printStackTrace();
        }

        // Read back using DataInputStream
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)))) {
            int count = dis.readInt(); // read the number of records written
            List<Student> readStudents = new ArrayList<>(count);
            for (int i = 0; i < count; i++) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                readStudents.add(new Student(roll, name, gpa));
            }

            System.out.println("Deserialized students:");
            for (Student s : readStudents) {
                System.out.println(s);
            }
        } catch (EOFException eof) {
            System.err.println("Reached end of file unexpectedly: " + eof.getMessage());
        } catch (IOException e) {
            System.err.println("IOException during reading: " + e.getMessage());
            e.printStackTrace();
        }
    }
}