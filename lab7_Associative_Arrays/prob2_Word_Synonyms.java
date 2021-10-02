package lab7_Associative_Arrays;

import java.util.*;

public class prob2_Word_Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfWards = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> mapSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < countOfWards; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            List<String> listSynonyms = new ArrayList<>();

            if (!mapSynonyms.containsKey(word)) {
                listSynonyms.add(synonym);
                mapSynonyms.put(word, listSynonyms);
            } else {
                mapSynonyms.get(word).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> e :
                mapSynonyms.entrySet()) {
            System.out.printf("%s - %s\n", e.getKey(), String.join(", ", e.getValue()));
        }
    }
}
