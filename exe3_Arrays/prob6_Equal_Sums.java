package exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob6_Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumOnRight = 0;
        int sumOnLeft = 0;
        boolean isEqualsSum = false;

        for (int index = 0; index < arr.length; index++) {
            if (index == 0) {


                for (int i = index + 1; i < arr.length; i++) {
                    sumOnRight += arr[i];
                }
            } else if (index == arr.length - 1) {
                sumOnRight = 0;
                sumOnLeft = 0;
                for (int i = 0; i < arr.length - 1; i++) {
                    sumOnLeft += arr[i];
                }
            } else {
                sumOnRight = 0;
                sumOnLeft = 0;
                for (int i = 0; i < index; i++) {
                    sumOnLeft += arr[i];
                }
                for (int i = index + 1; i < arr.length; i++) {
                    sumOnRight += arr[i];
                }
            }
            if (sumOnLeft == sumOnRight) {
                System.out.print(index);
                isEqualsSum = true;
            }
        }
        if (!isEqualsSum) {
            System.out.print("no");
        }
    }
}
