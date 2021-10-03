package exe8_Text_Processing;

import java.util.Scanner;

public class prob2_Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        int result = getResult(first, second);
        System.out.print(result);
    }

    private static int getResult(String first, String second) {
        int difference = Math.abs(first.length() - second.length());
        int loopLength = 0;
        int totalSum = 0;
        if (first.length() >= second.length()) {
            loopLength = first.length() - difference;
            if (first.length() > second.length()) {
                String substring = first.substring(loopLength);
                for (int i = 0; i < substring.length(); i++) {
                    int charSubstring = substring.charAt(i);
                    totalSum += charSubstring;
                }
            }
        } else {
            loopLength = second.length() - difference;
            String substring = second.substring(loopLength);
            for (int i = 0; i < substring.length(); i++) {
                int charSubstring = substring.charAt(i);
                totalSum += charSubstring;
            }
        }
        for (int i = 0; i < loopLength; i++) {
            int currentCharFirstStr = first.charAt(i);
            int currentCharSecondStr = second.charAt(i);
            int multiplyChars = currentCharFirstStr * currentCharSecondStr;
            totalSum += multiplyChars;
        }
        return totalSum;
    }
}
