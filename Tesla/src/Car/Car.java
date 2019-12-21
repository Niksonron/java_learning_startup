package Car;

public class Car {
    public String carName, carModel;
    Engine engine;
    Wheel wheels;





    public Car (String carName, String carModel){
        this.carModel = carModel;
        this.carName = carName;
    }


    @Override
    public String toString() {
        return "Car{" +
                "Car='" + carName + '\'' +
                ", Model='" + carModel + '\'' +
                ", Engine=" + engine +
                ", Wheels=" + wheels +
                '}';
    }
}