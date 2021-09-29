package exe4_Methods;

import java.util.Scanner;

public class prob6_Middle_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getMiddleCharacter(input);
    }

    private static void getMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            int rightMiddleIndex = input.length() / 2;
            int leftMiddleIndex = rightMiddleIndex - 1;
            char rightMiddle = input.charAt(rightMiddleIndex);
            char leftMiddle = input.charAt(leftMiddleIndex);
            System.out.print(leftMiddle);
            System.out.print(rightMiddle);
        } else {
            int oddMiddleIndex = input.length() / 2;
            char oddMiddle = input.charAt(oddMiddleIndex);
            System.out.print(oddMiddle);
        }
    }
}
