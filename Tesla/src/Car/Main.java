package Car;

public class Main {
    public static void main(String[] args) {

        Car tesla = new Car("TEsla", "Model x");
        Engine eng = new Engine("Yamaha", 3000);
        eng.setEngineNum();
        Wheel wheels = new Wheel("Toyo",4);
        tesla.setEngine(eng);
        tesla.setWheels(wheels);
        System.out.println(tesla);

    }
}