package lab5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob2_Gauss_Trick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> listOfNum = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int halfOfSize = listOfNum.size() / 2;
        for (int i = 0; i < halfOfSize; i++) {
            listOfNum.set(i, (listOfNum.get(i) + listOfNum.get(listOfNum.size() - 1)));
            listOfNum.remove(listOfNum.size() - 1);
        }
        for (int items : listOfNum) {
            System.out.print(items + " ");
        }
    }
}
