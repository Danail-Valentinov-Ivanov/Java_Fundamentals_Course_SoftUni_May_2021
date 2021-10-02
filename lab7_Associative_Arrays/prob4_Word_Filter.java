package lab7_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob4_Word_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrWords = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0).toArray(String[]::new);
        for (var e : arrWords) {
            System.out.println(e);
        }
    }
}
