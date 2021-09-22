package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob10_Special_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= num; i++) {
            int digit = i;
            int sumOfDigit = 0;
            while (digit > 0) {
                int currentDigit = digit % 10;
                sumOfDigit += currentDigit;
                digit = digit / 10;
            }
            if (sumOfDigit == 5 || sumOfDigit == 7 || sumOfDigit == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
