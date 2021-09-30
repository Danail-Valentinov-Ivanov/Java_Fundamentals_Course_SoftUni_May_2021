package exe5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob6_Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int size = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (first.size() >= second.size()) {
                size = second.size();
            } else {
                size = first.size();
            }
            if (size == 0) {
                break;
            }
            if (first.get(i) > second.get(i)) {
                first.add(first.get(i));
                first.remove(i);
                first.add(second.get(i));
                second.remove(i);
            } else if (first.get(i) < second.get(i)) {
                second.add(second.get(i));
                second.remove(i);
                second.add(first.get(i));
                first.remove(i);
            } else {
                first.remove(i);
                second.remove(i);
            }
            i--;
        }
        if (second.size() == 0) {
            int sum = 0;
            for (int i = 0; i < first.size(); i++) {
                sum += first.get(i);
            }
                System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = 0;
            for (int i = 0; i < second.size(); i++) {
                sum += second.get(i);
            }
                System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
