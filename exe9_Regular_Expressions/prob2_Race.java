package exe9_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class prob2_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listNames = Arrays.stream(input.split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> mapNames = new LinkedHashMap<>();
        String regexName = "(?<nameChar>[A-Za-z]+)";
        Pattern patternName = Pattern.compile(regexName);
        String regexDigit = "(?<digitChar>[0-9])";
        Pattern patternDigit = Pattern.compile(regexDigit);
        while (!input.equals("end of race")) {
            Matcher matcherName = patternName.matcher(input);
            String name = "";
            while (matcherName.find()) {
                name += matcherName.group();
            }
            Matcher matcherDigit = patternDigit.matcher(input);
            int sumDistance = 0;
            while (matcherDigit.find()) {
                sumDistance += Integer.parseInt(matcherDigit.group());
            }
            if (mapNames.containsKey(name) && listNames.contains(name)) {
                int oldDistance = mapNames.get(name);
                mapNames.put(name, oldDistance + sumDistance);
            } else if (!mapNames.containsKey(name) && listNames.contains(name)) {
                mapNames.put(name, sumDistance);
            }
            input = scanner.nextLine();
        }
        List<String> listFinalNames = new ArrayList<>();
        listFinalNames = mapNames.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3).map(e -> e.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s\n", listFinalNames.get(0));
        System.out.printf("2nd place: %s\n", listFinalNames.get(1));
        System.out.printf("3rd place: %s\n", listFinalNames.get(2));
    }
}
