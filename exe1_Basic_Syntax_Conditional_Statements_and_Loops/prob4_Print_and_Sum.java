package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob4_Print_and_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = Integer.parseInt(scan.nextLine());
        int input2 = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = input1; i <= input2; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
