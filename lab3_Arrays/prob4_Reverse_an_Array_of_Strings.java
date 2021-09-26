package lab3_Arrays;

import java.util.Scanner;

public class prob4_Reverse_an_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            String oldValue = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = oldValue;
        }
        System.out.println(String.join(" ", arr));
    }
}
