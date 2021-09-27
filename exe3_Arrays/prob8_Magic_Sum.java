package exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob8_Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < arr.length; index++) {
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[index] + arr[i] == num){
                    System.out.println(arr[index]+" "+arr[i]);
                }
            }
        }
    }
}
