package lab5_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class prob3_Merging_Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int minLength = 0;
        int maxLength = 0;
        boolean isFirstListSmaller = true;
        if (firstList.size() <= secondList.size()) {
            minLength = firstList.size();
            maxLength = secondList.size();
        } else {
            minLength = secondList.size();
            maxLength = firstList.size();
            isFirstListSmaller = false;
        }
        List<Integer> sumLists = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            sumLists.add(firstList.get(i));
            sumLists.add(secondList.get(i));
        }
        for (int i = 0; i < maxLength - minLength; i++) {
            if (!isFirstListSmaller) {
                sumLists.add(firstList.get(minLength + i));
            } else {
                sumLists.add(secondList.get(minLength + i));
            }
        }
        for (int items : sumLists) {
            System.out.print(items + " ");
        }
    }
}
