package more_exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob4_Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int length = input.length();

        for (int i = length - 1; i >= 0; i--) {
            char letter = input.charAt(i);
            System.out.print(letter);
        }
    }
}
