package practiceProblems;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

class Students{
	private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class ListToJSONArray {
    public static void main(String[] args) throws Exception {
        List<Students> student = new ArrayList<>();
        student.add(new Students("Aman", 22));
        student.add(new Students("Neha", 24));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(student);

        System.out.println(jsonArray);
    }
}
