package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob4_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sumChars = 0;
        for (int i = input; i > 0; i--) {
            char chars = scanner.nextLine().charAt(0);
            sumChars += chars;
        }
        System.out.printf("The sum equals: %d", sumChars);
    }
}
