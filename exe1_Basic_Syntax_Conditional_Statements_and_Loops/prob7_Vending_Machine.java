package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob7_Vending_Machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        double totalSum = 0;
        while (!input.equals("Start")) {
            double currentSum = Double.parseDouble(input);
            if (currentSum == 0.10 || currentSum == 0.20 ||
                    currentSum == 0.50 || currentSum == 1.00 || currentSum == 2.00) {
                totalSum = totalSum + currentSum;
            }else {
                System.out.printf("Cannot accept %.2f\n",currentSum);
            }
            input = scan.nextLine();
        }

        String purchased = scan.nextLine();
        while (!purchased.equals("End")){
            if (purchased.equals("Nuts")){
                if (totalSum < 2.00){
                    System.out.println("Sorry, not enough money");

                } else {
                    totalSum -= 2.00;
                    System.out.printf("Purchased %s\n",purchased);
                }
            }else if (purchased.equals("Water")){
                if (totalSum < 0.70){
                    System.out.println("Sorry, not enough money");

                } else {
                    totalSum -= 0.70;
                    System.out.printf("Purchased %s\n",purchased);
                }

            }else if (purchased.equals("Crisps")){
                if (totalSum < 1.50){
                    System.out.println("Sorry, not enough money");

                } else {
                    totalSum -= 1.50;
                    System.out.printf("Purchased %s\n",purchased);
                }

            }else if (purchased.equals("Soda")){
                if (totalSum < 0.80){
                    System.out.println("Sorry, not enough money");

                } else {
                    totalSum -= 0.80;
                    System.out.printf("Purchased %s\n",purchased);
                }

            }else if (purchased.equals("Coke")){
                if (totalSum < 1.00){
                    System.out.println("Sorry, not enough money");

                } else {
                    totalSum -= 1.00;
                    System.out.printf("Purchased %s\n",purchased);
                }

            }else {
                System.out.println("Invalid product");
            }

            purchased = scan.nextLine();
        }
        System.out.printf("Change: %.2f",totalSum);
    }
}
