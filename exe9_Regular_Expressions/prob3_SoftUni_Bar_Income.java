package exe9_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prob3_SoftUni_Bar_Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\\w]+)>" +
                "[^|$%.]*\\|(?<count>[\\d]+)\\|[^|$%.0-9]*(?<price>[0-9]+.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0;
        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double productPrice = 1.0 * count * price;
                totalPrice += productPrice;
                System.out.printf("%s: %s - %.2f\n", matcher.group("customer")
                        , matcher.group("product"), productPrice);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
