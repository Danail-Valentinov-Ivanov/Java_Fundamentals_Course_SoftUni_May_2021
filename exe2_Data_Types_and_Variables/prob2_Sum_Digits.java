package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob2_Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int sumDigit = 0;
        while (input!=0){
            int currentDigit = input % 10;
            sumDigit += currentDigit;
            input = input / 10;
        }
        System.out.print(sumDigit);
    }
}
