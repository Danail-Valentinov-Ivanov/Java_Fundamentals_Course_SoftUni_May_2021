package more_exe4_Methods;

import java.util.Scanner;

public class prob1_Data_Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeVariable = scanner.nextLine();
        String input = scanner.nextLine();
        if (typeVariable.equals("int")) {
            int intNum = Integer.parseInt(input);
            printInput(intNum);
        }else if (typeVariable.equals("real")){
            double doubleNum = Double.parseDouble(input);
            printInput(doubleNum);
        }else if (typeVariable.equals("string")){
            printInput(input);
        }
    }

    private static void printInput(String input) {
        System.out.printf("$%s$", input);
    }

    private static void printInput(double doubleNum) {
        doubleNum *= 1.5;
        System.out.printf("%.2f", doubleNum);
    }

    private static void printInput(int intNum) {
        intNum *= 2;
        System.out.print(intNum);
    }
}
