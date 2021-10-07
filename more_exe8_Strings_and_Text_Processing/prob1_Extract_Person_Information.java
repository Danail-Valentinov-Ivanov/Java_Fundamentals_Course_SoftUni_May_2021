package more_exe8_Strings_and_Text_Processing;

import java.util.Scanner;

public class prob1_Extract_Person_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int startIndexName = 0;
        int endIndexName = 0;
        int startIndexAge = 0;
        int endIndexAge = 0;
        for (int i = 0; i < input; i++) {
            String string = scanner.nextLine();
            for (int j = 0; j < string.length(); j++) {
                switch (string.charAt(j)) {
                    case '@':
                        startIndexName = j + 1;
                        break;
                    case '|':
                        endIndexName = j;
                        break;
                    case '#':
                        startIndexAge = j + 1;
                        break;
                    case '*':
                        endIndexAge = j;
                        break;
                }
            }
            String substringName = string.substring(startIndexName, endIndexName);
            String substringAge = string.substring(startIndexAge, endIndexAge);
            System.out.printf("%s is %s years old.\n", substringName, substringAge);
        }
    }
}
