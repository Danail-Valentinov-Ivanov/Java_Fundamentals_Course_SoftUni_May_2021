package lab8_Text_Processing;

import java.util.Scanner;

public class prob3_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String text = scanner.nextLine();
        int firstIndex = text.indexOf(key);
        while (firstIndex != -1) {
            text = text.replace(key, "");
            firstIndex = text.indexOf(key);
        }
        System.out.print(text);
    }
}
