package exe6_Objects_and_Classes.prob4_Articles_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        List<Articles> listOfArticle = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Articles currentArticle = new Articles(title, content, author);
            listOfArticle.add(currentArticle);
        }
        String command = scanner.nextLine();
        switch (command) {
            case "title":
                listOfArticle.sort(Comparator.comparing(Articles::getTitle));
                break;
            case "content":
                listOfArticle.sort(Comparator.comparing(Articles::getContent));
                break;
            case "author":
                listOfArticle.sort(Comparator.comparing(Articles::getAuthor));
                break;
        }
        System.out.println(listOfArticle.toString().replace("[", "")
                .replace("]", "").replaceAll(", ", ""));
    }

    public static class Articles {

        String title;
        String content;
        String author;

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String toString() {
            return this.title + " - " + this.content + ": " + this.author + "\n";
        }
    }

}
