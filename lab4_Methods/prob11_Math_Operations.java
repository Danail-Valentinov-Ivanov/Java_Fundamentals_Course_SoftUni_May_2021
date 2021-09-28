package lab4_Methods;

import java.util.Scanner;

public class prob11_Math_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f", getResult(num1,operator,num2));
    }

    private static double getResult(double num1, String operator, double num2) {
        double result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
