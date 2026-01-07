package javaStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {
    public static void main(String[] args) {
        String filePath = "employees.ser";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Aman", "Engineering", 90000.0));
        employees.add(new Employee(2, "Bobby", "Marketing", 65000.0));
        employees.add(new Employee(3, "Chirag", "Human Resources", 70000.0));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
            System.out.println("Serialized " + employees.size() + " employees to " + filePath);
        } catch (IOException e) {
            System.err.println("IOException during serialization: " + e.getMessage());
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            @SuppressWarnings("unchecked")
            List<Employee> deserialized = (List<Employee>) ois.readObject();
            System.out.println("Deserialized employees:");
            for (Employee emp : deserialized) {
                System.out.println(emp);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
    }
}