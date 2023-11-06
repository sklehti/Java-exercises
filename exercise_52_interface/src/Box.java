import java.util.ArrayList;

public class Box implements Storing {
    private ArrayList<Storing> box;
    private double maxWeight;

    public Box (double maxWeight) {
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add (Storing staff) {
        double totalWeight = 0;

        for (Storing w: this.box) {
            totalWeight += w.weight();
        }

        if ((totalWeight + staff.weight()) <= this.maxWeight) {
            this.box.add(staff);
        }

    }

    public double weight () {
       return this.box.stream().mapToDouble(obj -> obj.weight()).reduce(0,(sum ,weight) -> sum + weight);

    }

    public String toString () {
        return "Laatikko: " + this.box.size() + " esinettä, paino yhteens " + this.weight() + " kiloa";
    }
}
