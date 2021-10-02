package exe7_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class prob1_Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrChars = scanner.nextLine().split("");
        Map<String, Integer> mapChars = new LinkedHashMap<>();
        for (int i = 0; i < arrChars.length; i++) {
            if (arrChars[i].equals(" ")){
                continue;
            }
            if (mapChars.containsKey(arrChars[i])) {
                mapChars.put(arrChars[i], mapChars.get(arrChars[i]) + 1);
            } else {
                mapChars.put(arrChars[i], 1);
            }
        }
        for (Map.Entry<String, Integer> e :
                mapChars.entrySet()) {
            System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
        }
    }
}
