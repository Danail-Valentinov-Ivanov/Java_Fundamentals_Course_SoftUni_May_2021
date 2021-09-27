package exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob5_Top_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                } else {
                    isBigger = false;
                }

            }
            if (isBigger) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
