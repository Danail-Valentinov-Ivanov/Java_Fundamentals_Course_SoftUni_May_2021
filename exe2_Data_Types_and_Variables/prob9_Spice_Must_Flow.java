package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob9_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startYield = Integer.parseInt(scanner.nextLine());
        int countYieldDays = 0;

        int totalYield = 0;

        while (startYield >= 100) {
            int currentYield = startYield;
            currentYield -= 26;
            totalYield += currentYield;
            startYield -= 10;
            countYieldDays++;
        }
        if (startYield < 100) {
            totalYield -= 26;
        }
        if (totalYield<26){
            totalYield -= totalYield;
        }
        System.out.println(countYieldDays);
        System.out.println(totalYield);

    }
}
