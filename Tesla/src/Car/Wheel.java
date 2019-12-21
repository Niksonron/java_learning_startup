package Car;

public class Wheel {
    public String wheelLabel;
    public int wheelNum;

    public String getWheelLabel() {
        return wheelLabel;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    public Wheel(String wheelLabel, int wheelNum){
        this.wheelLabel = wheelLabel;
        this.wheelNum = wheelNum;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelLabel='" + wheelLabel + '\'' +
                ", wheelNum=" + wheelNum +
                '}';
    }
}
