package exe4_Methods;

import java.util.Scanner;

public class prob5_Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        getSum(num1, num2, num3);
    }

    private static void getSum(int num1, int num2, int num3) {
        int sum = num1 + num2;
        getSubtract(sum, num3);
    }

    private static void getSubtract(int sum, int num3) {
        int subtract = sum - num3;
        System.out.print(subtract);
    }
}
