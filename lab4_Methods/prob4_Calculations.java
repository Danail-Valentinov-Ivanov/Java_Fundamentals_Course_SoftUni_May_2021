package lab4_Methods;

import java.util.Scanner;

public class prob4_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        getDivide(command,num1, num2);
        getMultiply(command,num1,num2);
        getSubtract(command,num1,num2);
        getAdd(command, num1, num2);
    }

    private static void getDivide(String command, int num1, int num2) {
        if (command.equals("divide")) {
            int result = num1 / num2;
            System.out.print(result);
        }
    }

    private static void getMultiply(String command, int num1, int num2) {
        if (command.equals("multiply")) {
            int result = num1 * num2;
            System.out.print(result);
        }
    }

    private static void getSubtract(String command, int num1, int num2) {
        if (command.equals("subtract")) {
            int result = num1 - num2;
            System.out.print(result);
        }
    }

    private static void getAdd(String command, int num1, int num2) {
        if (command.equals("add")) {
            int result = num1 + num2;
            System.out.print(result);
        }
    }
}
