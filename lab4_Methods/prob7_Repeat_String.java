package lab4_Methods;

import java.util.Scanner;

public class prob7_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        System.out.print(getString(str, num));
    }

    private static String getString(String str, int num) {
        String finalStr = "";
        for (int i = 1; i <= num; i++) {
            finalStr += str;
        }
        return finalStr;
    }

}
