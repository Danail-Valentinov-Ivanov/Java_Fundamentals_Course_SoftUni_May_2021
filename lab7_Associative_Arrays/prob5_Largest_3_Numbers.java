package lab7_Associative_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob5_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listSortedNums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
        int divide = 0;
        if (listSortedNums.size() < 3) {
            divide = 3 - listSortedNums.size();
        }
        for (int i = 0; i < 3 - divide; i++) {
            System.out.print(listSortedNums.get(i) + " ");
        }
    }
}
