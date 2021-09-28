package lab4_Methods;

import java.util.Scanner;

public class prob10_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.print(getSumEvenAndOddNumbers(input));
    }

    private static int getSumEvenAndOddNumbers(int input) {
        int oddSum = getOddSum(input);
        int evenSum = getEvenSum(input);
        return evenSum * oddSum;
    }

    private static int getOddSum(int input) {
        int oddSum = 0;
        while (input != 0) {
            int digit = input % 10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            input /= 10;
        }
        return oddSum;
    }

    private static int getEvenSum(int input) {
        int evenSum = 0;
        while (input != 0) {
            int digit = input % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            input /= 10;
        }
        return evenSum;
    }
}
