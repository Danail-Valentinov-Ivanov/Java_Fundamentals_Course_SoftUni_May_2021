package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob11_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());
        double V = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
