package lab4_Methods;

import java.util.Scanner;

public class prob9_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("int")) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.print(getCompare(num1, num2));
        } else if (input.equals("char")) {
            char char1 = scanner.nextLine().charAt(0);
            char char2 = scanner.nextLine().charAt(0);
            System.out.print(getCompare(char1, char2));
        } else if (input.equals("string")) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.print(getCompare(str1, str2));
        }
    }

    private static int getCompare(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    private static char getCompare(char char1, char char2) {
        if (char1 > char2) {
            return char1;
        }
        return char2;
    }

    private static String getCompare(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            return str1;
        }
        return str2;
    }
}
