package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob1_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = Integer.parseInt(scan.nextLine());
        double kilometers = meters / 1000.0;
        System.out.printf("%.2f", kilometers);
    }
}
