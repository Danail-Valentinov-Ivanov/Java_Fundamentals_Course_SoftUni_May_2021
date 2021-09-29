package exe4_Methods;

import java.util.Scanner;

public class prob2_Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a e u o i
        printCountVowels(scanner.nextLine().toLowerCase());
    }

    private static void printCountVowels(String input) {
        int countVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            switch (currentChar){
                case 'a':
                    countVowels++;
                    break;
                case 'e':
                    countVowels++;
                    break;
                case 'u':
                    countVowels++;
                    break;
                case 'o':
                    countVowels++;
                    break;
                case 'i':
                    countVowels++;
                    break;
            }
        }
        System.out.print(countVowels);
    }
}
