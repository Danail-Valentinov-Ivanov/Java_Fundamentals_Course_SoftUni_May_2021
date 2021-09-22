package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob8_Lower_or_Upper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char input = scan.nextLine().charAt(0);
        int digit = input;
        if (digit >= 65 && digit <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
