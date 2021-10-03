package exe8_Text_Processing;

import java.util.Scanner;

public class prob3_Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String lastString = input[input.length - 1];
        String fileName = lastString.split("\\.")[0];
        String extension = lastString.split("\\.")[1];
        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
