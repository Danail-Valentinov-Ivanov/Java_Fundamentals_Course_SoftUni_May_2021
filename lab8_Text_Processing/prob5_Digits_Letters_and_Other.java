package lab8_Text_Processing;

import java.util.Scanner;

public class prob5_Digits_Letters_and_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digits.append(input.charAt(i));
            } else if (Character.isLetter(input.charAt(i))) {
                letters.append(input.charAt(i));
            } else {
                others.append(input.charAt(i));
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());
    }
}
