package javaStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyTop5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java WordFrequencyTop5 <path-to-text-file>");
            System.exit(1);
        }

        String filePath = args[0];
        HashMap<String, Integer> freq = new HashMap<>();

        // Read file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split on non-letter characters (keep apostrophes inside words if desired)
                for (String word : tokenize(line)) {
                    if (word.isEmpty()) continue;
                    String w = word.toLowerCase();
                    freq.put(w, freq.getOrDefault(w, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("I/O error while reading file: " + e.getMessage());
            e.printStackTrace();
            System.exit(2);
        }

        // Get top 5 by frequency
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort(
            Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue).reversed()
                      .thenComparing(Map.Entry::getKey)
        );

        int topN = Math.min(5, entries.size());
        System.out.println("Top " + topN + " words:");
        for (int i = 0; i < topN; i++) {
            Map.Entry<String, Integer> e = entries.get(i);
            System.out.println((i + 1) + ". " + e.getKey() + " -> " + e.getValue());
        }
    }

    // Simple tokenizer: split by non-alphabetic characters
    private static List<String> tokenize(String line) {
        List<String> tokens = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c) || c == '\'') {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    tokens.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) tokens.add(sb.toString());
        return tokens;
    }
}