package exe6_Objects_and_Classes.prob6_Vehicle_Catalogue;

public class Vehicle_Catalogue {
    //Type: {typeOfVehicle}
    //Model: {modelOfVehicle}
    //Color: {colorOfVehicle}
    //Horsepower: {horsepowerOfVehicle}
    String type;
    String model;
    String color;
    int horsePower;

    public Vehicle_Catalogue(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
