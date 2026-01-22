package practiceProblems;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJSON {
    public static void main(String[] args) throws IOException {

        String json = """
        [
          {"name":"A", "age":22},
          {"name":"B", "age":30},
          {"name":"C", "age":27}
        ]
        """;

        ObjectMapper mapper = new ObjectMapper();
        JsonNode array = mapper.readTree(json);

        for (JsonNode node : array) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}