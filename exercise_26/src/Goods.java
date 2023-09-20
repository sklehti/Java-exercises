public class Goods {
    private String name;
    private int weight;

    public Goods (String n, int w) {
        this.name = n;
        this.weight = w;
    }

    public String getName () {
        return this.name;
    }

    public int getWeight() {
        return weight;
    }

    public  String toString () {
        return this.name + " (" + this.weight + " kg)";
    }
}
