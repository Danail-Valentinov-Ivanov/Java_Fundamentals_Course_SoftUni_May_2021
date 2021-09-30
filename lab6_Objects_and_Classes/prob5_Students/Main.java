package lab6_Objects_and_Classes.prob5_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //    first name, last name, age and
//    hometown.
        List<Students> students = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            String age = data[2];
            String hometown = data[3];

            Students studentInfomation = new Students(firstName, lastName, age, hometown);
            students.add(studentInfomation);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Students e : students) {
            if (city.equals(e.getHometown())) {
                System.out.printf("%s %s is %s years old\n", e.getFirstName(), e.getLastName(), e.getAge());
            }
        }
    }
}
