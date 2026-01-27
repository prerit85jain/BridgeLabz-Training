package methodRefrences;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUppercase {

    public static void main(String[] args) {

        List<String> employees = Arrays.asList("ram", "sita", "arjun", "neha");

        List<String> upperNames = employees.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}