package lab4_Methods;

import java.util.Scanner;

public class prob6_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double areaRectangle = getArea(sideA, sideB);
        System.out.printf("%.0f", areaRectangle);
    }

    private static double getArea(double sideA, double sideB) {
        return sideA * sideB;
    }
}
