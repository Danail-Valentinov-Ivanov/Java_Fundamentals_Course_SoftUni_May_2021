package exe6_Objects_and_Classes.prob2_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] article = input.split(", ");
        String title = article[0];
        String content = article[1];
        String author = article[2];

        Articles currentArticle = new Articles(title, content, author);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            String newInput = scanner.nextLine();
            String[] newArticle = newInput.split(": ");
            String command = newArticle[0];
            String contentCommand = newArticle[1];

            if (command.equals("Edit")) {
                currentArticle.setContent(contentCommand);
            } else if (command.equals("ChangeAuthor")) {
                currentArticle.setAuthor(contentCommand);
            } else if (command.equals("Rename")) {
                currentArticle.setTitle(contentCommand);
            }
        }
        System.out.print(currentArticle.toString());
    }
}
