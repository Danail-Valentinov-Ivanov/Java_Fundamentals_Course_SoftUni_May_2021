package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob8_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numKegs = Integer.parseInt(scanner.nextLine());

        double volumeMaxCurrentKeg = 0;
        String volumeMaxModelKeg = "";
        for (int currentKeg = 1; currentKeg <= numKegs; currentKeg++) {
            String modelKeg = scanner.nextLine();
            double radiusKeg = Double.parseDouble(scanner.nextLine());
            int heightKeg = Integer.parseInt(scanner.nextLine());
            double volumeCurrentKeg = Math.PI * Math.pow(radiusKeg, 2) * heightKeg;
            if (volumeCurrentKeg >= volumeMaxCurrentKeg) {
                volumeMaxCurrentKeg = volumeCurrentKeg;
                volumeMaxModelKeg = modelKeg;
            }
        }
        System.out.println(volumeMaxModelKeg);
    }
}

