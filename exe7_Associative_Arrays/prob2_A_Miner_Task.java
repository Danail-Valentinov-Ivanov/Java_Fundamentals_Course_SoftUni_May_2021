package exe7_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class prob2_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> mapResources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (mapResources.containsKey(resource)) {
                mapResources.put(resource, mapResources.get(resource) + quantity);
            } else {
                mapResources.put(resource, quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> e : mapResources.entrySet()) {
            System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
        }
    }
}
