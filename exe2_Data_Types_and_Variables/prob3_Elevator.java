package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPersons = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());

        double numCourses = Math.ceil(1.0 * nPersons / capacityElevator);
        System.out.printf("%.0f", numCourses);
    }
}
