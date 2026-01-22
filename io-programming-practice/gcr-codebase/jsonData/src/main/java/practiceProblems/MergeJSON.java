package practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Ravi");

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("age", 26);

        json1.setAll(json2);

        System.out.println(json1.toPrettyString());
    }
}