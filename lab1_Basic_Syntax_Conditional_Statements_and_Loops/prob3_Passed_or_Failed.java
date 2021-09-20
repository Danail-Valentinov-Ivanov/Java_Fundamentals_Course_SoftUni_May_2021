package lab1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob3_Passed_or_Failed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());

        if (input >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}