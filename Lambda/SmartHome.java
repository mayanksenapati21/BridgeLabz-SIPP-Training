import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {
        Map<String, LightAction> triggers = new HashMap<>();

        // Lambda expressions for different triggers
        triggers.put("motion", () -> System.out.println("Lights ON with soft white glow."));
        triggers.put("night", () -> System.out.println("Lights ON with warm dim setting."));
        triggers.put("voice", () -> System.out.println("Lights ON with party mode colors!"));

        // Simulate triggers
        triggers.get("motion").execute();
        triggers.get("night").execute();
        triggers.get("voice").execute();
    }
}
