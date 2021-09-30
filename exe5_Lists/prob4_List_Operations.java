package exe5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob4_List_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//         Add {number} - add number at the end
// Insert {number} {index} - insert number at given index
// Remove {index} - remove that index
// Shift left {count} - first number becomes last &#39;count&#39; times
// Shift right {count} - last number becomes first &#39;count&#39; times
        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    listNumbers.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) < listNumbers.size() && Integer.parseInt(command[2]) >= 0) {
                        listNumbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(command[1]) < listNumbers.size() && Integer.parseInt(command[1]) >= 0) {
                        listNumbers.remove(Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    switch (command[1]) {
                        case "left":
                            for (int i = 1; i <= Integer.parseInt(command[2]); i++) {
                                listNumbers.add(listNumbers.get(0));
                                listNumbers.remove(0);
                            }
                            break;
                        case "right":
                            for (int i = 1; i <= Integer.parseInt(command[2]); i++) {
                                listNumbers.add(0, listNumbers.get(listNumbers.size() - 1));
                                listNumbers.remove(listNumbers.size() - 1);
                            }
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int e : listNumbers) {
            System.out.print(e + " ");
        }
    }
}
