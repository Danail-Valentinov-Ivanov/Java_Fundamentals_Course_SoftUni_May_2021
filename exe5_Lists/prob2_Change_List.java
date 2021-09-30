package exe5_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob2_Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInteger = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandArr = input.split(" ");
            if (commandArr[0].equals("Delete")) {
                listInteger.removeAll(Arrays.asList(Integer.parseInt(commandArr[1])));
            } else {
                listInteger.add(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[1]));
            }
            input = scanner.nextLine();
        }
        for (int e : listInteger) {
            System.out.print(e + " ");
        }
    }
}
