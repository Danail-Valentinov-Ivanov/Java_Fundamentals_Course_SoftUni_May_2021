package lab7_Associative_Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class prob1_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[]arrNums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer>countOfOccurrences = new TreeMap<>();
        for (double e : arrNums) {
            if (!countOfOccurrences.containsKey(e)){
                countOfOccurrences.put(e, 0);
            }
            countOfOccurrences.put(e, countOfOccurrences.get(e)+1);
        }
        for (Map.Entry<Double, Integer> e :
                countOfOccurrences.entrySet()) {
            DecimalFormat entry = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d\n", entry.format(e.getKey()), e.getValue());
        }
    }
}
