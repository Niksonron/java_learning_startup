package Car;

import java.util.Random;

public class Engine implements Enginein {
    String engineLabel;
    private int engineNum;
    public int enginePower;


    public int getEngineNum() {
        return engineNum;
    }

    public void setEngineNum(int engineNum) {
        Random r = new Random();
        int min = 1000;
        int max = 10000;
        int range = max - min;
        range = r.nextInt(max - min);
        this.engineNum = range;
    }



        public Engine (String engineLabel, int enginePower){
        this.engineLabel = engineLabel;
        this.enginePower = enginePower;
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
