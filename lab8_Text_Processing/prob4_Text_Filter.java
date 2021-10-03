package lab8_Text_Processing;

import java.util.Scanner;

public class prob4_Text_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listBanWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (var e : listBanWords) {
            if (text.contains(e)) {
                String replacement = "";
                for (int i = 0; i < e.length(); i++) {
                    replacement += "*";
                }
                text = text.replace(e, replacement);
            }
        }
        System.out.print(text);
    }
}
