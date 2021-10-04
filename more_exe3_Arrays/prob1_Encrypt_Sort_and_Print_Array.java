package more_exe3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob1_Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
// 65-97  69-101  73-105  79-111  85-117
        int[] arrSum = new int[input];

            for (int j = 0; j < input; j++) {
                int sumVowels = 0;
                int sumConsonants = 0;
                int sum = 0;

                String string = scanner.nextLine();
                char[] arrChars = new char[string.length()];
                for (int i = 0; i < arrChars.length; i++) {
                    arrChars[i] = string.charAt(i);
                }
                int[] arr = new int[string.length()];
                for (int index = 0; index < arr.length; index++) {
                    arr[index] = arrChars[index];
                    if (arr[index] == 65 || arr[index] == 97 || arr[index] == 69 || arr[index] == 101 ||
                            arr[index] == 73 || arr[index] == 105 || arr[index] == 79 || arr[index] == 111 ||
                            arr[index] == 85 || arr[index] == 117) {
                        int currentValueVowels = arr[index] * string.length();
                        sumVowels += currentValueVowels;
                    } else {
                        int currentValueConsonants = arr[index] / string.length();
                        sumConsonants += currentValueConsonants;
                    }
                }
                sum = sumConsonants + sumVowels;
                arrSum[j] = sum;
            }
            int temporary = 0;
            for (int i = 0; i < input; i++) {
                for (int j = i + 1; j < input; j++) {
                    if (arrSum[i] > arrSum[j]) {
                        temporary = arrSum[i];
                        arrSum[i] = arrSum[j];
                        arrSum[j] = temporary;
                    }
                }
            }
        for (int i = 0; i < input; i++) {
            System.out.println(arrSum[i]);
        }
    }
}



