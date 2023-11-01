import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ChangingHistory {
    ArrayList<Double> list;
    public ChangingHistory () {
        this.list = new ArrayList<>();
    }

    public void add (double situation) {
        this.list.add(situation);
    }

    public void reset () {
        this.list.clear();
    }

    public boolean isEmpty () {
        if (this.list.isEmpty()) {
            return true;
        }
        return  false;
    }

    public double maxValue () {
        if (this.isEmpty()) {
            return 0;
        }

        return  Collections.max(this.list);

    }

    public double minValue () {
        if (this.isEmpty()) {
            return 0;
        }

        return Collections.min(this.list);
    }

    public double averageValue () {
        if (this.isEmpty()) {
            return  0;
        }

        // calculate average value in list
        return this.list.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

    public String toString () {
        return this.list.toString();
    }
}
