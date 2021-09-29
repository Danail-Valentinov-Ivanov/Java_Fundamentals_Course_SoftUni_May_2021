package exe4_Methods;

import java.util.Scanner;

public class prob8_Factorial_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double factorialNum1 = getFactorial(num1);
        double factorialNum2 = getFactorial(num2);
        double divisionFactorials = factorialNum1 / factorialNum2;
        System.out.printf("%.2f", divisionFactorials);
    }

    private static double getFactorial(int numbers) {
        double factorial = 1;
        for (int j = numbers; j >= 1; j--) {
            factorial *= j;
        }
        return factorial;
    }
}
