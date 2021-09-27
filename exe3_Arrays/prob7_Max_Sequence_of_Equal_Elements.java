package exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob7_Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int indexMaxCount = 0;
        int count = 0;

        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] == arr[index + 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    indexMaxCount = arr[index];
                }
            } else {
                count = 0;
            }
        }
        for (int i = 1; i <= maxCount + 1; i++) {
            System.out.print(indexMaxCount + " ");
        }
    }
}
