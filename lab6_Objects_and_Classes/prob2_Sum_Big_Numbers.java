package lab6_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class prob2_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        BigInteger sum = firstNumber.add(secondNumber);
        System.out.print(sum);
    }
}
