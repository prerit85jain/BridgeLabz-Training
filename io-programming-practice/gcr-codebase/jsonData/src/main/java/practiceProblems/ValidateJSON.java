package practiceProblems;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSON {
    public static void main(String[] args) {
        String json = "{ \"name\": \"John\", \"age\": 25 }";
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(json);
            System.out.println("Valid JSON");
        } catch (IOException e) {
            System.out.println("Invalid JSON");
        }
    }
}