package lambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }

    public String toString() {
        return "Alert: " + type;
    }
}

public class NotificationFiltering {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency"),
                new Alert("Appointment"),
                new Alert("Medicine Reminder"),
                new Alert("Emergency")
        );

        Predicate<Alert> emergencyOnly = alert -> alert.type.equals("Emergency");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}