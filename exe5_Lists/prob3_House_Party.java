package exe5_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prob3_House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> listCommand = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] commandLineArr = scanner.nextLine().split(" ");
            switch (commandLineArr[2]) {
                case "going!":
                    if (listCommand.contains(commandLineArr[0])) {
                        System.out.printf("%s is already in the list!\n", commandLineArr[0]);
                    } else {
                        listCommand.add(commandLineArr[0]);
                    }
                    break;
                case "not":
                    if (listCommand.contains(commandLineArr[0])) {
                        listCommand.remove(commandLineArr[0]);
                    } else {
                        System.out.printf("%s is not in the list!\n", commandLineArr[0]);
                    }
                    break;
            }
        }
        for (String e : listCommand) {
            System.out.println(e);
        }
    }
}
