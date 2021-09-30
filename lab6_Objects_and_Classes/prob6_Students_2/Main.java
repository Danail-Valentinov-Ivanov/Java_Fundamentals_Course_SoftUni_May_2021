package lab6_Objects_and_Classes.prob6_Students_2;

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

            if (!isStdentExist(firstName, lastName, students, age, hometown)) {
                Students studentsInfo = new Students(firstName, lastName, age, hometown);
                students.add(studentsInfo);
            }

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Students e : students) {
            if (city.equals(e.getHometown())) {
                System.out.printf("%s %s is %s years old\n", e.getFirstName(), e.getLastName(), e.getAge());
            }
        }
    }

    private static boolean isStdentExist(String firstName, String lastName, List<Students> students,
                                         String age, String hometown) {
        for (Students e : students) {
            if (e.getFirstName().equals(firstName) && e.getLastName().equals(lastName)) {
                e.setAge(age);
                e.setHometown(hometown);
                return true;
            }
        }
        return false;
    }

    public static class Students {
        //    first name, last name, age and
//    hometown.
        private String firstName;
        private String lastName;
        private String age;
        private String hometown;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

        public Students(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public void setAge(String age) {
            this.age= age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

}
