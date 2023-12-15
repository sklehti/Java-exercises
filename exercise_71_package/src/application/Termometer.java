package application;

import java.util.Random;

public class Termometer implements Sensor {
    private boolean isOn;
    private int value;

    public Termometer () {
        this.isOn = false;
        this.value = 0;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;

        int range = 30 - (-30) + 1;
        // return (int) (Math.random() * range) - 30;
        this.value = new Random().nextInt(range) - 30;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure()  {
            if (this.isOn) {
                return this.value;
            }
       throw  new IllegalStateException("Measure isn't on.");

    }


}
