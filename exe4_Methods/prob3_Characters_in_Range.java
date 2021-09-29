package exe4_Methods;

import java.util.Scanner;

public class prob3_Characters_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        printCharsBetweenChars(char1, char2);
    }

    private static void printCharsBetweenChars(char char1, char char2) {
        if (char1 > char2) {
            char item = char1;
            char1 = char2;
            char2 = item;
        }
        for (int i = char1 + 1; i < char2; i++) {
            System.out.print((char) i + " ");
        }
    }
}

