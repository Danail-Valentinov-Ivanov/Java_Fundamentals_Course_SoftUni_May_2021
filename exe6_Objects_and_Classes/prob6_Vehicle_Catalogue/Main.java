package exe6_Objects_and_Classes.prob6_Vehicle_Catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Type: {typeOfVehicle}
        //Model: {modelOfVehicle}
        //Color: {colorOfVehicle}
        //Horsepower: {horsepowerOfVehicle}
        List<Vehicle_Catalogue> listVehicle = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String type = "";
            if (data[0].equals("car")) {
                type = "Car";
            } else {
                type = "Truck";
            }
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);
            Vehicle_Catalogue currentVehicle = new Vehicle_Catalogue(type, model, color, horsePower);
            listVehicle.add(currentVehicle);
            input = scanner.nextLine();
        }
        String modelVehicle = scanner.nextLine();
        while (!modelVehicle.equals("Close the Catalogue")) {
            for (Vehicle_Catalogue e : listVehicle) {
                if (modelVehicle.equals(e.getModel())) {
                    System.out.printf("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d\n", e.getType()
                            , e.getModel(), e.getColor(), e.getHorsePower());
                }
            }
            modelVehicle = scanner.nextLine();
        }
        int sumCars = 0;
        int sumTrucks = 0;
        int countCars = 0;
        int countTrucks = 0;
        for (Vehicle_Catalogue e : listVehicle) {
            switch (e.getType()) {
                case "Car":
                    sumCars += e.getHorsePower();
                    countCars++;
                    break;
                case "Truck":
                    sumTrucks += e.getHorsePower();
                    countTrucks++;
                    break;
            }
        }
        double averageHorsePowerCars = 1.0 * sumCars / countCars;
        double averageHorsePowerTrucks = 1.0 * sumTrucks / countTrucks;
        if (countCars > 0 && countTrucks > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageHorsePowerCars);
            System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);
        } else if (countCars == 0 && countTrucks > 0) {
            System.out.print("Cars have average horsepower of: 0.00.\n");
            System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);
        } else if (countCars > 0 && countTrucks == 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageHorsePowerCars);
            System.out.print("Trucks have average horsepower of: 0.00.");
        }

    }
}
