package exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob3_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[numLines];
        String[] arr2 = new String[numLines];

        for (int currentLine = 0; currentLine < numLines; currentLine++) {
            if (currentLine % 2 == 0) {
                String[] evenLine = scanner.nextLine().split(" ");
                arr1[currentLine] = evenLine[0];
                arr2[currentLine] = evenLine[1];
            } else {
                String[] oddline = scanner.nextLine().split(" ");
                arr1[currentLine] = oddline[1];
                arr2[currentLine] = oddline[0];
            }
        }
            System.out.println(String.join(" ", arr1));
            System.out.println(String.join(" ", arr2));
    }
}
