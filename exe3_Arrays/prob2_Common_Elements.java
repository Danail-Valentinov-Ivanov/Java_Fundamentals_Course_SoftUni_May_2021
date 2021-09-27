package exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob2_Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] arr1 = input1.split(" ");
        String[] arr2 = input2.split(" ");

        for (int indexArr2 = 0; indexArr2 < arr2.length; indexArr2++) {
            for (int indexArr1 = 0; indexArr1 < arr1.length; indexArr1++) {
                if (arr1[indexArr1].equals(arr2[indexArr2])) {
                    System.out.print(arr1[indexArr1] + " ");
                }
            }
        }
    }
}
