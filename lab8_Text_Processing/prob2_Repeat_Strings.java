package lab8_Text_Processing;

import java.util.Scanner;

public class prob2_Repeat_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                result.append(input[i]);
            }
        }
        System.out.print(result.toString());
    }
}
