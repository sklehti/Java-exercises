package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;

    public  AverageSensor () {
        this.sensors = new ArrayList<>();
    }

    public void addSensor (Sensor newSensor) {
        this.sensors.add(newSensor);
    }

    public List<Integer> measures () {
        List<Integer> list = new ArrayList<>();
        Iterator<Sensor> iterator = this.sensors.iterator();

        while (iterator.hasNext()) {
            list.add(iterator.next().measure());

        }

        return list;
    }
    @Override
    public boolean isOn() {
        Iterator<Sensor> iterator = this.sensors.iterator();

        while (iterator.hasNext()) {
            if (!iterator.next().isOn()) {
                return false;
            }
        }
        return  true;
    }

    @Override
    public void on() {
        for (Sensor s: sensors) {
             s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s: sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        int average = 0;
        for (Sensor s : sensors) {
            average += s.measure();
        }

        if (this.sensors.isEmpty() || average == 0) {
            throw new IllegalStateException("Array is empty.");
        }

        return average / this.sensors.size();
    }
}
