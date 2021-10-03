package more_exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob3_Floating_Equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double ets = 0.000001;
        double differentNum = Math.abs(num1 - num2);
        if (differentNum < ets) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
