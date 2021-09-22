package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob6_Chars_to_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char char1 = '\0';
        char char2 = '\0';
        char char3 = '\0';
        for (int i = 1; i <= 3; i++) {
            char input = scan.nextLine().charAt(0);
            if (i == 1) {
                char1 = input;
            } else if (i == 2) {
                char2 = input;
            } else {
                char3 = input;
            }
        }
        System.out.printf("%c%c%c", char1, char2, char3);
    }
}
