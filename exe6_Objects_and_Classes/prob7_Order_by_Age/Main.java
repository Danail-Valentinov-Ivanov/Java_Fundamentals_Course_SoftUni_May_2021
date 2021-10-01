package exe6_Objects_and_Classes.prob7_Order_by_Age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Order_by_Age> listWithPerson = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);
            Order_by_Age currentPerson = new Order_by_Age(name, id, age);
            listWithPerson.add(currentPerson);
            input = scanner.nextLine();
        }
        listWithPerson.sort(Comparator.comparing(Order_by_Age::getAge));
        for (Order_by_Age element : listWithPerson) {
            System.out.println(element.toString());
        }
    }
}
