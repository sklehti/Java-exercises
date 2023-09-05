public class Pet {
    private String name;
    private String breed;

    public Pet (String n, String b) {
        this.name = n;
        this.breed = b;
    }

    public String toString () {
        return this.name + ", joka on " + this.breed;
    }
}
