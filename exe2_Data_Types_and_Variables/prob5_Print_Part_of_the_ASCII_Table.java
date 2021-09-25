package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob5_Print_Part_of_the_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startChar = Integer.parseInt(scanner.nextLine());
        int stopChar = Integer.parseInt(scanner.nextLine());

        for (int i = startChar; i <= stopChar; i++) {
            System.out.print((char) i + " ");
        }
    }
}
