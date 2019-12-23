package Car;

public class Car implements Enginein {
    public String carName, carModel;
    Engine engine;
    Wheel wheels;


    public Car (String carName, String carModel){
        this.carModel = carModel;
        this.carName = carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setEngineNum() {

    }

    public void setWheels(Wheel wheels){
        this.wheels = wheels;
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