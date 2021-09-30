package lab5_Lists;

import java.util.*;

public class prob6_List_of_Products {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            String items = scanner.nextLine();
            stringList.add(items);
        }
        Collections.sort(stringList);
        for (int i = 0; i < input; i++) {
            System.out.printf("%d.%s\n", (i+1), stringList.get(i));
        }
    }
}
