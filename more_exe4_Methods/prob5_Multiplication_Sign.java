package more_exe4_Methods;

import java.util.Scanner;

public class prob5_Multiplication_Sign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        getSigh(num1, num2, num3);
    }

    private static void getSigh(int num1, int num2, int num3) {
        boolean isPositive = true;
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            isPositive = false;
            System.out.print("zero");
        }
        if (num1 < 0 && num2 < 0 && num3 < 0) {
            isPositive = false;
            System.out.print("negative");
        } else if (num1 < 0 || num2 < 0 || num3 < 0) {
            if (num1 < 0 && num2 < 0 && num3 > 0) {

            } else if (num1 < 0 && num3 < 0 && num2 > 0) {

            } else if (num2 < 0 && num3 < 0 && num1 > 0) {

            } else {
                isPositive = false;
                System.out.print("negative");
            }
        }
        if (isPositive) {
            System.out.print("positive");
        }
    }
}
