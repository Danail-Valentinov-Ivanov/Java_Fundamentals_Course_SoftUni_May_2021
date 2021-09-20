package lab1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob4_Back_in_30_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        if (minutes <= 30) {
            minutes += 30;
        } else {
            hours++;
            minutes += 30;
            minutes -= 60;
        }
        if (hours > 23) {
            hours -= 24;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
