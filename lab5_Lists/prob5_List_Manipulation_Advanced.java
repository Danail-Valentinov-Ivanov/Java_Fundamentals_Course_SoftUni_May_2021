package lab5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob5_List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Contains {number} – check if the list contains the number. If yes print &quot;Yes&quot;, otherwise print &quot;No such number&quot;
//        Print even – print all the numbers that are even separated by a space
//        Print odd – print all the numbers that are odd separated by a space
//        Get sum – print the sum of all the numbers
//        Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either &#39;&lt;&#39;, &#39;&gt;&#39;,
//&quot;&gt;=&quot;, &quot;&lt;=&quot;
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("end")) {
            String[] commandArray = commandLine.split(" ");
            switch (commandArray[0]) {
                case "Contains":
                    if (numbersList.contains(Integer.parseInt(commandArray[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArray[1].equals("even")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArray[1].equals("odd")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 1) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        sum += numbersList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (commandArray[1].equals("<")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandArray[2]) > numbersList.get(i)) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArray[1].equals(">")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandArray[2]) < numbersList.get(i)) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArray[1].equals(">=")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandArray[2]) <= numbersList.get(i)) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArray[1].equals("<=")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandArray[2]) >= numbersList.get(i)) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
    }
}