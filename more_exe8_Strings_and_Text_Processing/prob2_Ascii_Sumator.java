package more_exe8_Strings_and_Text_Processing;

import java.util.Scanner;

public class prob2_Ascii_Sumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int char1 = scanner.nextLine().charAt(0);
        int char2 = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > char1 && input.charAt(i) < char2) {
                sum += input.charAt(i);
            }
        }
        System.out.print(sum);
    }
}
