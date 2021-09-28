package lab4_Methods;

import java.util.Scanner;

public class prob5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//         coffee – 1.50
// water – 1.00
// coke – 1.40
// snacks – 2.00
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        getResult(product, quantity);
    }

    private static void getResult(String product, int quantity) {
        double result = 0;
        if (product.equals("coffee")) {
            result = 1.5 * quantity;
        } else if (product.equals("water")) {
            result = 1.0 * quantity;
        } else if (product.equals("coke")) {
            result = 1.4 * quantity;
        } else if (product.equals("snacks")) {
            result = 2.0 * quantity;
        }
        System.out.printf("%.2f", result);
    }
}
