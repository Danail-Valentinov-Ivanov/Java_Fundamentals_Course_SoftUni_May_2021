package exe9_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prob1_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[\\d]+.?[\\d]*)!([\\d]+)";
        String input = scanner.nextLine();
        List<String> listNames = new ArrayList<>();
        double sumFurniture = 0;

        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                listNames.add(matcher.group("name"));
                sumFurniture += Double.parseDouble(matcher.group("price"))
                        * Integer.parseInt(matcher.group(3));
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        listNames.forEach(e -> System.out.println(e));
        System.out.printf("Total money spend: %.2f\n", sumFurniture);
    }
}
