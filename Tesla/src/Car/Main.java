package Car;

public class Main {
    public static void main(String[] args) {

        Car tesla = new Car("TEsla", "Model x");
        Engine eng = new Engine("Yamaha", 3000);
        eng.setEngineNum(1001);
        Wheel wheels = new Wheel("Toyo",4);
        System.out.println(tesla);
        System.out.println(eng);
        System.out.println(wheels);
    }
}