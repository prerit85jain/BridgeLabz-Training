package practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Prerit Jain");
		jsonObject.put("Age", 21);
		
		JSONArray subject = new JSONArray();
		subject.put("Java");
		subject.put("Pyhton");
		
		jsonObject.put("Subjects", subject);
		
		System.out.println(jsonObject.toString());
	}

}
