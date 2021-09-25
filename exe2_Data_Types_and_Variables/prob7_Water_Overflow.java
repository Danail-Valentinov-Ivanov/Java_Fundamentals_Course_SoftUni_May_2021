package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob7_Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int leftCapacity = 255;

        for (int i = 1; i <= numLines; i++) {
            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());
            if (quantitiesOfWater > leftCapacity){
                System.out.println("Insufficient capacity!");
            } else {
                leftCapacity -= quantitiesOfWater;
            }
        }
        System.out.print(255 - leftCapacity);
    }
}
