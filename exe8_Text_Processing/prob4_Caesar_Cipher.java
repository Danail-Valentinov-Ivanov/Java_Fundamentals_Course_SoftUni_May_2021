package exe8_Text_Processing;

import java.util.Scanner;

public class prob4_Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = (char) (input.charAt(i) + 3);
            output.append(currentChar);
        }
        System.out.print(output);
    }
}
