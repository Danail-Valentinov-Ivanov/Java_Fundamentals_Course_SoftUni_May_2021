package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob6_Strong_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        int sumFact = 0;
        int startNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }
            number /= 10;
            sumFact += fact;

        }
        if (startNumber==sumFact){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
