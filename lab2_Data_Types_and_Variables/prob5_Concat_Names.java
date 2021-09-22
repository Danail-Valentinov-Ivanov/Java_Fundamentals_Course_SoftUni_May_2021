package lab2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob5_Concat_Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String chars = scan.nextLine();
        System.out.println(name1 + chars + name2);
    }
}
