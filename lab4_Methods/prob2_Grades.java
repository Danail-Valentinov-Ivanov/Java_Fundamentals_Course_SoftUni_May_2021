package lab4_Methods;

import java.util.Scanner;

public class prob2_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getGrade(Double.parseDouble(scanner.nextLine()));
    }

    // 2.00 – 2.99 - &quot;Fail&quot;
// 3.00 – 3.49 - &quot;Poor&quot;
// 3.50 – 4.49 - &quot;Good&quot;
// 4.50 – 5.49 - &quot;Very good&quot;
// 5.50 – 6.00 - &quot;Excellent&quot;
    private static void getGrade(double input) {
        if (input <= 2.99) {
            System.out.print("Fail");
        } else if (input >= 3 && input <= 3.49) {
            System.out.print("Poor");
        } else if (input >= 3.5 && input <= 4.49) {
            System.out.print("Good");
        } else if (input >= 4.5 && input <= 5.49) {
            System.out.print("Very good");
        } else if (input >= 5.5 && input <= 6) {
            System.out.print("Excellent");
        }
    }
}
