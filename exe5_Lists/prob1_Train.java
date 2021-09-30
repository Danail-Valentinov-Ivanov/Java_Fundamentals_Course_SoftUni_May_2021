package exe5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int capacityOfWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (!command[0].equals("Add")) {
                for (int i = 0; i < listWagons.size(); i++) {
                    if (listWagons.get(i) + Integer.parseInt(command[0]) <= capacityOfWagon) {
                        int sum = listWagons.get(i) + Integer.parseInt(command[0]);
                        listWagons.set(i, sum);
                        break;
                    }
                }
            } else {
                listWagons.add(listWagons.size(), Integer.parseInt(command[1]));
            }
            input = scanner.nextLine();
        }
        for (int items : listWagons) {
            System.out.print(items + " ");
        }
    }
}
