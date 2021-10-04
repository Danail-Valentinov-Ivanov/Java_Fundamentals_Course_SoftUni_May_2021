package lab9_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prob2_Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\B\\+359([ -])[2]{1}\\1[\\d]{3}\\1[\\d]{4}\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> listMatchers = new ArrayList<>();
        while (matcher.find()) {
            listMatchers.add(matcher.group());
        }

        System.out.println(String.join(", ", listMatchers));
    }
}
