package lab6_Objects_and_Classes;

import java.util.Random;
import java.util.Scanner;

public class prob1_Randomize_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Random randomWord = new Random();
        for (int i = 0; i < input.length; i++) {
            int randomIndex = randomWord.nextInt(input.length);
            String tempIndex = input[i];
            input[i] = input[randomIndex];
            input[randomIndex] = tempIndex;
        }
        for (String e : input) {
            System.out.println(e);
        }
    }
}
