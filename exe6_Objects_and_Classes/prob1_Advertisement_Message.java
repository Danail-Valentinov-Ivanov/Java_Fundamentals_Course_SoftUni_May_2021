package exe6_Objects_and_Classes;

import java.util.*;

public class prob1_Advertisement_Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        for (int i = 1; i <= input; i++) {
            Random randomElement = new Random();
            int randomIndex = randomElement.nextInt(phrases.size());
            System.out.print(phrases.get(randomIndex) + " ");

            randomIndex = randomElement.nextInt(events.size());
            System.out.print(events.get(randomIndex) + " ");

            randomIndex = randomElement.nextInt(authors.size());
            System.out.print(authors.get(randomIndex) + " - ");

            randomIndex = randomElement.nextInt(cities.size());
            System.out.print(cities.get(randomIndex));
            System.out.println();
        }
    }
}
