package exe4_Methods;

import java.util.Scanner;

public class prob7_NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        makeMatrix(input);
    }

    private static void makeMatrix(int input) {
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(input + " ");
            }
            System.out.println();
        }
    }
}
