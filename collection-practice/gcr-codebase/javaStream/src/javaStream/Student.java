package javaStream;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int roll;
    private String name;
    private double gpa;

    public Student(int roll, String name, double gpa) {
        this.roll = roll;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRoll() { return roll; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return "Student{roll=" + roll + ", name='" + name + "', gpa=" + gpa + "}";
    }
}