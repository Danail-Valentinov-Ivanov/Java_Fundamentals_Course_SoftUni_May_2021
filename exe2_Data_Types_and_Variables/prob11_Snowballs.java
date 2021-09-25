package exe2_Data_Types_and_Variables;

import java.util.Scanner;

public class prob11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSnowballs = Integer.parseInt(scanner.nextLine());
//(snowballSnow / snowballTime) ^ snowballQuality
        //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
        double snowballValue = 0;
        int snowballSnowMaxVolume = 0;
        int snowballTimeMaxVolume = 0;
        int snowballQualityMaxVolume = 0;
        for (int currentSnowballs = 1; currentSnowballs <= numSnowballs; currentSnowballs++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowDivideTime = (1.0 * snowballSnow / snowballTime);
            double snowballMaxValue = Math.pow(snowDivideTime, snowballQuality);
            if (snowballMaxValue > snowballValue) {
                snowballValue = snowballMaxValue;
                snowballSnowMaxVolume = snowballSnow;
                snowballTimeMaxVolume = snowballTime;
                snowballQualityMaxVolume = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMaxVolume, snowballTimeMaxVolume,
                snowballValue, snowballQualityMaxVolume);
    }
}
