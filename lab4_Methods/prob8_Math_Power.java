package lab4_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class prob8_Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.print(new DecimalFormat("0.####").format(mathPower(num,power)));
    }

    private static double mathPower(double num, int power) {
        return Math.pow(num, power);
    }
}
