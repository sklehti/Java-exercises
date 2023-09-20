public class Person {
    private String name;
    private int length;

    public Person(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName () {
        return this.name;
    }
    public int getLength () {
            return  this.length;
    }

    public String toString () {
        return this.name + " (" + this.length + " cm)";
    }
}
