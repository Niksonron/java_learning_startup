package Car;

import java.util.Random;

public class Engine implements Enginein {
    String engineLabel;
    private int engineNum;
    public int enginePower;


    public int getEngineNum() {
        return engineNum;
    }

    public void setEngineNum() {
        Random r = new Random();
        int min = 1000;
        int max = 10000;
        int range = max - min;
        range = r.nextInt(max - min);
        this.engineNum = range;
        System.out.println(range);
    }

    public int getEnginePower() {
        return enginePower;
    }

    public Engine (String engineLabel, int enginePower){
        this.engineLabel = engineLabel;
        this.enginePower = enginePower;
        }


    public String getEngineLabel() {
        return engineLabel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Label='" + engineLabel + '\'' +
                ", Num=" + engineNum +
                ", Power=" + enginePower +
                '}';
    }
}
