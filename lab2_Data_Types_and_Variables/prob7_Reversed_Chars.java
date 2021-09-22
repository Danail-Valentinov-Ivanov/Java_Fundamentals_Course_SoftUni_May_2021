package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob7_Reversed_Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char char1 = 0;
        char char2 = 0;
        char char3 = 0;
        for (int i = 1; i <= 3; i++) {
            char chars = scan.nextLine().charAt(0);
            if (i == 1) {
                char1 = chars;
            } else if (i == 2) {
                char2 = chars;
            } else {
                char3 = chars;
            }
        }
        System.out.printf("%c %c %c", char3, char2, char1);
    }
}
