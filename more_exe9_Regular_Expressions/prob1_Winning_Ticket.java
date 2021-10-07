package more_exe9_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prob1_Winning_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexJackpot = "(?<matchJackpot>[@]{10}|[#]{10}|[$]{10}|[\\^]{10})";
        String regexMatch = "(?<match>[@]{6,10}|[#]{6,10}|[$]{6,10}|[\\^]{6,10})";
        Pattern patternJackpot = Pattern.compile(regexJackpot);
        Pattern patternMatch = Pattern.compile(regexMatch);
        String input = scanner.nextLine();
        String[] currentString = input.split("\\s*,\\s*");
        for (int i = 0; i < currentString.length; i++) {
            String currentCommand = currentString[i];
            if (currentCommand.length() == 20) {
                String substring1Command = currentCommand.substring(0, 10);
                String substring2Command = currentCommand.substring(10);
                Matcher matcherJackpot1Command = patternJackpot.matcher(substring1Command);
                Matcher matcherJackpot2Command = patternJackpot.matcher(substring2Command);
                Matcher matcherMatch1Command = patternMatch.matcher(substring1Command);
                Matcher matcherMatch2Command = patternMatch.matcher(substring2Command);
                if (matcherJackpot1Command.find() && matcherJackpot2Command.find()) {

                    int numChars = matcherJackpot1Command.group().length();
                    char chars = matcherJackpot1Command.group().charAt(0);
                    System.out.printf("ticket \"%s\" - %d%c Jackpot!\n", currentCommand, numChars, chars);
                } else if (matcherMatch1Command.find() && matcherMatch2Command.find()) {

                    int numChars = Math.min(matcherMatch1Command.group().length(),
                            matcherMatch2Command.group().length());
                    char chars = matcherMatch2Command.group().charAt(0);
                    System.out.printf("ticket \"%s\" - %d%c\n", currentCommand,
                            numChars, chars);
                } else {
                    System.out.printf("ticket \"%s\" - no match\n", currentCommand);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
