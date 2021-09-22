package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob12_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int currentDigit = 0;
        for (int digit = 1; digit <= number; digit++) {
            currentDigit = digit;
            int sum = 0;

            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }
            if ((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n", currentDigit);
            } else {
                System.out.printf("%d -> False%n", currentDigit);
            }
            sum = 0;
            digit = currentDigit;
        }
    }
}
