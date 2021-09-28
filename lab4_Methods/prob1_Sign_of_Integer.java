package lab4_Methods;

import java.util.Scanner;

public class prob1_Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        printSign(input);
    }

    private static void printSign(int input) {
        if (input > 0) {
            System.out.printf("The number %d is positive.", input);
        } else if (input < 0) {
            System.out.printf("The number %d is negative.", input);
        } else {
            System.out.printf("The number %d is zero.", input);
        }
    }
}
