package exe7_Associative_Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class prob3_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Shadowmourne - requires 250 Shards
        // Valanyr - requires 250 Fragments
        // Dragonwrath - requires 250 Motes
        Map<String, Integer> mapJunk = new TreeMap<>();
        Map<String, Integer> mapKeyMaterials = new TreeMap<>();
        mapKeyMaterials.put("shards", 0);
        mapKeyMaterials.put("fragments", 0);
        mapKeyMaterials.put("motes", 0);
        boolean isEnd = false;
        while (!isEnd) {
            String[] currentCommand = scanner.nextLine().split("\\s+");
            int quantity = 0;
            String material = "";
            for (int i = 0; i < currentCommand.length; i += 2) {
                quantity = Integer.parseInt(currentCommand[i]);
                material = currentCommand[i + 1].toLowerCase();
                switch (material) {
                    case "shards":
                        mapKeyMaterials.put("shards", mapKeyMaterials.get("shards") + quantity);
                        break;
                    case "fragments":
                        mapKeyMaterials.put("fragments", mapKeyMaterials.get("fragments") + quantity);
                        break;
                    case "motes":
                        mapKeyMaterials.put("motes", mapKeyMaterials.get("motes") + quantity);
                        break;
                    default:
                        if (!mapJunk.containsKey(material)) {
                            mapJunk.put(material, quantity);
                        } else {
                            mapJunk.put(material, mapJunk.get(material) + quantity);
                        }
                        break;
                }
                switch (material) {
                    case "shards":
                        if (mapKeyMaterials.get("shards") >= 250) {
                            mapKeyMaterials.put("shards", mapKeyMaterials.get("shards") - 250);
                            System.out.println("Shadowmourne obtained!");
                            isEnd = true;
                        }
                        break;
                    case "fragments":
                        if (mapKeyMaterials.get("fragments") >= 250) {
                            mapKeyMaterials.put("fragments", mapKeyMaterials.get("fragments") - 250);
                            System.out.println("Valanyr obtained!");
                            isEnd = true;
                        }
                        break;
                    case "motes":
                        if (mapKeyMaterials.get("motes") >= 250) {
                            mapKeyMaterials.put("motes", mapKeyMaterials.get("motes") - 250);
                            System.out.println("Dragonwrath obtained!");
                            isEnd = true;
                        }
                        break;
                }
                if (isEnd) {
                    break;
                }
            }
        }
        mapKeyMaterials.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
        for (Map.Entry<String, Integer> e : mapJunk.entrySet()) {
            System.out.printf("%s: %d\n", e.getKey(), e.getValue());
        }
    }
}
