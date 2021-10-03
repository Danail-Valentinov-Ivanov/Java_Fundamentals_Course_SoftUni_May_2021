package exe8_Text_Processing;

import java.util.Scanner;

public class prob7_String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                strength += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            if (input.charAt(i) != '>' && strength > 0) {
                input.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.print(input);
    }
}
