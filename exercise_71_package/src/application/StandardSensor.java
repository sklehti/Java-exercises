package application;

public class StandardSensor implements Sensor {
    private int value;
    private boolean isOn;

    public StandardSensor (int v) {
        this.value = v;
        this.isOn = true;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.value;
    }
}
