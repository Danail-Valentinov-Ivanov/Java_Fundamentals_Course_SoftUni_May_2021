package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob3_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String typeGroup = scan.nextLine();
        String day = scan.nextLine();

//        Friday Saturday Sunday
//Students 8.45 9.80 10.46
//Business 10.90 15.60 16
//Regular 15 20 22.50

//        Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
// Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
// Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%

        double price = 0;
        if (typeGroup.equals("Students")) {
            if (day.equals("Friday")) {
                if (number >= 30) {
                    price = number * 8.45 * 0.85;
                } else {
                    price = number * 8.45;
                }
            } else if (day.equals("Saturday")) {
                if (number >= 30) {
                    price = number * 9.80 * 0.85;
                } else {
                    price = number * 9.80;
                }
            } else if (day.equals("Sunday")) {
                if (number >= 30) {
                    price = number * 10.46 * 0.85;
                } else {
                    price = number * 10.46;
                }
            }
        } else if (typeGroup.equals("Business")) {
            if (day.equals("Friday")) {
                if (number >= 100) {
                    price = (number - 10) * 10.90;
                } else {
                    price = number * 10.90;
                }
            } else if (day.equals("Saturday")) {
                if (number >= 100) {
                    price = (number - 10) * 15.60;
                } else {
                    price = number * 15.60;
                }
            } else if (day.equals("Sunday")) {
                if (number >= 100) {
                    price = (number - 10) * 16;
                } else {
                    price = number * 16;
                }
            }
        } else if (typeGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                if (number >= 10 && number <= 20) {
                    price = number * 15 * 0.95;
                } else {
                    price = number * 15;
                }
            } else if (day.equals("Saturday")) {
                if (number >= 10 && number <= 20) {
                    price = number * 20 * 0.95;
                } else {
                    price = number * 20;
                }
            } else if (day.equals("Sunday")) {
                if (number >= 10 && number <= 20) {
                    price = number * 22.50 * 0.95;
                } else {
                    price = number * 22.50;
                }
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
