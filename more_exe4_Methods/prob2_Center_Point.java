package more_exe4_Methods;

import java.util.Scanner;

public class prob2_Center_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        printPointClosestToCenter(x1, y1, x2, y2);
    }

    private static void printPointClosestToCenter(int x1, int y1, int x2, int y2) {
        double distanceToCenter1 = Math.sqrt(Math.abs(Math.pow(x1, 2) + Math.pow(y1, 2)));
        double distanceToCenter2 = Math.sqrt(Math.abs(Math.pow(x2, 2) + Math.pow(y2, 2)));
        if (distanceToCenter1 < distanceToCenter2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if (distanceToCenter1 > distanceToCenter2) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}
