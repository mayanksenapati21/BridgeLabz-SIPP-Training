import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Normal", "Daily check-up reminder."),
            new Alert("Emergency", "ICU patient needs attention!")
        );

        // Filter using Predicate (only show 'Critical' or 'Emergency')
        Predicate<Alert> importantAlerts = a -> a.type.equals("Critical") || a.type.equals("Emergency");

        alerts.stream()
              .filter(importantAlerts)
              .forEach(System.out::println);
    }
}
