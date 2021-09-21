package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob2_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        int divider = 0;
        if (input % 10 == 0) {
            divider = 10;
        } else if (input % 7 == 0) {
            divider = 7;
        } else if (input % 6 == 0) {
            divider = 6;
        } else if (input % 3 == 0) {
            divider = 3;
        } else if (input % 2 == 0) {
            divider = 2;
        }

        if (divider == 0) {
            System.out.printf("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", divider);
        }
    }
}
