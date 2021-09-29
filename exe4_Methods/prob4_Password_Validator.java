package exe4_Methods;

import java.util.Scanner;

public class prob4_Password_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean one = chechNumberOfLetters(input);
        boolean two = chechConsistOflettersAndNumbers(input);
        boolean tree = chechHaveAtLeastTwoNumbers(input);
        if (one && two && tree) {
            System.out.println("Password is valid");
        }
    }

    //48 57
    //65 90
    //97 122
    private static boolean chechHaveAtLeastTwoNumbers(String input) {
        boolean isValid = false;
        int countNumbers = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar > 47 && currentChar < 58) {
                countNumbers++;
            }
        }
        if (countNumbers >= 2) {
            isValid = true;
        }
        if (!isValid) {
            System.out.println("Password must have at least 2 digits");
        }
        return isValid;
    }

    private static boolean chechConsistOflettersAndNumbers(String input) {
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isLetter(currentChar) && !Character.isDigit(currentChar)) {
                isValid = false;
            }
        }
        if (!isValid) {
            System.out.println("Password must consist only of letters and digits");
        }
        return isValid;
    }

    private static boolean chechNumberOfLetters(String input) {
        boolean isValid = false;
        for (int i = 0; i < input.length(); i++) {
            if ((i + 1) >= 6 && (i + 1) <= 10) {
                isValid = true;
            }
        }
        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return isValid;
    }
}
