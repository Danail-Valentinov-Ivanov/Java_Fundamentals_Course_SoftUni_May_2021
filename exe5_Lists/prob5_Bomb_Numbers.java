package exe5_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob5_Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> saveIndex = new ArrayList<>();
        for (int i = 0; i < listNumbers.size(); i++) {
            saveIndex.add(0);
        }
        String[] commandArr = scanner.nextLine().split(" ");
        int numberOfBomb = Integer.parseInt(commandArr[0]);
        int powerOfBomb = Integer.parseInt(commandArr[1]);
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i).equals(numberOfBomb)) {
                saveIndex.set(i, listNumbers.get(i));
                for (int j = 1; j <= powerOfBomb; j++) {
                    if (i < listNumbers.size()) {
                        saveIndex.set(i + j, listNumbers.get(i + j));
                    }
                    if (i - j >= 0) {
                        saveIndex.set(i - j, listNumbers.get(i - j));
                    }
                }
            }
        }
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i).equals(saveIndex.get(i))){
                listNumbers.remove(i);
                saveIndex.remove(i);
                i--;
            }
        }
        int sumElements = 0;
        for (int i = 0; i < listNumbers.size(); i++) {
            sumElements += listNumbers.get(i);
        }
        System.out.print(sumElements);
    }
}
