package exe8_Text_Processing;

import java.util.Scanner;

public class prob6_Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                input.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.print(input);
    }
}
