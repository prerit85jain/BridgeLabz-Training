package practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

class Person{
	private String name;
	private String email;
	private int age;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
}

public class ReadJsonFile {

	public static void main(String[] args) throws Exception {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Person person = objectMapper.readValue(new File("data.json"), Person.class);
		
			System.out.println(person.getName());
			System.out.println(person.getEmail());
		}catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
