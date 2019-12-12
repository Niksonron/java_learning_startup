package Car;
import Wheel.Wheel;

public class Car {
    public String carName, carModel;

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }


    Wheel tires = new Wheel("TOYO", 4);

    public Car (String carName, String carModel){
        this.carModel = carModel;
        this.carName = carName;

    }


    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", tires=" + tires +
                '}';
    }
}