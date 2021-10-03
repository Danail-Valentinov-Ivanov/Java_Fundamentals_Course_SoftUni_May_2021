package more_exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob5_Decrypting_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numChars = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numChars; i++) {
            int newChar = 0;
            char chars = scanner.nextLine().charAt(0);
            newChar = chars + key;
            System.out.printf("%c", newChar);
        }
    }
}
