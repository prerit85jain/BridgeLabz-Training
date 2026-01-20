package advanceProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.util.*;

public class OnlyOpenCsvConverter {

    public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
        }

        String json = sb.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();

        String[] objects = json.split("\\},\\{");

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
            writer.writeNext(new String[]{"ID", "Name", "Age"});

            for (String obj : objects) {
                obj = obj.replace("{", "").replace("}", "");
                String[] fields = obj.split(",");

                String id = fields[0].split(":")[1].replace("\"", "");
                String name = fields[1].split(":")[1].replace("\"", "");
                String age = fields[2].split(":")[1].replace("\"", "");

                writer.writeNext(new String[]{id, name, age});
            }
        }
        System.out.println("✅ JSON converted to CSV: " + csvFile);
    }

    public static void csvToJson(String csvFile, String jsonFile) throws IOException, CsvException {
        List<String[]> rows;
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            rows = reader.readAll();
        }

        StringBuilder json = new StringBuilder();
        json.append("[\n");

        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);
            json.append("  {\"id\":\"").append(row[0])
                .append("\",\"name\":\"").append(row[1])
                .append("\",\"age\":").append(row[2]).append("}");
            if (i < rows.size() - 1) json.append(",");
            json.append("\n");
        }

        json.append("]");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile))) {
            bw.write(json.toString());
        }
        System.out.println("✅ CSV converted to JSON: " + jsonFile);
    }

    public static void main(String[] args) throws IOException, CsvException {
        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String newJsonFile = "students_back.json";

        jsonToCsv(jsonFile, csvFile);
        csvToJson(csvFile, newJsonFile);
    }
}