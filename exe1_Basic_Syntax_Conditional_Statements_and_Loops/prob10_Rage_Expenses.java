package exe1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob10_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int trashedHeadset = 0;
        int trashedMouse = 0;
        int trashedKeyboard = 0;
        int trashedDisplay = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                trashedHeadset++;
            }
            if (i % 3 == 0) {
                trashedMouse++;
            }
            if (i % 6 == 0) {
                trashedKeyboard++;
            }
            if (i % 12 == 0) {
                trashedDisplay++;
            }
        }
        double sumHeadsetPrice = headsetPrice * trashedHeadset;
        double sumMousePrice = mousePrice * trashedMouse;
        double sumKeyboardPrice = keyboardPrice * trashedKeyboard;
        double sumDisplayPrice = displayPrice * trashedDisplay;
        double totalSum = sumHeadsetPrice + sumMousePrice + sumKeyboardPrice + sumDisplayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
