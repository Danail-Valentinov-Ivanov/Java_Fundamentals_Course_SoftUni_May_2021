package lab7_Associative_Arrays;

import java.util.*;

public class prob3_Odd_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrWords = scanner.nextLine().split(" ");
        Map<String, Integer> mapWords = new LinkedHashMap<>();

        for (var e : arrWords) {
            String wordsInSmallCase = e.toLowerCase();
            if (mapWords.containsKey(wordsInSmallCase)) {
                mapWords.put(wordsInSmallCase, mapWords.get(wordsInSmallCase) + 1);
            } else {
                mapWords.put(wordsInSmallCase, 1);
            }
        }
        List<String> listFilterWords = new ArrayList<>();
        for (var e : mapWords.entrySet()) {
            if (mapWords.get(e.getKey()) % 2 == 1) {
                listFilterWords.add(e.getKey());
            }
        }
        System.out.print(String.join(", ", listFilterWords));
    }
}
