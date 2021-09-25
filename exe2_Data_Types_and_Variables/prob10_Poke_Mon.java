package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob10_Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pokePowerN = Double.parseDouble(scanner.nextLine());
        double distancePokeTargetsM = Double.parseDouble(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int countOfTargets = 0;

        double currentPokePowerN = pokePowerN;
        while (pokePowerN >= distancePokeTargetsM) {
            pokePowerN -= distancePokeTargetsM;
            countOfTargets++;
            if (pokePowerN == (currentPokePowerN / 2)) {
                pokePowerN = (int) pokePowerN;
                if ((pokePowerN / exhaustionFactorY) != 0 && exhaustionFactorY != 0) {
                    pokePowerN /= exhaustionFactorY;
                }

            }

        }
        System.out.println((int) pokePowerN);
        System.out.println(countOfTargets);
    }
}
