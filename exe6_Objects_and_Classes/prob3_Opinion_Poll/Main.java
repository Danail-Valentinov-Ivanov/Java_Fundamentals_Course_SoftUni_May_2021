package exe6_Objects_and_Classes.prob3_Opinion_Poll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Opinion_Poll> listOfPersons = new ArrayList<>();
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Opinion_Poll person = new Opinion_Poll(name, age);
            listOfPersons.add(person);
        }
        //filter
        listOfPersons = listOfPersons.stream().filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());
        //sort
        listOfPersons.sort(Comparator.comparing(Opinion_Poll::getName));
        for (Opinion_Poll e : listOfPersons) {
            System.out.println(e.toString());
        }
    }
}
