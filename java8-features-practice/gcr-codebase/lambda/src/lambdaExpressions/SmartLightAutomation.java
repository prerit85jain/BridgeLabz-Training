package lambdaExpressions;

import java.util.HashMap;
import java.util.Map;

public class SmartLightAutomation {

    public static void main(String[] args) {

        Map<String, Runnable> lightTriggers = new HashMap<>();

        lightTriggers.put("motion", () -> System.out.println("Lights turned ON with bright mode"));
        lightTriggers.put("night", () -> System.out.println("Lights turned ON with dim mode"));
        lightTriggers.put("voice", () -> System.out.println("Lights turned ON with custom color"));

        lightTriggers.get("motion").run();
        lightTriggers.get("night").run();
        lightTriggers.get("voice").run();
    }
}