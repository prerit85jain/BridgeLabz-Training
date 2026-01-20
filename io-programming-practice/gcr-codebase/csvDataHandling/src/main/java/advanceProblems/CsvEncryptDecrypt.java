package advanceProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class CsvEncryptDecrypt {

	private static String encrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            sb.append((char)(c + 3));
        }
        return sb.toString();
    }

    private static String decrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            sb.append((char)(c - 3));
        }
        return sb.toString();
    }

    public static void writeCsv(String filePath, List<String[]> rows) throws Exception {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"}); // header
            for (String[] row : rows) {
                writer.writeNext(new String[]{
                        row[0],
                        row[1],
                        encrypt(row[2]),
                        encrypt(row[3])
                });
            }
        }
    }

    public static List<String[]> readCsv(String filePath) throws Exception {
        List<String[]> result = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            boolean skipHeader = true;
            while ((line = reader.readNext()) != null) {
                if (skipHeader) { skipHeader = false; continue; }
                result.add(new String[]{
                        line[0],
                        line[1],
                        decrypt(line[2]),
                        decrypt(line[3])
                });
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String filePath = "employees.csv";

        List<String[]> employees = Arrays.asList(
                new String[]{"1", "Alice", "alice@example.com", "50000"},
                new String[]{"2", "Bob", "bob@example.com", "60000"}
        );

        writeCsv(filePath, employees);

        List<String[]> decrypted = readCsv(filePath);
        for (String[] row : decrypted) {
            System.out.println(Arrays.toString(row));
        }
    }
}