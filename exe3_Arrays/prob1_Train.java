package exe3_Arrays;

import java.util.Scanner;

public class prob1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int[] array = new int[num];
        int sumWagon = 0;
        for (int currentNum = 0; currentNum < num; currentNum++) {
            array[currentNum] = Integer.parseInt(scanner.nextLine());
            sumWagon += array[currentNum];
        }
        for (int currentNum = 0; currentNum < num; currentNum++) {
            System.out.print(array[currentNum] + " ");
        }
        System.out.println();
        System.out.print(sumWagon);
    }
}
