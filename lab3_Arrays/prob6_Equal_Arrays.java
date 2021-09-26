package lab3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob6_Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumElements = 0;
        boolean isEquals = true;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEquals = false;
                break;
            } else {
                sumElements += firstArr[i];
            }
        }
        if (isEquals){
            System.out.printf("Arrays are identical. Sum: %d", sumElements);
        }

    }
}
