package more_exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob1_Sort_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        if (first >= second && second >= third) {
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
        } else if (second >= first && first >= third) {
            System.out.println(second);
            System.out.println(first);
            System.out.println(third);
        } else if (second >= third && third >= first) {
            System.out.println(second);
            System.out.println(third);
            System.out.println(first);
        } else if (third >= second && second >= first) {
            System.out.println(third);
            System.out.println(second);
            System.out.println(first);
        } else if (third >= first && first >= second) {
            System.out.println(third);
            System.out.println(first);
            System.out.println(second);
        } else if (first >= third && third >= second) {
            System.out.println(first);
            System.out.println(third);
            System.out.println(second);
        }
    }
}
