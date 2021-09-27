package exe3_Arrays;

import java.util.Scanner;

public class prob4_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrInput = scanner.nextLine().split(" ");
        int numRotation = Integer.parseInt(scanner.nextLine());

        for (int currentRotation = 0; currentRotation < numRotation; currentRotation++) {
            String oldValue = arrInput[0];
            for (int currentIndex = 0; currentIndex < arrInput.length - 1; currentIndex++) {
                arrInput[currentIndex] = arrInput[currentIndex + 1];
            }
            arrInput[arrInput.length - 1] = oldValue;

        }
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + " ");
        }
    }
}
