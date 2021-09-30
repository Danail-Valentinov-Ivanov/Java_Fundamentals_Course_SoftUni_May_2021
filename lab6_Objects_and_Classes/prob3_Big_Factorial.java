package lab6_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class prob3_Big_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= input; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.print(factorial);
    }
}
