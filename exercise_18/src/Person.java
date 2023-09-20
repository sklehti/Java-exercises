public class Person {
    private String name;

    private Pet pet;

    public Person (String n, Pet p) {
        this.name = n;
        this.pet = p;
    }

    public String toString () {
        return this.name +  " kaverina " + this.pet;
    }
}
