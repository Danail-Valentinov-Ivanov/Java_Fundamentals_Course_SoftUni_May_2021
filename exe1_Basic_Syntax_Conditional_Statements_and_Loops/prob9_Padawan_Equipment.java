package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob9_Padawan_Equipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightsabers = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());

        double addCountLightsabers = Math.ceil(countOfStudents * 0.1);
        double totalPriceOfLightsabers = priceOfLightsabers * (countOfStudents + addCountLightsabers);
        double totalPriceOfRobes = priceOfRobes * countOfStudents;
        int countOfEverySixthBelts = 0;
        for (int i = 1; i <= countOfStudents; i++) {
            if (i % 6 == 0) {
                countOfEverySixthBelts = countOfEverySixthBelts + 1;
            }
        }
        double totalPriceOfBelts = priceOfBelts * (countOfStudents - countOfEverySixthBelts);
        double totalPrice = totalPriceOfLightsabers + totalPriceOfRobes + totalPriceOfBelts;
        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPrice - amountOfMoney));
        }
    }
}
