package lab1_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class prob6_Foreign_Languages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input){
            case "USA":
                System.out.println("English");
                break;
            case "England":
                System.out.println("English");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            case "Argentina":
                System.out.println("Spanish");
                break;
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
