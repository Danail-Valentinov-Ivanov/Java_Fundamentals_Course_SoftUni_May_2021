package more_exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob4_Refactoring_Prime_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 2; currentNum <= num; currentNum++) {
            boolean isTrue = true;
            for (int divider = 2; divider < currentNum; divider++) {
                if (currentNum % divider == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", currentNum, isTrue);
        }
    }
}
