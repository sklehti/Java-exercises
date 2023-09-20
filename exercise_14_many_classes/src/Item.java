public class Item {
    private String name;
    private String location;
    private int weight;

    public Item (String name) {
        this(name, "pientavarahylly", 1);
    }

    public Item (String name, int weight) {
        this(name, "varasto", weight);
    }

    public Item (String name, String location) {
        this(name, location, 1);
    }


    public Item (String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public String toString() {
        return this.name + " (" + this.weight + ") löytyy sijainnista " + this.location;
    }


}
