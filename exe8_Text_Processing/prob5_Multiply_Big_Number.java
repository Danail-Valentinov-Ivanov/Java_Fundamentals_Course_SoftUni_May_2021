package exe8_Text_Processing;

import java.math.BigInteger;
import java.util.Scanner;

public class prob5_Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());
        System.out.print(num1.multiply(num2));
    }
}
