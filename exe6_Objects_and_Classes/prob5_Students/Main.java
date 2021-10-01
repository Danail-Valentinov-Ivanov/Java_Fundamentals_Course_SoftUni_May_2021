package exe6_Objects_and_Classes.prob5_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<Student> listStudents = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String firstName = data[0];
            String secondName = data[1];
            double grade = Double.parseDouble(data[2]);

            Student currentStudent = new Student(firstName, secondName, grade);
            listStudents.add(currentStudent);
        }
        listStudents.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student e : listStudents) {
            System.out.printf("%s %s: %.2f\n", e.firstName, e.secondName, e.grade);
        }
    }
}
