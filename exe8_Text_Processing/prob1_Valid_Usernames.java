package exe8_Text_Processing;

import java.util.Scanner;

public class prob1_Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] userNames = input.split(", ");
        for (int i = 0; i < userNames.length; i++) {
            boolean isValid = true;
            if (userNames[i].length() >= 3 && userNames[i].length() <= 16) {
                for (int j = 0; j < userNames[i].length(); j++) {
                    char currentChar = userNames[i].charAt(j);
                    if (Character.isLetterOrDigit(currentChar)||currentChar==95||currentChar==45){

                    } else {
                        isValid = false;
                    }
                }
                if (isValid){
                    System.out.println(userNames[i]);
                }
            }
        }
    }
}
